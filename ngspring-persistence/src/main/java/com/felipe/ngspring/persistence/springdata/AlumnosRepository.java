package com.felipe.ngspring.persistence.springdata;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import com.felipe.ngspring.persistence.model.AlumnoEntity;

public interface AlumnosRepository extends JpaRepository<AlumnoEntity, Long>{
    Collection<AlumnoEntity> findByNombreAlumno(String nombreAlumno);
}
