<%@ page import="org.apache.ibatis.io.Resources" %>
<%@ page import="java.io.InputStream" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello world</h1>
<%
    InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml") ;
%>
</body>
</html>
