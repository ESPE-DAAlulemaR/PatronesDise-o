package mundo.service;

import java.util.List;

import mundo.dao.PersonaDAO;
import mundo.model.Persona;

public class PersonaServiceImpl implements PersonaService{

	private PersonaDAO dao;
	
	public PersonaServiceImpl(PersonaDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Persona> listar() {		
		return dao.listar();
	}

}
