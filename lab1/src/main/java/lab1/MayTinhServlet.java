package lab1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MayTinhhServlet
 */
@WebServlet("/MayTinhServlet")
public class MayTinhServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MayTinhServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("views/MayTinh.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String phepTinh = request.getParameter("action");
		int soA = Integer.parseInt(request.getParameter("soA"));
		int soB = Integer.parseInt(request.getParameter("soB"));
		float ketQua;
		
		switch (phepTinh) {
		case "cong":
			ketQua = soA + soB;
			break;
		case "tru":
			ketQua = soA - soB;
			break;
		case "nhan":
			ketQua = soA * soB;
			break;
		case "chia":
			ketQua = soA / soB;
			break;
		default:
			ketQua = 0;
			break;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("views/MayTinh.jsp");
		request.setAttribute("PHEPTINH", phepTinh);
		request.setAttribute("SOA", soA);
		request.setAttribute("SOB", soB);
		request.setAttribute("KETQUA", ketQua);
		rd.forward(request, response);
	}

}
