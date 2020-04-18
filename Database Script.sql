-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 18, 2020 at 12:59 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

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
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `DoctorId` int(11) NOT NULL,
  `Dname` varchar(20) NOT NULL,
  `DRegNo` varchar(10) NOT NULL,
  `Specialization` varchar(20) NOT NULL,
  `ContactNo` int(10) NOT NULL,
  `Address` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `HospitalName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`DoctorId`, `Dname`, `DRegNo`, `Specialization`, `ContactNo`, `Address`, `Email`, `HospitalName`) VALUES
(1, 'Avishka Yapa', '11111', 'ENT', 77544432, 'No.234 Galle Road', 'avis', 'Ragama'),
(2, 'Kalana', 'Kalana', 'Msc', 34343, 'Halawatha', '4343', 'Halawatha');

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
  `TPnumber` varchar(10) NOT NULL,
  `Location` varchar(100) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hospital`
--

INSERT INTO `hospital` (`HospitalID`, `MOHcode`, `ManagerName`, `HospitalName`, `Address`, `TPnumber`, `Location`, `Username`, `Password`) VALUES
(1, 'GOV1002', 'Dr. Pradeep Hettiarachchi', 'Gomas Hospital', '128/B Awissawella', '0452270048', 'Awissawella', 'Gomas@gmail.com', 'GomasGOV1002'),
(2, 'GOV1004', 'Dr. Kamal Senevirathna', 'Veenus Hospital', '18/B Awissawella', '0452270055', 'Awissawella', 'Veenus@gmail.com', 'VeenusGOV1004'),
(3, 'GOV1011', 'Dr. Anil Gunathilaka', 'Arogya Hospital', '13/B1 Anuradhapura', '0452266994', 'Anuradhapura', 'Arogya@gmail.com', 'ArogyaGOV1011'),
(4, 'GOV1066', 'Dr. Indrasena', 'Arya Hospital', '169/9 Rathnapura', '0452445555', 'Rathnapura', 'Arya@gmail.com', 'AryaGOV1066'),
(5, 'GOV1112', 'Dr. Newil', 'Newil Pranandu  Hospital', '19/9 Colombo 10', '0115647258', 'Colombo ', 'Newilp@gmail.com', 'NewilpGOV1112');

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

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `pamentID` int(11) NOT NULL,
  `cardNo` int(16) NOT NULL,
  `nameOnCard` varchar(20) NOT NULL,
  `expDate` date NOT NULL,
  `cvc` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`pamentID`, `cardNo`, `nameOnCard`, `expDate`, `cvc`) VALUES
(3, 254876952, 'B C R M COORAY', '2023-09-11', 586),
(4, 254876952, 'A S Y AMARASEKARA', '2023-09-11', 586),
(5, 789635421, 'N B DILHARA', '2024-08-10', 175),
(6, 826547895, 'H A T PRADEEP', '2021-04-10', 751),
(7, 564782136, 'K W MADHUSHANIKA', '2020-09-22', 961);

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

CREATE TABLE `schedule` (
  `Shedule_ID` int(11) NOT NULL,
  `Doctor_ID` int(11) NOT NULL,
  `Hospital_ID` int(11) NOT NULL,
  `Chargers` decimal(7,2) NOT NULL,
  `Available_Time` datetime NOT NULL,
  `End_Time` datetime NOT NULL,
  `Sever_Time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `schedule`
--

INSERT INTO `schedule` (`Shedule_ID`, `Doctor_ID`, `Hospital_ID`, `Chargers`, `Available_Time`, `End_Time`, `Sever_Time`) VALUES
(1, 1, 1, '2300.00', '2020-04-22 00:00:00', '2020-04-22 00:00:00', '2020-04-22 00:00:00'),
(2, 2, 2, '2000.00', '2020-04-22 00:00:00', '2020-04-22 00:00:00', '2020-04-22 00:00:00'),
(3, 2, 1, '1000.00', '2020-04-22 00:00:00', '2020-04-22 00:00:00', '2020-04-22 00:00:00'),
(6, 1, 2, '1000.00', '2020-04-22 00:00:00', '2020-04-22 00:00:00', '2020-04-22 00:00:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`DoctorId`);

--
-- Indexes for table `hospital`
--
ALTER TABLE `hospital`
  ADD PRIMARY KEY (`HospitalID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`userID`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`pamentID`);

--
-- Indexes for table `schedule`
--
ALTER TABLE `schedule`
  ADD PRIMARY KEY (`Shedule_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `DoctorId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `hospital`
--
ALTER TABLE `hospital`
  MODIFY `HospitalID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `userID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `pamentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `schedule`
--
ALTER TABLE `schedule`
  MODIFY `Shedule_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
