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
    DESCRIPTION varchar(1024),
    --
    primary key (ID)
);