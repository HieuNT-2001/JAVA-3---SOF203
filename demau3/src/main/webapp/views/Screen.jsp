<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
      <meta charset="utf-8" />
      <meta name="viewport" content="width=device-width, initial-scale=1" />
      <title>Index</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />
    </head>

    <body>
      <div class="container">
        <h1>Title</h1>
        <form action="../sach/add" method="post" onsubmit="return confirm('Bạn có muốn thêm không')">
          <div class="mb-3">
            <label for="ma" class="form-label">Mã</label>
            <input type="text" class="form-control" id="ma" name="ma" required />
          </div>

          <div class="mb-3">
            <label for="ten" class="form-label">Tên</label>
            <input type="text" class="form-control" id="ten" name="ten" required />
          </div>

          <div class="mb-3">
            <label for="so-trang" class="form-label">Số Trang</label>
            <input type="number" class="form-control" id="so-trang" name="so-trang" required />
          </div>

          <div class="mb-3">
            <label for="don-gia" class="form-label">Đơn giá</label>
            <input type="number" class="form-control" id="don-gia" name="don-gia" required />
          </div>

          <h3 class="text-danger">${loi }</h3>

          <button type="submit" class="btn btn-primary">Add</button>
        </form>

        <table class="table">
          <thead>
            <tr>
              <th scope="col">STT</th>
              <th scope="col">Mã</th>
              <th scope="col">Tên</th>
              <th scope="col">Số trang</th>
              <th scope="col">Đơn giá</th>
              <th scope="col">Hành động</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="entity" items="${list }" varStatus="status">
              <tr>
                <th scope="row">${status.count }</th>
                <td>${entity.ma }</td>
                <td>${entity.ten }</td>
                <td>${entity.soTrang }</td>
                <td>${entity.donGia }</td>
                <td>
                  <form action="../sach/remove" method="post" onsubmit="return confirm('Bạn có muốn xóa không')">
                    <input type="hidden" name="id" value="${entity.id}">
                    <button type="submit" class="btn btn-danger">Remove</button>
                  </form>
                </td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
    </body>

    </html>