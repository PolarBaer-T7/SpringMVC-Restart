package com.polarbear;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author PolarBear
 * @Date 2022/10/15 16:05
 * @PackageName: com.polarbear
 * @ClassName: HelloServlet
 * @Description: TODO
 * @Version 1.0
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        String add = "add";
        String post = "post";
        if (add.equals(method)) {
            req.getSession().setAttribute("msg", "执行了" + add + "方法");
        } else if (post.equals(method)) {
            req.getSession().setAttribute("msg", "执行了" + add + "方法");
        }
        req.getRequestDispatcher("/WEB-INF/jsp/Test.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        doPost(req, resp);
    }
}
