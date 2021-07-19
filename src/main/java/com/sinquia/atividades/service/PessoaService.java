package com.sinquia.atividades.service;

import com.sinquia.atividades.dto.PessoaDTO;
import com.sinquia.atividades.mapper.PessoaMapper;
import com.sinquia.atividades.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository repository;

    public PessoaDTO adicionarPessoa(PessoaDTO pessoa) {
        return new PessoaDTO(1L,"yr", BigDecimal.ZERO);
    }
}
