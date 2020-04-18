-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 17, 2020 at 11:26 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `healthcaredb`
--

-- --------------------------------------------------------

--
-- Table structure for table `hospital`
--

CREATE TABLE `hospital` (
  `HospitalID` int(10) NOT NULL,
  `MOHcode` varchar(20) NOT NULL,
  `ManagerName` varchar(30) NOT NULL,
  `HospitalName` varchar(30) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `TPnumber` int(11) NOT NULL,
  `Location` varchar(100) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hospital`
--

INSERT INTO `hospital` (`HospitalID`, `MOHcode`, `ManagerName`, `HospitalName`, `Address`, `TPnumber`, `Location`, `Username`, `Password`) VALUES
(1, 'GOV1002', 'Dr. Pradeep Hettiarachchi', 'Gomas Hospital', '128/B Awissawella', 452270048, 'Awissawella', 'Gomas@gmail.com', 'GomasGOV1002'),
(2, 'GOV1004', 'Dr. Kamal Senevirathna', 'Veenus Hospital', '18/B Awissawella', 452270055, 'Awissawella', 'Veenus@gmail.com', 'VeenusGOV1004'),
(3, 'GOV1011', 'Dr. Anil Gunathilaka', 'Arogya Hospital', '13/B1 Anuradhapura', 452266994, 'Anuradhapura', 'Arogya@gmail.com', 'ArogyaGOV1011'),
(4, 'GOV1066', 'Dr. Indrasena', 'Arya Hospital', '169/9 Rathnapura', 452445555, 'Rathnapura', 'Arya@gmail.com', 'AryaGOV1066'),
(5, 'GOV1112', 'Dr. Newil', 'Newil Pranandu  Hospital', '19/9 Colombo 10', 115647258, 'Colombo ', 'Newilp@gmail.com', 'NewilpGOV1112');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hospital`
--
ALTER TABLE `hospital`
  ADD PRIMARY KEY (`HospitalID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hospital`
--
ALTER TABLE `hospital`
  MODIFY `HospitalID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
