package com.example.demo.utils;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class HttpUtils {
    
    private static Logger logger = LoggerFactory.getLogger(HttpUtils.class);
    
    /**
     * @Description Solr后台数据管理系统的索引和指标查询
     * @Author 孟志明
     * @Email mzm12694@cnki.net
     * @CreateDate 2022/4/8
     */
    public static String doGetForSolr(String url, String contentType, String contentName, String token) {
        
        String resultString = "";
        // 创建Httpclient对象
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            // 创建uri
            URIBuilder builder = new URIBuilder(url);
            builder.setParameter("token", token);
            if (!Strings.isNullOrEmpty(contentType)) {
                builder.addParameter("contentType", contentType);
            }
            if (!Strings.isNullOrEmpty(contentName)) {
                builder.addParameter("contentName", contentName);
            }
            URI uri = builder.build();
            
            // 创建http GET请求
            HttpGet httpGet = new HttpGet(uri);
            // 执行请求
            resultString = execute(httpclient, httpGet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultString;
    }
    
    private static String execute(CloseableHttpClient httpclient, HttpGet httpGet) {
        String resultString = "";
        try (CloseableHttpResponse response = httpclient.execute(httpGet)) {
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultString;
    }
    
    public static String doGet(String url, String token) {
        
        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        
        String resultString = "";
        CloseableHttpResponse response = null;
        try {
            // 创建uri
            URIBuilder builder = new URIBuilder(url);
            URI uri = builder.build();
            
            // 创建http GET请求
            HttpGet httpGet = new HttpGet(uri);
            
            httpGet.setHeader("Authorization", "Bearer " + token);
            
            // 执行请求
            response = httpclient.execute(httpGet);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }
    
    /**
     * post请求（用于请求json格式的参数）
     * @param url
     * @return
     */
    public static String doPost(String url, String token) throws Exception {
        
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);// 创建httpPost
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.addHeader("Authorization", "Bearer " + token);
        
        String charSet = "UTF-8";
        StringEntity entity = new StringEntity("", charSet);
        httpPost.setEntity(entity);
        CloseableHttpResponse response = null;
        
        try {
            
            response = httpclient.execute(httpPost);
            StatusLine status = response.getStatusLine();
            int state = status.getStatusCode();
            if (state == HttpStatus.SC_OK) {
                HttpEntity responseEntity = response.getEntity();
                String jsonString = EntityUtils.toString(responseEntity);
                System.out.println(jsonString);
                return jsonString;
            } else {
                System.err.println("请求返回:" + state + "(" + url + ")");
            }
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
    /**
     * post请求(用于key-value格式的参数)
     * @param url
     * @param params
     * @return
     */
    public static String doPost(String url, Map params) {
        
        BufferedReader in = null;
        try {
            // 定义HttpClient
            HttpClient client = new DefaultHttpClient();
            // 实例化HTTP方法
            HttpPost request = new HttpPost();
            request.setURI(new URI(url));
            
            // 设置参数
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            for (Iterator iter = params.keySet().iterator(); iter.hasNext();) {
                String name = (String) iter.next();
                String value = String.valueOf(params.get(name));
                nvps.add(new BasicNameValuePair(name, value));
                
                // System.out.println(name +"-"+value);
            }
            request.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
            
            HttpResponse response = client.execute(request);
            int code = response.getStatusLine().getStatusCode();
            if (code == 200) { // 请求成功
                in = new BufferedReader(new InputStreamReader(response.getEntity()
                        .getContent(), "utf-8"));
                StringBuffer sb = new StringBuffer("");
                String line = "";
                String NL = System.getProperty("line.separator");
                while ((line = in.readLine()) != null) {
                    sb.append(line + NL);
                }
                
                in.close();
                
                System.out.println(sb.toString());
                
                return sb.toString();
            } else { //
                System.out.println("状态码：" + code);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            
            return null;
        }
    }
    
    /**
     * post请求(用于key-value格式的参数)
     * @param url
     * @param params
     * @return
     */
    public static String doPost(String url, Map params, String token) {
        
        BufferedReader in = null;
        try {
            // 定义HttpClient
            HttpClient client = new DefaultHttpClient();
            // 实例化HTTP方法
            HttpPost request = new HttpPost();
            request.setURI(new URI(url));
            request.setHeader("Authorization", "Bearer " + token);
            
            // 设置参数
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            for (Iterator iter = params.keySet().iterator(); iter.hasNext();) {
                String name = (String) iter.next();
                String value = String.valueOf(params.get(name));
                nvps.add(new BasicNameValuePair(name, value));
                
                // System.out.println(name +"-"+value);
            }
            request.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
            
            HttpResponse response = client.execute(request);
            int code = response.getStatusLine().getStatusCode();
            if (code == 200) { // 请求成功
                in = new BufferedReader(new InputStreamReader(response.getEntity()
                        .getContent(), "utf-8"));
                StringBuffer sb = new StringBuffer("");
                String line = "";
                String NL = System.getProperty("line.separator");
                while ((line = in.readLine()) != null) {
                    sb.append(line + NL);
                }
                
                in.close();
                
                System.out.println(sb.toString());
                
                return sb.toString();
            } else { //
                System.out.println("状态码：" + code);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            
            return null;
        }
    }
    
    /**
     * 发送httpPost请求(body请求)
     *
     * @param params 请求地址
     * @param params 请求参数
     * @return 响应体
     */
    public static String postAPI(String url, Map params, String token) throws IOException {
        
        HttpPost httpPost = new HttpPost(url);
        List<NameValuePair> pairs = new ArrayList<>();
        Set<Map.Entry> entries = params.entrySet();
        for (Map.Entry entry : entries) {
            NameValuePair pair = new BasicNameValuePair(entry.getKey().toString(), entry.getValue().toString());
            pairs.add(pair);
        }
        httpPost.setEntity(new UrlEncodedFormEntity(pairs, StandardCharsets.UTF_8));
        
        if (StringUtils.isNotBlank(token)) {
            httpPost.setHeader("Authorization", "Bearer " + token);
        }
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = httpclient.execute(httpPost);
        HttpEntity entity = response.getEntity();
        return EntityUtils.toString(entity, "UTF-8");
    }
    
    public static String doPost(String url, JSONObject param, String token) {
        HttpPost httpPost = null;
        String result = null;
        try {
            HttpClient client = new DefaultHttpClient();
            httpPost = new HttpPost(url);
            if (param != null) {
                StringEntity se = new StringEntity(param.toString(), "utf-8");
                httpPost.setEntity(se); // post方法中，加入json数据
                httpPost.setHeader("Content-Type", "application/json");
            }
            if (StringUtils.isNotBlank(token)) {
                httpPost.setHeader("Authorization", "Bearer " + token);
            }
            HttpResponse response = client.execute(httpPost);
            if (response != null) {
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    result = EntityUtils.toString(resEntity, "utf-8");
                }
            }
            
        } catch (Exception ex) {
            logger.error("发送到接口出错", ex);
        }
        return result;
    }
    
}
