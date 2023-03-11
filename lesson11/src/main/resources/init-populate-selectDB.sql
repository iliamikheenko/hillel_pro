create schema homework;
create table users(
                      user_id serial primary key,
                      name varchar(128) not null ,
                      surname varchar(128) not null,
                      date_of_registration date
);
create table wallet(
                       wallet_id serial primary key,
                       currency varchar(20) not null,
                       amount decimal,
                       user_id serial references users(user_id) not null,
                       created date
);
INSERT INTO users (name, surname, date_of_registration)
VALUES ('John', 'Cooper', '2023-01-01'),
       ('Alice', 'Smith', '2000-02-15'),
       ('Bob', 'Marley', '2022-03-10'),
       ('David', 'Nikolson', '2022-04-05'),
       ('Charles', 'Darvin', '1870-05-20');
INSERT INTO wallet (currency, amount, user_id, created)
VALUES ('USD', 100.50, 1, '2023-01-02'),
       ('EUR', 75.00, 2, '2000-02-16'),
       ('USD', 250.20, 3, '2022-03-11'),
       ('GBP', 50.75, 4, '2022-04-05'),
       ('EUR', 500.00, 5, '1870-05-21');
select u.name, u.surname, w.currency, w.amount
from users u
join wallet w on u.user_id=w.user_id;
