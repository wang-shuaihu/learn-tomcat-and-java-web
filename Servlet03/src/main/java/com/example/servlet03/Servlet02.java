package com.example.servlet03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 字符流响应数据,客户端会乱码
 * 服务端编码时不支持中文
 * 1设置服务端编码格式
 * 2.设置客户端编码格式
 */
@WebServlet("/s02")
public class Servlet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        // 设置服务端编码格式
      //  response.setCharacterEncoding("UTF-8");
        // 设置客户端编码格式和相应的MIME类型
        //response.setHeader("content-type","text/html;charset=UTF-8");

        //同时设置客户端和服务端的编码方式
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = response.getWriter();
        writer.write("<h2>你好</h2>");

    }
}
