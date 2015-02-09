CREATE DATABASE  IF NOT EXISTS `ff13` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ff13`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: ff13
-- ------------------------------------------------------
-- Server version	5.6.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


--
-- Table structure for table `catalyst`
--

DROP TABLE IF EXISTS `catalyst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalyst` (
  `catalyst_id` int(11) NOT NULL,
  `catalyst_name` varchar(45) DEFAULT NULL,
  `catalyst_shop` varchar(45) DEFAULT NULL,
  `catalyst_buy_price` int(11) DEFAULT NULL,
  `catalyst_sell_price` int(11) DEFAULT NULL,
  PRIMARY KEY (`catalyst_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `item_id` int(11) NOT NULL,
  `item_name` varchar(45) DEFAULT NULL,
  `item_min_level` int(11) DEFAULT NULL,
  `item_max_level` int(11) DEFAULT NULL,
  `item_base_xp` int(11) DEFAULT NULL,
  `item_incremental_xp` int(11) DEFAULT NULL,
  `item_xp_offset` int(11) DEFAULT NULL,
  `item_catalyst` int(11) DEFAULT NULL,
  `item_special_property` varchar(45) DEFAULT NULL,
  `item_synthesis_group` varchar(45) DEFAULT NULL,
  `item_shop` varchar(45) DEFAULT NULL,
  `item_buy_price` int(11) DEFAULT NULL,
  `item_sell_price` int(11) DEFAULT NULL,
  `item_item_group` varchar(45) DEFAULT NULL,
  `item_upgrade` int(11) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `item_upgrade_fk_idx` (`item_upgrade`),
  KEY `item_catalyst_fk_idx` (`item_catalyst`),
  CONSTRAINT `item_catalyst_fk` FOREIGN KEY (`item_catalyst`) REFERENCES `catalyst` (`catalyst_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `item_upgrade_fk` FOREIGN KEY (`item_upgrade`) REFERENCES `item` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `accessory`
--

DROP TABLE IF EXISTS `accessory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `accessory` (
  `accessory_id` int(11) NOT NULL,
  `accessory_attribute` varchar(45) DEFAULT NULL,
  `accessory_attribute_min` int(11) DEFAULT NULL,
  `accessory_attribute_max` int(11) DEFAULT NULL,
  `accessory_attribute_increment` int(11) DEFAULT NULL,
  PRIMARY KEY (`accessory_id`),
  CONSTRAINT `accessory_id_fk` FOREIGN KEY (`accessory_id`) REFERENCES `item` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


-- Table structure for table `weapon`
--

DROP TABLE IF EXISTS `weapon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `weapon` (
  `weapon_id` int(11) NOT NULL,
  `weapon_strength_min` int(11) DEFAULT NULL,
  `weapon_strength_max` int(11) DEFAULT NULL,
  `weapon_strength_increment` int(11) DEFAULT NULL,
  `weapon_magic_min` int(11) DEFAULT NULL,
  `weapon_magic_max` int(11) DEFAULT NULL,
  `weapon_magic_increment` int(11) DEFAULT NULL,
  PRIMARY KEY (`weapon_id`),
  CONSTRAINT `weapon_id_fk` FOREIGN KEY (`weapon_id`) REFERENCES `item` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-02-08 14:08:55
