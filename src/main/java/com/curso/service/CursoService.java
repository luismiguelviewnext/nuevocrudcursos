package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursoService {

    /*
     * Alta de curso. Recibirá en el cuerpo de la petición un JSON con los datos del
     * curso y lo
     * dará de alta, devolviendo como resultado una lista con los cursos existentes.
     */
    List<Curso> altaCurso(Curso curso);

    /*
     * Eliminación de curso. Recibirá en la url el código del curso y lo eliminará,
     * devolviendo
     * como resultado una lista con los cursos existentes.
     */
    List<Curso> eliminarCurso(int codCurso);

    /*
     * Actualización duración. Recibe en la url el código del curso y el número de
     * horas,
     * procediendo a la actualización de dicho dato en el almacen. No devuelve
     * ningún
     * resultado.
     */
    void actualizaDuracionCurso(int codCurso, int duracion);

    /*
     * Buscar curso. A partir del código del curso recibido en la url, devolverá un
     * JSON con los
     * datos del curso.
     */
    Curso buscarCurso(int codCurso);

    /*
     * Devuelve la lista de cursos
     */
    List<Curso> cursos();

     /**
     * Devuelve una lista de cursos que tienen un precio entre el rango proporcionado.
     * 
     * @param minPrecio Precio mínimo del curso.
     * @param maxPrecio Precio máximo del curso.
     * @return Lista de cursos que cumplen con el criterio de precio.
     */
    List<Curso> cursosPorPrecio(int minPrecio, int maxPrecio);   
    
    
  

}
