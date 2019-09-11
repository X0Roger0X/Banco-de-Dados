/* Comandos 

select codm, nome from Medicos; // Comando para pesquisar

orde by // coloca em ordem alfabética 

select cod_cli as ''Codigo do cliente,  // Comando que troca o nome na exportação
nome_cli as '' Nome do cliente' from Cliente
order by nome_cli;

select count(*) from Cliente where uf = 'SP'; // conta quantas linhas a tabela cliente tem a sigla SP

select faixa_comiss, sum(sal_ fixo) // 
from vendedor
group by faixa_comiss; 

select * from vendedor;  

select distinct faixa_comiss from vendedor 
select distinct uf from cliente;
