package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.XeMayDAO;
import entity.XeMay;

/**
 * Servlet implementation class mainServlet
 */
@WebServlet({ "/xemay/hien-thi", "/xemay/add", "/xemay/remove" })
public class mainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		if (url.contains("/xemay/hien-thi")) {
			request.setAttribute("list", XeMayDAO.getAll());
			request.getRequestDispatcher("../views/Form.jsp").forward(request, response);
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

		if (url.contains("xemay/add")) {
			String inputMa = request.getParameter("ma");
			String inputTen = request.getParameter("ten");
			String inputSoLuong = request.getParameter("so-luong");
			String inputMoTa = request.getParameter("trang-thai");
			boolean isValidate = true;

			if (inputMa.isBlank()) {
				isValidate = false;
			}

			if (inputTen.isBlank()) {
				isValidate = false;
			}

			if (inputSoLuong.isBlank()) {
				isValidate = false;
			}

			try {
				Integer.parseInt(inputSoLuong);
			} catch (Exception e) {
				// TODO: handle exception
				isValidate = false;
			}

			if (isValidate) {
				XeMay entty = new XeMay(0, inputMa, inputTen, Integer.parseInt(inputSoLuong), inputMoTa);
				XeMayDAO.add(entty);
			}

			response.sendRedirect("../xemay/hien-thi");
		}

		if (url.contains("xemay/remove")) {
			int id = Integer.parseInt(request.getParameter("id"));
			XeMayDAO.remove(id);
			response.sendRedirect("../xemay/hien-thi");
		}
	}

}
