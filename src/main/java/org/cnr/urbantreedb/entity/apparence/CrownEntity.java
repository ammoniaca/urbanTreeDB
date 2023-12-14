package org.cnr.urbantreedb.entity.apparence;


import jakarta.persistence.*;
import lombok.*;
import org.cnr.urbantreedb.entity.TreeEntity;
import org.cnr.urbantreedb.enums.likertscale.Point3ScaleLevelEnum;
import org.cnr.urbantreedb.enums.apparence.crown.CrownShapeEnum;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "crowns")
public class CrownEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name = "crown_id",
            updatable = false,
            nullable = false
    )
    private Long crownId;

    @Column(name = "shape")
    private Set<CrownShapeEnum> crownShape;

    @Column(name = "density")
    private Point3ScaleLevelEnum crownDensityLevel;

    @Column(name = "radius")
    private Double theoreticalMaximumCrownRadius;
/*
    @Column(name = "average_radius")
    private Double averageCrownRadius;*/

    @OneToOne(mappedBy = "crown")
    private TreeEntity treeEntity;

}
