package com.seecen.controller;

import com.seecen.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ajax")
public class AjaxText extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String id = req.getParameter("id");
         String name = req.getParameter("name");
         resp.getWriter().print("hello"+id);
         resp.getWriter().print(name);
         User user=new User(name,"123","123");
         resp.getWriter().print(user);
    }
}
