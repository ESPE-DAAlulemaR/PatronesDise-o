package mundo.dao;

import mundo.model.Persona;

public interface PersonaDAO extends CRUD<Persona>{

	void mostrarNombre();
	
}
