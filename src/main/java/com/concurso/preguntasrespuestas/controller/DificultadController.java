package com.concurso.preguntasrespuestas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concurso.preguntasrespuestas.dto.DificultadDto;
import com.concurso.preguntasrespuestas.entity.DificultadEntity;
import com.concurso.preguntasrespuestas.service.DificultadService;

@RestController
@RequestMapping("Dificultad")
public class DificultadController {

	@Autowired
	private DificultadService dificultadService;
	
	@GetMapping
	public ResponseEntity<List<DificultadDto>> getDificultad(){
		return ResponseEntity.ok(dificultadService.getDificultad());
	}
	
	@PostMapping
	public ResponseEntity<DificultadDto> createDificultad(@RequestBody DificultadEntity dificultad){
		return ResponseEntity.ok(dificultadService.createDificultad(dificultad));
	}
	
	@PutMapping
	public ResponseEntity<DificultadDto> updateDificultad(@RequestBody DificultadEntity dificultad){
		return ResponseEntity.ok(dificultadService.updateDificultad(dificultad)); 
	}
	
	
}
