package mundo;

import mundo.dao.*;
import mundo.model.Persona;

public class App {
	
	public static void main(String[] args) {
		CRUD<Persona> dao = new PersonaDAOImpl();
		dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));
		
		Persona per = new Persona();
		per.setNombres("Dannyel Alejandro");
		dao.registrar(per);
	}

}
