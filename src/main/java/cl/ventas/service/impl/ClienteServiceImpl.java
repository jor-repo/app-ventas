package cl.ventas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ventas.model.Cliente;
import cl.ventas.repo.IClienteRepo;
import cl.ventas.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepo repo;
	
	@Override
	public Cliente registrar(Cliente pac) {
		return repo.save(pac);
	}

	@Override
	public Cliente modificar(Cliente pac) {
		return repo.save(pac);
	}

	@Override
	public List<Cliente> listar() {
		return repo.findAll();
	}

	@Override
	public Cliente leerPorId(Integer id) {
		Optional<Cliente> op = repo.findById(id);
		return op.isPresent() ? op.get(): new Cliente();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
	
}
