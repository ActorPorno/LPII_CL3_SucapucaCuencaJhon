package Test;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl3;

public class TestEntidadProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblProductocl3 producto = new TblProductocl3();
        ClassProductoImp crud = new ClassProductoImp();
        /*
        producto.setNombrecl3("Hamburguesa");
        producto.setPrecioventacl3(3.50);
        producto.setPreciocompcl3(4.50);
        producto.setEstadocl3("Bueno");
        producto.setDescripcl3("Burger King");
        crud.RegistrarProducto(producto);

        */
	List<TblProductocl3> listarProducto = crud.ListarProducto();
    for(TblProductocl3 p:listarProducto){
        System.out.println("C�digo: "+p.getIdproductoscl3()+"\n"+
                            "Nombre: "+p.getNombrecl3()+"\n"+
                            "Precio de Venta: "+p.getPrecioventacl3()+"\n"+
                            "Precio de Compra: "+p.getPreciocompcl3()+"\n"+
                            "Estado: "+p.getEstadocl3()+"\n"+
                            "Descripci�n: "+p.getDescripcl3()+"\n");
    }
}
}