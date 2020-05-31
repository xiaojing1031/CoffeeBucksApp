create database if not exists `coffee_order_tracker`;
use `coffee_order_tracker`;

-- 
-- Table structure for table `users`
-- 
drop table if exists `users`;
create table `users` (
	`username` varchar(50) not null,
	`password` varchar(50) not null,
	`enabled` tinyint(1) not null,
	
	 primary key (`username`)
) engine=innoDB default charset=latin1;


-- 
-- Insert data for table `users`
--
insert into `users`
	values
	('john', '{noop}test123', 1),
	('mary', '{noop}test123', 1),
	('susan', '{noop}test123', 1);


--
-- Table structure for table `authorities
--	
drop table if exists `authorities`;
create table `authorities` (
	`username` varchar(50) not null,
	`authority` varchar(50) not null,
	unique key `authorities_idx_1` (`username`, `authority`),
	constraint `authorities_ibfk_1` foreign key (`username`) references `users` (`username`)
) engine=innoDB default charset=latin1;


--
-- Insert data for table `authorities`
--
insert into `authorities`
	values 
	('john', 'ROLE_EMPLOYEE'),
	('mary', 'ROLE_EMPLOYEE'),
	('mary', 'ROLE_MANAGER'),
	('susan', 'ROLE_EMPLOYEE'),
	('susan', 'ROLE_admin');




