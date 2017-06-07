<%@ page import="java.io.File" %>
<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>test-home</title>
</head>
<body>
<a href="show">dianyidian</a>
<%
    out.print("hello123");
%>
<hr>
<%
    out.print("建个文件夹");
    String dir = request.getServletContext().getRealPath("upload/");
    out.print(dir);
    File f = new File(dir);
    if(!f.exists()){
        f.mkdirs();
    }
%>
</body>
</html>
