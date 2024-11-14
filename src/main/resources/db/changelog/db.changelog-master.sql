--changeset Stepanov:1
create schema if not exists home;

create table if not exists home.CUSTOMERS
(
    id           SERIAL PRIMARY KEY,
    name         varchar not null,
    surname      varchar not null,
    age          int     not null,
    phone_number varchar not null
);

create table if not exists home.ORDERS
(
    id           SERIAL PRIMARY KEY,
    date         TIMESTAMP DEFAULT now(),
    customer_id  int REFERENCES home.CUSTOMERS (id),
    product_name varchar not null,
    amount       int     not null
    );

