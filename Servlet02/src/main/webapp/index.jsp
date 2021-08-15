<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h2>index页面</h2>
<%
    System.out.println("web06....");

    // 获取域对象内容
    String name = (String) request.getAttribute("name");
    System.out.println("name:"+name);
    int age = (int) request.getAttribute("age");
    System.out.println("age:"+age);

    List<String> list = (List<String>) request.getAttribute("list");
    System.out.println(list.get(0));
%>
</body>
</html>