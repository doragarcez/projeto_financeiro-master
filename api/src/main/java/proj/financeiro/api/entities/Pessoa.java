package proj.financeiro.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import proj.financeiro.api.dto.DadosPessoa;

@Table(name = "pessoas")
@Entity(name = "Pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="codigo")
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

    public Pessoa(Long codigo){
        this.codigo = codigo;
    }
}
