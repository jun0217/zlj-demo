package com.example.demo.mbg.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import org.apache.commons.lang3.StringUtils;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author
 * @Des TODO
 * @Date 2023/2/10 17:30
 **/
public class testService {
    
    public static void getPathList(String xml, List<String> list) throws IOException, JDOMException {
        if (StringUtils.isNotBlank(xml)) {
            Pattern p = Pattern.compile("\r|\n|\t");
            Matcher m = p.matcher(xml);
            xml = m.replaceAll("");
        }
        //创建一个新的字符串
        StringReader read = new StringReader(xml);
        //创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入
        InputSource source = new InputSource(read);
        //创建一个新的SAXBuilder
        SAXBuilder sb = new SAXBuilder();
        //通过输入源构造一个Document
        Document doc = sb.build(source);
        
        //---------------------------------------------
        //读取xml的那部分：
        //1.创建SAXBuilder对象
        SAXBuilder saxBuilder = new SAXBuilder();
        //2.创建输入流
        InputStream is = new FileInputStream(new File("src/main/resources/demo.xml"));
        //3.将输入流加载到build中
        Document document = saxBuilder.build(is);
        //--------------------------------------------
        //取的根元素
        Element root = document.getRootElement();
        String rootName = root.getName();
        List<Element> children = (List<Element>) root.getChildren();
        handleChildren(children, rootName, list);
    }
    
    public static String handleChildren(List<Element> elementList, String parentName, List<String> list) {
        for (Element child : elementList) {
            String name = child.getName();
            List<Element> innerChildren = (List<Element>) child.getChildren();
            if (CollectionUtil.isNotEmpty(innerChildren)) {
                handleChildren(innerChildren, new StringJoiner("/").add(parentName).add(name).toString(), list);
            } else {
                list.add(new StringJoiner("/").add(parentName).add(name).add(child.getText().trim()).toString());
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        String xml = "<Person>\n" +
                "\t<name>xmc</name>\n" +
                "\t<address>\n" +
                "\t\t<address1>\n" +
                "\t\t\tbeijing\n" +
                "\t\t</address1>\n" +
                "\t</address>\n" +
                "\t<money>\n" +
                "\t\t<much>\n" +
                "\t\t\t<how>\n" +
                "\t\t\t\t10000000000000\n" +
                "\t\t\t</how>\n" +
                "\t\t</much>\n" +
                "\t</money>\n" +
                "</Person>";
        try {
            
            //-------------------------------------------------------------
            List<String> list = new ArrayList<>();
            getPathList(xml, list);
            list.forEach(System.out::println);
        } catch (IOException | JDOMException e) {
            e.printStackTrace();
        }
    }
    
}
