package com.sinquia.atividades.service;

import com.sinquia.atividades.dto.AtividadeDTO;
import com.sinquia.atividades.dto.PessoaDTO;
import com.sinquia.atividades.mapper.AtividadeMapper;
import com.sinquia.atividades.model.Atividade;
import com.sinquia.atividades.model.Pessoa;
import com.sinquia.atividades.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtividadeService {

    @Autowired
    AtividadeRepository repository;

    @Autowired
    AtividadeMapper mapper;

    public AtividadeDTO criarAtividade(AtividadeDTO dto) {
        Atividade atividade = this.mapper.toEntity(dto);
        atividade = this.repository.save(atividade);
        return this.mapper.toDto(atividade);
    }
}
