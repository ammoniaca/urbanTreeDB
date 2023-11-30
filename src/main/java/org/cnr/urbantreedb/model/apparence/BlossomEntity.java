package org.cnr.urbantreedb.model.apparence;

import jakarta.persistence.*;
import org.cnr.urbantreedb.enums.apparence.blossom.BlossomColorEnum;
import org.cnr.urbantreedb.enums.apparence.blossom.BlossomPeriodEnum;

@Entity
@Table(name = "blossom")
public class BlossomEntity {

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
