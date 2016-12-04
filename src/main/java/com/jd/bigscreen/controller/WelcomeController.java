package com.jd.bigscreen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dongzhe6 on 2016/12/4.
 */
@Controller
@RequestMapping("/")
public class WelcomeController {
    @RequestMapping("/index")
    public String index(){
        //输出日志文件
        System.out.println("the first jsp pages");
        return "index";
    }
}
