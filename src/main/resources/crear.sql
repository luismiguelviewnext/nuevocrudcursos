CREATE SCHEMA `bd_nuevocursos` ;

CREATE TABLE `bd_nuevocursos`.`cursos` (
  `cod_curso` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `duracion` INT NOT NULL,
  `precio` INT NOT NULL,
  PRIMARY KEY (`codCurso`));

ALTER TABLE `bd_nuevocursos`.`cursos` 
ADD UNIQUE INDEX `codCurso_UNIQUE` (`cod_curso` ASC) VISIBLE;
;
