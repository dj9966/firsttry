package com.jd.bigscreen.controller;

import com.alibaba.fastjson.JSON;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.jd.bigscreen.controller.com.jd.bigscreen.httpclient.HttpRequestUtil.INTERFACE_HOST;
import static com.jd.bigscreen.controller.com.jd.bigscreen.httpclient.HttpRequestUtil.INTERFACE_METHOD;

/**
 * Created by dongzhe6 on 2016/12/4.
 */
@Controller
@RequestMapping("/data")
public class DataController {

    @Value("${data_interface_host}")
    private String host;

    @Value("${data_interface_method}")
    private String method;

    @Value("${data_interface_database}")
    private String database;

    @Value("${data_interface_username}")
    private String username;

    @ResponseBody
    @RequestMapping(value = "/query" , produces="application/json;charset=UTF-8")
    public String post(){
//        HttpClient httpClient = new HttpClient();
//        try {
//            httpClient.start();
//            ContentResponse response =httpClient.POST("http://"+host+method)
//                    .param("userName", database)
//                    .param("databaseName",username)
//                    .param("sql","")
//                    .header("Content-type", "application/x-www-form-urlencoded")//Must be
//                    .header("Accept", "application/json")
//                    .send();
//            httpClient.stop();
//            String jsonResponse = JSON.toJSONString(response.getContentAsString());
//            return jsonResponse;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return host+method+database+username;
    }
}
