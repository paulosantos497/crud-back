package com.example.crud.record;


import com.example.crud.entitie.Pessoa;

public record PessoaResponseDTO(Long id, String nome, String cpf, Integer idade) {

    public PessoaResponseDTO(Pessoa pessoa){
    this(pessoa.getId(), pessoa.getNome(), pessoa.getCpf(), pessoa.getIdade());
    }
}
