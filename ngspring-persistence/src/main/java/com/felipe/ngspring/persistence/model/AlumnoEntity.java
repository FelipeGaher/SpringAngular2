package com.felipe.ngspring.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class AlumnoEntity {

    @Id
    @GeneratedValue
    public Long idAlumno;
    public String nombreAlumno;
    
    public AlumnoEntity(AlumnoEntity alumno) {
        super();
        this.idAlumno = alumno.idAlumno;
        this.nombreAlumno = alumno.nombreAlumno;
    }
    
    public AlumnoEntity(String nombreAlumno) {
        super();
        this.nombreAlumno = nombreAlumno;
    }
    
    public AlumnoEntity() {
    }

    public Long getIdAlumno() {
        return idAlumno;
    }
    
    public String getNombreAlumno() {
        return nombreAlumno;
    }
    
    @Override
    public String toString() {
        return "AlumnoEntity [idAlumno=" + idAlumno + ", nombreAlumno=" + nombreAlumno + "]";
    }
}
