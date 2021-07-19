package dao;

import org.springframework.stereotype.Repository;

import domain.CargoEntity;

@Repository
public abstract class CargoDaoImpl extends AbstractDao<CargoEntity, Long> implements CargoDao{
	
	
}
