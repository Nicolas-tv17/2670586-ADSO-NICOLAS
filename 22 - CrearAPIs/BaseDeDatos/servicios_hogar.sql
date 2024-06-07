CREATE DATABASE IF NOT EXISTS `servicios_hogar` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `servicios_hogar`;

CREATE TABLE IF NOT EXISTS `usuario` (
  `Documento` int(11) NOT NULL PRIMARY KEY,
  `Nombre` varchar(50) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Telefono` int(10) NOT NULL,
  `Direccion` varchar(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS `servicio` (
  `id_servicio` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `Labor` varchar(100) NOT NULL,
  `Descripcion` varchar(200) NOT NULL,
  `Valor` double(10,2) NOT NULL,
  `usuario` int(11) NOT NULL,
  FOREIGN KEY (usuario) REFERENCES usuario(Documento)
);