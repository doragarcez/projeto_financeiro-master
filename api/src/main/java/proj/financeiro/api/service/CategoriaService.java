package proj.financeiro.api.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.financeiro.api.dto.DadosCategoria;
import proj.financeiro.api.entities.Categoria;
import proj.financeiro.api.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional
    public void cadastroCategoria(DadosCategoria dadosCategoria){
        categoriaRepository.save(new Categoria(dadosCategoria));
    }
}