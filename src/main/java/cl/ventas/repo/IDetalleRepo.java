package cl.ventas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.ventas.model.Detalle;

public interface IDetalleRepo extends JpaRepository<Detalle, Integer>{

}
