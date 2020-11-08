-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-11-2020 a las 10:21:09
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `aivon`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `campaña`
--

CREATE TABLE `campaña` (
  `idCampaña` int(10) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFinal` date NOT NULL,
  `montoMin` float NOT NULL,
  `montoTope` float NOT NULL,
  `estrellasXCampaña` int(11) NOT NULL,
  `estadoCampaña` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallepedido`
--

CREATE TABLE `detallepedido` (
  `idDetalle` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `idPedido` int(11) NOT NULL,
  `cantProducto` int(11) NOT NULL,
  `precioFecha` float NOT NULL,
  `estrellasTotales` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historicorc`
--

CREATE TABLE `historicorc` (
  `idHistoricoRC` int(11) NOT NULL,
  `idRevendedor` int(11) NOT NULL,
  `idCampaña` int(11) NOT NULL,
  `estrellasRC` int(11) NOT NULL,
  `estadoRC` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(10) NOT NULL,
  `idRevendedor` int(10) NOT NULL,
  `idCampaña` int(10) NOT NULL,
  `fechaIngreso` date NOT NULL,
  `fechaEntrega` date NOT NULL,
  `fechaPago` date NOT NULL,
  `cantCajas` int(11) NOT NULL,
  `importeTotal` float NOT NULL,
  `estrellasXPedido` int(11) NOT NULL,
  `estadoPedido` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `codigo` bigint(5) UNSIGNED ZEROFILL NOT NULL,
  `nombreProducto` varchar(25) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `tamanio` int(11) NOT NULL,
  `precioCosto` double NOT NULL,
  `precioPublico` double NOT NULL,
  `estrellas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `codigo`, `nombreProducto`, `descripcion`, `tamanio`, `precioCosto`, `precioPublico`, `estrellas`) VALUES
(1, 00111, 'Crema Aivon', 'crema para manos extra suave con extraco de vainilla y coco', 375, 38.5, 52.5, 5),
(2, 00112, 'Crema Aivon Piel reseca', 'crema con otra cosa', 375, 40.5, 55.5, 7),
(4, 00113, 'Desodorante Aivon', 'Anti transpirante de uso diario', 75, 68, 80, 11),
(5, 00114, 'Desodorante Rollon Aivon', 'Anti transpirante de uso diario con sistema rollon', 50, 65, 78, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `revendedor`
--

CREATE TABLE `revendedor` (
  `idRevendedor` int(11) NOT NULL,
  `dni` bigint(20) NOT NULL,
  `nombreRevendedor` varchar(25) NOT NULL,
  `apellidoRevendedor` varchar(25) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `mail` varchar(25) NOT NULL,
  `activo` tinyint(1) NOT NULL,
  `nivel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `campaña`
--
ALTER TABLE `campaña`
  ADD PRIMARY KEY (`idCampaña`);

--
-- Indices de la tabla `detallepedido`
--
ALTER TABLE `detallepedido`
  ADD PRIMARY KEY (`idDetalle`),
  ADD KEY `CLAVE_PEDIDO` (`idPedido`),
  ADD KEY `CLAVE_Prod` (`idProducto`);

--
-- Indices de la tabla `historicorc`
--
ALTER TABLE `historicorc`
  ADD PRIMARY KEY (`idHistoricoRC`),
  ADD KEY `CLAVE_CAMP_HISTORICO` (`idCampaña`),
  ADD KEY `CLAVE_REVEND_HISTORICO` (`idRevendedor`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `CLAVE_REVENDEDOR` (`idRevendedor`),
  ADD KEY `CLAVE_CAMPAÑA` (`idCampaña`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD UNIQUE KEY `UNICO` (`codigo`);

--
-- Indices de la tabla `revendedor`
--
ALTER TABLE `revendedor`
  ADD PRIMARY KEY (`idRevendedor`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `campaña`
--
ALTER TABLE `campaña`
  MODIFY `idCampaña` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detallepedido`
--
ALTER TABLE `detallepedido`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `historicorc`
--
ALTER TABLE `historicorc`
  MODIFY `idHistoricoRC` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `revendedor`
--
ALTER TABLE `revendedor`
  MODIFY `idRevendedor` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `campaña`
--
ALTER TABLE `campaña`
  ADD CONSTRAINT `campaña_ibfk_1` FOREIGN KEY (`idCampaña`) REFERENCES `pedido` (`idCampaña`);

--
-- Filtros para la tabla `detallepedido`
--
ALTER TABLE `detallepedido`
  ADD CONSTRAINT `CLAVE_PEDIDO` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`),
  ADD CONSTRAINT `CLAVE_Prod` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `historicorc`
--
ALTER TABLE `historicorc`
  ADD CONSTRAINT `CLAVE_CAMP_HISTORICO` FOREIGN KEY (`idCampaña`) REFERENCES `campaña` (`idCampaña`),
  ADD CONSTRAINT `CLAVE_REVEND_HISTORICO` FOREIGN KEY (`idRevendedor`) REFERENCES `revendedor` (`idRevendedor`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `CLAVE_CAMPAÑA` FOREIGN KEY (`idCampaña`) REFERENCES `campaña` (`idCampaña`),
  ADD CONSTRAINT `CLAVE_REVENDEDOR` FOREIGN KEY (`idRevendedor`) REFERENCES `revendedor` (`idRevendedor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
