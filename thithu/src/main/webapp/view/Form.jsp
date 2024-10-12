<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Quản lý bạn bè</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <div class="container mt-5">
      <h2 class="text-center">Quản lý bạn bè</h2>

      <!-- Form nhập thông tin -->
      <form class="mb-4">
        <div class="row mb-3">
          <div class="col-md-6">
            <label for="ma" class="form-label">Mã:</label>
            <input type="text" class="form-control" id="ma" />
          </div>
          <div class="col-md-6">
            <label for="soThich" class="form-label">Sở thích:</label>
            <input type="text" class="form-control" id="soThich" />
          </div>
        </div>

        <div class="row mb-3">
          <div class="col-md-6">
            <label for="ten" class="form-label">Tên:</label>
            <input type="text" class="form-control" id="ten" />
          </div>
          <div class="col-md-6">
            <label class="form-label">Giới tính:</label>
            <div>
              <div class="form-check form-check-inline">
                <input
                  class="form-check-input"
                  type="radio"
                  name="gioiTinh"
                  id="nam"
                  value="Nam"
                  checked
                />
                <label class="form-check-label" for="nam">Nam</label>
              </div>
              <div class="form-check form-check-inline">
                <input
                  class="form-check-input"
                  type="radio"
                  name="gioiTinh"
                  id="nu"
                  value="Nữ"
                />
                <label class="form-check-label" for="nu">Nữ</label>
              </div>
            </div>
          </div>
        </div>

        <button type="submit" class="btn btn-success">Add</button>
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
          <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
            <td>Nam</td>
            <td>
              <button class="btn btn-danger">Remove</button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>
