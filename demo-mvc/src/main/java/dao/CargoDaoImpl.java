package dao;

import org.springframework.stereotype.Repository;

import com.mballe.curso.boot.domain.CargoEntity;

@Repository
public abstract class CargoDaoImpl extends AbstractDao<CargoEntity, Long> implements CargoDao{
	
	
}
