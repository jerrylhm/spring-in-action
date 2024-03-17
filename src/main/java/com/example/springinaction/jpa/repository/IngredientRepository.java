package com.example.springinaction.jpa.repository;

import com.example.springinaction.jpa.entity.Ingredient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

    List<Ingredient> findByType(String type);

    List<Ingredient> findByOrderByTypeDescIdDesc();

    @Query(value = "SELECT * FROM ingredient o LIMIT 1", nativeQuery = true)
    Ingredient single();

}