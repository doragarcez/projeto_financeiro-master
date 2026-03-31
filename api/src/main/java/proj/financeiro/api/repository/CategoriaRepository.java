package proj.financeiro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.financeiro.api.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
}
