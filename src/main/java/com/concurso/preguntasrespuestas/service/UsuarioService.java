package com.concurso.preguntasrespuestas.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concurso.preguntasrespuestas.dao.UsuarioDao;
import com.concurso.preguntasrespuestas.dto.UsuarioDto;
import com.concurso.preguntasrespuestas.entity.UsuarioEntity;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;

	public List<UsuarioDto> getUsuario() {
		List<UsuarioEntity> usuarios = usuarioDao.findAll();
		return usuarios.stream().map(this::entityADto).collect(Collectors.toList());
	}

	public UsuarioDto getUsuarioId(Long idUsuario) {
		Optional<UsuarioEntity> optionalUsuario = usuarioDao.findById(idUsuario);
		return entityADto(optionalUsuario.get());
	}

	public UsuarioDto createUsuario(UsuarioEntity usuario) {
		UsuarioEntity newUsuario = usuarioDao.save(usuario);
		return entityADto(newUsuario);
	}

	private UsuarioDto entityADto(UsuarioEntity usuario) {
		UsuarioDto usuarioDto = new UsuarioDto();
		BeanUtils.copyProperties(usuario, usuarioDto);

		return usuarioDto;
	}

}
