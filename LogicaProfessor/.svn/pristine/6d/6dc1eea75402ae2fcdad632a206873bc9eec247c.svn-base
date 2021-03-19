-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema javan1801
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema javan1801
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `javan1801` DEFAULT CHARACTER SET latin1 ;
USE `javan1801` ;

-- -----------------------------------------------------
-- Table `javan1801`.`fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `javan1801`.`fornecedor` (
  `idfornecedor` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(150) NOT NULL,
  `cnpj` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idfornecedor`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `javan1801`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `javan1801`.`produto` (
  `idproduto` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(140) NOT NULL,
  `preco` DOUBLE NOT NULL,
  `idfornecedor` INT(11) NOT NULL,
  PRIMARY KEY (`idproduto`),
  INDEX `fk_produto_fornecedor_idx` (`idfornecedor` ASC),
  CONSTRAINT `fk_produto_fornecedor`
    FOREIGN KEY (`idfornecedor`)
    REFERENCES `javan1801`.`fornecedor` (`idfornecedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
