package com.sinquia.atividades.repository;

import com.sinquia.atividades.model.Movimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimentoRepository extends JpaRepository<Movimento, Long> {

    Long countByInicioIsNotNullAndConcluido(boolean concluido);

    List<Movimento> findByInicioIsNullAndConcluido(boolean concluido);
}
