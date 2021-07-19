package service;

import java.util.List;

import domain.CargoEntity;

public interface CargoService {
	
	void salvar (CargoEntity cargoEntity);
	
	void editar (CargoEntity cargoEntity);
	
	void excluir(Long id);
		
	CargoEntity buscarPorId (Long id);
	
	List<CargoEntity> buscarTodos();


	
}
