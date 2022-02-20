package mundo.dao;

import mundo.model.Medico;

public interface MedicoDAO extends CRUD<Medico>{

	void curar();

}
