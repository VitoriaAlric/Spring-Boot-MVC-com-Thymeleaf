package dao;

import java.util.List;

import com.mballe.curso.boot.domain.DepartamentoEntity;

public interface DepartamentoDao {
	
	void save (DepartamentoEntity departamentoEntity);
	
	void update (DepartamentoEntity departamentoEntity);

	void delete (Long id);
	
	DepartamentoEntity findById(long id);
	
	List<DepartamentoEntity> findAll();
	
}
