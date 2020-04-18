-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 18, 2020 at 09:17 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
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
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `userID` int(10) NOT NULL,
  `userName` varchar(100) NOT NULL,
  `userAddress` varchar(100) NOT NULL,
  `nicNo` varchar(100) NOT NULL,
  `dateOfBirth` date NOT NULL,
  `gender` varchar(100) NOT NULL,
  `mobileNumber` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`userID`, `userName`, `userAddress`, `nicNo`, `dateOfBirth`, `gender`, `mobileNumber`, `email`, `password`) VALUES
(1, 'bhagya', 'pannipitiya', '973133993V', '1997-11-08', 'male', '0772542373', 'bd@gmail.com', 'bhgy978@'),
(2, 'kasun', 'malabe', '954477113V', '1995-03-21', 'male', '0712338211', 'kasu@gmail.com', '2222aaaa'),
(3, 'avishka', 'katunayake', '962255771V', '1996-06-30', 'male', '0778885514', 'avi@gmail.com', 'abc321'),
(6, 'pradeep', 'rathnapura', '968866110V', '1996-02-21', 'male', '0772558801', 'prade@gmail.com', 'xxxvvv21');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `userID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
