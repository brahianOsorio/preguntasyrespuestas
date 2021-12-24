package com.concurso.preguntasrespuestas.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.concurso.preguntasrespuestas.entity.PreguntaEntity;

public interface PreguntaDao extends JpaRepository< PreguntaEntity, Long  > {
	
	
	List<PreguntaEntity> findByDificultad(Integer dificultad);
	
}
