alter table PIZZERIA_PIZZA add column SIZE_ varchar(50) ^
update PIZZERIA_PIZZA set SIZE_ = 'A' where SIZE_ is null ;
alter table PIZZERIA_PIZZA alter column SIZE_ set not null ;
