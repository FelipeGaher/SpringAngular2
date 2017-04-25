package com.felipe.ngspring.persistence.vo;

import java.io.Serializable;

/**
 * The VO class for the Alumnos table.
 * 
 */
public class AlumnoVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6776586029283423685L;
	public Long idAlumno;
	public String nombreAlumno;
	
    public Long getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(Long idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	
    @Override
    public String toString() {
        return "AlumnoVO [idAlumno=" + idAlumno + ", nombreAlumno=" + nombreAlumno + "]";
    }
}
