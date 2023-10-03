package com.curso.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Representa un curso en el sistema.
 * 
 * Esta clase es responsable de almacenar la información asociada
 * a un curso, incluyendo su código, nombre, duración y precio.
 */
@Entity
@Table(name ="cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codCurso;
    private String nombre;
    private int duracion;
    private int precio;

    /**
     * Constructor por defecto.
     * Instancia un nuevo objeto Curso con valores predeterminados.
     */
    public Curso() {
        super();
    }

    /**
     * Constructor con el código del curso como parámetro.
     *
     * @param codCurso El código del curso.
     */
    public Curso(int codCurso) {
        super();
        this.codCurso = codCurso;
    }

    /**
     * Constructor con parámetros.
     *
     * Instancia un nuevo objeto Curso con los valores proporcionados.
     *
     * @param codCurso El código del curso.
     * @param nombre   El nombre del curso.
     * @param duracion La duración del curso en horas.
     * @param precio   El precio del curso.
     */
    public Curso(int codCurso, String nombre, int duracion, int precio) {
        this.codCurso = codCurso;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }

    /**
     * @return El código del curso.
     */
    public int getCodCurso() {
        return codCurso;
    }

    /**
     * @return El nombre del curso.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return La duración del curso.
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @return El precio del curso.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Asigna el código del curso.
     *
     * @param codCurso El nuevo código a asignar.
     */
    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    /**
     * Asigna el nombre del curso.
     *
     * @param nombre El nuevo nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Asigna la duración del curso.
     *
     * @param duracion La nueva duración a asignar.
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Asigna el precio del curso.
     *
     * @param precio El nuevo precio a asignar.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return Representación en cadena del curso.
     */
    @Override
    public String toString() {
        return "Curso [codCurso=" + codCurso + ", nombre=" + nombre + ", duracion=" + duracion + ", precio=" + precio + "]";
    }

    /**
     * @return El hashcode calculado en base al código del curso.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codCurso;
        return result;
    }

    /**
     * Compara este curso con el objeto especificado.
     *
     * Los cursos se consideran iguales si y solo si el objeto
     * especificado también es un curso y sus códigos son iguales.
     *
     * @param obj El objeto con el que comparar.
     * @return {@code true} si este objeto es igual al objeto argumento;
     *         {@code false} en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (codCurso != other.codCurso)
            return false;
        return true;
    }
}
