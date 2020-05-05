package cl.ventas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.ventas.model.ModoPago;

public interface IModoPagoRepo extends JpaRepository<ModoPago, Integer>{

}
