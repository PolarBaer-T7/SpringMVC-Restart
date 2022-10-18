package com.polarbear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author PolarBear
 * @Date 2022/10/18 14:02
 * @PackageName: com.polarbear.controller
 * @ClassName: HelloSpringMVC
 * @Version 1.0
 */
@Controller
public class HelloSpringMVC {

    @RequestMapping("/h1")
    public String hello(ModelAndView mv){
        mv.addObject("msg", "Hello,SpringMVC!");
        mv.setViewName("hello");
        return "hello";
    }
}
