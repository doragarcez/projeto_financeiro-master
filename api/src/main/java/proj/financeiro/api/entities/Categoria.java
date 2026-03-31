package proj.financeiro.api.entities;

import jakarta.persistence.*;
import proj.financeiro.api.dto.DadosCategoria;

@Table(name = "categorias")
@Entity(name = "Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    public Categoria(DadosCategoria dadosCategoria){
        this.nome = dadosCategoria.nome();
    }
}
