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
				<h1>Enter Student Details</h1>
				<form action="add-student" method="post">
					<div class="form-group">
						<label>Roll Number</label> <input type="number"
							class="form-control" name="rollNumber">
					</div>

					<div class="form-group">
						<label>Name</label> <input type="text" class="form-control"
							name="name">
					</div>
					<div class="form-group">
						<label>Gender</label> 
						 <select class="form-control" name="gender">
  							  <option value="male">Male</option>
   							 <option value="female">Female</option>
   							 <option value="other">Other</option>
 						 </select>
					</div>
					<div class="form-group">
						<label>Address</label> <input type="text" class="form-control"
							name="address">
					</div>

					<div class="form-group">
						<label>Email</label> <input type="text" class="form-control"
							name="email">
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