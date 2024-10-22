package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.SanPhamDAO;
import entity.SanPham;

/**
 * Servlet implementation class SanPhamServlet
 */
@WebServlet({ "/sanpham/hien-thi", "/sanpham/add", "/sanpham/remove" })
public class SanPhamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SanPhamServlet() {
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

		if (url.contains("/sanpham/hien-thi")) {
			request.setAttribute("list", SanPhamDAO.getAll());
			request.getRequestDispatcher("../views/view.jsp").forward(request, response);
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
		String loiMa = "";
		String loiTen = "";
		String loiSoLuong = "";
		boolean isError = false;

		if (url.contains("/sanpham/add")) {
			String ma = request.getParameter("ma");
			String ten = request.getParameter("ten");
			int soLuong = Integer.parseInt(request.getParameter("so-luong"));
			int trangThai = Integer.parseInt(request.getParameter("trang-thai"));

			if (ma.isBlank()) {
				loiMa = "Chưa nhập mã";
				isError = true;
			}

			if (ten.isBlank()) {
				loiTen = "Chưa nhập tên";
				isError = true;
			}

			if (loiSoLuong.isBlank()) {
				loiSoLuong = "Chưa nhập số lượng";
				isError = true;
			}
			
			if (isError) {
				request.setAttribute("loiMa", loiMa);
				request.setAttribute("loiTen", loiTen);
				request.setAttribute("loiSoLuong", loiSoLuong);
				request.getRequestDispatcher("../views/view.jsp").forward(request, response);
				return;
			}

			SanPham sp = new SanPham(0, ma, ten, soLuong, trangThai);
			SanPhamDAO.add(sp);
			response.sendRedirect("../sanpham/hien-thi");
		}

		if (url.contains("/sanpham/remove")) {
			int id = Integer.parseInt(request.getParameter("id"));
			SanPhamDAO.remove(id);
			response.sendRedirect("../sanpham/hien-thi");
		}
	}

}
