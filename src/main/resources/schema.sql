DROP TABLE IF EXISTS users;
create table users(
	id int not null auto_increment,
	name varchar(100),
	email varchar(200),
	primary key(id)
);