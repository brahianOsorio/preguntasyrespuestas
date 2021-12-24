package com.concurso.preguntasrespuestas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.concurso.preguntasrespuestas.entity.UsuarioEntity;

public interface UsuarioDao extends JpaRepository<UsuarioEntity, Long> {

}
