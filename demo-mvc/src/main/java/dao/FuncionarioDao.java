package dao;

import java.util.List;

import domain.FuncionarioEntity;

public interface FuncionarioDao {

	void save(FuncionarioEntity funcionarioEntity);

	void update(FuncionarioEntity funcionarioEntity);

	void delete(Long id);

	FuncionarioEntity findById(long id);

	List<FuncionarioEntity> findAll();

}
