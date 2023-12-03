package org.cnr.urbantreedb.model.apparence;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.cnr.urbantreedb.enums.apparence.blossom.BlossomColorEnum;
import org.cnr.urbantreedb.enums.apparence.blossom.BlossomPeriodEnum;

import java.util.List;

@Entity
@Table(name = "blossom")
public class BlossomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long blossomId;

    @ElementCollection(
            targetClass = BlossomColorEnum.class,
            fetch = FetchType.EAGER
    )
    @CollectionTable(
            name = "blossom_colors",
            joinColumns = @JoinColumn(name = "blossom_color_id", nullable = false),
            uniqueConstraints = @UniqueConstraint(columnNames = {"blossom_color_id"})
    )
    @Column(name = "blossom_color")
    private List<BlossomColorEnum> blossomColors;

    @Column(name = "blossom_odor")
    private boolean blossomOdor;

    @Column(name = "blossom_period")
    private BlossomPeriodEnum blossomPeriod;

    @Column(name = "blossom_ornamental")
    private boolean blossomOrnamental;

}
