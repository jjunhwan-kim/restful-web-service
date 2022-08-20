drop table if exists user CASCADE;
create table user
(
    id integer not null,
    join_date timestamp,
    name varchar(255),
    password varchar(255),
    ssn varchar(255),
    primary key (id)
);
