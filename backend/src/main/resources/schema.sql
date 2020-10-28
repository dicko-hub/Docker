DROP TABLE IF EXISTS courses;
CREATE TABLE courses(
	id serial PRIMARY KEY, 
	username VARCHAR(255),
	description VARCHAR(255)
);