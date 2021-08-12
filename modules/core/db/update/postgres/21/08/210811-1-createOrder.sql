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
    NUMBER_ bigint not null,
    CREATED_DATE timestamp not null,
    TOTAL_AMOUNT decimal(19, 2) not null,
    DELIVER_ID uuid not null,
    --
    primary key (ID)
);