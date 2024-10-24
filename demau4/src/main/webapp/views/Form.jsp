<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html lang="vi">

    <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Quản lý bạn bè</title>
      <!-- Bootstrap CSS -->
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>
      <div class="container mt-5">
        <h1 class="text-center mb-4">Quản lý bạn bè</h1>

        <!-- Form quản lý bạn bè -->
        <form id="friend-form" class="mb-5">
          <div class="row mb-3">
            <div class="col-md-6">
              <label for="ma" class="form-label">Mã:</label>
              <input type="text" class="form-control" id="ma" name="ma">
            </div>
            <div class="col-md-6">
              <label for="ten" class="form-label">Tên:</label>
              <input type="text" class="form-control" id="ten" name="ten">
            </div>
          </div>
          <div class="row mb-3">
            <div class="col-md-6">
              <label for="so-thich" class="form-label">Sở thích:</label>
              <input type="text" class="form-control" id="so-thich" name="so-thich">
            </div>
            <div class="col-md-6">
              <label class="form-label">Giới tính:</label>
              <div class="form-check">
                <input class="form-check-input" type="radio" name="gioi-tinh" id="nam" value="Nam">
                <label class="form-check-label" for="nam">Nam</label>
              </div>
              <div class="form-check">
                <input class="form-check-input" type="radio" name="gioi-tinh" id="nu" value="Nữ">
                <label class="form-check-label" for="nu">Nữ</label>
              </div>
            </div>
          </div>
          <button type="submit" class="btn btn-success">ADD</button>
        </form>

        <!-- Bảng quản lý bạn bè -->
        <table class="table table-bordered">
          <thead class="table-light">
            <tr>
              <th>STT</th>
              <th>Mã bạn</th>
              <th>Tên bạn</th>
              <th>Sở thích</th>
              <th>Giới tính</th>
              <th>Hành động</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>1</td>
              <td>Mark</td>
              <td>Otto</td>
              <td>@mdo</td>
              <td>Nam</td>
              <td><button class="btn btn-danger btn-sm">Remove</button></td>
            </tr>
          </tbody>
        </table>
      </div>

      <!-- Bootstrap JS và các thư viện kèm theo -->
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
    </body>

    </html>