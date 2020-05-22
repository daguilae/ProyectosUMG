-- Aca estan todos los insertar, solo debe de asignar cursos a maestros y alumnos
-- los datos de mantenimiento se presentan a continuacion.

use sui;
-- -----------------------------------------------------
-- Insertar (Facultades)
-- -----------------------------------------------------
insert into facultades values (1, "Ingenieria", "A");
insert into facultades values (2, "Ciencias Juridicas", "A");

-- -----------------------------------------------------
-- Insertar (Carreras)
-- -----------------------------------------------------
insert into carreras values (9959, "Sistemas", "1", "A");
insert into carreras values (9960, "Derecho", "2", "A");

insert into cursos values (1, "Programacion III", "A");
insert into cursos values (2, "Estadistica I", "A");

insert into jornadas values (1, "Matutina", "A");
insert into jornadas values (2, "Nocturna", "A");

insert into aulas values (1, "C3", "A");
insert into aulas values (2, "C4", "A");

insert into secciones values (1,"A", "A");
insert into secciones values (2, "B", "A");

insert into sedes values (1, "Portales", "A");
insert into sedes values (2, "Central", "A");

-- aca es autoincremental
insert into tipo_notas values (0, "Primer Parcial");
insert into tipo_notas values (0, "Segundo Parcial");
insert into tipo_notas values (0, "Final");
insert into tipo_notas values (0, "Actividades");
insert into tipo_notas values (0, "Extraordinario");
insert into tipo_notas values (0, "Retrasada");

insert into alumnos values (11113, "Brayan", "Ciudad", 56521578, "Brayan@gmail.com", "A");
insert into alumnos values (11114, "Juan", "Ciudad", 56525785, "Juan@gmail.com", "A");

insert into maestros values (1, "Mario", "Ciudad", 52547477, "Mario@gmail.com", "A");
insert into maestros values (2, "Juan", "Ciudad", 12345678, "Juan@gmail.com", "A");
