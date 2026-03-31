package proj.financeiro.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proj.financeiro.api.dto.DadosCategoria;
import proj.financeiro.api.service.CategoriaService;

@RestController
@RequestMapping("categoria")

public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @PostMapping
    public void cadastroCategoria(@RequestBody DadosCategoria dadosCategoria){
        service.cadastroCategoria(dadosCategoria);
    }
}
