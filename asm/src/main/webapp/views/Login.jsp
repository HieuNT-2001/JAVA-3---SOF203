<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous" />
</head>
<body>
	<div class="container">
		<form action="./login" method="post">
			<h6 class="text-danger">${error }</h6>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Username</label>
				<input type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="username" />
				<div id="emailHelp" class="form-text"></div>
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="password" class="form-control"
					id="exampleInputPassword1" name="password" />
			</div>
			<div class="mb-3 form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1" />
				<label class="form-check-label" for="exampleCheck1">Check
					me out</label>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>