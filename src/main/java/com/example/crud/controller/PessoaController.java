package com.example.crud.controller;

import com.example.crud.entitie.Pessoa;
import com.example.crud.record.PessoaRequestDTO;
import com.example.crud.record.PessoaResponseDTO;
import com.example.crud.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @DeleteMapping

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void savePessoa(@RequestBody PessoaRequestDTO dados){
        Pessoa pessoa = new Pessoa(dados);
        pessoaRepository.save(pessoa);
        return;
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<PessoaResponseDTO> getAllPessoa() {
        List<PessoaResponseDTO> pessoaList = pessoaRepository.findAll().stream().map(PessoaResponseDTO::new).toList();
        return pessoaList;
    }
}
