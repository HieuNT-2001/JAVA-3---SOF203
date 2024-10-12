<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Quản lý bạn bè</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">Quản lý bạn bè</h2>

		<!-- Form nhập thông tin -->
		<form class="mb-4" action="./add" method="post">
			<div class="row mb-3">
				<div class="col-md-6">
					<label for="id" class="form-label">Mã:</label> <input type="number"
						class="form-control" id="id" name="id" />
				</div>
				<div class="col-md-6">
					<label for="hobby" class="form-label">Sở thích:</label> <input
						type="text" class="form-control" id="hobby" name="hobby" />
				</div>
			</div>

			<div class="row mb-3">
				<div class="col-md-6">
					<label for="name" class="form-label">Tên:</label> <input
						type="text" class="form-control" id="name" name="name" />
				</div>
				<div class="col-md-6">
					<label class="form-label">Giới tính:</label>
					<div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="male" value="1" checked /> <label
								class="form-check-label" for="male">Nam</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="female" value="0" /> <label class="form-check-label"
								for="female">Nữ</label>
						</div>
					</div>
				</div>
			</div>

			<button type="submit" class="btn btn-success">Add</button>
			<!-- <a href='<c:url value="/ban/add"></c:url>' class="btn btn-success">Add</a> -->
		</form>

		<!-- Bảng danh sách bạn bè -->
		<table class="table table-bordered text-center">
			<thead class="table-light">
				<tr>
					<th scope="col">STT</th>
					<th scope="col">Mã bạn</th>
					<th scope="col">Tên bạn</th>
					<th scope="col">Sở thích</th>
					<th scope="col">Giới tính</th>
					<th scope="col">Hành động</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${friends }" var="friend" varStatus="status">
					<tr>
						<th scope="row">${status.count }</th>
						<td>${friend.id }</td>
						<td>${friend.name }</td>
						<td>${friend.hobby }</td>
						<td>${friend.gender == true ? 'Nam' : 'Nữ' }</td>
						<td><a
							href='<c:url value="/ban/remove?id=${friend.id }"></c:url>'
							class="btn btn-danger">Remove</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
