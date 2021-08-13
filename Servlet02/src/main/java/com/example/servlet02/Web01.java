package com.example.servlet02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/s01")
public class Web01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURL = request.getRequestURL() + "";
        System.out.println("获取请求时的完整路径：" + requestURL);
        String requestURI = request.getRequestURI();
        System.out.println("获取请求时的部分路径:" + requestURI);
        String queryString = request.getQueryString();
        System.out.println("获取请求时的参数：" + queryString);
        String method = request.getMethod();
        System.out.println("获取请求的方式：" + method);
        String protocol = request.getProtocol();
        System.out.println("获取当前的协议:" + protocol);
        String contextPath = request.getContextPath();
        System.out.println("获取对外访问路径：" + contextPath);
        // 获取指定名称的参数值
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        System.out.println("name:" + name + ",pwd=" + pwd);

        //获取指定名称的参数的所有值
        String[] hobbies = request.getParameterValues("hobby");
        if (hobbies != null && hobbies.length > 0) {
            for (String hobby : hobbies) {
                System.out.println("爱好："+hobby);
            }
        }
    }
}
