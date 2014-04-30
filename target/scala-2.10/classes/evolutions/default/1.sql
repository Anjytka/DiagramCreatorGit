# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user_model (
  id                        bigint not null,
  login                     varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  constraint pk_user_model primary key (id))
;

create sequence user_model_seq;




# --- !Downs

drop table if exists user_model cascade;

drop sequence if exists user_model_seq;

