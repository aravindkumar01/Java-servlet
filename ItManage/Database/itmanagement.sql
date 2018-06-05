-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2018 at 03:38 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `itmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `addtask`
--

CREATE TABLE `addtask` (
  `t_id` bigint(30) NOT NULL,
  `t_emp` varchar(30) NOT NULL,
  `p_id` bigint(30) NOT NULL,
  `t_status` int(11) NOT NULL DEFAULT '1',
  `t_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `dep_id` bigint(30) NOT NULL,
  `dep_name` varchar(30) NOT NULL,
  `dep_status` int(11) NOT NULL DEFAULT '1',
  `dep_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `div_name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`dep_id`, `dep_name`, `dep_status`, `dep_time`, `div_name`) VALUES
(9, 'GSS', 1, '2018-03-31 13:07:23', 'IT'),
(10, 'RND', 1, '2018-03-31 13:10:58', 'IT'),
(11, 'voice', 1, '2018-03-31 13:12:02', 'IT'),
(12, 'GSS', 1, '2018-03-31 17:16:44', 'NON-IT'),
(13, 'Voice', 1, '2018-03-31 17:20:28', 'NON-IT'),
(14, 'client', 1, '2018-03-31 17:44:29', 'NON-IT'),
(15, 'Gss', 1, '2018-03-31 17:47:20', 'KGISL'),
(16, 'Voice', 1, '2018-03-31 17:47:53', 'KGISL');

-- --------------------------------------------------------

--
-- Table structure for table `division`
--

CREATE TABLE `division` (
  `div_id` bigint(20) NOT NULL,
  `div_name` varchar(30) NOT NULL,
  `div_status` int(11) NOT NULL DEFAULT '1',
  `div_createAt` varchar(30) NOT NULL DEFAULT 'admin',
  `div_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `division`
--

INSERT INTO `division` (`div_id`, `div_name`, `div_status`, `div_createAt`, `div_time`) VALUES
(5, 'IT', 1, 'admin', '2018-03-31 11:42:00'),
(6, 'NON-IT', 1, 'admin', '2018-03-31 12:31:21'),
(7, 'KGISL', 1, 'admin', '2018-03-31 12:37:37'),
(8, 'KGFSL', 1, 'admin', '2018-03-31 12:44:37'),
(9, 'TCS', 1, 'admin', '2018-03-31 13:06:34'),
(16, 'new', 1, 'admin', '2018-04-11 04:52:48');

-- --------------------------------------------------------

--
-- Table structure for table `emp`
--

CREATE TABLE `emp` (
  `emp_id` bigint(30) NOT NULL,
  `emp_idNum` varchar(10) NOT NULL,
  `emp_fname` varchar(30) NOT NULL,
  `emp_lname` varchar(30) NOT NULL,
  `emp_gender` varchar(20) NOT NULL,
  `emp_dob` varchar(10) NOT NULL,
  `emp_doj` varchar(10) NOT NULL,
  `emp_email` varchar(35) NOT NULL,
  `emp_desiganation` varchar(25) NOT NULL,
  `emp_division` varchar(20) NOT NULL,
  `emp_department` varchar(20) NOT NULL,
  `emp_team` varchar(20) NOT NULL,
  `address` varchar(150) NOT NULL,
  `emp_uname` varchar(30) NOT NULL,
  `emp_pass` varchar(30) NOT NULL,
  `emp_status` int(11) NOT NULL DEFAULT '1',
  `emp_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp`
--

INSERT INTO `emp` (`emp_id`, `emp_idNum`, `emp_fname`, `emp_lname`, `emp_gender`, `emp_dob`, `emp_doj`, `emp_email`, `emp_desiganation`, `emp_division`, `emp_department`, `emp_team`, `address`, `emp_uname`, `emp_pass`, `emp_status`, `emp_time`) VALUES
(70, 'IT01', 'Aravind', 'Kumar', 'male', '1997-05-01', '2018-03-30', 'aravindkumark1997@gmail.com', 'manager', 'IT', 'GSS', 'Testing', '39,ganthinagar,\r\npalani,\r\ndindugul', 'aravind', 'Aravind123', 1, '2018-03-31 18:02:10'),
(71, 'IT02', 'Akil', 'tangavel', 'Male', '1997-03-06', '2018-03-30', 'akilh4@gmail.com', 'team leader', 'IT', 'GSS', 'Testing', 'Palani', 'akil', 'Akil1234', 1, '2018-03-31 18:04:30'),
(72, 'IT03', 'Soundar', 'Rajan', 'male', '1996-03-06', '2018-03-30', 'haifriends1997@gmail.com', 'employee', 'IT', 'GSS', 'Testing', 'kovai', 'soundar', 'Soundar12345', 1, '2018-03-31 18:12:28'),
(73, 'IT04', 'elango', 'elango', 'male', '1996-01-02', '2018-03-30', 'haifriends1997@gmail.com', 'employee', 'IT', 'GSS', 'Design', 'kovai', 'elango', 'Elango1234', 1, '2018-03-31 18:13:44'),
(74, 'NON01', 'Mohan', 'siva', 'male', '1996-02-05', '2018-03-31', 'mohan@gmail.com', 'manager', 'NON-IT', 'GSS', 'Testing', 'kovai', 'mohan', 'Mohan1234', 1, '2018-04-01 13:16:51'),
(75, 'NON02', 'suresh', 'kumar', 'male', '1997-01-02', '2018-04-01', 'suresh@gmail.com', 'team leader', 'NON-IT', 'GSS', 'Testing', 'kovai', 'suresh', 'Suresh1234', 1, '2018-04-01 13:20:13'),
(76, 'NON03', 'gayatri', 'gayatri', 'female', '1997-02-05', '2018-04-01', 'gayatri@gmail.com', 'employee', 'NON-IT', 'GSS', 'Testing', 'kovai', 'gayatri', 'Gayatri1234', 1, '2018-04-01 13:23:44'),
(77, 'NON04', 'Srimathi', 'sri', 'female', '2018-04-05', '2018-04-01', 'srimathi@gmail.com', 'employee', 'NON-IT', 'GSS', 'Testing', 'kovai', 'srimathi', 'Srimathi1234', 1, '2018-04-01 13:29:09'),
(78, 'AO1', 'a', 'a', 'female', '2018-04-05', '2018-04-10', 'sri@gmail.com', 'manager', 'NON-IT', 'GSS', 'Testing', 'kovai', 'sri', 'Sri12345', 1, '2018-04-10 09:28:14');

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE `project` (
  `pro_id` bigint(30) NOT NULL,
  `p_name` varchar(30) NOT NULL,
  `p_des` varchar(50) NOT NULL,
  `createEmp_id` bigint(30) NOT NULL,
  `p_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `p_status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`pro_id`, `p_name`, `p_des`, `createEmp_id`, `p_time`, `p_status`) VALUES
(1, 'IT management', 'To create all process for project assigning', 71, '2018-04-05 13:18:40', 1),
(2, 'Assest Management System', 'To create a software and hardware installation', 71, '2018-04-05 13:22:25', 1),
(3, 'LabtopShopManagement', 'To create all procee', 71, '2018-04-07 05:37:35', 1),
(4, 'Student Information System', 'Student Information System', 71, '2018-04-07 11:39:13', 1),
(6, 'hardware management', 'To create a hardware management system .', 71, '2018-04-09 05:27:07', 1),
(11, 'software Management', 'To create software Management', 71, '2018-04-09 05:33:41', 1);

-- --------------------------------------------------------

--
-- Table structure for table `projectempdetail`
--

CREATE TABLE `projectempdetail` (
  `d_id` bigint(30) NOT NULL,
  `emp_id` int(11) NOT NULL,
  `emp_name` varchar(30) NOT NULL,
  `emp_role` varchar(30) NOT NULL,
  `pro_id` bigint(30) NOT NULL,
  `d_status` int(11) NOT NULL DEFAULT '1',
  `d_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `projectempdetail`
--

INSERT INTO `projectempdetail` (`d_id`, `emp_id`, `emp_name`, `emp_role`, `pro_id`, `d_status`, `d_time`) VALUES
(1, 72, 'Soundar', 'Testing', 1, 1, '2018-04-05 13:18:40'),
(2, 73, 'elango', 'Design', 1, 1, '2018-04-05 13:18:40'),
(3, 72, 'Soundar', 'Testing', 2, 1, '2018-04-05 13:22:25'),
(4, 73, 'elango', 'Design', 2, 1, '2018-04-05 13:22:25'),
(5, 72, 'Soundar', 'Testing', 3, 1, '2018-04-07 05:37:35'),
(6, 73, 'elango', 'Design', 3, 1, '2018-04-07 05:37:35'),
(7, 72, 'Soundar', 'Testing', 4, 1, '2018-04-07 11:39:13'),
(8, 73, 'elango', 'Design', 4, 1, '2018-04-07 11:39:13'),
(9, 72, 'Soundar', 'Testing', 5, 1, '2018-04-09 04:49:27'),
(11, 72, 'Soundar', 'Testing', 6, 1, '2018-04-09 05:27:07'),
(12, 73, 'elango', 'Design', 6, 1, '2018-04-09 05:27:07'),
(13, 72, 'Soundar', 'Testing', 7, 1, '2018-04-09 05:30:14'),
(14, 73, 'elango', 'Design', 7, 1, '2018-04-09 05:30:14'),
(15, 72, 'Soundar', 'Testing', 8, 1, '2018-04-09 05:30:59'),
(16, 73, 'elango', 'Design', 8, 1, '2018-04-09 05:30:59'),
(17, 72, 'Soundar', 'Testing', 9, 1, '2018-04-09 05:31:20'),
(18, 73, 'elango', 'Design', 9, 1, '2018-04-09 05:31:20'),
(19, 72, 'Soundar', 'Testing', 10, 1, '2018-04-09 05:31:32'),
(20, 73, 'elango', 'Design', 10, 1, '2018-04-09 05:31:33'),
(21, 72, 'Soundar', 'Testing', 11, 1, '2018-04-09 05:33:41'),
(22, 73, 'elango', 'Design', 11, 1, '2018-04-09 05:33:41');

-- --------------------------------------------------------

--
-- Table structure for table `task`
--

CREATE TABLE `task` (
  `task_id` bigint(30) NOT NULL,
  `t_name` varchar(30) NOT NULL,
  `pro_id` bigint(30) NOT NULL,
  `p_name` varchar(35) NOT NULL,
  `t_des` varchar(100) NOT NULL,
  `t_createAt` varchar(30) NOT NULL,
  `t_assignee` varchar(30) DEFAULT NULL,
  `task_status` varchar(30) NOT NULL,
  `t_sdate` varchar(10) NOT NULL,
  `t_ddate` varchar(10) NOT NULL,
  `t_status` int(11) NOT NULL DEFAULT '1',
  `t_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `task`
--

INSERT INTO `task` (`task_id`, `t_name`, `pro_id`, `p_name`, `t_des`, `t_createAt`, `t_assignee`, `task_status`, `t_sdate`, `t_ddate`, `t_status`, `t_time`) VALUES
(1, 'Login form', 1, 'IT management', 'To create login form for all users', 'akil', 'Soundar', 'Completed', '2018-04-05', '2018-04-27', 1, '2018-04-05 13:23:59'),
(2, 'Employee form', 1, 'IT management', 'To create employee module', 'akil', 'Soundar', 'New', '2018-04-06', '2018-04-20', 1, '2018-04-05 13:25:54'),
(3, 'Hardware module', 2, 'Assest Management System', 'To create a hardware module', 'akil', 'Soundar', 'Completed', '2018-04-13', '2018-04-20', 1, '2018-04-05 13:34:19'),
(4, 'login page', 2, 'Assest Management System', 'To create login page', 'akil', 'elango', 'Ready to Use', '2018-04-05', '2018-04-20', 1, '2018-04-05 13:35:23'),
(5, 'Employee form', 2, 'Assest Management System', 'To create employee module', 'akil', 'soundar', 'Inprogress', '2018-04-06', '2018-04-19', 1, '2018-04-05 13:37:07'),
(6, 'software form', 2, 'Assest Management System', 'To create a software form', 'akil', 'elango', 'Inprogress', '2018-04-06', '2018-04-13', 1, '2018-04-05 13:39:19'),
(7, 'team leader form', 1, 'IT management', 'To create all access for team leader module', 'akil', 'soundar', 'Inprogress', '2018-04-06', '2018-04-06', 1, '2018-04-05 13:41:32'),
(8, 'manager form', 1, 'IT management', 'To create manager module', 'akil', 'soundar', 'Inprogress', '2018-04-05', '2018-04-20', 1, '2018-04-05 13:42:44'),
(9, 'Employee registartion', 2, 'Assest Management System', 'To create employee registration module', 'akil', 'soundar', 'Inprogress', '2018-04-06', '2018-04-19', 1, '2018-04-05 13:45:11');

-- --------------------------------------------------------

--
-- Table structure for table `task_update`
--

CREATE TABLE `task_update` (
  `u_id` bigint(30) NOT NULL,
  `pro_id` bigint(30) NOT NULL,
  `t_id` bigint(30) NOT NULL,
  `u_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `u_empid` int(30) NOT NULL,
  `u_priority` int(11) NOT NULL,
  `u_days` int(11) NOT NULL,
  `u_response` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `task_update`
--

INSERT INTO `task_update` (`u_id`, `pro_id`, `t_id`, `u_time`, `u_empid`, `u_priority`, `u_days`, `u_response`) VALUES
(1, 2, 3, '2018-04-05 14:25:49', 0, 1, 10, 'Its easy to create'),
(2, 1, 1, '2018-04-05 14:27:25', 0, 1, 1, 'Its easy'),
(3, 2, 4, '2018-04-05 14:36:36', 73, 1, 2, 'Its easy'),
(4, 2, 4, '2018-04-05 14:37:16', 73, 1, 1, 'Its easy one'),
(5, 1, 1, '2018-04-09 18:14:37', 0, 1, 1, 'easy'),
(6, 2, 3, '2018-04-09 18:14:59', 0, 1, 1, 'easy');

-- --------------------------------------------------------

--
-- Table structure for table `team`
--

CREATE TABLE `team` (
  `t_id` bigint(30) NOT NULL,
  `t_name` varchar(30) NOT NULL,
  `t_status` int(11) NOT NULL DEFAULT '1',
  `dep_name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `team`
--

INSERT INTO `team` (`t_id`, `t_name`, `t_status`, `dep_name`) VALUES
(7, 'Testing', 1, 'GSS'),
(8, 'Design', 1, 'GSS'),
(9, 'Design', 1, 'RND'),
(10, 'design', 1, 'Voice'),
(11, 'Testing', 1, 'Voice'),
(12, 'design', 1, 'client'),
(13, 'design', 1, 'Gss'),
(14, 'test', 1, 'Gss'),
(15, 'team1', 1, 'new'),
(16, 'team2', 1, 'new'),
(17, 'testing', 1, 'RND');

-- --------------------------------------------------------

--
-- Table structure for table `user_account`
--

CREATE TABLE `user_account` (
  `user_id` bigint(20) NOT NULL,
  `emp_id` bigint(30) NOT NULL,
  `user_name` varchar(25) NOT NULL,
  `user_password` varchar(25) NOT NULL,
  `user_role` varchar(11) NOT NULL,
  `user_status` int(11) NOT NULL DEFAULT '1',
  `user_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_createAt` varchar(30) NOT NULL DEFAULT 'admin'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_account`
--

INSERT INTO `user_account` (`user_id`, `emp_id`, `user_name`, `user_password`, `user_role`, `user_status`, `user_time`, `user_createAt`) VALUES
(71, 70, 'aravind', 'Aravind123', 'manager', 1, '2018-03-31 18:02:10', 'admin'),
(72, 71, 'akil', 'Akil1234', 'team leader', 1, '2018-03-31 18:04:31', 'admin'),
(73, 72, 'soundar', 'Soundar12345', 'employee', 1, '2018-03-31 18:12:28', 'admin'),
(74, 73, 'elango', 'Elango1234', 'employee', 1, '2018-03-31 18:13:44', 'admin'),
(75, 74, 'mohan', 'Mohan1234', 'manager', 1, '2018-04-01 13:16:52', 'admin'),
(76, 75, 'suresh', 'Suresh1234', 'team leader', 1, '2018-04-01 13:20:14', 'admin'),
(77, 76, 'gayatri', 'Gayatri1234', 'employee', 1, '2018-04-01 13:23:44', 'admin'),
(78, 77, 'srimathi', 'Srimathi1234', 'employee', 1, '2018-04-01 13:29:09', 'admin'),
(79, 78, 'sri', 'Sri12345', 'manager', 1, '2018-04-10 09:28:14', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addtask`
--
ALTER TABLE `addtask`
  ADD PRIMARY KEY (`t_id`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`dep_id`);

--
-- Indexes for table `division`
--
ALTER TABLE `division`
  ADD PRIMARY KEY (`div_id`);

--
-- Indexes for table `emp`
--
ALTER TABLE `emp`
  ADD PRIMARY KEY (`emp_id`);

--
-- Indexes for table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`pro_id`),
  ADD KEY `createEmp_id` (`createEmp_id`);

--
-- Indexes for table `projectempdetail`
--
ALTER TABLE `projectempdetail`
  ADD PRIMARY KEY (`d_id`);

--
-- Indexes for table `task`
--
ALTER TABLE `task`
  ADD PRIMARY KEY (`task_id`),
  ADD KEY `pro_id` (`pro_id`);

--
-- Indexes for table `task_update`
--
ALTER TABLE `task_update`
  ADD PRIMARY KEY (`u_id`);

--
-- Indexes for table `team`
--
ALTER TABLE `team`
  ADD PRIMARY KEY (`t_id`);

--
-- Indexes for table `user_account`
--
ALTER TABLE `user_account`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `addtask`
--
ALTER TABLE `addtask`
  MODIFY `t_id` bigint(30) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `dep_id` bigint(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `division`
--
ALTER TABLE `division`
  MODIFY `div_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `emp`
--
ALTER TABLE `emp`
  MODIFY `emp_id` bigint(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;

--
-- AUTO_INCREMENT for table `project`
--
ALTER TABLE `project`
  MODIFY `pro_id` bigint(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `projectempdetail`
--
ALTER TABLE `projectempdetail`
  MODIFY `d_id` bigint(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `task`
--
ALTER TABLE `task`
  MODIFY `task_id` bigint(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `task_update`
--
ALTER TABLE `task_update`
  MODIFY `u_id` bigint(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `team`
--
ALTER TABLE `team`
  MODIFY `t_id` bigint(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `user_account`
--
ALTER TABLE `user_account`
  MODIFY `user_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=80;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `project`
--
ALTER TABLE `project`
  ADD CONSTRAINT `project_ibfk_1` FOREIGN KEY (`createEmp_id`) REFERENCES `emp` (`emp_id`);

--
-- Constraints for table `task`
--
ALTER TABLE `task`
  ADD CONSTRAINT `task_ibfk_1` FOREIGN KEY (`pro_id`) REFERENCES `project` (`pro_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
