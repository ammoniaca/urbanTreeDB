package org.cnr.urbantreedb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Table(name = "trees")
public class TreeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long treeId;

    @NotNull(message = "Genius cannot be null.")
    @Column(name = "genius")
    private String genius;

    @NotNull(message = "Species cannot be null.")
    @Column(name = "species")
    private String species;

    @Column(name = "registration_datetime_utc")
    private Date registrationDateUTC;

    @Column(name = "update_datetime_utc")
    private Date updateDateUTC;

    @Column(name = "scientific_name")
    private String scientificName;

    @NotNull(message = "Common name cannot be null.")
    @Column(name = "common_name")
    private String commonName;


}
