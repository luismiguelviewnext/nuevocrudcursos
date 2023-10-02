package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Curso;

/**
 * Interfaz de repositorio para realizar operaciones CRUD en entidades de tipo {@link Curso}.
 * 
 * Esta interfaz extiende de {@link JpaRepository} y, por lo tanto, hereda una gran cantidad de
 * métodos para realizar operaciones CRUD, como save, findAll, findById, etc., sobre entidades de tipo
 * {@link Curso}.
 * 
 * No es necesario implementar esta interfaz ya que Spring Data JPA
 * proporciona implementaciones por defecto para los métodos heredados de {@link JpaRepository}.
 */
public interface CursosDao extends JpaRepository<Curso, Integer> {

      @Query("SELECT c FROM Curso c WHERE c.precio BETWEEN :minPrecio AND :maxPrecio")
    List<Curso> findCursosByPrecioBetween(@Param("minPrecio") int minPrecio, @Param("maxPrecio") int maxPrecio);
}
