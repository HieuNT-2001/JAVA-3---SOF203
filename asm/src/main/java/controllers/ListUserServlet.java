package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entity.UserEntity;

/**
 * Servlet implementation class ListUserServlet
 */
@WebServlet("/list-user")
public class ListUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<UserEntity> listUser = new ArrayList<>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListUserServlet() {
		super();
		// TODO Auto-generated constructor stub
		listUser.add(new UserEntity(1, "Hieu", "hieuntpp03096", 1));
		listUser.add(new UserEntity(2, "Lam", "lamntpp03096", 2));
		listUser.add(new UserEntity(3, "Nam", "namntpp03096", 2));
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Thêm mới user từ User.jsp nếu có
		HttpSession session = request.getSession();
		UserEntity user = (UserEntity) session.getAttribute("user"); // Lấy thông tin user mới từ session
		if (user != null) {
			listUser.add(user);
		}
		
		request.setAttribute("listUser", listUser);
		request.getRequestDispatcher("views/ListUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Chuyen sang trang nhap thong tin user moi
		request.getRequestDispatcher("views/User.jsp").forward(request, response);
	}

}
