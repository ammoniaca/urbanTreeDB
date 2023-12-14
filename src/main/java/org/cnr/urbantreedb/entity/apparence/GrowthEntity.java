package org.cnr.urbantreedb.entity.apparence;

import jakarta.persistence.*;
import lombok.*;
import org.cnr.urbantreedb.enums.apparence.growth.GrowthDirectionEnum;
import org.cnr.urbantreedb.enums.apparence.habitus.HabitEnum;
import org.cnr.urbantreedb.enums.likertscale.Point3ScaleLevelEnum;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "growths")
public class GrowthEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "growth_id", updatable = false, nullable = false)
    private Long growthId;

    @Column(name = "habit")
    private Set<HabitEnum> habit;

    @Column(name = "direction")
    private Set<GrowthDirectionEnum> growthDirection;

    @Column(name = "height")
    private Double theoreticalMaximumTreeHeight;

/*    @Column(name = "average_height")
    private Double  averageTreeHeight;*/

    @Column(name = "diameter")
    private Double theoreticalMaximumTrunkDiameter;

/*    @Column(name = "average_trunk_diameter")
    private Double averageTrunkDiameter;*/

    @Column(name = "speed")
    private Point3ScaleLevelEnum growthSpeedLevel;

    @Column(name = "size")
    private Integer treeSizeClass;

}
