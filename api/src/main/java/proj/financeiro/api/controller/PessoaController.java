package proj.financeiro.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proj.financeiro.api.dto.DadosPessoa;
import proj.financeiro.api.service.PessoaService;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    @Autowired
    private PessoaService services;

    @PostMapping
    public void cadastroPessoa(@RequestBody DadosPessoa dadosPessoa){
        services.cadastroPessoa(dadosPessoa);
    }
}
