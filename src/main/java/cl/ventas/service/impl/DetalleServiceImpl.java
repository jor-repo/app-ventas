package cl.ventas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ventas.model.Detalle;
import cl.ventas.repo.IDetalleRepo;
import cl.ventas.service.IDetalleService;

@Service
public class DetalleServiceImpl implements IDetalleService{

	@Autowired
	private IDetalleRepo repo;
	
	@Override
	public Detalle registrar(Detalle pac) {
		return repo.save(pac);
	}

	@Override
	public Detalle modificar(Detalle pac) {
		return repo.save(pac);
	}

	@Override
	public List<Detalle> listar() {
		return repo.findAll();
	}

	@Override
	public Detalle leerPorId(Integer id) {
		Optional<Detalle> op = repo.findById(id);
		return op.isPresent() ? op.get(): new Detalle();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}	
	
	
}
