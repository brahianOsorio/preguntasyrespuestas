package com.concurso.preguntasrespuestas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.concurso.preguntasrespuestas.entity.HistoricoEntity;

public interface HistoricoDao extends JpaRepository<HistoricoEntity, Long>{

}
