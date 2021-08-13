package com.example.servlet02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求乱码问题
 *
 * GET tomcat8.5 中文不会乱码
 * POST 会乱码，因为默认编码方式不支持中文
 */
@WebServlet("/s02")
public class Web02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码的格式 ,post请求不再乱码
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        System.out.println("name:" + name + ",pwd=" + pwd);

    }
}
