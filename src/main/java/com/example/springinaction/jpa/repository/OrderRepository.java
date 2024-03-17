package com.example.springinaction.jpa.repository;

import com.example.springinaction.jpa.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}