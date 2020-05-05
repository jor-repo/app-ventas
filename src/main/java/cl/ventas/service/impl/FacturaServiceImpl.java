package cl.ventas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ventas.model.Factura;
import cl.ventas.repo.IFacturaRepo;
import cl.ventas.service.IFacturaService;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepo repo;
	
	@Override
	public Factura registrar(Factura pac) {
		return repo.save(pac);
	}

	@Override
	public Factura modificar(Factura pac) {
		return repo.save(pac);
	}

	@Override
	public List<Factura> listar() {
		return repo.findAll();
	}

	@Override
	public Factura leerPorId(Integer id) {
		Optional<Factura> op = repo.findById(id);
		return op.isPresent() ? op.get(): new Factura();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

	
}
