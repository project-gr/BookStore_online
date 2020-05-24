--CREATE TABLE
create table Books(
	Book_ID varchar(30) primary key NOT NULL,
	Book_Name varchar(30) NOT NULL,
	Author varchar(30) NOT NULL,
	Category varchar(30),
	Price float NOT NULL,
	Discount float,
	Quantity int NOT NULL,
);

create table Customers(
	Customer_ID varchar(30) NOT NULL,
	Customer_Name varchar(30) NOT NULL, 
	Cus_username varchar(30) NOT NULL,
	Cus_password varchar(30) NOT NULL,
	Address varchar(30),
	Street varchar(30),
	District varchar(30),
	City varchar(30),
	Country varchar(30),
	Phone varchar(14),
	Email varchar(30), 
	primary key(Customer_ID, Cus_username)
);

create table Staff(
	Staff_ID varchar(30) NOT NULL,
	Staff_Name varchar(30) NOT NULL,
	Staff_username varchar(30) NOT NULL,
	Staff_password varchar(30) NOT NULL,
	Phone varchar(14),
	Email varchar(30),
	primary key(Staff_ID, Staff_username)
)

create table Order_Review(
	Order_ID varchar(30) NOT NULL,
		 varchar(30) NOT NULL,
	Reviewer_username varchar(30) NOT NULL,
	Book varchar(30) NOT NULL,
	Review text,
	Rating int NOT NULL,
	check (Rating >= 1 OR Rating <=5),
	Primary key(Reviewer, Book),
	foreign key(Reviewer, Reviewer_username) references Customers(Customer_ID, Cus_username),
	foreign key(Book) references Books(Book_ID)
);

CREATE TABLE Orders(
	Order_ID varchar(30) NOT NULL,
	Book_ID varchar(30) NOT NULL,
	Customer_ID varchar(30) NOT NULL,
	Cus_username varchar(30) NOT NULL,
	Number int,
	Price float,
	Order_Date Date,
	foreign key(Customer_ID,Cus_username) references Customers(Customer_ID,Cus_username),
    foreign key(Book_ID) references Books(Book_ID)
);

create function Bill(@Orders_ID varchar(30))
returns table return 
select *
from Orders
where Orders.Order_ID = @Orders_ID

select * from Books;
select * from Customers;
select * from Staff;
select * from Orders

insert into Order_Review values('1212','Customer1','stella','book1','Amazing',5)
select * from Order_Review