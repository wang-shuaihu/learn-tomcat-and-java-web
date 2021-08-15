package com.example.servlet07;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@WebServlet("/uploadServlet")
@MultipartConfig  //如果是文件上传，必须加
public class uploadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("文件上传。。。。。。。");

        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("uname");
        System.out.println("name:"+name);

        // 获取part对象
        Part part = request.getPart("myfile"); //表单中file文件域的name属性值
        // 通过part对象得到的上传文件名
        String submittedFileName = part.getSubmittedFileName();
        System.out.println("上传的文件名："+submittedFileName);

        // 得到文件存放的路径
        String realPath = request.getServletContext().getRealPath("/");
        System.out.println("文件存放的路径："+realPath);
        // 上传文件到指定目录
        part.write(realPath+"/"+submittedFileName);


    }
}
