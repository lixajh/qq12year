/*
Navicat MySQL Data Transfer

Source Server         : qqsrx.site
Source Server Version : 50558
Source Host           : 198.46.248.122:3306
Source Database       : qq12year

Target Server Type    : MYSQL
Target Server Version : 50558
File Encoding         : 65001

Date: 2018-01-17 11:33:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_tv_show
-- ----------------------------
DROP TABLE IF EXISTS `tbl_tv_show`;
CREATE TABLE `tbl_tv_show` (
  `pk_global_id` varchar(36) NOT NULL,
  `m_date` date DEFAULT NULL,
  `audio` varchar(255) DEFAULT NULL,
  `have_show` int(11) DEFAULT '0' COMMENT '0:没有 1:有',
  PRIMARY KEY (`pk_global_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_tv_show
-- ----------------------------
INSERT INTO `tbl_tv_show` VALUES ('11101', '2006-03-01', 'http://qqsrx.site:8080/2006-03-01.mp3', '1');
INSERT INTO `tbl_tv_show` VALUES ('11109', '2006-03-03', 'http://qqsrx.site:8080/2006-03-03.mp3', '1');
INSERT INTO `tbl_tv_show` VALUES ('11112', '2006-01-12', 'http://qqsrx.site:8080/2006-01-12.mp3', '1');
INSERT INTO `tbl_tv_show` VALUES ('11113', '2006-01-13', 'http://qqsrx.site:8080/2006-01-13.mp3', '1');
INSERT INTO `tbl_tv_show` VALUES ('11114', '2006-02-06', 'http://qqsrx.site:8080/2006-02-06.mp3', '1');
INSERT INTO `tbl_tv_show` VALUES ('11115', '2006-02-07', 'http://qqsrx.site:8080/2006-02-07.mp3', '1');
