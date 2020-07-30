DROP TABLE IF EXISTS POSTARE;
DROP TABLE IF EXISTS RATING;
DROP TABLE IF EXISTS UTILIZATOR;
DROP TABLE IF EXISTS SUBSCRIPTION;
 
CREATE TABLE POSTARE (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  titlu VARCHAR(250) NOT NULL,
  continut VARCHAR(250) NOT NULL
);

CREATE TABLE RATING (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_postare int not null,
    nota int not null
);
 
CREATE TABLE UTILIZATOR(
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(250) NOT NULL,
    abonare BIT NOT NULL 
);

CREATE TABLE POSTARE_UTILIZATOR (
    id_postare int not null,
    id_utilizator int not null
);
