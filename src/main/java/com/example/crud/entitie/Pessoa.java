package com.example.crud.entitie;

import com.example.crud.record.PessoaRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "pessoa")
@Table(name = "pessoa")
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private Integer idade;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public Pessoa(PessoaRequestDTO dados){
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.idade = dados.idade();
    }
}
