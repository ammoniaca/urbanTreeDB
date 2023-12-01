package org.cnr.urbantreedb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.cnr.urbantreedb.model.distribution.OriginsEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "trees")
public class TreeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tree_id", updatable = false, nullable = false)
    private Long treeId;


    @NotNull(message = "Family cannot be null.")
    @Column(name = "family")
    private String family;

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

    @NotNull(message = "Common name(s) cannot be null.")
    @ElementCollection(
            targetClass = String.class,
            fetch = FetchType.EAGER
    )
    @CollectionTable(
            name = "common_names",
            joinColumns = @JoinColumn(name = "common_name_id", nullable = false),
            uniqueConstraints = @UniqueConstraint(columnNames = {"common_name_id"})
    )
    @Column(name = "common_name")
    private List<String> commonNames = new ArrayList<>();

    @OneToMany(
            mappedBy="tree",
            cascade = CascadeType.ALL
    )
    private List<OriginsEntity> origins = new ArrayList<>();





}
