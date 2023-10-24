package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

	@Override
	public Boolean ValidarUsuario(String usuario, String password) {
		// TODO Auto-generated method stub
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("CL2ORTIZ");
		EntityManager emanager=conex.createEntityManager();
		Query consulta=emanager.createQuery("select u from TblUsuariocl2 u where u.usuariocl2=:x and u.passwordcl2=:y",TblUsuariocl2.class);
		
			consulta.setParameter("x",usuario);
			consulta.setParameter("y",password);
			List<TblUsuariocl2> acceso=consulta.getResultList();
			
		
		return !acceso.isEmpty();
	}

}
