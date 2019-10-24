create table student
(
sno int primary key,
name varchar(30) not null,
Sub1 int,
Sub2 int,
Sub3 int,
total numeric(9,2),
avg numeric(9,2)
) 

insert into student(sno, name, Sub1, Sub2, Sub3)
values(1, 'Prem', 67, 65, 66),
(2, 'Sai', 55, 85, 99),
(3, 'Visali', 54, 66, 78),
(4, 'Deepa', 74, 65, 98) 

select * from student

update student
set
total = Sub1+Sub2+Sub3,
avg = (Sub1+Sub2+Sub3)/3

delete from student where sno=1
