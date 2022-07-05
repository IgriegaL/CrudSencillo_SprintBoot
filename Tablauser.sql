

CREATE TABLE IF NOT EXISTS `usuarios`.`user` (
  `id` INT(11) NOT NULL,
  `Name` VARCHAR(45) NOT NULL,
  `Lastname` VARCHAR(45) NOT NULL,
  `Age` INT(3) NOT NULL,
  `Gender` VARCHAR(5) NOT NULL,
  `Email` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB