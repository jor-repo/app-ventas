package cl.ventas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.ventas.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer>{

}
