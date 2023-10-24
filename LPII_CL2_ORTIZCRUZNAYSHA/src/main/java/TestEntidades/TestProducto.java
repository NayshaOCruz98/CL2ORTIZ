package TestEntidades;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TblProductocl2;

public class TestProducto {
	public static void main(String[] args) {
		//establecemos conexion con la entidad de persistencia 
		EntityManagerFactory emana =Persistence.createEntityManagerFactory("CL2ORTIZ");
		//manejamos las entidades
		EntityManager eman = emana.createEntityManager();
		eman.getTransaction().begin();
		//instanciamos las respectivas entidades
		TblProductocl2 tproducto = new TblProductocl2();
		
//		//REGISTRAMOS DATOS A LA TABLA PRODUCTO
//		tproducto.setNombrecl2("Arroz");
//		tproducto.setPrecioventacl2(5.40);
//		tproducto.setPreciocompracl2(2.80);
//		tproducto.setEstadocl2("vigente");
//		tproducto.setDescripcioncl2("Producto mas vendido");
//		eman.persist(tproducto);
//		System.out.println("datos registrados");
//		eman.getTransaction().commit();
//		eman.close();
		
		
		//listado de produccto
		List<TblProductocl2> listado=eman.createQuery("select prod from TblProductocl2 prod",TblProductocl2.class).getResultList();
		//aplicamos el bucle for
		for(TblProductocl2 lis:listado){
			//imprimimos dentro del bucle
			System.out.println("-----------------\n"+"codigo producto--> " + lis.getIdproducto() + "\n"+
					"Nombre -->  "+lis.getNombrecl2()+ "\n" +"precio venta --> "+lis.getPrecioventacl2()+"\n"
					+ "Precio Compra--> "+lis.getPreciocompracl2()+"\n"+ "Estado-->"+lis.getEstadocl2()+"\n"+ "Decripcion-->"+lis.getDescripcioncl2());
		}//fin del bucle for 
		//confirmamos
		eman.getTransaction().commit();
		//cerramos
		eman.close();
		
		
		
	}
}
