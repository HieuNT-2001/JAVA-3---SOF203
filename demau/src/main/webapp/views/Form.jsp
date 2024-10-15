<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Bootstrap demo</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <script>
      function confirmAction(action) {
        if (confirm("Bạn có muốn " + action + " không?")) {
          alert(action + " thành công");
          return true;
        }
        return false;
      }
    </script>
  </head>
  <body>
    <div class="container mt-5">
      <form
        action="../ban/add"
        method="get"
        onsubmit="return confirmAction('thêm')"
      >
        <div class="mb-3">
          <label for="id" class="form-label">Mã</label>
          <input
            type="number"
            class="form-control"
            id="id"
            name="id"
            required
          />
        </div>

        <div class="mb-3">
          <label for="name" class="form-label">Tên</label>
          <input
            type="text"
            class="form-control"
            id="name"
            name="name"
            required
          />
        </div>

        <div class="mb-3">
          <label for="hobby" class="form-label">Sở thích</label>
          <input
            type="text"
            class="form-control"
            id="hobby"
            name="hobby"
            required
          />
        </div>

        <div>
          <input
            class="form-check-input"
            type="radio"
            name="gender"
            id="male"
            value="1"
            checked
          />
          <label class="form-check-label" for="male"> Nam </label>
          <input
            class="form-check-input"
            type="radio"
            name="gender"
            id="female"
            value="0"
          />
          <label class="form-check-label" for="female"> Nữ </label>
        </div>
        <br />

        <button type="submit" class="btn btn-primary">ADD</button>
      </form>

      <table class="table">
        <thead>
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
          <c:forEach var="entity" items="${list }" varStatus="status">
            <tr>
              <th scope="row">${status.count }</th>
              <td>${entity.id }</td>
              <td>${entity.name }</td>
              <td>${entity.hobby }</td>
              <td>${entity.gender == true ? 'Nam' : 'Nữ' }</td>
              <td>
                <a
                  href='<c:url value="/ban/remove?id=${entity.id }"></c:url>'
                  class="btn btn-danger"
                  onclick="return confirmAction('xóa')"
                  >DELTE</a
                >
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
