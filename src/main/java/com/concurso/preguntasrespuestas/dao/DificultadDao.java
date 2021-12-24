package com.concurso.preguntasrespuestas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concurso.preguntasrespuestas.entity.DificultadEntity;

public interface DificultadDao extends JpaRepository<DificultadEntity, Long>{

}
