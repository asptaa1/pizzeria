alter table PIZZERIA_ORDER rename column deliver_id to deliver_id__u60531 ;
alter table PIZZERIA_ORDER alter column deliver_id__u60531 drop not null ;
drop index IDX_PIZZERIA_ORDER_ON_DELIVER ;
alter table PIZZERIA_ORDER add column CLIENT_NAME varchar(255) ^
update PIZZERIA_ORDER set CLIENT_NAME = '' where CLIENT_NAME is null ;
alter table PIZZERIA_ORDER alter column CLIENT_NAME set not null ;
-- alter table PIZZERIA_ORDER add column DELIVER_COURIER_ID uuid ^
-- update PIZZERIA_ORDER set DELIVER_COURIER_ID = <default_value> ;
-- alter table PIZZERIA_ORDER alter column deliver_courier_id set not null ;
alter table PIZZERIA_ORDER add column DELIVER_COURIER_ID uuid not null ;
alter table PIZZERIA_ORDER add column ADDRESS varchar(255) ^
update PIZZERIA_ORDER set ADDRESS = '' where ADDRESS is null ;
alter table PIZZERIA_ORDER alter column ADDRESS set not null ;
alter table PIZZERIA_ORDER add column EMAIL varchar(255) ;
alter table PIZZERIA_ORDER add column STATUS varchar(50) ^
update PIZZERIA_ORDER set STATUS = 'A' where STATUS is null ;
alter table PIZZERIA_ORDER alter column STATUS set not null ;
alter table PIZZERIA_ORDER add column PHONE_NUMBER varchar(255) ^
update PIZZERIA_ORDER set PHONE_NUMBER = '' where PHONE_NUMBER is null ;
alter table PIZZERIA_ORDER alter column PHONE_NUMBER set not null ;
alter table PIZZERIA_ORDER add column COMMENT_ varchar(2048) ;
