package org.cnr.urbantreedb.model;

import jakarta.persistence.*;

@Entity
public class TreeFruitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long fruitId;


}
