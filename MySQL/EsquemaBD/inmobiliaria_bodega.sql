-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: inmobiliaria
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bodega`
--

DROP TABLE IF EXISTS `bodega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bodega` (
  `id_bod` int NOT NULL AUTO_INCREMENT,
  `id_clientes` int NOT NULL,
  `id_loc` int DEFAULT NULL,
  `id_dep` int DEFAULT NULL,
  `codigo_bod` varchar(13) NOT NULL,
  `num` int DEFAULT NULL,
  `seccion` int DEFAULT NULL,
  `estado` varchar(50) NOT NULL,
  `metros` int DEFAULT NULL,
  `descripcion` varchar(300) DEFAULT NULL,
  `direccion` varchar(300) NOT NULL,
  `espacio` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id_bod`),
  UNIQUE KEY `codigo_bod` (`codigo_bod`),
  KEY `id_clientes` (`id_clientes`),
  KEY `id_dep` (`id_dep`),
  KEY `id_loc` (`id_loc`),
  CONSTRAINT `bodega_ibfk_1` FOREIGN KEY (`id_clientes`) REFERENCES `clientes` (`id_clientes`),
  CONSTRAINT `bodega_ibfk_2` FOREIGN KEY (`id_dep`) REFERENCES `departamento` (`id_dep`),
  CONSTRAINT `bodega_ibfk_3` FOREIGN KEY (`id_loc`) REFERENCES `locales` (`id_loc`)
) ENGINE=InnoDB AUTO_INCREMENT=4006 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bodega`
--

LOCK TABLES `bodega` WRITE;
/*!40000 ALTER TABLE `bodega` DISABLE KEYS */;
INSERT INTO `bodega` VALUES (4004,111,NULL,NULL,'B002',33,12,'renta',60,'','',''),(4005,1066,3003,NULL,'BL001',1,1,'renta',12,'','','imagen2.jpg');
/*!40000 ALTER TABLE `bodega` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-28  1:07:23
