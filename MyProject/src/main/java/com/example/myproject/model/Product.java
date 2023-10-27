package com.example.myproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "tables")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String id;
    private String name;
    private String description;
    private BigDecimal price;
}
