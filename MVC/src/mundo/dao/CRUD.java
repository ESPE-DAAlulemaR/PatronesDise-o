package mundo.dao;

import java.util.List;

public interface CRUD<T> {

	List<T> listar();
}
