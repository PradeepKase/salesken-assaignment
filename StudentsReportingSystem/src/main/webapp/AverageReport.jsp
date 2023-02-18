<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp"%>
<title>Average Report</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark"
		style="background-color: #37b3d9; height: 80px;">
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="home.jsp"
					style="font-family: sans-serif; font-size: 22px">Home <span
						class="sr-only">(current)</span></a></li>
			</ul>
		</div>
	</nav>
	<fieldset>
		<table class="table" border="2"
			style="margin-top: 25px; text-align: center">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Average marks for English</th>
					<th scope="col">Average marks for Maths</th>
					<th scope="col">Average marks for Science</th>
					<th scope="col">Average Percentage of whole Semester</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="l" items="${list}">
					<tr>
						<td>${l.english}</td>
						<td>${l.maths}</td>
						<td>${l.science}</td>
						<td>${l.averagePercentage}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="container text-center">
			<a href="home.jsp" class="btn btn-outline-warning">Go Back</a> <a
				href="addStudent.jsp" class="btn btn-outline-success">Add Student</a>
		</div>
	</fieldset>
</body>
</html>