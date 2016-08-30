create database Struts2BBS;
use Struts2BBS;
drop table if exists Category;
create table Category (
	id int not null auto_increment primary key,
	subject varchar(30) not null,
	content varchar(200)
);