<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
<h1>Hello from Spring MVC</h1>

<%
	Integer id = (Integer)request.getAttribute("id");
	String name = (String)request.getAttribute("name");
	Integer salary = (Integer)request.getAttribute("salary");
	
	out.println("id = "+id);
	out.println("name = "+name);
	out.println("salary = "+salary);
%>
	<h3>ID = ${id}</h3>
	<h3>Name = ${name}</h3>
	<h3>Salary = ${salary}</h3>
	
</body>
</html>