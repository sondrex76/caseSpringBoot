DROP TABLE IF EXISTS employee;
CREATE TABLE employee(
 name varchar(100) NOT NULL,
  id BIGINT NOT NULL,
 experience BIGINT DEFAULT 0,
 details varchar(1000) DEFAULT NULL,
 picture varchar(99999) DEFAULT NULL,
 PRIMARY KEY (characterId)
);