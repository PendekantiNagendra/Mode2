create database sqlpractice1;
use sqlpractice1;

CREATE TABLE EMPLOYEE (
EMP_ID int NOT NULL auto_increment, 
NAME VARCHAR(25), 
PRIMARY KEY (EMP_ID)
);

 drop table EMPLOYEE
drop table EMPLOYEE_ADDRESS

 CREATE TABLE EMPLOYEE_ADDRESS  ( 
 ADDR_ID int NOT NULL auto_increment, 
 EMP_ID int NOT NULL  , 
 STREET VARCHAR(25), 
 CITY VARCHAR(25), 
 STATE VARCHAR(25), 
 COUNTRY VARCHAR(25), 
 PRIMARY KEY (ADDR_ID),

 CONSTRAINT fk_emp FOREIGN KEY (EMP_ID) REFERENCES EMPLOYEE (EMP_ID)
 );

INSERT INTO EMPLOYEE
VALUES
	(default, 'Pankaj'),
	(default, 'David'),
	(default, 'Lisa'),
	(default, 'Jack');
    select * from employee
    
    INSERT INTO EMPLOYEE_ADDRESS
VALUES
	(default, 1, 'SR Colony', 'Nandyal','AP', 'India'),
	(default, 2, 'Gangotri', 'bng','KS', 'India'),
	(default, 3, 'Benz', 'vija','AP', 'India'),
	(default, 4, 'OMR', 'chennai','TS', 'India');
    
     select * from EMPLOYEE_ADDRESS
    
    