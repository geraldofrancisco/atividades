package com.sinquia.atividades.service;

import com.sinquia.atividades.dto.MovimentoDTO;
import com.sinquia.atividades.exception.RegraNegocioException;
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


    public MovimentoDTO criarMovimento(MovimentoDTO dto) {
        if(this.existeMovimentoEmExecucao()) 
            throw new RegraNegocioException("Existe atividades em execução");

        Movimento movimento = this.mapper.toEntity(dto);
        movimento = this.repository.save(movimento);
        return this.mapper.toDto(movimento);
    }

    public boolean existeMovimentoEmExecucao() {
        Long quantidadeEmExecucao = this.repository.countByInicioIsNotNullAndConcluido(false);
        return quantidadeEmExecucao > 0L;
    }
}
