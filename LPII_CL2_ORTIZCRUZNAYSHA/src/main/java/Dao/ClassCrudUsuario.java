package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interface.IUsuarioble;
import model.TblUsuariocl2;

public class ClassCrudUsuario implements IUsuarioble{

	@Override
	public void RegistrarUsuario(TblUsuariocl2 tusuario) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("CL2ORTIZ");
		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		emanager.persist(tusuario);
		emanager.getTransaction().commit();
		emanager.close();
		
		
	}

}
