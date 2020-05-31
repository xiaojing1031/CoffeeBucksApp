create database if not exists `coffee_order_tracker`;
use `coffee_order_tracker`;

drop table if exists `t_coffee`;
drop table if exists `t_order`;
drop table if exists `t_order_coffee`;

create table `t_coffee` (
    `id` bigint auto_increment,
    `create_time` timestamp,
    `update_time` timestamp,
    `name` varchar(255),
    `price` bigint,
    primary key (`id`)
);

create table `t_order` (
    `id` bigint auto_increment,
    `create_time` timestamp,
    `update_time` timestamp,
    `customer` varchar(255),
    `state` integer not null,
    primary key (`id`)
);

create table `t_order_coffee` (
    `coffee_order_id` bigint not null,
    `items_id` bigint not null
);

lock tables `t_coffee` write;

insert into `t_coffee` (name, price, create_time, update_time) values 
    ('espresso', 2000, now(), now()),
    ('latte', 2500, now(), now()),
    ('capuccino', 2500, now(), now()),
    ('mocha', 3000, now(), now()),
    ('macchiato', 3000, now(), now());

unlock tables;