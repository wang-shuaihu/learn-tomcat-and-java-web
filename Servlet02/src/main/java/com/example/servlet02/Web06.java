package com.example.servlet02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * request作用域（请求转发跳转时有效）
 */
@WebServlet("/s06")
public class Web06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("web06....");

        // 获取域对象内容
        String name = (String) request.getAttribute("name");
        System.out.println("name:"+name);
        int age = (int) request.getAttribute("age");
        System.out.println("age:"+age);

        List<String> list = (List<String>) request.getAttribute("list");
        System.out.println(list.get(0));
    }
}
