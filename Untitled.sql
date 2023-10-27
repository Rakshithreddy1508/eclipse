show databases;
create database RR;
use RR;
show tables;

create table Products(
   id INT,
   name VARCHAR(100) ,
   des text,
   cost INT
);


INSERT INTO Products ( id, name, des,cost ) VALUES( 1111, "TV","Electronics",5555);
INSERT INTO Products ( id, name, des,cost ) VALUES( 2222, "Phone","Electronics",6000);
INSERT INTO Products ( id, name, des,cost ) VALUES( 3333, "Laptop","Electronics",4000);
INSERT INTO Products ( id, name, des,cost ) VALUES( 4444, "Motor","Electronics",5453);
#read from table
Select * from Products;

 
