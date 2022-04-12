/*
 * DQL - query and check the test data
 */

select * from to_do_items;
select * from users;


select u.first_name, u.last_name, u.email, tdi.task, tdi.due, tdi.completed
from users u
join to_do_items tdi on tdi.user_id = u.user_id
where u.user_id = 1