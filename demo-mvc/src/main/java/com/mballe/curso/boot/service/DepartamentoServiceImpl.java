package com.mballe.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballe.curso.boot.domain.DepartamentoEntity;

import dao.DepartamentoDao;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(DepartamentoEntity departamentoEntity) {

		dao.save(departamentoEntity);

	}

	@Transactional(readOnly = false)
	@Override
	public void editar(DepartamentoEntity departamentoEntity) {

		dao.update(departamentoEntity);

	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);

	}

	@Transactional(readOnly = true)
	@Override
	public DepartamentoEntity buscarPorId(Long id) {
	
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<DepartamentoEntity> buscarTodos() {
		return dao.findAll();
	}

}
