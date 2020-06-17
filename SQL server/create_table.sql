create table books
(
	isbn varchar(20) primary key NOT NULL,
	title varchar(30) NOT NULL,
	price float NOT NULL,
	publisher varchar(50),
	inventory int NOT NULL,
	description text,
	cover_image varchar(100)
);



create table users
(
	username varchar(20) primary key NOT NULL,
	pass varchar(30) NOT NULL,
	fName varchar(50) NOT NULL,
	address varchar(100),
	phone varchar(20),
	email varchar(50),
	is_staff tinyint NOT NULL,
	signup_date date
);

insert into users values('stella','stella123','Stella Hehe','','','',0,'');
insert into users values('tuoc','tuoc123','Dang Viet Hung','','','',1,'');
insert into users values('linh','linh123','Le Thi Phuong Linh','','','',1,'');
insert into users values('chau','chau123','Le Truong Ngan Chau','','','',1,'');
insert into users values('tom','tom123','Tom','','','',0,'');

create table author
(
	author_id int primary key NOT NULL,
	author_name varchar(50) NOT NULL
);

create table author_book(
	author_id int NOT NULL,
	isbn varchar(20) NOT NULL,
	primary key(author_id, isbn),
	foreign key (isbn) references books(isbn)
        on delete cascade
        on update cascade,
    foreign key (author_id) references author(author_id)
        on delete cascade
        on update cascade
);

insert into author_book values(1,'123456789');
insert into author_book values(2,'741852963');
insert into author_book values(3,'963852741');
insert into author_book values(4,'789456123');

create table category(
	category_id int primary key NOT NULL,
	category_name varchar(20)
);

create table category_book(
	category_id int NOT NULL,
	isbn varchar(20) NOT NULL,
	primary key(category_id, isbn),
	foreign key (isbn) references books(isbn)
        on delete cascade
        on update cascade,
    foreign key (category_id ) references category(category_id )
        on delete cascade
        on update cascade
);

insert into category_book values('fiction','123456789');

create table review (
    username varchar(20),
    isbn varchar(20),
    rating int NOT NULL,
	check (rating >= 1 OR rating <=5),
    review_text text,
    foreign key (isbn) references books(isbn)
        on delete cascade
		on update cascade,
    foreign key (username) references users(username)
        on delete cascade
		on update cascade,
	primary key (username, isbn)
);

create table bill(
	order_id int identity(1,1) primary key NOT NULL,
	username varchar(20) NOT NULL,
	order_date date,
	total_price float NOT NULL
);

create table orders(
	order_id int NOT NULL,
	isbn varchar(20) NOT NULL,
	quantity int NOT NULL,
	foreign key (order_id) references bill(order_id)
        on delete cascade
		on update cascade,
	foreign key (isbn) references books(isbn)
        on delete cascade
		on update cascade,
	primary key(order_id, isbn)
);

select * from books;
select * from users;
select * from author;
select * from category;
select * from author_book;

select * from books
inner join category_book as c
on c.isbn = books.isbn
where c.category_name = 'fiction';

select * from books
inner join author_book as a
on a.isbn = books.isbn;

