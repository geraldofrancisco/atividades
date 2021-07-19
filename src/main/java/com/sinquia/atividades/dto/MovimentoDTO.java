package com.sinquia.atividades.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovimentoDTO {
    private Long id;
    private Long pessoaId;
    private Long atividadeId;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private boolean concluido;

    public MovimentoDTO(Long id, Long pessoaId, Long atividadeId) {
        this.id = id;
        this.pessoaId = pessoaId;
        this.atividadeId = atividadeId;
    }
}
