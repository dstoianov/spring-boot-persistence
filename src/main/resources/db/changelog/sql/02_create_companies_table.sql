-- liquibase formatted sql

-- changeset denys.stoianov:id_2
-- comment: create locations table

-- -----------------------------------------------------
-- Schema companies
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `companies`
(
    id           BIGINT(10)  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    company_name VARCHAR(64) NOT NULL UNIQUE,
    description  TEXT        NOT NULL,
    location_id  BIGINT(10)           DEFAULT NULL,
    created_on   DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_on   DATETIME             DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE = InnoDB
  CHARSET = utf8;
