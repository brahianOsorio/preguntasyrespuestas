
package com.concurso.preguntasrespuestas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concurso.preguntasrespuestas.dto.PreguntaDto;
import com.concurso.preguntasrespuestas.entity.PreguntaEntity;
import com.concurso.preguntasrespuestas.service.PreguntaService;

@RestController
@RequestMapping("Pregunta")
public class PreguntaController {

	@Autowired
	private PreguntaService preguntaService;

	@GetMapping
	public ResponseEntity<List<PreguntaDto>> getPreguntas() {
		return ResponseEntity.ok(preguntaService.getPreguntas());
	}

	@RequestMapping(value = "{preguntaDif}")
	public ResponseEntity<List<PreguntaDto>> getPreguntaByDif(@PathVariable("preguntaDif") int preguntaDif) {
		return ResponseEntity.ok(preguntaService.getPreguntasByDif(preguntaDif));
	}
	
	@RequestMapping(value = "/Una/{difPregunta}")
	public ResponseEntity<PreguntaDto> getPreguntaAleatoriaByDif(@PathVariable("difPregunta") int preguntaDif) {
		return ResponseEntity.ok(preguntaService.preguntaAleatoria(preguntaDif));
	}
	
	@PostMapping
	public ResponseEntity<PreguntaDto> createPregunta(@RequestBody PreguntaEntity pregunta) {
		return ResponseEntity.ok(preguntaService.postPregunta(pregunta));

	}

	@DeleteMapping(value = "{preguntaId}")
	public void deletePreguntaById(@PathVariable("preguntaId") Long preguntaId) {
		preguntaService.deletePregunta(preguntaId);
	}

}
