<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>User</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

</head>
<body>

	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Type</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${listUser}" varStatus="userStatus">
					<tr>
						<th scope="row">${user.id }</th>
						<td>${user.name } </td>
						<td>${user.email }</td>
						<td>${user.type == 1 ? 'admin' : 'user'}</td>
						<td>
							<a href="<c:url value="/edit-user?id=${user.id }"/>" class="btn btn-secondary">Sửa</a>
							<a href="<c:url value="/remove-user?id=${user.id }"/>" class="btn btn-secondary">Xóa</a>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
		<a href="<c:url value="/add-user"/>" class="btn btn-primary"> Thêm </a>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous">
	</script>
	
</body>
</html>