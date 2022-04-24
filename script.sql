-- or whatever you want, just remember to update the java code
CREATE DATABASE sample;

USE sample;

CREATE TABLE fruits (name varchar(30), color varchar(30));

INSERT INTO fruits (name, color) 
			values 
			('banana', 'yellow'), 
			('apple', 'green'), 
			('tangerine', 'orange');
