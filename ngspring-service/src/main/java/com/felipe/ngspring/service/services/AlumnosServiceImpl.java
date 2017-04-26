package com.felipe.ngspring.service.services;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.felipe.ngspring.persistence.model.AlumnoEntity;
import com.felipe.ngspring.persistence.springdata.AlumnosRepository;
import com.felipe.ngspring.persistence.vo.AlumnoVO;
import com.felipe.ngspring.service.interfaces.AlumnosService;

/**
 * @author fmontiel
 */
@Component
public class AlumnosServiceImpl implements AlumnosService {

	@Autowired
    private AlumnosRepository repository;
    private DozerBeanMapper mapper = new DozerBeanMapper();
	
    /**
     * Obtiene todos los AlumnoVO
     *
     * @return listAlumnoVO
     */
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<AlumnoVO> findAll() {
        
        // Obtenemos todos los Alumno
        Iterable<AlumnoEntity> iterableAlumno = repository.findAll();
        List<AlumnoVO> listAlumnoVO = new ArrayList<AlumnoVO>();
        for (AlumnoEntity alumnoEntity : iterableAlumno) {
            // Convertimos el Entity al VO y lo agregamos a la lista
            listAlumnoVO.add(mapper.map(alumnoEntity, AlumnoVO.class));
        }

        return listAlumnoVO;
    }
    
}