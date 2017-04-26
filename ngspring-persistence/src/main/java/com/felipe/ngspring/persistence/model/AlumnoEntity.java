package com.felipe.ngspring.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "alumnos")
public class AlumnoEntity {

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	private Long id;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public AlumnoEntity(AlumnoEntity alumno) {
        super();
        this.id = alumno.id;
        this.nombre = alumno.nombre;
    }
	
	public AlumnoEntity(String nombre) {
		super();
		this.nombre = nombre;
	}

	public AlumnoEntity() {
	}

	@Override
	public String toString() {
		return "AlumnoEntity [id=" + id + ", nombre=" + nombre + "]";
	}
}
