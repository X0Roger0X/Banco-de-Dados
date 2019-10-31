use sakila;

select * from rental;

select rental.rental_id, customer.first_name, amount
	from rental
    inner join payment on rental.rental_id = payment.rental_id
    inner join customer on rental.customer_id = customer.customer_id;
    
create view venda as
	select rental.rental_id, rental.customer_id, customer.first_name, amount
	from rental
    inner join payment on rental.rental_id = payment.rental_id
    inner join customer on rental.customer_id = customer.customer_id;
    
    select * from venda;
    
select * from payment where rental_id =76;
update payment set amount = 3.55 where rental_id = 76;
update venda set amount = 5.54 where rental_id;

select sum(amount) from venda    /* soma os valores da tabela*/
where customer_id =1;

select customer_id, first_name, count(*)/* agrupa os valores iguais*/, avg(amount)/* calcula a media da soma*/, sum(amount)/* soma os valores da tabela*/ 
from venda
group by customer_id;

/* create or replace view   cria ou subtitui a tabela */

create view venda_funcionario as
	select rental.rental_id, staff.staff_id, staff.first_name, amount
	from rental
    inner join payment on rental.rental_id = payment.rental_id
    inner join staff on staff.staff_id = rental.staff_id;
    
select staff_id, first_name, count(*), avg(amount), sum(amount)
    from venda_funcionario
	group by staff_id;
    
/*ATIVIDADE*/

create view cliente as

select rental.rental_id, rental.customer_id, customer.first_name, amount
	from rental
    inner join payment on rental.rental_id = payment.rental_id
    inner join customer on rental.customer_id = customer.customer_id; 
    
select customer_id, first_name, count(*), sum(amount), sum(amount*1.05) as reajuste
    from cliente
    group by customer_id;
    
create view cliente_pais as
	select country
	from customer
    inner join customer on customer.address_id = address.address_id
    inner join city on address.city_id = city.city_id
    inner join country on city.city_country_id = country.country_id;
    

    



    
    
    