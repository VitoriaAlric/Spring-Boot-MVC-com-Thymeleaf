package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.CargoDao;
import domain.CargoEntity;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoDao dao;

	@Override
	public void salvar(CargoEntity cargoEntity) {
		dao.save(cargoEntity);

	}

	@Override
	public void editar(CargoEntity cargoEntity) {
		dao.update(cargoEntity);

	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);

	}

	@Override
	@Transactional(readOnly = true)
	public CargoEntity buscarPorId(Long id) {

		return dao.findById(id);

	}

	@Override
	@Transactional(readOnly = true)
	public List<CargoEntity> buscarTodos() {

		return dao.findAll();

	}

}
