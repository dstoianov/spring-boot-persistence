-- liquibase formatted sql

-- changeset denys.stoianov:id_1
-- comment: create locations table

-- -----------------------------------------------------
-- Schema locations
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `locations`
(
    id           BIGINT(10)  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    city_name    VARCHAR(64) NOT NULL UNIQUE,
    country_name VARCHAR(64) NOT NULL,
    created_on   DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_on   DATETIME             DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE = InnoDB
  CHARSET = utf8;

