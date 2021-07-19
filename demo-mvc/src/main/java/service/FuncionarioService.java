package service;

import java.util.List;

import domain.FuncionarioEntity;

public interface FuncionarioService {
	
	void salvar(FuncionarioEntity funcionarioEntity);

	void editar(FuncionarioEntity funcionarioEntity);

	void excluir(Long id);

	FuncionarioEntity buscarPorId(Long id);

	List<FuncionarioEntity> buscarTodos();

}
