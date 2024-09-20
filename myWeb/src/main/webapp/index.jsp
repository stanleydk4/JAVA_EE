<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link href="style/myStyle.css" rel="stylesheet" ></link>
</head>
<body>
	<h1>Welcome To My Java EE Playground</h1>
	<p>Current Time is: <%= SimpleDateFormat.getInstance().format(new Date()) %></p>
	<p>
		<a href ="admin/hello.aspx">Hello Servlet</a><br/>
		<a href ="admin/dump.view">Dump Servlet</a><br/>
		<a href ="customer/createCustomer.jsp">Create Customer</a><br/>
		<a href ="hello.jsp">Hello JSP</a><br/>
		<a href ="admin/dump.jsp">Dump JSP</a><br/>
		<a href ="customer/createCustomer1.jsp">測試交談時期</a><br/>
	</p>
</body>
</html>