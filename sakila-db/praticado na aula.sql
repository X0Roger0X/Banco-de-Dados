use sakila;

select count(*) rental;

select count(*) customer;

select * from rental, customer
	where rental.customer_id = customer.customer_id
    order by rental_id;
    
select rental.rental_id, rental.customer_id, customer.first_name
	from rental, customer
	where rental.customer_id = customer.customer_id and customer.customer_id = 130
    order by rental_id;
    
select rental.rental_id as 'Codigo da Locação', rental.customer_id, customer.first_name
	from rental
    inner join customer
    on rental.customer_id = customer.customer_id
    and customer.customer_id = 130;
    
select * from inventory;

select rental.rental_id as 'Codigo da Locação', rental.customer_id, customer.first_name, inventory.film_id, film.title, category.category_id, category.name
	from rental
    inner join customer on rental.customer_id = customer.customer_id
    inner join inventory on rental.inventory_id = inventory.inventory_id
    inner join film on inventory.film_id = film.film_id
    inner join film_category on film.film_id = film_category.film_id
    inner join category on film_category.category_id = category.category_id
    and customer.customer_id = 130;
    
    
        