use senacbda;

create table arquivo1(

	codigo int auto_increment,
    nome varchar(50) not null,
    
    primary key (codigo)
);

insert into arquivo1 (nome)
value 
('Fernanda'),
('Josefa'),
('Luiz'),
('Fernando'),
('Romulo');

create table arquivo2(
	
    codigo int  auto_increment,
    nome varchar(50) not null,
    
    primary key(codigo)
);

insert into arquivo2 (nome)
value 
('Carlos'),
('Manoel'),
('Luis'),
('Fernando'),
('Romulo');


select a.nome, b.nome
from arquivo1 as a
inner join arquivo2 as b
	on a.nome = b.nome;

select a.nome, b.nome
from arquivo1 as a
left join arquivo2 as b
	on a.nome = b.nome;

select a.nome, b.nome
from arquivo1 as a
left join arquivo2 as b
	on a.nome = b.nome;




