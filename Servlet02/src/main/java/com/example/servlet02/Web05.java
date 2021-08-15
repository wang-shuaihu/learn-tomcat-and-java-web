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
@WebServlet("/s05")
public class Web05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("web05....");

        // 设置域对象内容
        request.setAttribute("name","admin");
        request.setAttribute("age",18);
        List<String> list =new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        request.setAttribute("list",list);

        //请求跳转转发
//        request.getRequestDispatcher("s06").forward(request,resp);
        // 请求转发到jsp页面
        request.getRequestDispatcher("index.jsp").forward(request,resp);
    }
}
