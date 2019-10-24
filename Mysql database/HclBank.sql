create database HCLBANK;
use HCLBANK;

create table user(
id int Not null primary key auto_increment,
username varchar(30) unique not null,
password varchar(25) not null
);

drop table user;
insert into user values(default, 'Nagendra', '1'),
						(default, 'Sobha', '2'),
                        (default, 'Vardan', '3');
                        
                        insert into user values(default, 'Sudha', '4');
                         insert into user values(default, 'Chinna', '5');
                          insert into user values(default, 'Gopi', '6');
                           insert into user values(default, 'Sudarshan', '7');
                        
                        select * from user;
                        
create table account(
accountnum int Not null primary key auto_increment,
amount double,
accounttype char,
userid int,
 foreign key (userId) references USER(id)
);
               
               insert into account values(default, '5000', 's', '1');
					 insert into account values	(default, '7500', 'c', '2');
                      insert into account values   (default, '9300', 's', '3');
select * from account
drop table account;
ALTER TABLE account DROP acc_no;
