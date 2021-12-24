package com.concurso.preguntasrespuestas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concurso.preguntasrespuestas.dto.UsuarioDto;
import com.concurso.preguntasrespuestas.entity.UsuarioEntity;
import com.concurso.preguntasrespuestas.service.UsuarioService;

@RestController
@RequestMapping("Usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "{usuarioId}")
	public ResponseEntity<UsuarioDto> getUsuarioById(@PathVariable("usuarioId") Long usuarioId) {
		return ResponseEntity.ok(usuarioService.getUsuarioId(usuarioId));

	}

	@PostMapping
	public ResponseEntity<UsuarioDto> createUser(@RequestBody UsuarioEntity usuario) {
		return ResponseEntity.ok(usuarioService.createUsuario(usuario));

	}

}
