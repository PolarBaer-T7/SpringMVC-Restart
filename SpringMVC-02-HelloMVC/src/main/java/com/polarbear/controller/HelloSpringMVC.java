package com.polarbear.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author PolarBear
 * @Date 2022/10/15 18:50
 * @PackageName: com.polarbear.controller
 * @ClassName: HelloSpringMVC
 * @Description: TODO
 * @Version 1.0
 */
public class HelloSpringMVC implements Controller {
//上面

    /**
     *  Template
     * @Author PolarBear
     * @Title handleRequest
     * @Description //TODO
     * @Date 17:28 2022/10/16
     * @param request
     * @param response
     * @return org.springframework.web.servlet.ModelAndView
     **/
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "HelloSpringMVC!");
        mv.setViewName("Hello");
        return mv;
    }
}
