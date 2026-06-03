create database db;
use db;
drop table emp; 
create table emp(
empid int,
ename char(10),
ecity char(10),
esal int
);
insert into emp values (101,"n","ngp",10200),(102,"m","mumbai",30000),(103,"s","pune",20000);
 
create table emp2 as select * from emp;
select * from emp2;

create table emp3 as select empid,ecity from emp;
select * from emp3;

alter table emp2 rename to employee;
select * from employee;

drop table employee;
select * from employee;

alter table emp add(pincode int);
select * from emp;

-- alter table emp modify(pincode varchar(10)); oracle
alter table emp  modify pincode varchar(10);
truncate table emp3;