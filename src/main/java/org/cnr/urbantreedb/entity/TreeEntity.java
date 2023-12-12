package org.cnr.urbantreedb.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "trees")
public class TreeEntity {

    @Id
    @SequenceGenerator(
            name = "tree_sequence",
            sequenceName = "tree_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tree_sequence"
    )
    @Column(name = "tree_id", updatable = false, nullable = false)
    private Long treeId;

    @Column(name = "family")
    private String family;

    @Column(name = "genus")
    private String genus;

    @Column(name = "species")
    private String species;

    @Column(name = "binomial_name")
    private String binomialName;

    @Column(name = "registration_datetime_utc") // creation_datetime_utc
    private OffsetDateTime registrationDatetimeUTC;

    @Column(name = "update_datetime_utc") // last_modified_datetime_utc
    private OffsetDateTime updateDatetimeUTC;

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genius) {
        this.genus = genius;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public OffsetDateTime getRegistrationDatetimeUTC() {
        return registrationDatetimeUTC;
    }

    public void setRegistrationDatetimeUTC(OffsetDateTime registrationDatetimeUTC) {
        this.registrationDatetimeUTC = registrationDatetimeUTC;
    }

    public OffsetDateTime getUpdateDatetimeUTC() {
        return updateDatetimeUTC;
    }

    public void setUpdateDatetimeUTC(OffsetDateTime updateDatetimeUTC) {
        this.updateDatetimeUTC = updateDatetimeUTC;
    }

    public String getBinomialName() {
        return binomialName;
    }

    public void setBinomialName(String scientificName) {
        this.binomialName = scientificName;
    }

    /*


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
    private List<DistributionEntity> origins = new ArrayList<>();

*/




}
