create database Agencia;

use Agencia;

create table Pacote(
	cod_Pac int null auto_increment,
	pacote enum ('1ªClasse','Geral'),
    destino varchar(40),
    ida date,
    volta date,
    dias numeric(2),
    
    primary key(cod_Pac)
    
);

insert into Pacote(pacote,destino,ida,volta,dias)
values
('1ªClasse','Curitiba','2019/09/25','2019/09/30',5),
('1ªClasse','Rio de Janeiro','2019/09/25','2019/09/26',1),
('Geral','Vitoria','2019/09/23','2019/09/26',3),
('1ªClasse','Fortaleza','2019/09/27','2019/09/28',1),
('1ªClasse','Maceio','2019/09/22','2019/09/23',1),
('1ªClasse','Curitiba','2019/09/28','2019/09/30',2),
('Geral','Rio de Janeiro','2019/09/25','2019/09/30',4),
('Geral','Salvaador','2019/09/24','2019/09/27',2),
('1ªClasse','Curitiba','2019/09/27','2019/09/28',1),
('Geral','Fortaleza','2019/09/29','2019/09/30',1);

create table Cliente(
	cod_cli int null auto_increment,
    nome varchar(40) not null,
    cpf numeric(11) not null,
    atendimento date,

	primary key(cod_cli) 
);

insert into Cliente(nome,cpf,atendimento)
values
('Roger',36985274210,'2019/09/20'),
('Pedro',36985274310,'2019/09/20'),
('Augusto',36985274410,'2019/09/23'),
('Alex',36985274510,'2019/09/26'),
('Vinicius',36985274610,'2019/09/21'),
('Rafael',36985274710,'2019/09/26'),
('Vitor',36985274810,'2019/09/22'),
('Ruan',36985274910,'2019/09/23'),
('Felipe',36985279910,'2019/09/20'),
('Daniel',36985276510,'2019/09/20');




create table Consumo(
	cod_consumo int null auto_increment,
	cod_cli int not null,
    cod_Pac int not null,
    dias int not null,
    
    primary key(cod_consumo),
    
    foreign key(cod_cli) references Cliente(cod_cli) on update cascade,
    foreign key(cod_Pac) references Pacote(cod_Pac) on update cascade

);

insert into Consumo(cod_cli,cod_Pac,dias)
values
(1,1,5),
(1,2,1),
(2,4,1),
(4,6,2),
(5,8,2),
(5,3,3),
(5,9,1),
(7,6,2),
(9,10,1),
(10,6,2);









