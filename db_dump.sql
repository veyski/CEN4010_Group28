-- MySQL dump 10.13  Distrib 8.0.32, for macos13 (arm64)
--
-- Host: localhost    Database: geekText
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Author`
--

DROP TABLE IF EXISTS `Author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Author` (
  `AuthorID` int NOT NULL AUTO_INCREMENT,
  `Author_Name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`AuthorID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Author`
--

LOCK TABLES `Author` WRITE;
/*!40000 ALTER TABLE `Author` DISABLE KEYS */;
INSERT INTO `Author` VALUES (1,'Harper Lee'),(2,'F. Scott Fitzgerald'),(3,'Jane Austen'),(4,'George Orwell'),(5,'J.D. Salinger');
/*!40000 ALTER TABLE `Author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `best_selling_books`
--

DROP TABLE IF EXISTS `best_selling_books`;
/*!50001 DROP VIEW IF EXISTS `best_selling_books`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `best_selling_books` AS SELECT 
 1 AS `Book_Title`,
 1 AS `Author_Name`,
 1 AS `Book_Copies_Sold`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `Book`
--

DROP TABLE IF EXISTS `Book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Book` (
  `BookID` int NOT NULL AUTO_INCREMENT,
  `AuthorID` int DEFAULT NULL,
  `CategoryID` int DEFAULT NULL,
  `Book_Title` varchar(100) NOT NULL,
  `Book_Description` varchar(255) DEFAULT NULL,
  `Book_Price` float DEFAULT NULL,
  `Book_Publish_Date` varchar(100) DEFAULT NULL,
  `Book_ISBN` varchar(13) DEFAULT NULL,
  `Book_Copies_Sold` int DEFAULT NULL,
  `Book_Publisher` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`BookID`),
  UNIQUE KEY `Book_Title` (`Book_Title`),
  KEY `AuthorsID` (`AuthorID`),
  KEY `CategoryID` (`CategoryID`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`AuthorID`) REFERENCES `Author` (`AuthorID`),
  CONSTRAINT `book_ibfk_2` FOREIGN KEY (`CategoryID`) REFERENCES `Category` (`CategoryID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Book`
--

LOCK TABLES `Book` WRITE;
/*!40000 ALTER TABLE `Book` DISABLE KEYS */;
INSERT INTO `Book` VALUES (1,1,1,'To Kill a Mockingbird','A classic tale of justice and racism in the deep south',9.99,'1960-07-11','9780061120084',100,'Harper Perennial Modern Classics'),(2,2,4,'The Great Gatsby','A story of love and loss in the roaring 20s',15.99,'1925-04-10','9780743273565',150,'Scribner'),(3,3,3,'Pride and Prejudice','A timeless story of love and social class',6.99,'1813-01-28','9780141439518',200,'Penguin Classics'),(4,4,2,'1984','A dystopian vision of a future society',9.99,'1949-06-08','9780451524935',75,'Signet Classics'),(5,5,1,'The Catcher in the Rye','A coming-of-age story about teenage angst',8.99,'1951-07-16','9780316769488',125,'Little, Brown and Company');
/*!40000 ALTER TABLE `Book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Category`
--

DROP TABLE IF EXISTS `Category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Category` (
  `CategoryID` int NOT NULL AUTO_INCREMENT,
  `Category` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CategoryID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Category`
--

LOCK TABLES `Category` WRITE;
/*!40000 ALTER TABLE `Category` DISABLE KEYS */;
INSERT INTO `Category` VALUES (1,'Fiction'),(2,'Non-fiction'),(3,'Classics'),(4,'Science Fiction'),(5,'Biography'),(6,'Classic'),(7,'Dystopian'),(8,'Romance'),(9,'Fiction');
/*!40000 ALTER TABLE `Category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CC`
--

DROP TABLE IF EXISTS `CC`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `CC` (
  `CCID` int NOT NULL AUTO_INCREMENT,
  `UserID` int DEFAULT NULL,
  `CC_Num` varchar(16) DEFAULT NULL,
  `CC_Expiration` varchar(5) DEFAULT NULL,
  `CC_CVV` varchar(3) DEFAULT NULL,
  `Billing_Address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CCID`),
  KEY `UserID` (`UserID`),
  CONSTRAINT `cc_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `User` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CC`
--

LOCK TABLES `CC` WRITE;
/*!40000 ALTER TABLE `CC` DISABLE KEYS */;
/*!40000 ALTER TABLE `CC` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Order`
--

DROP TABLE IF EXISTS `Order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Order` (
  `OrderID` int NOT NULL AUTO_INCREMENT,
  `UserID` int DEFAULT NULL,
  `BookID` int DEFAULT NULL,
  `CCID` int DEFAULT NULL,
  `Order_Quantity` int DEFAULT NULL,
  `Total_Price` int DEFAULT NULL,
  PRIMARY KEY (`OrderID`),
  KEY `UserID` (`UserID`),
  KEY `BookID` (`BookID`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `User` (`UserID`),
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`BookID`) REFERENCES `Book` (`BookID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Order`
--

LOCK TABLES `Order` WRITE;
/*!40000 ALTER TABLE `Order` DISABLE KEYS */;
/*!40000 ALTER TABLE `Order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Review`
--

DROP TABLE IF EXISTS `Review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Review` (
  `ReviewID` int NOT NULL AUTO_INCREMENT,
  `UserID` int DEFAULT NULL,
  `BookID` int DEFAULT NULL,
  `Content` varchar(255) DEFAULT NULL,
  `Score` int DEFAULT NULL,
  PRIMARY KEY (`ReviewID`),
  KEY `UserID` (`UserID`),
  KEY `BookID` (`BookID`),
  CONSTRAINT `review_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `User` (`UserID`),
  CONSTRAINT `review_ibfk_2` FOREIGN KEY (`BookID`) REFERENCES `Book` (`BookID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Review`
--

LOCK TABLES `Review` WRITE;
/*!40000 ALTER TABLE `Review` DISABLE KEYS */;
INSERT INTO `Review` VALUES (1,1,1,'Great book! A must-read for everyone.',4),(2,2,2,'One of my favorite books of all time.',5),(3,3,3,'Not my cup of tea, but I can see why others like it.',3);
/*!40000 ALTER TABLE `Review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `User` (
  `UserID` int NOT NULL AUTO_INCREMENT,
  `Username` varchar(100) DEFAULT NULL,
  `Pass` varchar(100) DEFAULT NULL,
  `Full_Name` varchar(100) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Home_Address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES (1,'johndoe','pass1','John Doe','johndoe@onemail.io','111 First Street, Anytown USA'),(2,'janesmith','pass2','Jane Smith','janesmith@onemail.io','456 Elm St, Anytown USA'),(3,'bobjohns','pass3','Bob Johns','bobjohns@onemail.io','789 Oak St, Anytown USA');
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `best_selling_books`
--

/*!50001 DROP VIEW IF EXISTS `best_selling_books`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb3 */;
/*!50001 SET character_set_results     = utf8mb3 */;
/*!50001 SET collation_connection      = utf8mb3_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `best_selling_books` AS select `b`.`Book_Title` AS `Book_Title`,`a`.`Author_Name` AS `Author_Name`,`b`.`Book_Copies_Sold` AS `Book_Copies_Sold` from (`book` `b` join `author` `a` on((`b`.`AuthorID` = `a`.`AuthorID`))) order by `b`.`Book_Copies_Sold` desc limit 10 */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-19 14:13:10
