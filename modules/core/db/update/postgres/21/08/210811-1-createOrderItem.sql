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
);