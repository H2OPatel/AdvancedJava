<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Sample JSP</title>
</head>
<body bgcolor="orange">
	
	<%
	int i  =Integer.parseInt(request.getParameter("num1"));
	int j  =Integer.parseInt(request.getParameter("num2"));
	
	int k = i+ j;
	
	out.println("The sum with First JSP is : " + k);
	
	%>

</body>
</html>