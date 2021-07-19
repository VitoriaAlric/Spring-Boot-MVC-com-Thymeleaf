package com.mballe.curso.boot.service;

import java.util.List;

import com.mballe.curso.boot.domain.CargoEntity;

public interface CargoService {
	
	void salvar (CargoEntity cargoEntity);
	
	void editar (CargoEntity cargoEntity);
	
	void excluir(Long id);
		
	CargoEntity buscarPorId (Long id);
	
	List<CargoEntity> buscarTodos();


	
}
