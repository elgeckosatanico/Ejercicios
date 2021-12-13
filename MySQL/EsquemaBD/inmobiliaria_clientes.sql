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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `id_clientes` int NOT NULL AUTO_INCREMENT,
  `rfc` varchar(13) NOT NULL,
  `tel_fijo` varchar(8) DEFAULT NULL,
  `celular` varchar(10) DEFAULT NULL,
  `nombre` varchar(100) NOT NULL,
  `a_paterno` varchar(100) NOT NULL,
  `a_materno` varchar(100) NOT NULL,
  PRIMARY KEY (`id_clientes`),
  UNIQUE KEY `rfc` (`rfc`)
) ENGINE=InnoDB AUTO_INCREMENT=1072 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (111,'CAVJ891102NMO','43210527','5553261278','Juan Carlos','Castillo','Vera'),(344,'ROMR7918K6L',NULL,NULL,'Ricardo','Rodriguez','Martinez'),(555,'CAMG940226CC1',NULL,'5578247269','Gabriel','Castro','Martinez'),(1051,'FLCM000601CCC',NULL,'5526752389','Florinda','Chespirito','Meza'),(1052,'PEGP800701KKL','25962162',NULL,'Pablo','Perez','Garcia'),(1053,'GOFA880927CDC',NULL,'5538993984','Antonia','Gomez','Fernandez'),(1054,'LODR771101H1C','39123126','5538730681','Ricardo Antonio','Lopez','Diaz'),(1055,'GASC801203VB2',NULL,NULL,'Claudia','Garcia','Sanchez'),(1056,'ROSL780308Z34','60666311','5533123251','Laura','Romero','Sosa'),(1057,'TOAS890601VB5',NULL,NULL,'Sofia','Torres','Alvarez'),(1066,'RURJ950922AC6','19801836',NULL,'Jose Maria','Ruiz','Ramirez'),(1067,'FOAM910712BN5','36141952',NULL,'Melissa','Flores','Acosta'),(1068,'HEMV880710CHC',NULL,'5562581941','Valentina','Herrera','Medina'),(1069,'ROMD9007123CC',NULL,'5590429554','Daniela','Rojas','Molina'),(1070,'ROSJ79050555T','29136377',NULL,'Juan','Rodriguez','Silva'),(1071,'POJN981001CXC','63215633',NULL,'Juan Carlos Bodoque','Ponce','Navarro');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
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
