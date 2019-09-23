create database rest_db;
use rest_db;

create table employee(
name varchar(35) not null,
salary double,
id int primary key not null
);