package org.cnr.urbantreedb.model;

import jakarta.persistence.*;
import org.cnr.urbantreedb.enums.blossom.BlossomColorEnum;
import org.cnr.urbantreedb.enums.blossom.BlossomPeriodEnum;

@Entity
@Table(name = "blossom")
public class TreeBlossomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long blossomId;

    @Column(name = "blossom_color")
    private BlossomColorEnum blossomColor;

    @Column(name = "blossom_odor")
    private boolean blossomOdor;

    @Column(name = "blossom_period")
    private BlossomPeriodEnum blossomPeriod;

    @Column(name = "blossom_ornamental")
    private boolean blossomOrnamental;



}
