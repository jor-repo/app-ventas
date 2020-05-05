package cl.ventas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.ventas.model.Categoria;

public interface ICategoriaRepo extends JpaRepository<Categoria, Integer> {

}
