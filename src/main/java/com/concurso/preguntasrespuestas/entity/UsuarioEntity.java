package com.concurso.preguntasrespuestas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuarios")
public class UsuarioEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "acomulado", nullable = false)
	private double acomulado = 0.0;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAcomulado() {
		return acomulado;
	}

	public void setAcomulado(double acomulado) {
		this.acomulado = acomulado;
	}

	
}
