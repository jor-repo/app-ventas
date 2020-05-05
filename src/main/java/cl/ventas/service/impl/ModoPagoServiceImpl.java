package cl.ventas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import cl.ventas.model.ModoPago;
import cl.ventas.repo.IModoPagoRepo;
import cl.ventas.service.IModoPagoService;

public class ModoPagoServiceImpl implements IModoPagoService{

	@Autowired
	private IModoPagoRepo repo;
	
	@Override
	public ModoPago registrar(ModoPago pac) {
		return repo.save(pac);
	}

	@Override
	public ModoPago modificar(ModoPago pac) {
		return repo.save(pac);
	}

	@Override
	public List<ModoPago> listar() {
		return repo.findAll();
	}

	@Override
	public ModoPago leerPorId(Integer id) {
		Optional<ModoPago> op = repo.findById(id);
		return op.isPresent() ? op.get(): new ModoPago();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
	
}
