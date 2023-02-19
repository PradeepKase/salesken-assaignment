<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Student Reporting System</title>

</head>
<body style="background-color: #3e9cef">
	<div class="container mt-3 text-center" border-radius="60px">
		<h1 style="font-size: 60px">Student Reporting System</h1>
		<br> <br>
		<div class="list-group">
				<a href="./home.jsp" class="list-group-item list-group-item-action"><h3>Home</h3></a> 
				<a href="./addStudent.jsp" class="list-group-item list-group-item-action"><h3>Add New Student</h3></a>
				<a href="./addMarks.jsp" class="list-group-item list-group-item-action"><h3>Edit Student Marks</h3></a> 
				<a href="./reports.jsp" class="list-group-item list-group-item-action"><h3>See Reports</h3></a>
		</div>
	</div>
</body>
</html>