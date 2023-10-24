package Interface;

import model.TblUsuariocl2;

public interface IUsuarioble {
	public void RegistrarUsuario(TblUsuariocl2 tusuario);
	public Boolean ValidarUsuario(String usuario, String password);
}
