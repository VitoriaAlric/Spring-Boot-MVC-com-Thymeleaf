package com.mballe.curso.boot.service;

import java.util.List;

import com.mballe.curso.boot.domain.DepartamentoEntity;

public interface DepartamentoService {

	
	void salvar (DepartamentoEntity departamentoEntity);
	
	void editar (DepartamentoEntity departamentoEntity);
	
	void excluir(Long id);
		
	DepartamentoEntity buscarPorId (Long id);
	
	List<DepartamentoEntity> buscarTodos();


}
