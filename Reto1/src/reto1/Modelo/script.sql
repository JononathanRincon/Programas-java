Create database reto_g54_db;
use reto_g54_db;
CREATE TABLE Empresa (
    nit INT PRIMARY KEY NOT NULL,
    nombreEmpresa VARCHAR(50) NOT NULL
);
insert into empresa value(123456789, "Consultoria Rincon");

CREATE TABLE Direccion (
    idDireccion INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    zona ENUM('Urbana', 'Rural'),
    tipoCalle ENUM('Avenida', 'Calle', 'Carrera', 'Circumbalar', 'Transversal', 'Otro'),
    numero1 VARCHAR(9) NOT NULL,
    numero2 VARCHAR(9) NOT NULL,
    numero3 VARCHAR(9) NOT NULL,
    nombreDepartamento VARCHAR(50) NOT NULL
);
insert into direccion value(1, "urbana", "calle", "9", "3A", "28", "Tolima");
CREATE TABLE Sucursal (
    idSucursal INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nombreSucursal VARCHAR(50) UNIQUE KEY NOT NULL,
    FK_nit INT NOT NULL,
    FK_idDireccion INT NOT NULL,
    FOREIGN KEY (FK_nit)
        REFERENCES Empresa (nit),
    FOREIGN KEY (FK_idDireccion)
        REFERENCES Direccion (idDireccion)
);
insert into sucursal values(1, "Consultoria Rincon Tolima", 123456789, 1);
CREATE TABLE Empleado (
    idEmp INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nombreEmp VARCHAR(25) NOT NULL,
    apellidos VARCHAR(25) NOT NULL,
    tipoDocumento ENUM('CedulaCiudadania', 'CedulaExtranjera', 'LibretaMilitar', 'Pasaporte', 'Otro'),
    documento VARCHAR(11) UNIQUE KEY NOT NULL,
    correo VARCHAR(50) UNIQUE KEY NOT NULL,
    FK_idSucursal INT NOT NULL,
    FOREIGN KEY (FK_idSucursal)
        REFERENCES Sucursal (idSucursal)
);
INSERT INTO `empleado`(`nombreEmp`, `apellidos`, `tipoDocumento`, `documento`, `correo`, `FK_idSucursal`) 
VALUES 
('Jacinto','Tellez','CedulaCiudadania','75310310','jacinto@gmail.com',1),
('Lola','Mento','CedulaCiudadania','75310330','lola@gmail.com',1),
('Marco','de la Puerta','Pasaporte','75310333','marcodelapuerta@gmail.com',1),
('Marci','Ana','CedulaExtranjera','75310230','marciana@gmail.com',1);
