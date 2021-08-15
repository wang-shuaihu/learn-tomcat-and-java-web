package com.example.servlet03;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 字节流响应数据
 */
@WebServlet("/s03")
public class Servlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        //同时设置客户端和服务端的编码方式
        response.setContentType("text/html;charset=UTF-8");
        // 字节输出流
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write("你好啊".getBytes("UTF-8"));

    }
}
