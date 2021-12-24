package com.concurso.preguntasrespuestas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "preguntas")
public class PreguntaEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "codDificultad", nullable = false)
	private int dificultad;

	@Column(name = "pregunta", nullable = false, length = 150)
	private String pregunta;

	@Column(name = "RespuestaCorrecta", nullable = false, length = 150)
	private String respuesta;

	@Column(name = "RespuestaInc1", nullable = false, length = 150)
	private String respuestaI1;

	@Column(name = "RespuestaInc2", nullable = false, length = 150)
	private String respuestaI2;

	@Column(name = "RespuestaInc3", nullable = false, length = 150)
	private String respuestaI3;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (long) id;
	}

	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public String getRespuestaI1() {
		return respuestaI1;
	}

	public void setRespuestaI1(String respuestaI1) {
		this.respuestaI1 = respuestaI1;
	}

	public String getRespuestaI2() {
		return respuestaI2;
	}

	public void setRespuestaI2(String respuestaI2) {
		this.respuestaI2 = respuestaI2;
	}

	public String getRespuestaI3() {
		return respuestaI3;
	}

	public void setRespuestaI3(String respuestaI3) {
		this.respuestaI3 = respuestaI3;
	}

}
