package com.felipe.ngspring.service.interfaces;

import java.util.List;
import com.felipe.ngspring.persistence.vo.AlumnoVO;

/**
 *
 * Interfaz del servicio de operaciones sobre la entidad TipoDoc
 * 
 * @author fmontiel
 *
 */
public interface AlumnosService {

    /**
     * Obtiene todos los AlumnoVO
     *
     * @return listAlumnoVO
     */
    List<AlumnoVO> findAll();
}