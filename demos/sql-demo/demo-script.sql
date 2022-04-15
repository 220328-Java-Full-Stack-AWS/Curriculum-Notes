--comment
/* 
 * milti-line comment
 */


--Table creation - DDL
drop table test_table;

create table test_table (
	id INT primary key,
	string VARCHAR(200)
);

select * from test_table;


--CRUD - Create, Read, Update, Delete
-- Create - INSERT - DML
insert into test_table (id, string) values (0, 'hello');
insert into test_table values (1, 'goodbyte');
insert into test_table (id) values (2);

-- Read - SELECT - DQL
select * from test_table;
select id from test_table;
select id, string from test_table;
select * from test_table where id = 1;
select string from test_table where id = 0 or id = 1
select * from test_table where id = 0 and string = 'hello';
select * from test_table order by id;

-- Update - UPDATE - DML
update test_table set string = 'adios' where id = 2;
update test_table set string = 'Zuul';
update test_table set string = 'hello' where id < 2;
update test_table set id = 99, string = 'ninety-nine' where id = 2;


-- Delete - DELETE - DML
delete from test_table where id = 99;




SELECT * FROM test_table WHERE id = 0

