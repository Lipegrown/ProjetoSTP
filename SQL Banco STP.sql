create database bancoStp;

use bancoStp;

create table if not exists funcionario(
id_funcionario int auto_increment not null primary key,
nome varchar(100) not null,
cpf varchar(100) not null,
rg varchar(100) not null

);

create table if not exists pagMensal(
id_pagMensal int auto_increment not null primary key,
id_fk_funcionario int not null,
salario double not null,
periodo Date not null,
FOREIGN KEY (id_fk_funcionario) REFERENCES funcionario (id_funcionario)
);