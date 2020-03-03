package ru.bukreev.cryptoprototype.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pair {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Float price;
}
