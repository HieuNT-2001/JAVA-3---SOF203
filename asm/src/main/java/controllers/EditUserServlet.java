package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.UserDao;
import entity.UserEntity;

/**
 * Servlet implementation class EditUserServlet
 */
@WebServlet("/edit-user")
public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao userDAO = new UserDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditUserServlet() {
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
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("user", userDAO.find(id));
		request.getRequestDispatcher("views/EditUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int type = Integer.parseInt(request.getParameter("type"));
		UserEntity user = userDAO.find(id);
		user.setName(name);
		user.setEmail(email);
		user.setType(type);
		userDAO.update(user);
		response.sendRedirect(request.getContextPath() + "/list-user");
	}

}
