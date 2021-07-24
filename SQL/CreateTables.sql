create table Products(
	barcode	int IDENTITY(1,1),
	name varchar(MAX),	
	price int,
	description	text,
	PRIMARY KEY (barcode),
	);

create table Students(
	student_id int IDENTITY(1,1),
	age int,
	name varchar(MAX),
	pc_id int,
	PRIMARY KEY (student_id),
	FOREIGN KEY (pc_id) REFERENCES PCs(pc_id)
	);

create table PCs(
	pc_id int IDENTITY(1,1),
	ram	int,
	manufacturer varchar(50)
	PRIMARY KEY (pc_id)
	);

insert into Products (name, price, description) values ('Apple', 2, 'Keeps the doctor away.');
insert into PCs (ram, manufacturer) values (16, 'Lenovo');
insert into Students (age, name, pc_id) values (24, 'Hadi', 1);