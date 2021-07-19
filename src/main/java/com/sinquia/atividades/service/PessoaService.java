package com.sinquia.atividades.service;

import com.sinquia.atividades.dto.PessoaDTO;
import com.sinquia.atividades.mapper.PessoaMapper;
import com.sinquia.atividades.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository repository;

    @Autowired
    PessoaMapper mapper;

    public PessoaDTO adicionarPessoa(PessoaDTO pessoa) {
        return null;
    }
}
