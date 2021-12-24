package com.concurso.preguntasrespuestas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concurso.preguntasrespuestas.dao.DificultadDao;
import com.concurso.preguntasrespuestas.dto.DificultadDto;
import com.concurso.preguntasrespuestas.entity.DificultadEntity;

@Service
public class DificultadService {
	
	@Autowired
	private DificultadDao dificultadDao;
	
	public List<DificultadDto> getDificultad(){
		List<DificultadEntity> dificultades = dificultadDao.findAll();
		return dificultades.stream().map(this::entityADto).collect(Collectors.toList());
	}
	
	public DificultadDto createDificultad(DificultadEntity dificultad) {
		DificultadEntity newDificultad = dificultadDao.save(dificultad);
		return entityADto(newDificultad);
	}
	
	public DificultadDto updateDificultad(DificultadEntity dificultad) {
		DificultadEntity newDificultad = dificultadDao.save(dificultad);
		return entityADto(newDificultad);
	}
	

	private DificultadDto entityADto(DificultadEntity dificultad) {
		DificultadDto dificultadDto = new DificultadDto();
		BeanUtils.copyProperties(dificultad, dificultadDto);
		return dificultadDto;
	}
}
