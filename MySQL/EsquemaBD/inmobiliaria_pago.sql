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
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pago` (
  `id_pago` int NOT NULL AUTO_INCREMENT,
  `id_clientes` int NOT NULL,
  `codigo` varchar(13) NOT NULL,
  `valor_oper` int DEFAULT NULL,
  `descripcion` varchar(300) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  PRIMARY KEY (`id_pago`),
  KEY `id_clientes` (`id_clientes`),
  CONSTRAINT `pago_ibfk_1` FOREIGN KEY (`id_clientes`) REFERENCES `clientes` (`id_clientes`)
) ENGINE=InnoDB AUTO_INCREMENT=135 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (100,111,'B002',3000,'pago mensual','2020-11-23 13:23:00'),(101,1066,'L001',3000,'pago mensual','2016-02-21 14:23:10'),(102,1066,'BL001',3000,'pago mensual','2019-03-22 16:27:02'),(103,1066,'BL001',3000,'pago mensual','2019-04-09 17:23:40'),(104,1066,'BL001',3000,'pago mensual','2019-05-10 13:13:50'),(105,1066,'BL001',3000,'pago mensual','2019-06-10 15:02:45'),(106,1066,'BL001',3000,'pago mensual','2019-07-11 13:37:34'),(107,1057,'L124',1500,'pago mensual','2019-10-11 12:26:02'),(108,1057,'L124',1500,'pago mensual','2019-11-11 13:25:02'),(109,1057,'L124',1500,'pago mensual','2019-12-12 11:25:02'),(110,1057,'L124',1500,'pago mensual','2020-01-11 14:23:10'),(111,1057,'L124',1500,'pago mensual','2020-02-11 17:23:10'),(112,1057,'L124',1500,'pago mensual','2020-03-21 14:23:10'),(113,1057,'L124',1500,'pago mensual','2020-04-11 11:23:10'),(114,1057,'L124',1500,'pago mensual','2020-05-11 12:23:10'),(115,1057,'L124',1500,'pago mensual','2020-06-11 13:03:10'),(116,1057,'L124',1500,'pago mensual','2020-07-12 14:23:10'),(117,1057,'L124',1500,'pago mensual','2020-08-11 15:23:10'),(118,1057,'L124',1500,'pago mensual','2020-09-20 16:23:10'),(119,1057,'L124',1500,'pago mensual','2020-10-11 14:23:10'),(120,1057,'L124',1500,'pago mensual','2020-11-11 16:23:10'),(121,1057,'L124',1500,'pago mensual','2021-01-01 13:47:55'),(122,1057,'L123',1000,'pago mensual','2019-12-12 11:25:02'),(123,1057,'L123',1000,'pago mensual','2020-01-12 14:23:10'),(124,1057,'L123',1000,'pago mensual','2020-02-12 17:23:10'),(125,1057,'L123',1000,'pago mensual','2020-03-13 14:23:10'),(126,1057,'L123',1000,'pago mensual','2020-04-11 11:23:10'),(127,1057,'L123',1000,'pago mensual','2020-05-13 12:23:10'),(128,1057,'L123',1000,'pago mensual','2020-06-12 13:03:10'),(129,1057,'L123',1000,'pago mensual','2020-07-12 14:23:10'),(130,1057,'L123',1000,'pago mensual','2020-08-11 15:23:10'),(131,1057,'L123',1000,'pago mensual','2020-09-11 16:23:10'),(132,1057,'L123',1000,'pago mensual','2020-10-11 14:23:10'),(133,1057,'L123',1000,'pago mensual','2020-11-11 16:23:10'),(134,1057,'L123',1000,'pago mensual','2021-01-01 13:47:55');
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
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
