<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp"%>
<title>Insert title here</title>
</head>
<body style="background-color: #3e9cef">
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1>Select The Semester</h1>
				<form action="choose-semester" method="post">
					<div class="form-group">
						<label>Semester</label> 
						 <select class="form-control" name="semester">
  							  <option value="1">First</option>
   							 <option value="2">Second</option>
 						 </select>
					</div>
					<div class="container text-center">
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</form>
			</div>

		</div>

	</div>
</body>
</html>