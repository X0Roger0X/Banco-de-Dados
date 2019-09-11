create database Clinica;

use Clinica;

create table Ambulatorios (
nroa int not null auto_increment,
andar numeric(3) not null,
capacidade int null,

primary key (nroa) 
);

insert into Ambulatorios (andar,capacidade) 
values 
(1,'30'),
(1,'50'),
(2,'40'),
(2,'25'),
(2,'55');

create table Medicos (
codm int not null auto_increment,
nome varchar(40) not null,
idade numeric(9,2) not null,
especialidade char(20) null,
CPF numeric(11) unique key not null,
cidade varchar(30) null,
nroa int null,

primary key (codm),
foreign key(nroa) references Ambulatorios (nroa) on delete cascade
);

insert into Medicos (nome,idade,especialidade,CPF,cidade,nroa) 
values 
('Joao',40,'ortopedia',1000010000,'Florianopolis',1),
('Maria',42,'traumatologia',1000011000,'Blumenau',2),
('Pedro',51,'pediatria',1100010000,'São José',2),
('Carlos',28,'ortopedia',1100011000,'Joinville', null),
('Marcia',33,'neurologia',1100011100,'Biguacu',3);

create table Pacientes (
codp int not null auto_increment,
nome varchar(40) not null,
idade smallint not null,
cidade char(30) null,
CPF numeric(11) unique key not null,
doenca varchar(40) not null,

primary key (codp)
);

insert into Pacientes (nome,idade,cidade,CPF,doenca) 
values 
('Ana',20,'Florianopolis',20000200000,'gripe'),
('Paulo',24,'Palhoca',20000220000,'fratura'),
('Lucia',30,'Biguacu',22000200000,'tendinite'),
('Carlos',28,'Joinville',11000110000,'sarampo');


create table Funcionarios (
codf int not null auto_increment,
nome varchar(40) not null,
idade smallint null,
CPF numeric(11) unique key not null,
cidade varchar(30) null,
salario numeric(10) null,
cargo varchar(20) null,

primary key (codf)
);

ALTER TABLE Funcionarios ADD nroa int;

ALTER TABLE Funcionarios DROP COLUMN cargo, DROP COLUMN nroa;

insert into Funcionarios (nome,idade,cidade,salario,CPF) 
values 
('Rita',32,'Sao Jose',1200,20000100000),
('Maria',55,'Palhoca',1220,30000110000),
('Caio',45,'Florianopolis',1100,41000100000),
('Carlos',44,'Florianopolis',1200,51000110000),
('Paula',33,'Florianopolis',2500,61000111000);

create table Consultas (
num_consulta int not null auto_increment,
codm int null,
codp int null,
dia date,
hora time null,

primary key (num_consulta),
foreign key(codm) references Medicos (codm) on delete cascade,
foreign key(codp) references Pacientes (codp) on delete cascade
);

insert into Consultas (codm,codp,dia,hora) 
values 
(1,1,'2006/06/12','14:00'),
(1,4,'2006/06/12','10:00'),
(2,1,'2006/06/13','09:00'),
(2,2,'2006/06/13','11:00'),
(2,3,'2006/06/13','14:00'),
(2,4,'2006/06/14','17:00'),
(3,1,'2006/06/14','18:00'),
(3,3,'2006/06/19','10:00'),
(3,4,'2006/06/12','13:00'),
(4,4,'2006/06/19','13:00'),
(4,4,'2006/06/20','19:30');

update Pacientes 
set cidade = 'Ilhota'
where nome = 'Paulo';

update Consultas 
set dia = '2006/07/04',
hora ='12:00'
where codm = 1 and codp = 4;

update Pacientes
set doenca = 'Cancer'
where codp = 1;

update Pacientes
set idade = idade +1
where codp = 1;

update Consultas 
set hora = addtime(hora,'01:30')
where codm = 3 and codp = 4;

delete from Funcionarios 
where codf= 4;

delete from Consultas 
where hora > '19:00';

delete from Pacientes 
where idade <= 10 or doenca = 'Cancer';

delete from Medicos 
where cidade = 'Palhoca' or cidade = 'Biguacu';

/* Pode usar o comando dessa forma tb

   delete from Medicos 
   where cidade in ('Biguacu','Palhoca')*/

select codm, nome from Medicos;






            
