CREATE SCHEMA `bd_nuevocursos` ;

CREATE TABLE `bd_nuevocursos`.`cursos` (
  `codCurso` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `duracion` INT NOT NULL,
  `precio` INT NOT NULL,
  PRIMARY KEY (`codCurso`));

