DROP TABLE IF EXISTS `departamento`;
DROP TABLE IF EXISTS `empleado`;


CREATE TABLE `departamento` (
  `codigo` INT NOT NULL,
  `nombre` VARCHAR(250) DEFAULT NULL,
  `presupuesto` INT DEFAULT NULL,
  PRIMARY KEY (`codigo`)
);

CREATE TABLE `empleado` (
  `dni` VARCHAR(8) NOT NULL,
  `nombre` VARCHAR(250) DEFAULT NULL,
  `apellidos` VARCHAR(250) DEFAULT NULL,
  `codigo_departamento` INT DEFAULT NULL,
  PRIMARY KEY (`dni`),
  CONSTRAINT `empleados_fk` FOREIGN KEY (`codigo_departamento`) 
  REFERENCES `departamento` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE
);


INSERT INTO `departamento` VALUES (1,'Pro-files',99000),(2,'Angular',5000),(3,'Web designer',64000),(4,'Game development',91000);

INSERT INTO `empleado` VALUES (56498731,'Saruman','El blanco',1),(34573512,'Baby','Yoda',3),(9853467,'Poe','Dameron',2),(9567421,'David','Bowie',4);