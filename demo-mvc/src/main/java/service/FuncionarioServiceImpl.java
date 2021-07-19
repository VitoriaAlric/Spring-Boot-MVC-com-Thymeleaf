package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.FuncionarioDao;
import domain.FuncionarioEntity;

@Service
@Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDao dao;

	@Override
	@Transactional(readOnly = false)
	public void salvar(FuncionarioEntity funcionarioEntity) {
		dao.save(funcionarioEntity);

	}

	@Override
	@Transactional(readOnly = false)
	public void editar(FuncionarioEntity funcionarioEntity) {
		dao.update(funcionarioEntity);

	}

	@Override
	@Transactional(readOnly = false)
	public void excluir(Long id) {

		dao.delete(id);
	}

	@Override
	public FuncionarioEntity buscarPorId(Long id) {

		return dao.findById(id);
	}

	@Override
	public List<FuncionarioEntity> buscarTodos() {

		return dao.findAll();
	}

}
