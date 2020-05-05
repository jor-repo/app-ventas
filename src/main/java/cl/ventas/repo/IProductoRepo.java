package cl.ventas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.ventas.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer>{

}
