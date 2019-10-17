create database lojaDB;

use lojaDB;

create table cliente (
	idcliente int not null,
	nome varchar(50) not null,
	endereco varchar(50) null,
	cidade varchar (50) null,
	cep numeric(8) null,
	uf varchar(2) null,

	primary key (idcliente) 

);

