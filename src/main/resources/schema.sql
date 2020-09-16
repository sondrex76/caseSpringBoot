CREATE TABLE employee

(

 characterName varchar(100) NOT NULL,

  characterId int(11) NOT NULL ,

 characterExperienceValue int(100) DEFAULT NULL,

 characterDetails varchar(1000) DEFAULT NULL,

 characterPicture varchar(1000) DEFAULT NULL,

 PRIMARY KEY (characterId)

);