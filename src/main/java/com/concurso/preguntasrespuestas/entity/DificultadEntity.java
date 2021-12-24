package com.concurso.preguntasrespuestas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dificultad")
public class DificultadEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "premio", nullable = false)
	private double premio;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPremio() {
		return premio;
	}

	public void setPremio(double premio) {
		this.premio = premio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
