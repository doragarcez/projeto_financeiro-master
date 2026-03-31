package proj.financeiro.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proj.financeiro.api.dto.DadosLancamento;
import proj.financeiro.api.service.LancamentoService;

@RestController
@RequestMapping("lancamento")
public class LancamentoController {

    @Autowired
    private LancamentoService service;

    @PostMapping
    public void cadastroLancamento(@RequestBody DadosLancamento dadosLancamento){
        service.cadastroLancamento(dadosLancamento);
    }
}
