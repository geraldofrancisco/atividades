package com.sinquia.atividades.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
@Entity
@Table(name = "movimento")
public class Movimento implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "id_pessoa", nullable = false)
    private Long pessoaId;

    @Column(name = "id_atividade", nullable = false)
    private Long atividadeId;

    private LocalDateTime inicio;

    private LocalDateTime fim;

    private boolean concluido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id", updatable = false, insertable = false)
    private Pessoa pessoa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_atividade", referencedColumnName = "id", updatable = false, insertable = false)
    private Atividade atividade;
}
