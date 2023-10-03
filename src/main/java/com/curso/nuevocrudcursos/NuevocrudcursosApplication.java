/**
 * Clase principal de la aplicación Spring Boot para el CRUD de cursos.
 * 
 * Esta clase se encarga de iniciar la aplicación Spring Boot y también de 
 * configurar el escaneo de componentes específicos necesarios para la aplicación.
 * 
 * 
 * @author Luis Miguel Albarracín Castillo
 * @version 1.0
 */

package com.curso.nuevocrudcursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.curso.model")
@EnableJpaRepositories(basePackages = "com.curso.dao")
@SpringBootApplication(scanBasePackages = { "com.curso.controller", "com.curso.service" })
public class NuevocrudcursosApplication {

    /**
     * Método principal para iniciar la aplicación Spring Boot.
     * 
     * @param args argumentos de línea de comandos
     */
	public static void main(String[] args) {
		SpringApplication.run(NuevocrudcursosApplication.class, args);
	}

}
