--Creates the database.
CREATE DATABASE dNames;

--Creates the user in that database.
CREATE USER 'test'@'%' IDENTIFIED BY 'Test';

--Grant all the privileges to the new user on the newly created database.
GRANT ALL ON dNotes.* TO 'test'@'%';

--Create Table(s)

--Table [Names]
DROP TABLE IF EXISTS Names;

CREATE TABLE Names (
	id BIGINT NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(50) NOT NULL,
	middle_name VARCHAR(50),
	last_name VARCHAR(50) NOT NULL,
	PRIMARY KEY (id)
);

