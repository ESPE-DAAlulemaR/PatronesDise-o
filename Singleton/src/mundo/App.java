package mundo;

import mundo.model.Conexion;

public class App {

	public static void main(String[] args) {
		//Instanciaci�n por constructor proh�bido por ser "private"
		//Conexion c = new Conexion();
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();
		
		boolean rpta = c instanceof Conexion;
		System.out.println(rpta);
	}
}
