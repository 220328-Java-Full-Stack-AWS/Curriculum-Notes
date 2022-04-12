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



/*
 * DML - insert test data
 */

insert into users (first_name, last_name, username, password, email) values ('Kyle', 'Plummer', 'kplummer', 'P4ssw0rd!', 'kyle.plummer@revature.com');


insert into to_do_items (task, due, completed, user_id) values ('bring car to jiffylube', '2022-05-01', false, 1);
insert into to_do_items (task, due, completed, user_id) values ('get car inspected', '2022-05-01', false, 1);
insert into to_do_items (task, due, completed, user_id) values ('pay rent', '2022-04-01', true, 1);





/*
 * DQL - query and check the test data
 */

select * from to_do_items;
select * from users;


select u.first_name, u.last_name, u.email, tdi.task, tdi.due, tdi.completed
from users u
join to_do_items tdi on tdi.user_id = u.user_id
where u.user_id = 1