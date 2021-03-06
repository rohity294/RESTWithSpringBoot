-- MySQL Script generated by MySQL Workbench
-- Wed Dec 22 00:23:33 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema rohitdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `rohitdb` ;

-- -----------------------------------------------------
-- Schema rohitdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `rohitdb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `rohitdb` ;

-- -----------------------------------------------------
-- Table `rohitdb`.`department`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `rohitdb`.`department` ;

CREATE TABLE IF NOT EXISTS `rohitdb`.`department` (
  `department_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`department_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `rohitdb`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `rohitdb`.`user` ;

CREATE TABLE IF NOT EXISTS `rohitdb`.`user` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `age` INT NULL DEFAULT NULL,
  `salary` FLOAT NULL DEFAULT NULL,
  `department_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  INDEX `fkDepartment_department_id_idx` (`department_id` ASC) VISIBLE,
  CONSTRAINT `fkDepartment_department_id`
    FOREIGN KEY (`department_id`)
    REFERENCES `rohitdb`.`department` (`department_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
