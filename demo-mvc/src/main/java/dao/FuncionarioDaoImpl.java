package dao;

import org.springframework.stereotype.Repository;

import domain.FuncionarioEntity;

@Repository
public abstract class FuncionarioDaoImpl extends AbstractDao<FuncionarioEntity, Long> implements FuncionarioDao{

}
