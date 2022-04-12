/*
 * DDL, drop and re-create the database schema
 */


drop table if exists to_do_items;
drop table if exists users;



create table if not exists users (
	user_id serial primary key,
	first_name VARCHAR(40) not null,
	last_name VARCHAR(40) not null,
	username VARCHAR(40) not null unique,
	password VARCHAR(40) not null,
	email VARCHAR(100) not null unique
);


create table if not exists to_do_items (
	item_id SERIAL,
	task VARCHAR(600) not null,
	due DATE not null,
	completed bool not null,
	user_id int not null,
	primary key (item_id),
	constraint fk_to_do_items_users foreign key (user_id) references users (user_id)
);


