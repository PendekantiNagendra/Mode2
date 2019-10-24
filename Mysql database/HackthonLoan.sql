create database bankdb;
use bankdb;
create table login(
login_id int not null auto_increment primary key,
username varchar(30) not null,
password varchar(30) not null,
unique(username)
);  

create table customer(
cust_id int not null auto_increment primary key,
name varchar(30) not null,
type int default '1',
credit_score double(3,2),
add_id int,
login_id int ,
 FOREIGN KEY (login_id) REFERENCES login(login_id),
 FOREIGN KEY (add_id) REFERENCES address(add_id)
);

create table address(
add_id int not null auto_increment primary key,
house_no varchar(10),
street varchar(15),
city varchar(10),
state varchar(10),
country varchar(10),
near_by varchar(30),
area_code int,
email varchar(30),
phoneno varchar(30)
);
alter table address modify street varchar(30), modify city varchar(30), modify house_no varchar(30),modify country varchar(30) ;
alter table customer modify login_id int default '0';

alter table address modify state varchar(30);
select * from customer;
select * from address;
drop table address;
drop table customer;
drop table login;

select * from login;
truncate table login;
truncate table address;

create table loan(
loan_id int not null primary key auto_increment,
loanamount int,
area_code int,
area_size double(4,2),
legal_residence varchar(30)
);
create table items(
item_id int not null primary key auto_increment,
item_name varchar(30),
amount double(6,2),
score double(2,2)
);
insert into items values(default,"a",200000,30),
(default,"b",400000,40),(default,"c",600000,60),(default,"d",800000,30),(default,"e",1000000,30);