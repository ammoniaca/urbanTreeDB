package org.cnr.urbantreedb.model.climate;

import jakarta.persistence.*;

@Entity
public class ClimaticConditionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long climateId;



}
