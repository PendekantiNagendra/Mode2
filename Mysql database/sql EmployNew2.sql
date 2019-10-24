use sqlpractice;

drop table EmployNew

create table EmployNew
(
 empno int primary key,
 name varchar(30) not null,
 dept varchar(30),
 desig varchar(30),
 basic numeric(9,2)
 )
 
 insert into EmployNew values
 (1, 'Raghu', 'Java', 'Expert', 88522),
(3, 'Niveditha', 'J2EE', 'Programmer', 42222),
(4, 'Anisha', 'Sql', 'Expert', 88542),
(5, 'Vinod', 'Dba', 'Expert', 88422);

select * from EmployNew
