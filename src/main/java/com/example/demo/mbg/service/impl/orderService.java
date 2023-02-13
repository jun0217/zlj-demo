package com.example.demo.mbg.service.impl;

import com.example.demo.utils.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

/**
 * @author
 * @Des TODO
 * @Date 2022/11/16 17:52
 **/
public class orderService {
    @Autowired
    private HttpClientUtil httpClientUtil;
    
    public void login() throws Exception {
        String url="https://oa.cnki.net/web/Account/Login";
        HashMap<Object, Object> param = new HashMap<>();
        param.put("Account","ZLJ14589");
        param.put("Password","zlj9984751");
       
        httpClientUtil.doPost(url,param.toString(),null);
    }
    
    public static void main(String[] args) throws Exception {
        String url="https://oa.cnki.net/web/Account/Login";
        HashMap<Object, Object> param = new HashMap<>();
        param.put("Account","ZLJ14589");
        param.put("Password","zlj9984751");
        HttpClientUtil httpClient = new HttpClientUtil();
        httpClient.doPost(url,param.toString(),"utf-8");
    }
    public static void main01(String[] args) throws Exception {
        String url="https://oa.cnki.net/api/amimanage/EatOrder/EatOrderAddUp";
        HashMap<Object, Object> param = new HashMap<>();
        param.put("Account","ZLJ14589");
        param.put("Password","zlj9984751");
        HttpClientUtil httpClient = new HttpClientUtil();
        httpClient.doPost(url,param.toString(),"utf-8");
    }
   
}
