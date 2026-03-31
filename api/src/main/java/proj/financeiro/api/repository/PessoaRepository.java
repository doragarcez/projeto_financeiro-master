package proj.financeiro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.financeiro.api.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
