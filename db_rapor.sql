/*
SQLyog Ultimate v12.4.3 (64 bit)
MySQL - 10.4.21-MariaDB : Database - db_rapor
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_rapor` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `db_rapor`;

/*Table structure for table `tb_guru` */

DROP TABLE IF EXISTS `tb_guru`;

CREATE TABLE `tb_guru` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `alamat` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `lahir` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_guru` */

LOCK TABLES `tb_guru` WRITE;

insert  into `tb_guru`(`id`,`alamat`,`email`,`lahir`,`nama`,`password`,`username`) values 
(1,'Bandung','nushnna1953@gmail.com','2003-05-19','Nurul','12345','admin');

UNLOCK TABLES;

/*Table structure for table `tb_kkm` */

DROP TABLE IF EXISTS `tb_kkm`;

CREATE TABLE `tb_kkm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kkm` int(11) DEFAULT NULL,
  `mapel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_kkm` */

LOCK TABLES `tb_kkm` WRITE;

insert  into `tb_kkm`(`id`,`kkm`,`mapel`) values 
(1,75,'PAI'),
(2,70,'PKN'),
(3,75,'Bahasa Indonesia'),
(4,75,'Matematika'),
(5,75,'IPA'),
(6,70,'IPS'),
(7,70,'Seni Budaya');

UNLOCK TABLES;

/*Table structure for table `tb_nilai` */

DROP TABLE IF EXISTS `tb_nilai`;

CREATE TABLE `tb_nilai` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mapel` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `nilai` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_nilai` */

LOCK TABLES `tb_nilai` WRITE;

insert  into `tb_nilai`(`id`,`mapel`,`nama`,`nilai`) values 
(1,'PAI','Nurul',90),
(2,'PKN','Nurul',70),
(6,'Bahasa Indonesia','Aren',80),
(4,'Matematika','Mita',80);

UNLOCK TABLES;

/*Table structure for table `tb_sekolah` */

DROP TABLE IF EXISTS `tb_sekolah`;

CREATE TABLE `tb_sekolah` (
  `npsn` int(11) NOT NULL AUTO_INCREMENT,
  `alamat` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `provinsi` varchar(255) DEFAULT NULL,
  `web` varchar(255) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`npsn`)
) ENGINE=MyISAM AUTO_INCREMENT=11024367 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_sekolah` */

LOCK TABLES `tb_sekolah` WRITE;

insert  into `tb_sekolah`(`npsn`,`alamat`,`email`,`nama`,`provinsi`,`web`,`foto`) values 
(11024365,'Jl. Raya 01','nushnna1953@gmail.com','SD Pelita','Jawa Tengah','www.pelitabandung.co.id','11024365.jpg');

UNLOCK TABLES;

/*Table structure for table `tb_siswa` */

DROP TABLE IF EXISTS `tb_siswa`;

CREATE TABLE `tb_siswa` (
  `nis` int(11) NOT NULL AUTO_INCREMENT,
  `agama` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `alamat_ayah` varchar(255) DEFAULT NULL,
  `alamat_ibu` varchar(255) DEFAULT NULL,
  `alamat_wali` varchar(255) DEFAULT NULL,
  `jk` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `nama_ayah` varchar(255) DEFAULT NULL,
  `nama_ibu` varchar(255) DEFAULT NULL,
  `nama_wali` varchar(255) DEFAULT NULL,
  `pekerjaah_ayah` varchar(255) DEFAULT NULL,
  `pekerjaah_ibu` varchar(255) DEFAULT NULL,
  `pekerjaan_wali` varchar(255) DEFAULT NULL,
  `tgl_lahir` varchar(255) DEFAULT NULL,
  `kelas` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nis`)
) ENGINE=MyISAM AUTO_INCREMENT=1104 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_siswa` */

LOCK TABLES `tb_siswa` WRITE;

insert  into `tb_siswa`(`nis`,`agama`,`alamat`,`alamat_ayah`,`alamat_ibu`,`alamat_wali`,`jk`,`nama`,`nama_ayah`,`nama_ibu`,`nama_wali`,`pekerjaah_ayah`,`pekerjaah_ibu`,`pekerjaan_wali`,`tgl_lahir`,`kelas`) values 
(1101,'Islam','Sukaraja','Jepara','Bandung','','Perempuan','Nurul','Budi Hadi','Mulyati','','Swasta','IRT','','2003-03-25','1'),
(1102,'islam','pekanbaru','pkb','pkb','','Perempuan','Mita','aa','bb','','swasta','irt','','2022-04-09','2'),
(1103,'Islam','Subang','Bandung','Bandung','','Perempuan','Aren','Ayah','Mama','','Pengusaha','Guru','','2001-03-01','1');

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
