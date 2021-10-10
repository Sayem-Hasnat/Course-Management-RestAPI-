-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 10, 2021 at 01:16 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `course_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `approval_form`
--

CREATE TABLE `approval_form` (
  `approval_id` bigint(20) NOT NULL,
  `course_id` bigint(20) NOT NULL,
  `approval_status` bit(1) NOT NULL,
  `student_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `course_id` bigint(20) NOT NULL,
  `course_code` varchar(255) NOT NULL,
  `course_credit` double NOT NULL,
  `course_name` varchar(255) NOT NULL,
  `is_exist` bit(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`course_id`, `course_code`, `course_credit`, `course_name`, `is_exist`) VALUES
(1, 'Synesis3201', 0, 'Synesis Trainee', b'1'),
(2, 'CSE3201', 3, 'SoftWare Develeopment', b'1'),
(3, 'CS3202', 3, 'Basic C language', b'0'),
(4, 'CS3207', 3, 'Basic C++ language', b'1'),
(5, 'JAVA3203', 4, 'Mastering on Java', b'1'),
(6, 'S&A3201', 3, 'Software Analysis', b'1'),
(7, 'OOP3201', 2, 'OOP Concept', b'1'),
(8, 'CSE3209', 3, 'Software Management', b'1'),
(9, 'Sys2301', 0, 'System Design', b'1'),
(10, 'DB3202', 3, 'Database Design', b'1'),
(11, 'DB3207', 3, 'Basic DB language', b'1');

-- --------------------------------------------------------

--
-- Table structure for table `course_approval`
--

CREATE TABLE `course_approval` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course_approval`
--

INSERT INTO `course_approval` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `course_department`
--

CREATE TABLE `course_department` (
  `department_id` bigint(20) NOT NULL,
  `course_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course_student`
--

CREATE TABLE `course_student` (
  `student_id` bigint(20) NOT NULL,
  `course_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `department_id` bigint(20) NOT NULL,
  `department_code` varchar(255) NOT NULL,
  `department_name` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`department_id`, `department_code`, `department_name`) VALUES
(1, ' CSE', 'Computer Science & Engineering'),
(2, ' CN', 'Computer Networking'),
(3, ' ELL', 'Department of English Language'),
(4, 'EEE', 'Electrical Engineering');

-- --------------------------------------------------------

--
-- Table structure for table `department_course`
--

CREATE TABLE `department_course` (
  `course_id` bigint(20) NOT NULL,
  `department_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `department_student`
--

CREATE TABLE `department_student` (
  `department_id` bigint(20) DEFAULT NULL,
  `student_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(12);

-- --------------------------------------------------------

--
-- Table structure for table `role_type`
--

CREATE TABLE `role_type` (
  `role_id` bigint(20) NOT NULL,
  `authority` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `student_id` bigint(20) NOT NULL,
  `is_exist` bit(1) DEFAULT NULL,
  `student_first_name` varchar(255) NOT NULL,
  `student_last_name` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`student_id`, `is_exist`, `student_first_name`, `student_last_name`) VALUES
(1, b'0', 'Sayem', 'Hasnat'),
(2, b'1', 'Sayem', 'Hasnat'),
(3, b'1', 'Abdur', 'Rahman'),
(4, b'1', 'Moshiur', 'Rahman'),
(5, b'1', 'Moshiur', 'Rahman'),
(6, b'1', 'Last', 'Test'),
(7, b'1', 'Dept', 'Test');

-- --------------------------------------------------------

--
-- Table structure for table `student_course`
--

CREATE TABLE `student_course` (
  `course_id` bigint(20) NOT NULL,
  `student_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_course`
--

INSERT INTO `student_course` (`course_id`, `student_id`) VALUES
(2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `student_department`
--

CREATE TABLE `student_department` (
  `department_id` bigint(20) NOT NULL,
  `student_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

CREATE TABLE `user_details` (
  `user_id` bigint(20) NOT NULL,
  `user_mail` varchar(255) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `user_pass` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `approval_form`
--
ALTER TABLE `approval_form`
  ADD PRIMARY KEY (`approval_id`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`course_id`);

--
-- Indexes for table `course_department`
--
ALTER TABLE `course_department`
  ADD KEY `FKfpoq5d0sd9agxuxtlglbf3yxb` (`course_id`),
  ADD KEY `FKdsko06r0aais6mh9tjecmgmp` (`department_id`);

--
-- Indexes for table `course_student`
--
ALTER TABLE `course_student`
  ADD KEY `FKlmj50qx9k98b7li5li74nnylb` (`course_id`),
  ADD KEY `FK4xxxkt1m6afc9vxp3ryb0xfhi` (`student_id`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`department_id`);

--
-- Indexes for table `department_course`
--
ALTER TABLE `department_course`
  ADD KEY `FK5lv22lb7yc6ew05u2c6ppkhe2` (`department_id`),
  ADD KEY `FK7iqy10owpdwhv1r2qe50i3ejd` (`course_id`);

--
-- Indexes for table `department_student`
--
ALTER TABLE `department_student`
  ADD PRIMARY KEY (`student_id`),
  ADD KEY `FKtm4rbsshlj7gqk17xt7cngpwb` (`department_id`);

--
-- Indexes for table `role_type`
--
ALTER TABLE `role_type`
  ADD PRIMARY KEY (`role_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`student_id`);

--
-- Indexes for table `student_course`
--
ALTER TABLE `student_course`
  ADD KEY `FKq7yw2wg9wlt2cnj480hcdn6dq` (`student_id`),
  ADD KEY `FKejrkh4gv8iqgmspsanaji90ws` (`course_id`);

--
-- Indexes for table `student_department`
--
ALTER TABLE `student_department`
  ADD UNIQUE KEY `UK_60rikh7y80tt0aol89dw6vfjw` (`student_id`),
  ADD KEY `FK78ynrm0a10okrfjodfyrkerqy` (`department_id`);

--
-- Indexes for table `user_details`
--
ALTER TABLE `user_details`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `department_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `role_type`
--
ALTER TABLE `role_type`
  MODIFY `role_id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `student_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
