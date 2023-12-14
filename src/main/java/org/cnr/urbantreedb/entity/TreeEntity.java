package org.cnr.urbantreedb.entity;

import jakarta.persistence.*;
import lombok.*;
import org.cnr.urbantreedb.entity.apparence.*;
import org.cnr.urbantreedb.entity.distribution.DistributionEntity;

import java.time.OffsetDateTime;
import java.util.Set;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
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

    @Column(name = "common_name")

    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "common_name", joinColumns = @JoinColumn(name = "fk_tree_id"))
    private Set<String> commonName;

    @Column(name = "binomial_name")
    private String binomialName;

    @Column(name = "registration_datetime_utc") // creation_datetime_utc
    private OffsetDateTime registrationDatetimeUTC;

    @Column(name = "update_datetime_utc") // last_modified_datetime_utc
    private OffsetDateTime updateDatetimeUTC;

    //fk_distribution_id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_distribution_id")
    private DistributionEntity distribution;

    //fk_leaf_id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_leaf_id")
    private LeafEntity leaf;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_crown_id")
    private CrownEntity crown;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_blossom_id")
    private BlossomEntity blossom;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_fruit_id")
    private FruitEntity fruit;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_growth_id")
    private GrowthEntity growth;
}
