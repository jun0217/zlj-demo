package com.example.demo.controller;

import com.example.demo.common.util.ExportExcel;
import com.example.demo.mbg.model.XkjcXk;
import com.example.demo.mbg.pojo.XkjcXKPOJO;
import com.example.demo.mbg.service.repository.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author jun
 * @Des TODO
 * @Date 2022/2/7 16:08
 **/
@Api(tags = "TestController", description = "测试类管理")
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    @ResponseBody
    public String test() {
        return "你好，世界！";
    }

    @ApiOperation("获取所有学科")
    @PostMapping("/selectByExample")
    @ResponseBody
    public List<XkjcXk> selectByExample(XkjcXk xkjcXk) {
        List<XkjcXk> xkjcXkList = testService.selectByExample(xkjcXk);
        return xkjcXkList;
    }

    @ApiOperation("获取所有学科")
    @PostMapping("/selectById")
    @ResponseBody
    public XkjcXk selectById(String id) {
        XkjcXk xkjcXk = testService.selectById(id);
        return xkjcXk;
    }

    @ApiOperation("获取所有学科！！！")
    @GetMapping("/exportXk")
    @ResponseBody
    public void exportXk(HttpServletResponse response) throws IOException {
        testService.exportXk(response);
    }

    @ApiOperation("获取所有学科！！！")
    @PostMapping("/readExcel")
    @ResponseBody
    public List<XkjcXKPOJO> readExcel(MultipartFile file) throws IOException {
        List<XkjcXKPOJO> xkjcXKPOJOList = testService.readExcel(file);
        return xkjcXKPOJOList;
    }
    
    //@ApiOperation(value = "从某路径导出至excel-测试方法", notes = "导出至excel", response = WebResponse.class)
    @ApiImplicitParams({})
    @RequestMapping("/exportData01")
    //@RequiresPermissions("statistics:resultsList:export") solr权限注解
    public void exportData01(@RequestParam String name, HttpServletResponse response) {
        Long selectSolrStartTime = System.currentTimeMillis();
        //log.info("exportDataStartTime=====> {}", selectSolrStartTime);
        ExportExcel<Map<String, Object>> exportExcel = new ExportExcel<>();
        exportExcel.doExcel02(name,response);
        //log.info("exportDataEndTime=====> {}, cost {}", System.currentTimeMillis(), (System.currentTimeMillis() - selectSolrStartTime));
    }
}
