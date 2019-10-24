create database stuExam;
use stuExam;
create table student(
id int not null auto_increment,
rollNo int,
sName varchar(20),
age int,
gender varchar(10),
country varchar(15),
dateofJoin date,
finalScore float,
primary key(id)
);

create table Exam(
mi int  auto_increment primary key,
marks double, 
subName varchar(35),
sid int
);