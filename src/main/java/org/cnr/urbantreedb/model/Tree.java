package org.cnr.urbantreedb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Table(name = "trees")
public class Tree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long treeId;

    @NotNull(message = "Genius cannot be null.")
    private String genius;

    @NotNull(message = "Species cannot be null.")
    private String species;

    private Date registrationDateUTC;

    private Date updateDateUTC;

    private String scientificName;

    @NotNull(message = "Common name cannot be null.")
    private String commonName;


}
