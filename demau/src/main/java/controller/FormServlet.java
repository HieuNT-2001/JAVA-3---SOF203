package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.banDAO;
import entity.Ban;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet({ "/ban/hien-thi", "/ban/add", "/ban/remove" })
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormServlet() {
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
		
		if (url.contains("/ban/hien-thi")) {
			request.setAttribute("list", banDAO.getAll());
			request.getRequestDispatcher("../views/Form.jsp").forward(request, response);
		}
		
		if (url.contains("/ban/add")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String name  = request.getParameter("name");
			String hobby  = request.getParameter("hobby");
			boolean gender = request.getParameter("gender").equals("1");
			Ban entity = new Ban(id, name, hobby, gender);
			banDAO.add(entity);
			response.sendRedirect("../ban/hien-thi");
		}
		
		if (url.contains("/ban/remove")) {
			int id = Integer.parseInt(request.getParameter("id"));
			banDAO.remove(id);
			response.sendRedirect("../ban/hien-thi");
		}
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
