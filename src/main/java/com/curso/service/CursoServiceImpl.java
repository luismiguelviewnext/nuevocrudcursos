package com.curso.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursosDao;
import com.curso.model.Curso;

@Service
public class CursoServiceImpl implements CursoService {
    
    @Autowired
    private CursosDao cursosDao; 

    @Override
    public List<Curso> altaCurso(Curso curso) {
        cursosDao.save(curso);
        return cursosDao.findAll();
    }

    @Override
    public List<Curso> eliminarCurso(int codCurso) {
        cursosDao.deleteById(codCurso);
        return cursosDao.findAll();
    }

   @Override
    public void actualizaDuracionCurso(int codCurso, int duracion) {
        cursosDao.save(cursosDao.findById(codCurso).orElse(null));
    }

    @Override
    public Curso buscarCurso(int codCurso) {
        return cursosDao.findById(codCurso).orElse(null);
    }

    @Override
    public List<Curso> cursos() {
        return cursosDao.findAll();
    }

     @Override
    public List<Curso> cursosPorPrecio(int minPrecio, int maxPrecio) {
        return cursosDao.findCursosByPrecioBetween(minPrecio, maxPrecio);
    }

}
