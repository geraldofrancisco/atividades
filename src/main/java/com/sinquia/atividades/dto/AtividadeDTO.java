package com.sinquia.atividades.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtividadeDTO {
    private Long id;
    private String nome;
    private Integer esforco;
}
