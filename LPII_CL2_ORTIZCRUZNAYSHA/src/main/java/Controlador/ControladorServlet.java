package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassCrudUsuario;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorServlet
 */
public class ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String usuario=request.getParameter("usuario");
		String password=request.getParameter("password");
		
		TblUsuariocl2 tuser = new TblUsuariocl2();
		ClassCrudUsuario cruser = new ClassCrudUsuario();
		
		tuser.setUsuariocl2(usuario);
		tuser.setPasswordcl2(password);
		cruser.RegistrarUsuario(tuser);
		System.out.println("Datos registrados");
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
