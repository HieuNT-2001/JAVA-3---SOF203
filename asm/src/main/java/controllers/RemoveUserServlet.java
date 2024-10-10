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
 * Servlet implementation class RemoveUserServlet
 */
@WebServlet("/remove-user")
public class RemoveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao userDAO = new UserDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemoveUserServlet() {
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
		userDAO.remove(id);
		response.sendRedirect(request.getContextPath() + "/list-user");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
