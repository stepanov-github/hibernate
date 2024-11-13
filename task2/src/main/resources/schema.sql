

create table if not exists CUSTOMERS
(
    id           SERIAL PRIMARY KEY,
    name         varchar not null,
    surname      varchar not null,
    age          int     not null,
    phone_number varchar not null
);

create table if not exists ORDERS
(
    id           SERIAL PRIMARY KEY,
    date         TIMESTAMP DEFAULT now(),
    customer_id  int REFERENCES CUSTOMERS (id),
    product_name varchar not null,
    amount       int     not null
);
