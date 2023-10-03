package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursosDao;
import com.curso.model.Curso;

/**
 * Servicio que implementa las operaciones relacionadas con los cursos.
 * 
 * @author Luis Miguel Albarracín Castillo
 */
@Service
public class CursoServiceImpl implements CursoService {
    
    /**
     * Repositorio utilizado para acceder a los datos de los cursos.
     */
    @Autowired
    CursosDao cursosDao; 

    /**
     * Registra un nuevo curso y devuelve una lista de todos los cursos.
     * 
     * @param curso El curso a ser registrado.
     * @return Una lista de todos los cursos.
     */
    @Override
    public List<Curso> altaCurso(Curso curso) {
        cursosDao.save(curso);
        return cursosDao.findAll();
    }

    /**
     * Elimina un curso basado en su código y devuelve una lista de todos los cursos.
     * 
     * @param codCurso El código del curso a eliminar.
     * @return Una lista de todos los cursos.
     */
    @Override
    public List<Curso> eliminarCurso(int codCurso) {
        cursosDao.deleteById(codCurso);
        return cursosDao.findAll();
    }

    /**
     * Actualiza la duración de un curso específico.
     * 
     * @param codCurso El código del curso a actualizar.
     * @param duracion La nueva duración del curso.
     */
   @Override
    public void actualizaDuracionCurso(int codCurso, int duracion) {
        Curso curso = cursosDao.findById(codCurso).orElse(null);
        if (curso != null) {
            curso.setDuracion(duracion);
            cursosDao.save(curso);
        }
    }

    /**
     * Busca y devuelve un curso basado en su código.
     * 
     * @param codCurso El código del curso a buscar.
     * @return El curso encontrado o null si no se encuentra.
     */
    @Override
    public Curso buscarCurso(int codCurso) {
        return cursosDao.findById(codCurso).orElse(null);
    }

    /**
     * Devuelve una lista de todos los cursos.
     * 
     * @return Una lista de todos los cursos.
     */
    @Override
    public List<Curso> cursos() {
        return cursosDao.findAll();
    }

    /**
     * Busca y devuelve una lista de cursos que están dentro de un rango de precios específico.
     * 
     * @param minPrecio El precio mínimo del rango.
     * @param maxPrecio El precio máximo del rango.
     * @return Una lista de cursos dentro del rango de precios.
     */
     @Override
    public List<Curso> cursosPorPrecio(int minPrecio, int maxPrecio) {
        return cursosDao.findCursosByPrecioBetween(minPrecio, maxPrecio);
    }

  
}
