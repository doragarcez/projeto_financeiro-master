package proj.financeiro.api.entities;

import jakarta.persistence.*;
import proj.financeiro.api.dto.DadosPessoa;

@Table(name = "pessoas")
@Entity(name = "Pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    @Embedded
    private Endereco Endereco;

    public Pessoa(DadosPessoa dadosPessoa) {
        this.nome = dadosPessoa.nome();
        this.Endereco = new Endereco(dadosPessoa.endereco());
    }
}
