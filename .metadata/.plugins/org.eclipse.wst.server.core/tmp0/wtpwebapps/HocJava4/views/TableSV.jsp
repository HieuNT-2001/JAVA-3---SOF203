<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Tên</th>
				<th scope="col">Tuổi</th>
				<th scope="col">Giới tính</th>
				<th scope="col">Nơi sinh</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="data" items="${danhSach }">
				<!-- duyệt danh sách để in ra từng dòng -->
				<tr>
					<th scope="row">1</th>
					<td>${data[0] }</td>
					<td>${data[1] }</td>
					<td>${data[2] }</td>
					<td>${data[3] }</td>
				</tr>
			</c:forEach>
			<!-- 
			<tr>
					<th scope="row">1</th>
					<td>${ten }</td>
					<td>${tuoi }</td>
					<td>${gioiTinh }</td>
					<td>${noiSinh }</td>
				</tr> 
			-->
		</tbody>
	</table>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>