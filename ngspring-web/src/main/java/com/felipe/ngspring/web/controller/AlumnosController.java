package com.felipe.ngspring.web.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.ngspring.persistence.vo.AlumnoVO;
import com.felipe.ngspring.service.interfaces.AlumnosService;

/**
 * Controller para la consulta de alumnos.
 *
 * @author fmontiel
 */
@RestController
@RequestMapping("alumnos")
public class AlumnosController {

    private final AlumnosService alumnoService;

    @Autowired
    AlumnosController(AlumnosService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @RequestMapping(method = RequestMethod.GET)
    Collection<AlumnoVO> getAlumnos() {
        return this.alumnoService.findAll();
    }

}