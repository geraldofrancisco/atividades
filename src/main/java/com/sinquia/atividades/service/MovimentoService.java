package com.sinquia.atividades.service;

import com.sinquia.atividades.dto.AtividadeDTO;
import com.sinquia.atividades.dto.MovimentoDTO;
import com.sinquia.atividades.mapper.MovimentoMapper;
import com.sinquia.atividades.model.Movimento;
import com.sinquia.atividades.repository.MovimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentoService {

    @Autowired
    MovimentoRepository repository;

    @Autowired
    MovimentoMapper mapper;


    public MovimentoDTO criarMovimento(MovimentoDTO movimento) {
        return null;
    }
}
