package com.example.demo.utils;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

/**
 * @author
 * @Des TODO
 * @Date 2022/11/16 17:58
 **/
@Component
public class HttpClientUtil {
    
    public static String doGet(String url,String charset) throws Exception{
        HttpClient httpClient = null;
        HttpGet httpget = null;
        String result = null;
        
        httpClient = new SSLClient();
        httpget = new HttpGet(url);
        httpget.addHeader("Content-Type", "application/json");
        // httpget.setEntity(se);
        HttpResponse response = httpClient.execute(httpget);
        if(response != null){
            HttpEntity resEntity = response.getEntity();
            if(resEntity != null){
                result = EntityUtils.toString(resEntity,charset);
            }
        }
        
        return result;
    }
    public static String doPost(String url,String json,String charset) throws Exception{
        HttpClient httpClient = null;
        HttpPost HttpPost = null;
        String result = null;
        
        httpClient = new SSLClient();
        HttpPost = new HttpPost(url);
        HttpPost.addHeader("Content-Type", "text/html; charset=utf-8");
        // HttpPost.addHeader("Content-Type", "application/json");
        StringEntity se = new StringEntity(json);
        se.setContentType("text/json");
        se.setContentEncoding(new BasicHeader("Content-Type", "application/x-www-form-urlencoded"));
        // se.setContentEncoding(new BasicHeader("Content-Type", "application/json"));
        HttpPost.setEntity(se);
        HttpResponse response = httpClient.execute(HttpPost);
        if(response != null){
            HttpEntity resEntity = response.getEntity();
            if(resEntity != null){
                result = EntityUtils.toString(resEntity,charset);
            }
        }
        
        return result;
    }
}
