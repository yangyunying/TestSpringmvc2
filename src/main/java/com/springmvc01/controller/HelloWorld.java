package com.springmvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by admin on 2018/9/27.
 * 创建HelloWorld控制器
 */

@Controller  //声明为控制器
@RequestMapping(path = "/home")  //请求映射
public class HelloWorld {
    @RequestMapping(path = "/index")  //请求映射
    public String index(Model model){
        model.addAttribute("message","Hello Spring MVC!");
        return "home/index";
    }
}