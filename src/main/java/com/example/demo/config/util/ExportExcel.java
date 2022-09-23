package com.example.demo.config.util;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description: excel的导出工具类
 * @Author:
 */
public class ExportExcel<T> {
    
    /**
     * 默认日期格式
     */
    public static String DEFAULT_DATE_PATTERN = "yyyy年MM月dd日";
    public static final String UTF8 ="UTF-8";
    /**
     * @param title   表格名称
     * @param headers 表格属性列名数组（标题行）
     * @param column  需要显示的表格属性列名数组，如果是JavaBean就是字段名，如果是map就是key值
     * @param dataset 需要显示的数据集合
     * @param isMerge 是否合并单元格
     */
    public HSSFWorkbook exportExcel(String title, List<String> headers, List<String> column, Collection<T> dataset, boolean isMerge) {
        // 声明一个工作薄
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 生成一个表格
        HSSFSheet sheet = workbook.createSheet(title);
        // 设置表格默认列宽度为15个字节
        sheet.setDefaultColumnWidth((short) 15);
        
        // 生成一个表头样式
        HSSFCellStyle titleStyle = workbook.createCellStyle();
        titleStyle.setWrapText(true);
        titleStyle.setAlignment(HorizontalAlignment.CENTER);
        titleStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        // 生成一个字体
        HSSFFont titleFont = workbook.createFont();
        titleFont.setBold(true);
        titleFont.setFontHeightInPoints((short) 14);
        titleFont.setFontName("宋体");
        // 把字体应用到表头样式中
        titleStyle.setFont(titleFont);
        
        // 生成一个表格文本样式
        HSSFCellStyle textStyle = workbook.createCellStyle();
        textStyle.setWrapText(true);
        textStyle.setAlignment(HorizontalAlignment.CENTER);
        textStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        // 生成一个字体
        HSSFFont textFont = workbook.createFont();
        textFont.setFontHeightInPoints((short) 12);
        textFont.setFontName("宋体");
        // 把字体应用到表头样式中
        textStyle.setFont(textFont);
        
        // 产生表格标题行
        HSSFRow row = sheet.createRow(0);
        for (short i = 0; i < headers.size(); i++) {
            HSSFCell cell = row.createCell(i);
            cell.setCellStyle(titleStyle);
            HSSFRichTextString text = new HSSFRichTextString(headers.get(i));
            cell.setCellValue(text);
        }
        // 遍历集合数据，产生数据行
        Iterator<T> it = dataset.iterator();
        int index = 0;
        HSSFRow preRow = null;
        Map<String, String> mergeMap = new HashMap();
        while (it.hasNext()) {
            index++;
            row = sheet.createRow(index);
            T t = (T) it.next();
            // 属性数组
            List<String> fields = column;
            for (short i = 0; i < fields.size(); i++) {
                HSSFCell cell = row.createCell(i);
                cell.setCellStyle(textStyle);
                String fieldName = fields.get(i);
                try {
                    Object value = "";
                    Map map = null;
                    Class tCls = null;
                    if (t instanceof Map) {
                        map = (Map) t;
                        value = map.get(fieldName);
                    } else {
                        String getMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                        tCls = t.getClass();
                        Method getMethod = tCls.getMethod(getMethodName, new Class[]{});
                        value = getMethod.invoke(t, new Object[]{});
                    }
                    if (value == null) {
                        value = "";
                    }
                    // 判断值的类型后进行强制类型转换
                    String textValue = null;
                    if (value instanceof Byte) {
                        short bValue = (Byte) value;
                        if ("isLocked".equals(fieldName)) {
                            if (0 == bValue) {
                                textValue = "否";
                            } else {
                                textValue = "是";
                            }
                        } else if ("isActive".equals(fieldName)) {
                            if (0 == bValue) {
                                textValue = "无效";
                            } else {
                                textValue = "有效";
                            }
                        } else {
                            textValue = Short.toString(bValue);
                        }
                    } else if (value instanceof Date) {
                        Date date = (Date) value;
                        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
                        textValue = sdf.format(date);
                    } else {
                        // 其它数据类型都当作字符串简单处理
                        textValue = value.toString();
                    }
                    cell.setCellValue(textValue);
                    if (isMerge) {
                        if (index == 1) {
                            continue;
                        }
                        if (i == 0 || i == 1) {
                            // 获取之前每一行的当前列
                            for (int j = 1; j < index; j++) {
                                preRow = sheet.getRow(j);
                                HSSFCell preCell = preRow.getCell(i);
                                boolean b1 = cell.getStringCellValue().equals(preCell.getStringCellValue());
                                boolean b2 = row.getCell(0).getStringCellValue().equals(preRow.getCell(0).getStringCellValue());
                                if (b1 && b2) {
                                    String str = j + "," + index + "," + i + "," + i;
                                    String key = "";
                                    if (i == 0) {
                                        key = cell.getStringCellValue();
                                    } else {
                                        key = row.getCell(0).getStringCellValue() + cell.getStringCellValue();
                                    }
                                    mergeMap.put(key, str);
                                    break;
                                }
                            }
                        }
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (!CollectionUtils.isEmpty(mergeMap) && isMerge) {
            for (String key : mergeMap.keySet()) {
                String[] obj = mergeMap.get(key).trim().split(",");
                int firstRow = Integer.parseInt(obj[0]);
                int lastRow = Integer.parseInt(obj[1]);
                int firstCol = Integer.parseInt(obj[2]);
                int lastCol = Integer.parseInt(obj[3]);
                sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol, lastCol));
            }
        }
        return workbook;
    }
    
    /**
     * @param response
     * @param info
     * @param title
     * @param headers
     * @param column
     * @param isMerge
     */
    public void doExcel(HttpServletResponse response, Collection info, String title, List<String> headers, List<String> column, boolean isMerge) {
        try {
            OutputStream out = response.getOutputStream();
            response.reset();
            // response.setContentType("application/msexcel");
            response.setContentType("application/msexcel;charset=" +UTF8 );
            // response.setContentType("application/octet-stream");
            response.setHeader("Content-disposition", "attachment; filename=" + new String((title + ".xls").getBytes(), "iso-8859-1"));
            ExportExcel ex = new ExportExcel();
            HSSFWorkbook workbook = ex.exportExcel(title, headers, column, info, isMerge);
            try {
                workbook.write(out);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void doExcel01(HttpServletResponse response, Collection info, String title, List<String> headers, List<String> column, boolean isMerge) {
        try {
            OutputStream out = response.getOutputStream();
            response.reset();
            // response.setContentType("application/msexcel");
            response.setContentType("application/msexcel;charset=" + UTF8);
            // response.setContentType("application/octet-stream");
            response.setHeader("Content-disposition", "attachment; filename=" + new String((title + ".xls").getBytes(), "iso-8859-1"));
            ExportExcel ex = new ExportExcel();
            HSSFWorkbook workbook = ex.exportExcel(title, headers, column, info, isMerge);
            
            //start---此几行行代码为将文件写入到指定的路径下
            FileOutputStream output=new FileOutputStream("D:\\workPlace\\xkjcBack\\"+title+".xls");
            workbook.write(output);//写入磁盘
            output.close();
            //end ----
            
            try {
                workbook.write(out);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void doExcel02(String name, HttpServletResponse response) {
    
        InputStream ins = null;
        BufferedInputStream bins = null;
        OutputStream outs = null;
        BufferedOutputStream bouts = null;
        String file_name = "D:\\workPlace\\xkjcBack\\"+name+".xls";
        try {
            outs = response.getOutputStream();
            response.reset();
            response.setContentType("application/vnd.ms-excel;charset=" + UTF8);
            // response.setContentType("application/octet-stream");
            response.setHeader("Content-disposition", "attachment; filename=" + new String(name.getBytes(), "iso-8859-1")+".xls");
            response.setCharacterEncoding("UTF-8");

            bouts = new BufferedOutputStream(outs);
            if (!"".equals(file_name)) {
                File file = new File(file_name);
                String[] strs = file_name.split("/");
                String realFileName = strs[strs.length-1];
                if (file.exists()) {
                    ins = new FileInputStream(file_name);
                    bins = new BufferedInputStream(ins);
                    int bytesRead = 0;
                    byte[] buffer = new byte[8192];
                    while ((bytesRead = bins.read(buffer, 0, 8192)) != -1) {
                        bouts.write(buffer, 0, bytesRead);
                    }
                    bouts.flush(); //清空缓存区
                } else {
                    throw new Exception("下载的文件不存在!");
                }
            } else {
                throw new Exception("导出文件时发生错误！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //最后关闭流的操作
            try {
                if (null != ins) {
                    ins.close();
                }
                if (null != bins) {
                    bins.close();
                }
                if (null != outs) {
                    outs.close();
                }
                if (null != bouts) {
                    bouts.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        /*//我用的是创建文件对文件进行下载，需要对创建的文件进行删除
        File file = new File(file_name);
        if (!"".equals(file_name)) {
            if (file.exists() && file.isFile()) {
                if (file.delete()) {
                    System.out.println("删除单个文件" + file_name + "成功！");
                } else {
                    System.out.println("删除单个文件" + file_name + "失败！");
                }
            } else {
                System.out.println("删除单个文件失败!" + file_name + "不存在！");
            }
        } else {
            System.out.println("删除文件时发生错误！");
        }*/
    }
}
