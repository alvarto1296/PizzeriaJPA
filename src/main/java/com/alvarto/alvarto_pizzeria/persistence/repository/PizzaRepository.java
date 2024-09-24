package com.alvarto.alvarto_pizzeria.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.alvarto.alvarto_pizzeria.persistence.entity.PizzaEntity;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity,Integer>{

}
