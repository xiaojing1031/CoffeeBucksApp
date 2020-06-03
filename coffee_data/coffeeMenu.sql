create database if not exists `coffee_order_tracker`;
use `coffee_order_tracker`;

drop table if exists `coffee_menu`;

create table `coffee_menu` (
	`id` bigint auto_increment,
	`coffee_name` varchar(255),

	`regular_size_price` bigint,
	`venti_size_price` bigint,
	primary key (`id`)
);

insert into `coffee_menu` (coffee_name,
	regular_size_price,
	venti_size_price) values 
	('Cappuccino', 18, 20),
	('Espresso', 19, 21),
	('Flat White', 15, 17),
	('Latte', 19, 21),
	('Macchiato', 18, 20),
	('Mocha', 16, 18),
	('Bubble Milk Tea', 18, 20),
	('Thai Tea', 16, 18);
	

unlock tables;
