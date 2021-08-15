package com.example.servlet03;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * 字节输出流
 * 字符输出流
 */
@WebServlet("/s01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //字符输出流
//        PrintWriter writer = response.getWriter();
//        writer.write("hello");
        // 字节输出流
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write("hi".getBytes());


    }
}
