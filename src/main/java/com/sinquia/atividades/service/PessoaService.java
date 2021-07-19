package com.sinquia.atividades.service;

import com.sinquia.atividades.dto.PessoaDTO;
import com.sinquia.atividades.mapper.PessoaMapper;
import com.sinquia.atividades.model.Pessoa;
import com.sinquia.atividades.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository repository;

    @Autowired
    PessoaMapper mapper;

    public PessoaDTO adicionarPessoa(PessoaDTO dto) {
        Pessoa pessoa = this.mapper.toEntity(dto);
        pessoa = this.repository.save(pessoa);
        return this.mapper.toDto(pessoa);
    }
}
