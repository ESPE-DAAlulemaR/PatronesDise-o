package mundo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import mundo.dao.PersonaDAOImpl;
import mundo.model.Persona;
import mundo.service.PersonaService;
import mundo.service.PersonaServiceImpl;

@Named
@ViewScoped
public class PersonaController implements Serializable {

	private List<Persona> lista;
	private PersonaService service;	
	private String motor;

	public PersonaController() {
		motor = "MYSQL";
		lista = new ArrayList<>();
		service = new PersonaServiceImpl(new PersonaDAOImpl(motor));
		listar();
	}

	public void listar() {
		lista = service.listar();
	}
	
	public void seleccionar(String motor) {
		service = new PersonaServiceImpl(new PersonaDAOImpl(motor));
		listar();
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}	

}
