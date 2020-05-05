package cl.ventas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.ventas.model.Factura;

public interface IFacturaRepo extends JpaRepository<Factura, Integer>{

}
