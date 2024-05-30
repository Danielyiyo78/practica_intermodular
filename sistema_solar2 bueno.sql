drop database if exists practica_intermodular;
create database practica_intermodular;
use practica_intermodular;

create table estrella(
nombre varchar(30) primary key not null,
tipoEstrella varchar(10),
km int,
temperatura int,
distanciaMedia double,
composicion varchar(100),
fechacreacion date
);

create table planeta(
nombre varchar(30) primary key,
radio double,
distanciaMedia double,
dias int,
temperatura int,
tipoPlaneta varchar(50),
numeroSatelite int,
fechacreacion date,
estrella varchar(50),
constraint fk_planeta_estrella foreign key(estrella) references estrella(nombre)
);

create table satelite(
nombre varchar(30) primary key,
planeta varchar(30),
radio double,
distanciaMedia double,
dias int,
temperatura int,
tipoCuerpo varchar(50),
fechacreacion date,
constraint fk_satelite_planeta foreign key (planeta) references planeta(nombre)
);
DELIMITER //

CREATE TRIGGER contar.planeta
AFTER INSERT ON satelite
FOR EACH ROW
BEGIN
  UPDATE planeta
  SET numeroSatelite = numeroSatelite + 1
  WHERE nombre = NEW.planeta;
END//

DELIMITER ;

DELIMITER //

CREATE TRIGGER fecha_actual
BEFORE INSERT ON estrella
FOR EACH ROW
SET NEW.fechacreacion = SYSDATE();

CREATE TRIGGER set_creation_date_planeta
BEFORE INSERT ON planeta
FOR EACH ROW
SET NEW.fechacreacion = SYSDATE();

CREATE TRIGGER set_creation_date_satelite
BEFORE INSERT ON satelite
FOR EACH ROW
SET NEW.fechacreacion = SYSDATE();

DELIMITER ;



INSERT INTO planeta (nombre, radio, distanciaMedia, dias, temperatura, tipoPlaneta, numeroSatelite) VALUES
  ('Mercurio', 2439.7, 57.9, 88.0, 167.0, 'Rocoso',0),
  ('Venus', 6051.8, 108.2, 225.0, 464.0, 'Rocoso',0),
  ('Tierra', 6371.0, 149.6, 365.25, 15.0, 'Rocoso',1),
  ('Marte', 3389.5, 227.9, 687.0, -65.0, 'Rocoso',2),
  ('Júpiter', 69911.0, 778.5, 4333.0, -110.0, 'Gaseoso',4),
  ('Saturno', 58232.0, 1429.4, 10759.0, -140.0, 'Gaseoso',2),
  ('Urano', 25362.0, 2870.9, 30687.0, -195.0, 'Gaseoso',2),
  ('Neptuno', 24622.0, 4498.3, 60190.0, -200.0, 'Gaseoso',0);

INSERT INTO estrella (nombre, tipoEstrella,km, temperatura, distanciaMedia, composicion) VALUES
  ('Sol', 'G2V', 696340, 5500, 149.6, '74% Hidrogeno,24% Helio,2% Otro');
  
INSERT INTO satelite (nombre, planeta, radio, distanciaMedia, dias, temperatura, tipoCuerpo) VALUES 
('Luna','Tierra', 1737.4, 384400, 27.3, -53, 'Sólido/Rocoso'),
('Fobos','Marte', 11.1, 9378, 03, -40, 'Sólido/Rocoso'),
('Deimos', 'Marte', 6.2, 23460, 1.3, -40, 'Sólido/Rocoso'),
('Ío','Júpiter',1821.6,	421700, 1.8, -143,'Sólido/Rocoso'),
('Europa','Júpiter',1560.8,670900,	3.5,-160,'Sólido/Hielo'),
('Ganimedes','Júpiter',2634.1, 1070400,7.2,-163,'Sólido/Hielo'),
('Calisto','Júpiter',2410.3,1882700,16.7,-139,'Sólido/Hielo'),
('Titán','Saturno',2575.5,1222000,15.9,-179,'Sólido/Hielo'),
('Encélado','Saturno',252.1,238000,1.4,-201,'Sólido/Hielo'),
('Titania',	'Urano',788.4,435900,8.7,-203,'Sólido/Hielo'),
('Oberón',	'Urano',761.4,583500,13.5,-203,'Sólido/Hielo');



