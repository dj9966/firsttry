package com.jd.bigscreen.controller.com.jd.bigscreen.httpclient;

import com.alibaba.fastjson.JSON;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;

/**
 * Created by dongzhe6 on 2016/12/3.
 */
public class HttpRequestUtil {

    public static String INTERFACE_HOST;
    public static String INTERFACE_METHOD;
    public static String INTERFACE_DATABASE;
    public static String INTERFACE_USERNAME;

    public static String syncPost(String sql) throws Exception {
        HttpClient httpClient = new HttpClient();
        httpClient.start();
        ContentResponse response =httpClient.POST("http://"+INTERFACE_HOST+INTERFACE_METHOD)
                .param("userName", INTERFACE_USERNAME)
                .param("databaseName",INTERFACE_DATABASE)
                .param("sql",sql)
                .header("Content-type", "application/x-www-form-urlencoded")//Must be
                .header("Accept", "application/json")
                .send();
        httpClient.stop();
        String jsonResponse = JSON.toJSONString(response.getContentAsString());
        return jsonResponse;
    }
}
