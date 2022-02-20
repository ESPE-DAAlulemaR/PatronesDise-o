package mundo.model;

public class Conexion {
	
	private static Conexion instancia;
	
	private Conexion() {}
	
	public static Conexion getInstancia() {
		if(instancia == null)
			instancia = new Conexion();

		return instancia;
	}
	
	public void conectar() {
		System.out.println("Me conect� a la BD");
	}
	
	public void desconectar() {
		System.out.println("Me desconect� de la BD");
	}

}
