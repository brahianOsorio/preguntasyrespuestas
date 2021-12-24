package com.concurso.preguntasrespuestas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concurso.preguntasrespuestas.dao.PreguntaDao;
import com.concurso.preguntasrespuestas.dto.PreguntaDto;
import com.concurso.preguntasrespuestas.entity.PreguntaEntity;
@Service
public class PreguntaService {

	@Autowired
	private PreguntaDao preguntaDao;

	public List<PreguntaDto> getPreguntas() {

		List<PreguntaEntity> preguntas = preguntaDao.findAll();

		return preguntas.stream().map(this::entityADto).collect(Collectors.toList());

	}

	public List<PreguntaDto> getPreguntasByDif(int preguntaDif) {
		List<PreguntaEntity> optionalPregunta = preguntaDao.findByDificultad(preguntaDif);

		return optionalPregunta.stream().map(this::entityADto).collect(Collectors.toList());
	}

	public PreguntaDto postPregunta(PreguntaEntity pregunta) {
		PreguntaEntity newPregunta = preguntaDao.save(pregunta);
		return entityADto(newPregunta);
	}

	public void deletePregunta(Long preguntaId) {
		preguntaDao.deleteById(preguntaId);
	}
	
	
	public PreguntaDto preguntaAleatoria(int dificultad) {
		List<PreguntaDto> listPregunta = getPreguntasByDif(dificultad);
		return listPregunta.get( (int)(Math.random() * listPregunta.size()) );
	}

	private PreguntaDto entityADto(PreguntaEntity pregunta) {

		PreguntaDto preguntaDto = new PreguntaDto();
		BeanUtils.copyProperties(pregunta, preguntaDto);

		return preguntaDto;

	}

}
