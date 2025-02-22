-- CREATE DATABASE movie;
USE movie;
 DROP TABLE IF EXISTS movies;
DROP TABLE IF EXISTS directors;
DROP TABLE IF EXISTS actors;
DROP TABLE IF EXISTS ratings;
DROP TABLE IF EXISTS genres;
CREATE TABLE directors (
	-- director_id SERIAL PRIMARY KEY,
	director_id INT AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	date_of_birth DATE
);
-- id, rating, description

CREATE TABLE ratings (
	rating_id INT AUTO_INCREMENT PRIMARY KEY,
	rating VARCHAR(5) NOT NULL,
	description VARCHAR(50) NOT NULL
);
-- ALTER TABLE ratings MODIFY COLUMN description VARCHAR(50);

-- G - General Audiences
-- PG - Parental Guidance Suggested
-- PG-13 - Parents Strongly Cautioned
-- R - Restricted
insert into ratings (rating, description) values ('G', 'General Audiences');
insert into ratings (rating, description) values ('PG', 'Parental Guidance Suggested');
insert into ratings (rating, description) values ('PG-13', 'Parents Strongly Cautioned');
insert into ratings (rating, description) values ('R', 'Restricted');

CREATE TABLE genres (
	genre_id INT AUTO_INCREMENT PRIMARY KEY,
	genre VARCHAR(25) NOT NULL
);
insert into genres (genre) values ('Action');
insert into genres (genre) values ('Animation');
insert into genres (genre) values ('Comedy');
insert into genres (genre) values ('Sci-Fi');
insert into genres (genre) values ('Drama, Sci-Fi');


TRUNCATE TABLE directors;
insert into directors (first_name, last_name, date_of_birth) values ('James', 'Cameron', '1954-08-16');
insert into directors (first_name, last_name, date_of_birth) values ('J.J.', 'Abrams', '1966-06-27');
CREATE TABLE actors (
	actor_id INT AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	date_of_birth DATE
);
TRUNCATE TABLE actors;
insert into actors (first_name, last_name, date_of_birth) values ('Sam', 'Worthington', '1976-08-02');
insert into actors (first_name, last_name, date_of_birth) values ('Zoe', 'Saldana', '1978-06-19');
insert into actors (first_name, last_name, date_of_birth) values ('Sigourney', 'Weaver', '1949-10-08');
insert into actors (first_name, last_name, date_of_birth) values ('John', 'Cho', '1972-06-16');
insert into actors (first_name, last_name, date_of_birth) values ('Chris', 'Pine', '1980-08-26');


CREATE TABLE movies (
	movie_id INT AUTO_INCREMENT PRIMARY KEY,
	director_id INT,
    rating_id INT NOT NULL,
	movie_name VARCHAR(50) NOT NULL,
	movie_length INT,
	release_date DATE, 
	FOREIGN KEY (director_id) REFERENCES directors(director_id),
    foreign key (genre_id) references genres(genre_id)
);
select * from movies;


select * from movies where movie_name = 'Avatar';

select movie_name, first_name, last_name from movies m;

join directors d on d.director_id = m.director_id where m.movie_name = 'Avatar';




INSERT INTO movies (movie_name, movie_length, release_date, director_id, rating_id)
values ('Avatar', 162, '2009-12-18', 1, 3);

INSERT INTO movies (movie_name, movie_length, release_date, director_id, rating_id)
values ('Star Trek', 127, '2009-05-08', 2, 3);

select m.movie_name, m.movie_length, m.release_date, d.first_name, d.last_name, r.rating, g.genre from movies m join directors d on d.director_id = m.director_id join ratings r on r.rating_id = m.rating_id join genres g on g.genre_id = m.genre_id where m.movie_name = 'Star Trek';