package com.sinquia.atividades.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class MovimentoId implements Serializable {

    @Column(name = "id_pessoa", nullable = false)
    private Long pessoaId;

    @Column(name = "id_atividade", nullable = false)
    private Long atividadeId;

}
