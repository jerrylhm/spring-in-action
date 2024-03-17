package com.example.springinaction.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
public class Ingredient {

    @Id
    private String id;

    private String name;

    private String type;

}
