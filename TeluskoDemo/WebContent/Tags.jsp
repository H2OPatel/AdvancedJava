
<%-- This is called Directives-> the one with <%@page %> --%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Let's look at the tags of JSP</title>
</head>


<body>

<%-- This is called Declaration-> the one with <%! %>    --%>f
<%!
	int fn = 4;
%>

<%-- This is called ScroptLet -> the one with just <% %>  --%>
<%
	out.println("We can create multiple ScriptLets");
	
	
%>

<h1>We can also put the text in the between scrptlets</h1>

<!-- another ScriptLet -->
<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	
	int k = i+ j;
	out.println("The sum of two number is : "+k);
%>
<br>
<%-- This is called Expression -> the one with <%= %> --%>
Just to use Expression My favourite number is : <%= fn%>
</body>
</html>