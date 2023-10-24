package TestEntidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TblUsuariocl2;

public class TestUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emana =Persistence.createEntityManagerFactory("CL2ORTIZ");
		EntityManager eman = emana.createEntityManager();
		eman.getTransaction().begin();
		TblUsuariocl2 tusuario = new TblUsuariocl2();
		
		//REGISTRAMOS DATOS A LA TABLA usuario
		tusuario.setUsuariocl2("Naysha");
		tusuario.setPasswordcl2("Nich0402");
		eman.persist(tusuario);
		System.out.println("datos registrados");
		eman.getTransaction().commit();
		eman.close();
	}
}
