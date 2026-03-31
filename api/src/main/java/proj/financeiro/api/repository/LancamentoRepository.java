package proj.financeiro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.financeiro.api.entities.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}
