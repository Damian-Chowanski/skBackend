package com.example.skBackend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idItem;

    @Column
    private String name;

    @Column
    private Double quantity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idQuantityType")
    private QuantityType quantityType;

    @ManyToMany
    @JoinTable(
            name = "item_warehouse",
            joinColumns = @JoinColumn(name = "idItems"),
            inverseJoinColumns = @JoinColumn(name = "idWarehouse")
    )
    private Set<Warehouse> warehouse;


}
