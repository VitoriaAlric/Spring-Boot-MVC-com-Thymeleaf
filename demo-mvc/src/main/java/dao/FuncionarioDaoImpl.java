package dao;

import org.springframework.stereotype.Repository;

import com.mballe.curso.boot.domain.FuncionarioEntity;

@Repository
public abstract class FuncionarioDaoImpl extends AbstractDao<FuncionarioEntity, Long> implements FuncionarioDao{

}
