use sqlpractice;

Create Table EmployNew
(
 empno int,
 name varchar(30),
 dept varchar(30),
 desig varchar(30),
 basic numeric(9,2)
);

Insert into EmployNew
values(1, 'Raghu', 'Java', 'Expert', 88522),
(3, 'Niveditha', 'J2EE', 'Programmer', 42222),
(4, 'Anisha', 'Sql', 'Expert', 88542),
(5, 'Vinod', 'Dba', 'Expert', 88422);

select * from EmployNew