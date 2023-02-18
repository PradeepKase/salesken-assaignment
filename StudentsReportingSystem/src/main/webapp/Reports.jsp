<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp"%>
<title>Reports</title>
</head>
<body style="background-color: #3e9cef">
	<div class="container mt-3 text-center" border-radius="50px">
		<h1 style="font-size: 60px">View Reports</h1>
		<br> <br>
		<div class="list-group">
				<a href="./home.jsp" class="list-group-item list-group-item-action"><h3>Home</h3></a> 
				<a href="./chooseSemester.jsp" class="list-group-item list-group-item-action"><h3>Average Report</h3></a>
				<a href="topstudents" class="list-group-item list-group-item-action"><h3>Top Two Students</h3></a> 
		</div>
	</div>
</body>
</html>