package mundo;

import mundo.dao.*;

public class App {

	public static void main(String[] args) {
		IConexion cx1 = new ConexionMySQL("root", "toor", "localhost");				
		
		IConexion cx2 = new ConexionPostgre("Postgre", "root", "192.168.1.1");
		
		PersonaDAO dao = new PersonaDAOImpl();
		dao.setConexion(cx1);
		
		dao.listarTodos();
		
	}
}
