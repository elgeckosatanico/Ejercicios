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
-- Temporary view structure for view `personal`
--

DROP TABLE IF EXISTS `personal`;
/*!50001 DROP VIEW IF EXISTS `personal`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `personal` AS SELECT 
 1 AS `id`,
 1 AS `rfc`,
 1 AS `paterno`,
 1 AS `materno`,
 1 AS `nombre`,
 1 AS `tipo`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `inmuebles`
--

DROP TABLE IF EXISTS `inmuebles`;
/*!50001 DROP VIEW IF EXISTS `inmuebles`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `inmuebles` AS SELECT 
 1 AS `id`,
 1 AS `id_clientes`,
 1 AS `codigo`,
 1 AS `metros`,
 1 AS `descripcion`,
 1 AS `direccion`,
 1 AS `tipo`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `depandloc`
--

DROP TABLE IF EXISTS `depandloc`;
/*!50001 DROP VIEW IF EXISTS `depandloc`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `depandloc` AS SELECT 
 1 AS `id`,
 1 AS `id_clientes`,
 1 AS `codigo`,
 1 AS `metros`,
 1 AS `descripcion`,
 1 AS `direccion`,
 1 AS `tipo`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `bodando`
--

DROP TABLE IF EXISTS `bodando`;
/*!50001 DROP VIEW IF EXISTS `bodando`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `bodando` AS SELECT 
 1 AS `id`,
 1 AS `id_clientes`,
 1 AS `codigo`,
 1 AS `metros`,
 1 AS `descripcion`,
 1 AS `direccion`,
 1 AS `tipo`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `inmuebleclientes`
--

DROP TABLE IF EXISTS `inmuebleclientes`;
/*!50001 DROP VIEW IF EXISTS `inmuebleclientes`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `inmuebleclientes` AS SELECT 
 1 AS `id`,
 1 AS `id_clientes`,
 1 AS `a_paterno`,
 1 AS `a_materno`,
 1 AS `cliente`,
 1 AS `codigo`,
 1 AS `metros`,
 1 AS `descripcion`,
 1 AS `direccion`,
 1 AS `tipo`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `personal`
--

/*!50001 DROP VIEW IF EXISTS `personal`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `personal` AS select `clientes`.`id_clientes` AS `id`,`clientes`.`rfc` AS `rfc`,`clientes`.`a_paterno` AS `paterno`,`clientes`.`a_materno` AS `materno`,`clientes`.`nombre` AS `nombre`,'cliente' AS `tipo` from `clientes` union select `trabajadores`.`id_trabajadores` AS `id_trabajadores`,`trabajadores`.`rfc` AS `rfc`,`trabajadores`.`a_paterno` AS `a_paterno`,`trabajadores`.`a_materno` AS `a_materno`,`trabajadores`.`nombre` AS `nombre`,'trabajador' AS `tipo` from `trabajadores` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `inmuebles`
--

/*!50001 DROP VIEW IF EXISTS `inmuebles`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `inmuebles` AS select `depandloc`.`id` AS `id`,`depandloc`.`id_clientes` AS `id_clientes`,`depandloc`.`codigo` AS `codigo`,`depandloc`.`metros` AS `metros`,`depandloc`.`descripcion` AS `descripcion`,`depandloc`.`direccion` AS `direccion`,`depandloc`.`tipo` AS `tipo` from `depandloc` union select `bodando`.`id` AS `id`,`bodando`.`id_clientes` AS `id_clientes`,`bodando`.`codigo` AS `codigo`,`bodando`.`metros` AS `metros`,`bodando`.`descripcion` AS `descripcion`,`bodando`.`direccion` AS `direccion`,`bodando`.`tipo` AS `tipo` from `bodando` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `depandloc`
--

/*!50001 DROP VIEW IF EXISTS `depandloc`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `depandloc` AS select `departamento`.`id_dep` AS `id`,`departamento`.`id_clientes` AS `id_clientes`,`departamento`.`codigo_dep` AS `codigo`,`departamento`.`metros` AS `metros`,`departamento`.`descripcion` AS `descripcion`,`departamento`.`direccion` AS `direccion`,'departamento' AS `tipo` from `departamento` union select `locales`.`id_loc` AS `id_loc`,`locales`.`id_clientes` AS `id_clientes`,`locales`.`codigo_loc` AS `codigo_loc`,`locales`.`metros` AS `metros`,`locales`.`descripcion` AS `descripcion`,`locales`.`direccion` AS `direccion`,'local' AS `tipo` from `locales` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `bodando`
--

/*!50001 DROP VIEW IF EXISTS `bodando`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `bodando` AS select `bodega`.`id_bod` AS `id`,`bodega`.`id_clientes` AS `id_clientes`,`bodega`.`codigo_bod` AS `codigo`,`bodega`.`metros` AS `metros`,`bodega`.`descripcion` AS `descripcion`,`bodega`.`direccion` AS `direccion`,'bodega' AS `tipo` from `bodega` union select `otro`.`id_o` AS `id_o`,`otro`.`id_clientes` AS `id_clientes`,`otro`.`codigo_o` AS `codigo_o`,`otro`.`metros` AS `metros`,`otro`.`descripcion` AS `descripcion`,`otro`.`direccion` AS `direccion`,'otro' AS `tipo` from `otro` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `inmuebleclientes`
--

/*!50001 DROP VIEW IF EXISTS `inmuebleclientes`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `inmuebleclientes` AS select `i`.`id` AS `id`,`i`.`id_clientes` AS `id_clientes`,`c`.`a_paterno` AS `a_paterno`,`c`.`a_materno` AS `a_materno`,`c`.`nombre` AS `cliente`,`i`.`codigo` AS `codigo`,`i`.`metros` AS `metros`,`i`.`descripcion` AS `descripcion`,`i`.`direccion` AS `direccion`,`i`.`tipo` AS `tipo` from (`clientes` `c` join `inmuebles` `i` on((`c`.`id_clientes` = `i`.`id_clientes`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Dumping routines for database 'inmobiliaria'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-28  1:07:24
