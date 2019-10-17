create database Banco;

use Banco;

create table banco (
	cod_ba int not null auto_increment,
    nome varchar(40) not null,
    
    primary key (cod_ba)
    );
    
    
    insert into banco(nome)
    values 
    ('santander'),
    ('itau'),
    ('bradesco');
    
    
create table agencia(
	cod_ag int not null auto_increment,
    cod_ba int null,
    endereco varchar(150),
    
    primary key (cod_ag),
    foreign key(cod_ba) references banco (cod_ba) on update cascade
);    
	
	insert into agencia (cod_ba,endereco)
    value
    (1,'Rua Alba, 1565, Jabaquara, São Paulo, SP, 04346-000 '),
    (2,'Rua Santa Cataria, 256, Parque São Jorge, apto 209, São Paulo - SP, 03086-025'),
	(3,'Av Santo Amaro, 6781, Granja Julieta, São Paulo - SP, 04701-100');
    


create table cliente(
	cod_cliente int not null auto_increment,
    nome varchar(40) not null,
    endereco varchar(150) not null,
    cpf numeric(11) unique key not null,
    sexo enum('M','F'),
    tel_Fixo varchar(12) not null,
    tel_cell varchar(12) not null,
    tel_com varchar(12) not null,
    
    primary key(cod_cliente)
    
);
	insert into cliente (nome,endereco,cpf,sexo,tel_Fixo,tel_cell,tel_com)
    value
	('Rita', 'rua frutuoso barbosa, 568, jardim Primavera, São Paulo, SP, 04546-000',20000100000,'F','5668-5847','',''),
    ('Maria', 'rua carlos dumon, 157, Santo Amaro, São Paulo, SP, 04516-030',20000100100,'F', '','','1133369568'),
    ('Caio', 'avenida joaquim, 6584, Vila Olimpia, Rio de Janeiro, 04696-030',30000100100,'M','','21965412358','');
    
    
create table conta(
	cod_conta int not null auto_increment,
	cod_ag int null,
    cod_cliente int null,
    tipo varchar(10),
    saldo double not null,
	foreign key(cod_ag) references agencia (cod_ag) on update cascade,
    foreign key(cod_cliente) references cliente (cod_cliente) on update cascade
);    
    insert into conta(cod_ag,cod_cliente,tipo, saldo)
    value
    (1,2,'corrente', 5500 ),
    (2,3,'poupanca', 2000 ),
	(3,1,'corrente', -120 );
    
    
create table contaCliente(
	data_abertura date,
    cod_conta int not null,
    foreign key(cod_conta) references conta (cod_conta) on update cascade
    foreign key(cod_cliente) references cliente (cod_cliente) on update cascade
); 

insert into contaCliente (cod_conta,data_abertura,cod_ag,cod_cliente)
value
(1,'2012/12/12', 2, 1),
(2,'2006/03/13', 1, 3),
(3,'1999/07/06', 3, 2);
    
