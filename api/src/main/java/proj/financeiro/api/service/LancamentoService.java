package proj.financeiro.api.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.financeiro.api.dto.DadosLancamento;
import proj.financeiro.api.entities.Lancamento;
import proj.financeiro.api.repository.LancamentoRepository;

@Service
public class LancamentoService{

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Transactional
    public void cadastroLancamento(DadosLancamento dadosLancamento){
        lancamentoRepository.save(new Lancamento(dadosLancamento));
    }
}
