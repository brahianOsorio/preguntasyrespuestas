package com.concurso.preguntasrespuestas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concurso.preguntasrespuestas.dao.HistoricoDao;
import com.concurso.preguntasrespuestas.dto.HistoricoDto;
import com.concurso.preguntasrespuestas.entity.HistoricoEntity;

@Service
public class HistoricoService {
	@Autowired
	private HistoricoDao historicoDao;

	public List<HistoricoDto> getHistorico(){
		List<HistoricoEntity> historicos = historicoDao.findAll();
		return historicos.stream().map(this::entityADto).collect(Collectors.toList());
	}
	
	public HistoricoDto createHistorico(HistoricoEntity historico) {
		HistoricoEntity newHistorico = historicoDao.save(historico);
		return entityADto(newHistorico);
	}
	
	private HistoricoDto entityADto(HistoricoEntity historico) {
		HistoricoDto historicoDto = new HistoricoDto();
		BeanUtils.copyProperties(historico, historicoDto);

		return historicoDto;
	}
}