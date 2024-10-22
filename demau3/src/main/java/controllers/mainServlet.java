package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.sachDAO;
import entity.sach;

/**
 * Servlet implementation class mainServlet
 */
@WebServlet({ "/sach/hien-thi", "/sach/add", "/sach/remove" })
public class mainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	sachDAO dao = new sachDAO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public mainServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = request.getServletPath();
		if (url.contains("sach/hien-thi")) {
			request.setAttribute("list", dao.getAll());
			request.getRequestDispatcher("../views/Screen.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = request.getServletPath();

		if (url.contains("sach/add")) {
			String inputMa = request.getParameter("ma");
			String inputTen = request.getParameter("ten");
			String inputSoTrang = request.getParameter("so-trang");
			String inputDonGia = request.getParameter("don-gia");
			Boolean isValidate = true;

			if (inputMa.isBlank()) {
				request.setAttribute("loi", "Bạn chưa nhập mã");
				isValidate = false;
			}

			if (inputTen.isBlank()) {
				request.setAttribute("loi", "Bạn chưa nhập tên");
				isValidate = false;
			}

			if (inputSoTrang.isBlank()) {
				request.setAttribute("loi", "Bạn chưa nhập số trang");
				isValidate = false;
			}

			if (inputDonGia.isBlank()) {
				request.setAttribute("loi", "Bạn chưa nhập đơn giá");
				isValidate = false;
			}

			if (isValidate) {
				sach entity = new sach(0, inputMa, inputTen, Integer.parseInt(inputSoTrang),
						Float.parseFloat(inputDonGia));
				dao.add(entity);
				response.sendRedirect("../sach/hien-thi");
			}
			
			request.getRequestDispatcher("../views/Screen.jsp").forward(request, response);

		}

		if (url.contains("sach/remove")) {
			int id = Integer.parseInt(request.getParameter("id"));
			dao.remove(id);
			response.sendRedirect("../sach/hien-thi");
		}
	}

}
