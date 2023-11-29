package org.cnr.urbantreedb.model;

import jakarta.persistence.*;
import org.cnr.urbantreedb.enums.CrownShapeEnum;
import org.cnr.urbantreedb.enums.CrownTransparencyEnum;
import org.cnr.urbantreedb.enums.GrowthDirectionEnum;
import org.cnr.urbantreedb.enums.HabitEnum;

@Entity
@Table(name = "appearance")
public class TreeAppearance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long AppearanceId;

    @Column(name="habit")
    private HabitEnum habit;

    @Column(name="growth_direction")
    private GrowthDirectionEnum growthDirection;

    @Column(name="crown_shape")
    private CrownShapeEnum crownShape;

    @Column(name="crown_transparency")
    private CrownTransparencyEnum crownTransparency;

    @Column(name="average_crown_radius")
    private double  averageCrownRadius;

    @Column(name="maximum_tree_height")
    private double maximumTreeHeight;

    @Column(name="average_tree_height")
    private double  averageTreeHeight;

    @Column(name="average_trunk_diameter")
    private double averageTrunkDiameter;

    @Column(name="average_bark_thickness")
    private double averageBarkThickness;

    @Column(name = "spinescence")
    private boolean spinescence;

    @Column(name = "basal_shoot")
    private boolean basalShoot;




    //private double lifespan;



}
