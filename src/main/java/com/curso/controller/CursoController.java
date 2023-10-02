package com.curso.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursoService;

@RestController
public class CursoController {
    @Autowired
    CursoService service;

@PostMapping(value= "curso", produces = MediaType.APPLICATION_JSON_VALUE)
public List<Curso> altaCurso(@RequestBody Curso curso){
    return service.altaCurso(curso);
}

@DeleteMapping(value ="curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
public List<Curso> eliminarCurso(@PathVariable("codCurso")int codCurso){
    return service.eliminarCurso(codCurso);
}

@PutMapping(value="curso/{codCurso}/{duracion}", produces = MediaType.APPLICATION_JSON_VALUE)
public void actualizaDuracionCurso(@PathVariable ("codCurso") int codCurso, @PathVariable ("duracion") int duracion){
    service.actualizaDuracionCurso(codCurso, duracion);
}

    
}
