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
      <div class="container mt-5">
        <h1>DANH SÁCH SẢN PHẨM</h1>
        <form action="../sanpham/add" method="post" onsubmit="return confirm('Bạn có muốn thêm không')">
          <div class="mb-3">
            <label for="ma" class="form-label">Mã sản phẩm</label>
            <input type="text" class="form-control" id="ma" name="ma" required />
          </div>

          <div class="mb-3">
            <label for="ten" class="form-label">Tên sản phẩm</label>
            <input type="text" class="form-control" id="ten" name="ten" required />
          </div>

          <div class="mb-3">
            <label for="so-luong" class="form-label">Số lượng</label>
            <input type="number" class="form-control" id="so-luong" name="so-luong" required />
          </div>

          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Trạng thái</label><br />
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" name="trang-thai" id="cu" value="1" checked />
              <label class="form-check-label" for="cu">Cũ</label>
            </div>

            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" name="trang-thai" id="moi" value="0" />
              <label class="form-check-label" for="moi">Mới</label>
            </div>
          </div>

          <button type="submit" class="btn btn-primary">Add</button>
        </form>

        <table class="table">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Mã SP</th>
              <th scope="col">Tên SP</th>
              <th scope="col">Số lượng</th>
              <th scope="col">Trạng thái</th>
              <th scope="col">Action</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="sp" items="${list }" varStatus="status">
              <tr>
                <th scope="row">${status.count }</th>
                <td>${sp.ma }</td>
                <td>${sp.ten }</td>
                <td>${sp.soLuong }</td>
                <td>${sp.trangThai == 1 ? 'Cũ' : 'Mới' }</td>
                <td>
                  <form action="../sanpham/remove" method="post" onsubmit="return confirm('Bạn có muốn xóa không')">
                    <input type="hidden" name="id" id="id" value="${sp.id }">
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