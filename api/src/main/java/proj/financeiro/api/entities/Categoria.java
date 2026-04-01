package proj.financeiro.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import proj.financeiro.api.dto.DadosCategoria;

@Table(name = "categorias")
@Entity(name = "Categoria")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of="codigo")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    public Categoria(DadosCategoria dadosCategoria){
        this.nome = dadosCategoria.nome();
    }

    public Categoria(Long codigo){
        this.codigo = codigo;
    }
}
