create database hibernate;
use hibernate;
create table student(
	id int not null auto_increment primary key,
	name varchar(20),
	age int
);