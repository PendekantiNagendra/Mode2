create table department
(
deptno int primary key,
dname varchar(30),
loc varchar(300),
head varchar(30)
);

insert into department values(1, 'java', 'parlin', 'matt'),
(2, 'dotnet', 'detroit', 'prior'),
(3, 'SAP', 'piscaptsway', 'scott'),
(4, 'HRM', 'delaware', 'adam'),
(5, 'SQL', 'hollywood', 'steve')

select * from Department