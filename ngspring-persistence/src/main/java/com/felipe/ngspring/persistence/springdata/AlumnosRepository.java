package com.felipe.ngspring.persistence.springdata;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import com.felipe.ngspring.persistence.model.AlumnoEntity;

/**
 * @author fmontiel
 */
public interface AlumnosRepository extends JpaRepository<AlumnoEntity, Long>{
    Collection<AlumnoEntity> findByNombre(String nombre);
}
