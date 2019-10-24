create database college 

use college;

create table CourseList
(
   courseno varchar(15) primary key,
   duration int,
   startDate date,
   endDate date,
   HOD varchar(30)
)



create table subjects
(
   year int,instructor varchar(28),
subject varchar(150),
theory int,
practical int
)