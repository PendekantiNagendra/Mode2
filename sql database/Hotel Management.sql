create database hotel

use hotel

select * from room 
update room set status='Available' 
Create Table Room
(
   RoomID varchar(10) primary key,
   Type varchar(10),
   Status varchar(10) default 'Available',
   CostPerDay INT
);

-- Type must be Single or Double 

Create Table Booking
(
  BookId varchar(10) primary key,
  RoomID varchar(10),
  CustName varchar(30),
  City varchar(30),
  BookDate TIMESTAMP,
  ChkDate TimeStamp
);

select * from booking 

truncate table booking 

Create Table Billing 
(
   BookID varchar(10),
   RoomID varchar(10),
   NoOfDays INT,
   BillAmt INT
);