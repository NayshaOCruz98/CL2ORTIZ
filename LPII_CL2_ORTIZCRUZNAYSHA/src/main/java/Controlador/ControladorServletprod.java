package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassCrudProducto;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorServletprod
 */
public class ControladorServletprod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorServletprod() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nombre=request.getParameter("nombre");
		double precioV=Double.parseDouble(request.getParameter("precioventa"));
		double precioC=Double.parseDouble(request.getParameter("PrecioCompra"));
		String estado=request.getParameter("estado");
		String descrip=request.getParameter("descrip");
		
		TblProductocl2 tprod = new TblProductocl2();
		ClassCrudProducto crud= new ClassCrudProducto();
		
		tprod.setNombrecl2(nombre);
		tprod.setPrecioventacl2(precioV);
		tprod.setPreciocompracl2(precioC);
		tprod.setEstadocl2(estado);
		tprod.setDescripcioncl2(descrip);
		
		crud.RegistrarProducto(tprod);
		List<TblProductocl2> listarproducto=crud.ListadoProducto();
		request.setAttribute("listado", listarproducto);
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
		
		
		
		
	}

}
