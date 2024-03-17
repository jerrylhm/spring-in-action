package com.example.springinaction.jpa.repository;

import com.example.springinaction.jpa.entity.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}