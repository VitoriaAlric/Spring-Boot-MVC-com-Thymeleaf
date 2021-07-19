package dao;

import java.util.List;

import domain.CargoEntity;

public interface CargoDao {

	void save(CargoEntity cargoEntity);

	void update(CargoEntity cargoEntity);

	void delete(Long id);

	CargoEntity findById(long id);

	List<CargoEntity> findAll();

}
