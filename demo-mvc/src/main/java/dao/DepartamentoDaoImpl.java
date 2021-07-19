package dao;

import org.springframework.stereotype.Repository;

import com.mballe.curso.boot.domain.DepartamentoEntity;

@Repository
public abstract class DepartamentoDaoImpl extends AbstractDao<DepartamentoEntity, Long> implements DepartamentoDao {
		
}
