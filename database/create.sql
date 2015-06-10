create database tenant_1;
use tenant_1

drop table if exists staff;

create table staff
(
id int not null auto_increment,
name varchar(30) not null,
telephone varchar(30) not null,
address varchar(255) not null,
email varchar(50) not null,
CONSTRAINT PK_customer PRIMARY KEY  (id)
);

