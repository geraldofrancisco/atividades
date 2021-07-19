package com.sinquia.atividades.repository;

import com.sinquia.atividades.model.Movimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentoRepository extends JpaRepository<Movimento, Long> {
}
