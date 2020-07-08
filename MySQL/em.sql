SET FOREIGN_KEY_CHECKS=0;
SET GLOBAL time_zone = '+2:00';

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id_student` int(11) NOT NULL AUTO_INCREMENT,
  `name_student` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `gender` boolean NOT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `status` boolean NOT NULL,
  PRIMARY KEY (`id_student`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for khoa_hoc
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id_course` int(11) NOT NULL AUTO_INCREMENT,
  `name_course` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `status_course` boolean NOT NULL,
  PRIMARY KEY (`id_course`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for lop_hoc
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `id_class` int(11) NOT NULL AUTO_INCREMENT,
  `id_course` int(11) DEFAULT NULL,
  `id_student` int(11) DEFAULT NULL,
  `subscribe_date` date DEFAULT NULL,
  `status_class` boolean NOT NULL,
  PRIMARY KEY (`ma_lop_hoc`),
  KEY `FK_nsk96k2rdocji4oakgsv51nuq` (`id_student`),
  KEY `FK_pvhxvf4oy1n5bp8tvn8a6tcnu` (`id_course`),
  CONSTRAINT `FK_nsk96k2rdocji4oakgsv51nuq` FOREIGN KEY (`id_student`) REFERENCES `student` (`id_student`),
  CONSTRAINT `FK_pvhxvf4oy1n5bp8tvn8a6tcnu` FOREIGN KEY (`id_course`) REFERENCES `course` (`id_course`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;