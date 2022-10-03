package diagramaclases;


/**
 * @author labc205
 * @version 1.0
 * @created 27-sep.-2022 09:24:32
 */
public class Factura {

	private DateTime fechaFact;
	private int idFact;
	public Cliente m_Cliente;
	public Vendedor m_Vendedor;
	public Carrito m_Carrito;

	public Factura(){

	}

	public void finalize() throws Throwable {

	}
	public double calcIva(){
		return 0;
	}

	public double calcMonto(){
		return 0;
	}

	public double calcNeto(){
		return 0;
	}
}//end Factura