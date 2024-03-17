package com.example.springinaction.jpa.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="taco_order")
public class Order implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private Date placedAt;
    
    @ManyToMany(targetEntity=Taco.class)
    private List<Taco> tacos = new ArrayList<>();
    
    public void addDesign(Taco design) {
        this.tacos.add(design);
    }
    
    @PrePersist
    void placedAt() {
        this.placedAt = new Date();
    }
}