package com.concurso.preguntasrespuestas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Historico")
public class HistoricoEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "idUsuario", nullable = false)
	private Long idUsuario;

	@Column(name = "acomulado", nullable = false)
	private double acomulado = 0.0;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getAcomulado() {
		return acomulado;
	}

	public void setAcomulado(double acomulado) {
		this.acomulado = acomulado;
	}

}
