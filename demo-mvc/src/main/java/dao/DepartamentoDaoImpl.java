package dao;

import org.springframework.stereotype.Repository;

import domain.DepartamentoEntity;

@Repository
public abstract class DepartamentoDaoImpl extends AbstractDao<DepartamentoEntity, Long> implements DepartamentoDao {
		
}
