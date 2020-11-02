-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : lun. 02 nov. 2020 à 22:00
-- Version du serveur :  10.4.13-MariaDB
-- Version de PHP : 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `TDJSPServlet`
--

-- --------------------------------------------------------

--
-- Structure de la table `CLIENT`
--

CREATE TABLE `CLIENT` (
  `ID` int(11) NOT NULL,
  `ADRESSE` varchar(150) NOT NULL,
  `NOM` varchar(50) NOT NULL,
  `TELEPHONE` varchar(14) NOT NULL,
  `VILLAGE_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `CLIENT`
--

INSERT INTO `CLIENT` (`ID`, `ADRESSE`, `NOM`, `TELEPHONE`, `VILLAGE_ID`) VALUES
(1, 'Mbour', 'Faye', '761234567', 4),
(2, 'Canada', 'Mballo', '648765478574', 2),
(3, 'bjcfdjggjjljhjhcd', 'Sow', '765478574', 1),
(4, 'Mbour', 'Faye', '7092457895', 4),
(5, 'mnklkkl;kl', 'Faye', '7092457895', 4),
(6, 'Canada', 'Lo', '77537783723', 4);

-- --------------------------------------------------------

--
-- Structure de la table `USER`
--

CREATE TABLE `USER` (
  `ID` int(11) NOT NULL,
  `MOTDEPASSE` varchar(150) NOT NULL,
  `NOMUTILISATEUR` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `VILLAGE`
--

CREATE TABLE `VILLAGE` (
  `ID` int(11) NOT NULL,
  `NOM` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `VILLAGE`
--

INSERT INTO `VILLAGE` (`ID`, `NOM`) VALUES
(1, 'Pire'),
(2, 'Guandiaye'),
(3, 'Bambali'),
(4, 'Tattaguine'),
(5, 'Ndioum'),
(6, 'Keur Mor ndiaye'),
(7, 'Keur Mor ndiaye'),
(8, 'Mboro');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `CLIENT`
--
ALTER TABLE `CLIENT`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_CLIENT_VILLAGE_ID` (`VILLAGE_ID`);

--
-- Index pour la table `USER`
--
ALTER TABLE `USER`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `VILLAGE`
--
ALTER TABLE `VILLAGE`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `CLIENT`
--
ALTER TABLE `CLIENT`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `USER`
--
ALTER TABLE `USER`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `VILLAGE`
--
ALTER TABLE `VILLAGE`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `CLIENT`
--
ALTER TABLE `CLIENT`
  ADD CONSTRAINT `FK_CLIENT_VILLAGE_ID` FOREIGN KEY (`VILLAGE_ID`) REFERENCES `VILLAGE` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
