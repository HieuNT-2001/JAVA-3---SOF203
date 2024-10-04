package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import entity.UserEntity;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
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
		request.getRequestDispatcher("views/User.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Lay du lieu tu User.jsp
		String inputID = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int type = Integer.parseInt(request.getParameter("type"));

		// Kiem tra trong du lieu
		if (!inputID.isBlank() && !name.isBlank() && !email.isBlank()) {
			HttpSession session = request.getSession();
			int id = Integer.parseInt(inputID);
			session.setAttribute("user", new UserEntity(id, name, email, type)); // Lưu thông tin user mới vào session
			response.sendRedirect(request.getContextPath() + "/list-user"); // Điều hướng sang list-user
		} else {
			request.setAttribute("error", "Bạn phải nhập đầy đủ thông tin");
			request.getRequestDispatcher("views/User.jsp").forward(request, response);
		}
	}

}
