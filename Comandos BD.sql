create database SenacBDRoger;

use senacBDRoger;

create table cliente (
cod_cli int not null,
nome_cli varchar(50) not null,
endereco varchar(50) null,
cidade varchar (50) null,
cep varchar(8) null,
uf varchar(2) null,

primary key (cod_cli) 
);

INSERT INTO cliente ()
VALUES(1, 'Roger', 'Rua frutuoso barbosa, 233', 'São Paulo', '04812-030', 'SP');

INSERT INTO cliente (cod_cli, nome_cli)
VALUES (2, 'Arthur');

SELECT * FROM cliente; # * pega tds as colunas, pode ser trocado pelo nome da coluna

INSERT INTO cliente (cod_cli, nome_cli, cep)
VALUES(3, 'Pedro', '04696-000');

INSERT INTO cliente (cod_cli, nome_cli, uf)
VALUES(4, 'Diogo','SP');

INSERT INTO cliente (cod_cli, nome_cli, endereco, uf)
VALUES(5, 'Devak', 'AV. Eng. Eusebio Stevaux, 823','SP');

INSERT INTO cliente (cod_cli, nome_cli, cep)
VALUES(6, 'Daniel','04696-000');

INSERT INTO cliente (cod_cli, nome_cli, cidade)
VALUES(7, 'Alex','São Paulo');

INSERT INTO cliente (cod_cli, nome_cli, cidade, cep)
VALUES(8, 'Marcelo','São Paulo', '04696-000');

INSERT INTO cliente (cod_cli, nome_cli, uf)
VALUES(9, 'Carol','SP');

INSERT INTO cliente (cod_cli, nome_cli, endereco)
VALUES(10, 'Iolanda', 'AV. Eng. Eusebio Stevaux, 823');

UPDATE cliente 
		set uf = 'RJ'
        where cod_cli = 10;

/*delete from cliente where cod_cli 3;
 deleta a seleção */
 
 /*drop table vendedor 
 deleta td a tabela*/

create table vendedor (
cod_vend int not null auto_increment,
nome_vend varchar(40) not null,
sal_fixo numeric(9,2) not null,
faixa_comiss char(01) not null,
primary key (cod_vend)
);

insert into vendedor (nome_vend,sal_fixo,faixa_comiss) values ('Roberto',1250.34,'1');
insert into vendedor (nome_vend,sal_fixo,faixa_comiss) values ('Juan',1500.00,'1');
insert into vendedor (nome_vend,sal_fixo,faixa_comiss) values ('Ruan',1150.23,'1');

create table produto (
cod_prod int not null auto_increment,
unid_prod char(03) not null,
desc_prod varchar(20) not null,
val_unit numeric(9,2) not null,
primary key (cod_prod)
);

insert into produto (unid_prod,desc_prod,val_unit) values ('UD', 'Caderno', 13.50);
insert into produto (unid_prod,desc_prod,val_unit) values ('UD', 'Lapis', 1.50);
insert into produto (unid_prod,desc_prod,val_unit) values ('UD', 'Caneta', 2.50);

create table pedido (
num_ped int not null auto_increment,
prazo_entr smallint not null,
cd_cli smallint not null REFERENCES cliente (cod_cli), # puxa o cod_cli da tabela cliente 
cd_vend smallint not null REFERENCES vendedor (cod_vend), # puxa o cod_vend da tabela vendedor 
primary key (num_ped)
); 

insert into pedido (prazo_entr,cd_cli,cd_vend) values (15,2,1); 

create table item_pedido (
no_ped smallint not null REFERENCES pedido (num_ped),
cd_prod smallint not null REFERENCES produto (cod_prod),
qtd_ped float not null
); 

insert into item_pedido values (1,2,1);


















            
