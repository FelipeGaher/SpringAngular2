package com.felipe.ngspring.web.controller;

import java.net.URI;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.felipe.ngspring.persistence.model.AlumnoEntity;
import com.felipe.ngspring.persistence.springdata.AlumnosRepository;

/**
 * Controller para la consulta de alumnos.
 *
 * @author fmontiel
 */
@RestController
@RequestMapping("alumnos")
public class AlumnosController {

	private final AlumnosRepository alumnosRepository;

    @Autowired
    AlumnosController(AlumnosRepository alumnosService) {
        this.alumnosRepository = alumnosService;
    }

    @RequestMapping(method = RequestMethod.GET)
    Collection<AlumnoEntity> getAlumnos() {
        return this.alumnosRepository.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/id/{idAlumno}")
    AlumnoEntity getAlumnoById(@PathVariable Long idAlumno) {
        return this.alumnosRepository.findOne(idAlumno);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/name/{nombreAlumno}")
    Collection<AlumnoEntity> getAlumnoByName(@PathVariable String nombreAlumno) {
        return this.alumnosRepository.findByNombre(nombreAlumno);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    @ResponseStatus(value = HttpStatus.OK)
    ResponseEntity<?> addAlumno(@RequestBody(required = true) AlumnoEntity newAlumno) {
    	AlumnoEntity result = alumnosRepository.save(new AlumnoEntity(newAlumno));

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{idAlumno}")
                .buildAndExpand(result.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/delete")
    @ResponseStatus(value = HttpStatus.OK)
    public void updateSegmento(@RequestBody(required = true) AlumnoEntity alumno) {
        alumnosRepository.delete(alumno);
    }

}