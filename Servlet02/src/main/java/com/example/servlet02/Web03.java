package com.example.servlet02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求转发跳转  request.getRequestDispatcher(url).forward(request,response);
 * 特点  1.服务端行为
 *       2.地址栏不发生改变
 *        3.只有一个请求
 *        4.数据可以共享
 */
@WebServlet("/s03")
public class Web03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        System.out.println("s03 name:" + name );

        // 请求转发跳转到s04
//        request.getRequestDispatcher("s04").forward(request,response);
        //请求转发到jsp页面
        //request.getRequestDispatcher("login.jsp").forward(request,response);
        //请求转发到html页面
        request.getRequestDispatcher("login.html").forward(request,response);
    }
}
