package dao;

import java.util.List;

import com.mballe.curso.boot.domain.CargoEntity;

public interface CargoDao {

	void save(CargoEntity cargoEntity);

	void update(CargoEntity cargoEntity);

	void delete(Long id);

	CargoEntity findById(long id);

	List<CargoEntity> findAll();

}
