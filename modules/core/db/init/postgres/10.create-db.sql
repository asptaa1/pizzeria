-- begin PIZZERIA_PIZZA
create table PIZZERIA_PIZZA (
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
    CALORIES decimal(19, 2),
    PRICE decimal(19, 2) not null,
    SIZE_ varchar(50) not null,
    DESCRIPTION varchar(1024),
    --
    primary key (ID)
)^
-- end PIZZERIA_PIZZA
-- begin PIZZERIA_TOPPING
create table PIZZERIA_TOPPING (
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
    SPICY boolean not null,
    --
    primary key (ID)
)^
-- end PIZZERIA_TOPPING
-- begin PIZZERIA_PAYMENT
create table PIZZERIA_PAYMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_ID uuid not null,
    AMOUNT decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end PIZZERIA_PAYMENT
-- begin PIZZERIA_ORDER
create table PIZZERIA_ORDER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DELIVER_COURIER_ID uuid not null,
    CLIENT_NAME varchar(255) not null,
    PHONE_NUMBER varchar(255) not null,
    EMAIL varchar(255),
    ADDRESS varchar(255) not null,
    COMMENT_ varchar(2048),
    --
    NUMBER_ bigint not null,
    STATUS varchar(50) not null,
    CREATED_DATE timestamp not null,
    TOTAL_AMOUNT decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end PIZZERIA_ORDER
-- begin PIZZERIA_ORDER_ITEM
create table PIZZERIA_ORDER_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_ID uuid not null,
    PIZZA_ID uuid not null,
    QUANTITY integer not null,
    --
    primary key (ID)
)^
-- end PIZZERIA_ORDER_ITEM
-- begin PIZZERIA_INGREDIENT
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
)^
-- end PIZZERIA_INGREDIENT
