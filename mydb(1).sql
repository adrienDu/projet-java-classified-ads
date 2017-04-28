-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2017 at 10:38 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `annonce`
--

CREATE TABLE `annonce` (
  `idAnnonce` varchar(50) NOT NULL,
  `titreAnnonce` varchar(500) NOT NULL,
  `descAnnonce` varchar(1000) NOT NULL,
  `photoAnnonce` varchar(1000) DEFAULT NULL,
  `zoneAnnonce` int(5) NOT NULL,
  `Prix` float NOT NULL,
  `Contact` varchar(50) NOT NULL,
  `dateAnnonce` date NOT NULL,
  `finAnnonce` date NOT NULL,
  `importanceAnnonce` int(3) NOT NULL,
  `dateCrea` date NOT NULL,
  `User_idUser` varchar(50) NOT NULL,
  `Cat_idCategorie` int(11) NOT NULL,
  `idType_Type` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `annonce`
--

INSERT INTO `annonce` (`idAnnonce`, `titreAnnonce`, `descAnnonce`, `photoAnnonce`, `zoneAnnonce`, `Prix`, `Contact`, `dateAnnonce`, `finAnnonce`, `importanceAnnonce`, `dateCrea`, `User_idUser`, `Cat_idCategorie`, `idType_Type`) VALUES
('1', 'Vente chaussure', 'blablabalbabalabl', NULL, 75000, 0, '', '2017-04-01', '2017-04-03', 1, '2017-04-24', 'P1', 1, 0),
('2', 'Achat vetements', 'balzoefizjovij i jpozdcpokzcdp', NULL, 75019, 0, '', '2017-04-11', '2017-04-19', 1, '2017-04-18', 'E5', 2, 1),
('29e80311-da75-479d-9de6-a526ec19d67d', 'Recherche SSD', 'Recherche SSD de 1TB de préférence Crucial ou Samsung', '', 75019, 0, '', '2017-04-26', '2017-05-26', 1, '2017-04-26', 'E1', 4, 0),
('3', 'recherche emploi', 'zeoifzoeijfoiej', NULL, 75018, 0, '', '2017-04-06', '2017-04-19', 1, '2017-04-08', 'P3', 2, 2),
('4', 'vente telephone', 'eofijeifoe', NULL, 75017, 0, '', '2017-04-20', '2017-04-27', 1, '2017-04-20', 'P1', 2, 0),
('5', 'covoiturage', 'vfvefok', NULL, 75013, 0, '', '2017-04-17', '2017-04-21', 3, '2017-04-06', 'A2', 1, 3),
('6fe4de0c-4373-4458-bfe1-40c2f79f74ba', 'BMW X5', 'VEhicule de 2012', '', 75004, 25000, 'Adrien', '2017-04-27', '2017-04-29', 1, '2017-04-27', 'E1', 0, 1),
('9c973f30-b76b-4a43-aa2c-460d71a6bcb6', 'BMW', 'de 2015', '', 75005, 25000, 'Adrien', '2017-04-27', '2017-04-29', 1, '2017-04-27', 'E1', 0, 1),
('e4180368-5770-461d-a4a1-e7d2c34551b1', 'az', 'qsd', '', 75001, 0, '', '2017-04-26', '2017-04-28', 1, '2017-04-26', 'E1', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `association`
--

CREATE TABLE `association` (
  `User_idUser` varchar(50) NOT NULL,
  `nomAss` varchar(100) NOT NULL,
  `siretAss` varchar(45) NOT NULL,
  `numAdAss` int(11) NOT NULL,
  `rueAdAss` varchar(100) NOT NULL,
  `cpAdAss` int(5) NOT NULL,
  `villeAdAss` varchar(50) NOT NULL,
  `telAss` int(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `association`
--

INSERT INTO `association` (`User_idUser`, `nomAss`, `siretAss`, `numAdAss`, `rueAdAss`, `cpAdAss`, `villeAdAss`, `telAss`) VALUES
('A1', 'Association1', '8574980343', 9, '9', 75001, 'Paris', 7),
('A2', 'Medecins sans frontiere', '85749803543', 33, 'avenue Garnier', 75003, 'Paris', 675432343),
('A4', 'Association 4', '49857456039', 5, '8', 75005, 'Paris', 67579389),
('A5', 'Association 4', '4985756456039', 5, '8', 75009, 'Paris', 67579389);

-- --------------------------------------------------------

--
-- Table structure for table `categorie`
--

CREATE TABLE `categorie` (
  `idCategorie` int(11) NOT NULL,
  `nomCategorie` varchar(50) NOT NULL,
  `Type_idType` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `categorie`
--

INSERT INTO `categorie` (`idCategorie`, `nomCategorie`, `Type_idType`) VALUES
(0, 'Vehicule', 0),
(0, 'Vehicule', 1),
(1, 'Electromenager', 0),
(1, 'Electromenager', 1),
(2, 'Immobilier', 0),
(2, 'Immobilier', 1),
(3, 'Mobilier', 0),
(3, 'Mobilier', 1),
(4, 'Multimedia', 0),
(4, 'Multimedia', 1),
(5, 'Loisirs', 0),
(5, 'Loisirs', 1),
(6, 'Livres', 0),
(6, 'Livres', 1),
(7, 'Materiel Proffessionnel', 0),
(7, 'Materiel Professionnel', 1),
(8, 'Evenement', 0),
(8, 'Evenement', 1),
(8, 'Evenements', 4),
(9, 'Maison et Jardin', 0),
(9, 'Maison et Jardin', 1),
(10, 'Autres', 0),
(10, 'Autres', 1),
(10, 'Autres', 2),
(10, 'Autres', 3),
(10, 'Autres', 4),
(11, 'CDD/CDI', 2),
(12, 'Stages et Alternances', 2),
(13, 'Petits Boulots', 2),
(13, 'Petits Boulots', 3),
(14, 'Activites et Formations', 2),
(14, 'Activites et Formations', 3),
(15, 'Covoiturage', 2),
(15, 'Covoiturage', 3);

-- --------------------------------------------------------

--
-- Table structure for table `entreprise`
--

CREATE TABLE `entreprise` (
  `User_idUser1` varchar(50) NOT NULL,
  `nomEnt` varchar(100) NOT NULL,
  `numAdEnt` int(11) NOT NULL,
  `rueAdEnt` varchar(100) NOT NULL,
  `cpAdEnt` int(5) NOT NULL,
  `villeAdEnt` varchar(50) NOT NULL,
  `telEnt` int(30) DEFAULT NULL,
  `sirenEnt` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `entreprise`
--

INSERT INTO `entreprise` (`User_idUser1`, `nomEnt`, `numAdEnt`, `rueAdEnt`, `cpAdEnt`, `villeAdEnt`, `telEnt`, `sirenEnt`) VALUES
('E1', 'La Broquante', 15, 'Rue de la Roquette', 75012, 'Paris', 142503954, '702 012 881'),
('E2', 'La Brocante', 43, 'Rue des Pruniers', 75015, 'Paris', 43092384, '702 012 834'),
('E3', 'Auto Occase', 32, 'Rue de le Resistance', 75002, 'Paris', 12342384, '702 012 312'),
('E4', 'Century 21', 17, 'Avenue Laumiere', 75017, 'Paris', 23492384, '702 012 756'),
('E5', 'Deco.fr', 77, 'Rue des Etoiles', 75005, 'Paris', 5932384, '702 012 222');

-- --------------------------------------------------------

--
-- Table structure for table `particulier`
--

CREATE TABLE `particulier` (
  `User_idUser` varchar(50) NOT NULL,
  `nomPart` varchar(50) NOT NULL,
  `prenomPart` varchar(50) NOT NULL,
  `numAdPart` int(11) NOT NULL,
  `rueAdPart` varchar(100) NOT NULL,
  `cpAdPart` int(5) NOT NULL,
  `villeAdPart` varchar(50) NOT NULL,
  `telPart` int(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `particulier`
--

INSERT INTO `particulier` (`User_idUser`, `nomPart`, `prenomPart`, `numAdPart`, `rueAdPart`, `cpAdPart`, `villeAdPart`, `telPart`) VALUES
('P1', 'Veider', 'Lea', 10, 'avenue Jules Ferry', 75010, 'Paris', 678912345),
('P2', 'Rigaud', 'Jean', 58, 'rue de la butte', 75019, 'Paris', 678934874),
('P3', 'Troyes', 'Julie', 4, 'rue de Rome', 75009, 'Paris', 678230943),
('P4', 'Plank', 'Louis', 33, 'quai de la Loire', 75019, 'Paris', 683984390),
('P5', 'Hierre', 'Tom', 7, 'boulevard saint Martin', 75008, 'Paris', 684793401);

-- --------------------------------------------------------

--
-- Table structure for table `permission`
--

CREATE TABLE `permission` (
  `idPermission` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `permission`
--

INSERT INTO `permission` (`idPermission`) VALUES
('admin'),
('classique'),
('modo'),
('user');

-- --------------------------------------------------------

--
-- Table structure for table `premium`
--

CREATE TABLE `premium` (
  `idPremium` int(11) NOT NULL,
  `datePayPremium` date DEFAULT NULL,
  `dureePremium` int(11) DEFAULT NULL,
  `montantPayPremium` int(11) DEFAULT NULL,
  `User_idUser` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `premium`
--

INSERT INTO `premium` (`idPremium`, `datePayPremium`, `dureePremium`, `montantPayPremium`, `User_idUser`) VALUES
(1, '2016-12-01', 3, 3, 'A1'),
(2, NULL, NULL, NULL, 'E1'),
(4, '1913-01-12', 3, 5, 'E3');

-- --------------------------------------------------------

--
-- Table structure for table `type`
--

CREATE TABLE `type` (
  `idType` int(11) NOT NULL,
  `nomType` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `type`
--

INSERT INTO `type` (`idType`, `nomType`) VALUES
(0, 'Achat'),
(1, 'Vente'),
(2, 'Proprosition Service'),
(3, 'Recherche Service'),
(4, 'Information');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `idUser` varchar(50) NOT NULL,
  `idSocialUser` varchar(50) NOT NULL,
  `mailUser` varchar(255) NOT NULL,
  `mdpUser` varchar(255) NOT NULL,
  `etatUser` varchar(45) NOT NULL,
  `dateInUser` date NOT NULL,
  `typeUser` varchar(45) NOT NULL,
  `Permission_idPermission` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`idUser`, `idSocialUser`, `mailUser`, `mdpUser`, `etatUser`, `dateInUser`, `typeUser`, `Permission_idPermission`) VALUES
('16beb409-2769-11e7-bcc5-080027c8c725', '0', 'admin@admin.fr', 'admin', '1', '2017-04-22', 'admin', 'admin'),
('16bf06f7-2769-11e7-bcc5-080027c8c725', '1', 'user@user.fr', 'user', '1', '2017-04-22', 'part', 'user'),
('A1', '34093U5H3', 'blablabal@hbaponp.com', 'ffoijfezoe', 'OK', '2016-11-16', 'A', 'classique'),
('A2', '34093tU5HRRG345', 'blablabartrfrtl@hbaponp.com', 'ffoifgtrrjfezoeer', 'OK', '2016-11-16', 'A', 'classique'),
('A4', '34093U5H34', 'blablabal@hbaponp.comFfe', 'ffoijfezoefr', 'OK', '2016-09-23', 'A', 'classique'),
('A5', '34093U5HRRG345', 'blablabarfrtl@hbaponp.com', 'ffoifrjfezoeer', 'OK', '2016-11-16', 'A', 'classique'),
('E1', '', 'labroquante@surparis.fr', '6841a1ad0ef61ce0ac6846be62a5d956', 'OK', '2016-11-15', 'Ent', 'classique'),
('E2', '120432951432521', 'auto@auto-occase.fr', '3367fc2e1948e6bbe0a3eaee153da460', 'OK', '2016-10-15', 'Ent', 'classique'),
('E3', '23941391985321', 'agence17@century21.fr', 'ezgsnfbnke', 'OK', '2016-11-15', 'Ent', 'classique'),
('E4', '231570234570736', 'jeanpierre@mairie04.paris', 'zrÃ ipgovhnqgk', 'OK', '2016-11-15', 'Ent', 'classique'),
('E5', '235069143054628', 'pichet@deco.fr', 'zpvnrgiqqelfgbh', 'OK', '2016-07-27', 'Ent', 'classique'),
('P1', '12345678975434565', 'lea.veider@mail.fr', 'leaveider1', 'OK', '2016-11-25', 'Part', 'classique'),
('P2', '8439239457493579385', 'jeanrigaud@mail.fr', 'jeanrigaudpwd', 'OK', '2016-11-25', 'Part', 'classique'),
('P3', '485739205837859', 'julie.troyes@mail.com', 'hello123', 'OK', '2016-11-23', 'Part', 'classique'),
('P4', '7384973895497940', 'louisplank@mail.com', 'plank90pwd', 'OK', '2016-11-22', 'Part', 'admin'),
('P5', '8569547983759437598', 'tomhierre@mail.fr', 'tomtomhierre123', 'OK', '2016-11-25', 'Part', 'classique');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `annonce`
--
ALTER TABLE `annonce`
  ADD PRIMARY KEY (`idAnnonce`,`User_idUser`,`Cat_idCategorie`),
  ADD UNIQUE KEY `idAnnonce_UNIQUE` (`idAnnonce`),
  ADD KEY `fk_Annonce_User1_idx` (`User_idUser`),
  ADD KEY `fk_Annonce_Type1_idx` (`Cat_idCategorie`),
  ADD KEY `idType_Type` (`idType_Type`);

--
-- Indexes for table `association`
--
ALTER TABLE `association`
  ADD PRIMARY KEY (`User_idUser`),
  ADD KEY `fk_User_has_User_User1_idx` (`User_idUser`);

--
-- Indexes for table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`idCategorie`,`Type_idType`),
  ADD KEY `fk_Categorie_Type1_idx` (`Type_idType`);

--
-- Indexes for table `entreprise`
--
ALTER TABLE `entreprise`
  ADD PRIMARY KEY (`User_idUser1`),
  ADD KEY `fk_User_has_User_User2_idx` (`User_idUser1`);

--
-- Indexes for table `particulier`
--
ALTER TABLE `particulier`
  ADD PRIMARY KEY (`User_idUser`),
  ADD KEY `fk_User_has_User_User3_idx` (`User_idUser`);

--
-- Indexes for table `permission`
--
ALTER TABLE `permission`
  ADD PRIMARY KEY (`idPermission`);

--
-- Indexes for table `premium`
--
ALTER TABLE `premium`
  ADD PRIMARY KEY (`idPremium`,`User_idUser`),
  ADD KEY `fk_Premium_User1_idx` (`User_idUser`);

--
-- Indexes for table `type`
--
ALTER TABLE `type`
  ADD PRIMARY KEY (`idType`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idUser`,`Permission_idPermission`),
  ADD UNIQUE KEY `idUser_UNIQUE` (`idUser`),
  ADD UNIQUE KEY `idSocialUser_UNIQUE` (`idSocialUser`),
  ADD KEY `fk_User_Permission1_idx` (`Permission_idPermission`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `annonce`
--
ALTER TABLE `annonce`
  ADD CONSTRAINT `fk_Annonce_Cat1` FOREIGN KEY (`Cat_idCategorie`) REFERENCES `categorie` (`idCategorie`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Annonce_Type1` FOREIGN KEY (`idType_Type`) REFERENCES `type` (`idType`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Annonce_User1` FOREIGN KEY (`User_idUser`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `association`
--
ALTER TABLE `association`
  ADD CONSTRAINT `fk_User_has_User_User1` FOREIGN KEY (`User_idUser`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `categorie`
--
ALTER TABLE `categorie`
  ADD CONSTRAINT `fk_Categorie_Type1` FOREIGN KEY (`Type_idType`) REFERENCES `type` (`idType`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `entreprise`
--
ALTER TABLE `entreprise`
  ADD CONSTRAINT `fk_User_has_User_User2` FOREIGN KEY (`User_idUser1`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `particulier`
--
ALTER TABLE `particulier`
  ADD CONSTRAINT `fk_User_has_User_User3` FOREIGN KEY (`User_idUser`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `premium`
--
ALTER TABLE `premium`
  ADD CONSTRAINT `fk_Premium_User1` FOREIGN KEY (`User_idUser`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `fk_User_Permission1` FOREIGN KEY (`Permission_idPermission`) REFERENCES `permission` (`idPermission`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
