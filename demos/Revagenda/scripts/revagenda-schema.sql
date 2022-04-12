drop table if exists to_do_items;

create table if not exists to_do_items (
	id SERIAL primary key,
	task VARCHAR(600) not null,
	due DATE not null,
	completed bool not null
);





insert into to_do_items (task, due, completed) values ('bring car to jiffylube', '2022-05-01', false);
insert into to_do_items (task, due, completed) values ('get car inspected', '2022-05-01', false);
insert into to_do_items (task, due, completed) values ('pay rent', '2022-04-01', true);


