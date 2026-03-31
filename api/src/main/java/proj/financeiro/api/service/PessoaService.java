package proj.financeiro.api.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.financeiro.api.dto.DadosPessoa;
import proj.financeiro.api.entities.Pessoa;
import proj.financeiro.api.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Transactional
    public void cadastroPessoa(DadosPessoa dadosPessoa) {
        pessoaRepository.save(new Pessoa(dadosPessoa));
    }
}
