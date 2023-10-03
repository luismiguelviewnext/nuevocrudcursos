package com.curso.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.curso.model.Curso;
import com.curso.service.CursoService;

/**
 * Controlador para gestionar operaciones relacionadas con cursos.
 */
@RestController
public class CursoController {

    @Autowired
    private CursoService service;

    /**
     * Añade un nuevo curso y devuelve la lista actualizada de cursos.
     * 
     * @param curso El curso a añadir.
     * @return La lista de cursos actualizada.
     */
    @PostMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> altaCurso(@RequestBody Curso curso) {
        return service.altaCurso(curso);
    }

    /**
     * Elimina un curso basado en el código del curso y devuelve la lista actualizada de cursos.
     * 
     * @param codCurso El código del curso a eliminar.
     * @return La lista de cursos actualizada.
     */
    @DeleteMapping(value = "curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> eliminarCurso(@PathVariable("codCurso") int codCurso) {
        return service.eliminarCurso(codCurso);
    }

    /**
     * Actualiza la duración de un curso específico.
     * 
     * @param codCurso El código del curso a actualizar.
     * @param duracion La nueva duración del curso.
     */
    @PutMapping(value = "curso/{codCurso}/{duracion}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizaDuracionCurso(@PathVariable("codCurso") int codCurso, @PathVariable("duracion") int duracion) {
        service.actualizaDuracionCurso(codCurso, duracion);
    }

    /**
     * Busca un curso por su código.
     * 
     * @param codCurso El código del curso a buscar.
     * @return El curso con el código proporcionado.
     */
    @GetMapping(value = "curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso buscarCurso(@PathVariable("codCurso") int codCurso) {
        return service.buscarCurso(codCurso);
    }

    /**
     * Devuelve una lista de todos los cursos disponibles.
     * 
     * @return La lista de todos los cursos.
     */
    @GetMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> cursos() {
        return service.cursos();
    }

    /**
     * Devuelve una lista de cursos basados en un rango de precios.
     * 
     * @param minPrecio El precio mínimo del rango.
     * @param maxPrecio El precio máximo del rango.
     * @return La lista de cursos dentro del rango de precios proporcionado.
     */
    @GetMapping(value = "curso/{minPrecio}/{maxPrecio}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> cursosPorPrecio(@PathVariable("minPrecio") int minPrecio, @PathVariable("maxPrecio") int maxPrecio) {
        return service.cursosPorPrecio(minPrecio, maxPrecio);
    }


}
