create database modeTwoDB;
use modeTwoDB;
drop table Student;
create table Student(
	id int not null auto_increment,
    rollNum int ,
    sname varchar(30),
    age int,
    gender varchar(10),
    country varchar(15),
    DateOfJoin datetime,
    FinalScore float,
    primary key(id)
);
select * from Student;

create table exam(
eid int not null auto_increment,
mark int, 
subject varchar(35),
sid int,
primary key(eid),
foreign key (sid) references student(id) ON DELETE CASCADE);

drop table exam
