<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Help Page</title>
</head>
<body>
<h1>This is the Help page</h1>
<h2> Here you can contact us </h2>
<h2>Our email id is given below</h2>
<%
	String name = (String)request.getAttribute("Name");
	Integer id =(Integer) request.getAttribute("id");
	LocalDateTime time=(LocalDateTime) request.getAttribute("time");
	%>
	<h2>
		My name is <%=name %>
	</h2>
	<h2>
	My id is <%=id %>
	</h2>
	<h2>
	The Time is <%=time.toString() %>
	</h2>
</body>
</html>