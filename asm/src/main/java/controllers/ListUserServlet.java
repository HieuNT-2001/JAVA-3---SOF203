package controllers;

import java.util.*;
import entity.UserEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ListUserServlet
 */
@WebServlet("/list-user")
public class ListUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List<UserEntity> listUser = new ArrayList<UserEntity>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListUserServlet() {
        super();
        // TODO Auto-generated constructor stub
        listUser.add(new UserEntity(1, "Hiếu", "hieu@gmail.com", 1));
        listUser.add(new UserEntity(2, "Nam", "nam@gmail.com", 2));
        listUser.add(new UserEntity(3, "Hà", "ha@gmail.com", 2));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("listUser", this.listUser);
		request.getRequestDispatcher("views/ListUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
