create database shop; -- Создать БД "shop"

use shop;  -- говорим программе, что мы работаем с ранее созданной БД shop
-- Нужно обязательно вызывать команду use перед началом работы, чтобы указать, с какой БД мы работаем

create table products(
id integer primary key auto_increment, 
-- integer - целое число, 
-- primary key - уникальный идентификатор (констрейнд)
title varchar(64), -- название не может сод более 64 символов
price integer, 
discount decimal(2, 1) -- decimal тоже число, в скобках первое число то, сколько чисел принимает аргумент 
);

select * from products; -- создать выборку
select title, price from products; -- выбираем конкретные поля 

insert into products(title, price, discount) values -- эту команду вызывать всего лишь 1 раз(ВООБЩЕ), иначе будут дубликаты. Только 1 раз при добавлении.
													("Велосипед", 50000, 0.9),
													("Ролики", 15000, 0.1),
                                                    ("Лыжи", 2500, null),
                                                    ("Самолет", 30000, 0.8),
                                                    ("Санки", 100000, 0.8);
select * from products;
select price from products; -- нехорошая практика

select price as price_ruble from products; -- меняем в выборке (только в выборке, НЕ В ТАБЛИЦЕ) наименование price

select *, price/70 as price_dollar from products; -- создали новое поле в рез-те математической операции (price/70)
select price, title, price / 70 as price_dollar from products;
select * from products where price > 1000;

select * from products where price = 50000;
select * from products where price <> 50000;  -- <> значит "не равно". Более частое. Также может писаться как и в Java - !=