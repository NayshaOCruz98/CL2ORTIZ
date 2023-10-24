package Interface;

import java.util.List;

import model.TblProductocl2;

public interface IProductoble {
	public void RegistrarProducto(TblProductocl2 tprod);
	public List<TblProductocl2> ListadoProducto();
}
