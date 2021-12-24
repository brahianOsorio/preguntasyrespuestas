package com.concurso.preguntasrespuestas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concurso.preguntasrespuestas.dto.HistoricoDto;
import com.concurso.preguntasrespuestas.entity.HistoricoEntity;
import com.concurso.preguntasrespuestas.service.HistoricoService;
@RestController
@RequestMapping("Historico")
public class HistoricoController {

	@Autowired
	private HistoricoService historicoService;

	@GetMapping
	public ResponseEntity<List<HistoricoDto>> getHistory(){
		return ResponseEntity.ok(historicoService.getHistorico());
	}
	
	@PostMapping
	public ResponseEntity<HistoricoDto> createHistory(@RequestBody HistoricoEntity historico){
		return ResponseEntity.ok(historicoService.createHistorico(historico));
	}
	
}


