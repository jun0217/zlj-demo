package com.example.demo.mbg.service.impl;

import cn.hutool.core.util.StrUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.mbg.mapper.XkjcXkMapper;
import com.example.demo.mbg.model.XkjcXk;
import com.example.demo.mbg.model.XkjcXkExample;
import com.example.demo.mbg.pojo.XkjcXKPOJO;
import com.example.demo.mbg.service.repository.TestService;
import com.github.pagehelper.PageHelper;
import javafx.util.Pair;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author jun
 * @Des TODO
 * @Date 2022/2/9 9:53
 **/
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private XkjcXkMapper xkjcXkMapper;
    
    @Override
    public List<XkjcXk> selectByExample(XkjcXk xkjcXk) {
        PageHelper.startPage(0, 10);
        //List<XkjcXk> XkjcXk = xkjcXkMapper.selectByExample(xkjcXkExample);
        QueryWrapper<XkjcXk> wrapper = new QueryWrapper<>();
        if (StrUtil.isNotBlank(xkjcXk.getXkBh())) {
            wrapper.eq("xk_bh", xkjcXk.getXkBh());
        }
        List<XkjcXk> XkjcXk = xkjcXkMapper.selectList(wrapper);
        return XkjcXk;
    }
    
    @Override
    public XkjcXk selectById(String id) {
        XkjcXk xkjcXk = xkjcXkMapper.selectByPrimaryKey(Integer.valueOf(id));
        if (xkjcXk == null) {
            return null;
        }
        return xkjcXk;
    }
    
    @Override
    public void exportXk(HttpServletResponse response) throws IOException {
        List<XkjcXk> XkjcXkList = xkjcXkMapper.selectByExample(new XkjcXkExample());
        List<XkjcXKPOJO> xkjcXKPOJOS = new ArrayList<>();
        XkjcXkList.forEach(v -> {
            XkjcXKPOJO xkjcXKPOJO = new XkjcXKPOJO();
            BeanUtils.copyProperties(v, xkjcXKPOJO);
            xkjcXKPOJOS.add(xkjcXKPOJO);
        });
        
        Set<String> set = new HashSet<>();
        set.add("bh");
        set.add("updateTime");//.includeColumnFiledNames(set) 设置不需要下载的字段
        
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=" + "学科" + ".xlsx");
        //1、单sheet导出
        /*EasyExcel.write(response.getOutputStream(), XkjcXKPOJO.class)
                .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy()) //自适应宽高
                .sheet("模板").doWrite(xkjcXKPOJOS);*/
        //2、 测试多sheel导出
        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).build();
        //WriteSheet test1 = EasyExcel.writerSheet(0, "test1").head(XkjcXKPOJO.class).build();
        // 表头样式
        WriteCellStyle headWriteCellStyle = new WriteCellStyle();
        // 单元格样式
        WriteCellStyle contentWriteCellStyle = new WriteCellStyle();
        // 初始化表格样式
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = new HorizontalCellStyleStrategy(headWriteCellStyle, contentWriteCellStyle);
        WriteSheet test1 = EasyExcel.writerSheet(0, "test1").head(XkjcXKPOJO.class).
                registerWriteHandler(horizontalCellStyleStrategy).build();
        WriteSheet test2 = EasyExcel.writerSheet(1, "test2").head(XkjcXKPOJO.class).build();
        excelWriter.write(xkjcXKPOJOS, test1).write(xkjcXKPOJOS, test2);
        excelWriter.finish();
        
        
    }
    
    @Override
    public List<XkjcXKPOJO> readExcel(MultipartFile file) throws IOException {
        List<XkjcXKPOJO> list = new ArrayList<>();
        InputStream inputStream = file.getInputStream();
        /*
         * EasyExcel 读取 是基于SAX方式
         * 因此在解析时需要传入监听器
         */
        // 第一个参数 为 excel文件路径
        // 读取时的数据类型
        // 监听器
        //EasyExcel.read("学生信息表" + ExcelTypeEnum.XLSX.getValue(), XkjcXKPOJO.class, new AnalysisEventListener<XkjcXKPOJO>() {
        EasyExcel.read(inputStream, XkjcXKPOJO.class, new AnalysisEventListener<XkjcXKPOJO>() {
            
            // 每读取一行就调用该方法
            @Override
            public void invoke(XkjcXKPOJO data, AnalysisContext context) {
                list.add(data);
            }
            
            // 全部读取完成就调用该方法
            @Override
            public void doAfterAllAnalysed(AnalysisContext context) {
                System.out.println("读取完成");
            }
        }).sheet().doRead();
        
        list.forEach(System.out::println);
        return list;
    }
    
    public static void main01(String[] args) {
        List<Pair<String, Double>> pairArrayList = new ArrayList<>(3);
        pairArrayList.add(new Pair<>("version", 12.10));
        pairArrayList.add(new Pair<>("version", 12.19));
        pairArrayList.add(new Pair<>("version", 6.28));
        // 生成的 map 集合中只有一个键值对：{version=6.28}
        Map map = pairArrayList.stream().collect(Collectors.toMap(Pair::getKey, Pair::getValue, (v1, v2) -> v2));
        System.out.println(map.toString());
        
        String[] str = new String[]{"a", "b"};
        List<String> string = Arrays.asList(str);
        str[0] = "c";
        string.remove("b");
    }
    
    public static void main02(String[] args) throws IOException {
        //txt文件生成的位置
        File outFile = new File("D:\\Desktop\\test\\test.txt");
        //Writer out;
        try {
            FileWriter out = new FileWriter(outFile);
            //输入流,进行写入操作
            //out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile, true), "utf-8"), 10240);
            //开始写
            out.write("测试第一行:姓名");
            out.write("\r\n");
            out.write("测试第二行:性别");
            //清空缓存区,完全写入
            out.flush();
            //关闭流
            out.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        
        //读取文件
        InputStreamReader read = null;
        try {
            String encoding = "utf-8";
            File file = new File("D:\\Desktop\\test\\test.txt");
            
            if (file.isFile() && file.exists()) { //判断文件是否存在
                read = new InputStreamReader(
                        new FileInputStream(file), encoding);//考虑到编码格式
                
                BufferedReader bufferedReader = new BufferedReader(read);
                
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    System.out.println(lineTxt); // 一行一行的读
                }
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        } finally {
            read.close();
        }
    }
}
