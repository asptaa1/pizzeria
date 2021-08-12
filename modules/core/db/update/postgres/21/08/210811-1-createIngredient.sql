create table PIZZERIA_INGREDIENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    AMOUNT integer not null,
    TOPPING_ID uuid not null,
    PIZZA_ID uuid not null,
    --
    primary key (ID)
);