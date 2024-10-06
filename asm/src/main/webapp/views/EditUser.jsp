<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<h2>Đang sửa user có id bằng</h2>
		<form action="./edit-user" method="post">
			<!-- <div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Id </label> <input
					name="id" type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" value="${user.id }">
			</div> -->
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Name </label> <input
					name="name" type="text" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp"
					value="${user.name }">
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email </label> <input
					name="email" type="email" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp"
					value="${user.email }">
			</div>
			<div class="mb-3">
				<select name="type" class="form-select"
					aria-label="Default select example">
					<option value="1" ${user.type == 1 ? "selected" : "" }>Admin</option>
					<option value="2" ${user.type != 1 ? "selected" : "" }>User</option>
				</select>
			</div>
			<input type="hidden" name="id" value="${user.id }">
			<button class="btn btn-primary" type="submit">Sửa</button>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>