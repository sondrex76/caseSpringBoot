CREATE TABLE employee

(

 characterName varchar(100) NOT NULL,

  characterId BIGINT NOT NULL,

 characterExperienceValue BIGINT DEFAULT 0,

 characterDetails varchar(1000) DEFAULT NULL,

 characterPicture varchar(1000) DEFAULT NULL,

 PRIMARY KEY (characterId)

);