package org.cnr.urbantreedb.model.sitecharacteristic;

import jakarta.persistence.*;
import org.cnr.urbantreedb.enums.sitecharacteristic.climate.DroughtToleranceEnum;
import org.cnr.urbantreedb.enums.sitecharacteristic.climate.HeatToleranceEnum;
import org.cnr.urbantreedb.enums.sitecharacteristic.climate.LateFrostToleranceEnum;
import org.cnr.urbantreedb.enums.sitecharacteristic.climate.LightRequirementEnum;

@Entity
public class ClimaticConditionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long climateId;

    @Column(name = "light_requirement")
    private LightRequirementEnum lightRequirement;

    @Column(name = "drought_tolerance")
    private DroughtToleranceEnum droughtTolerance;

    @Column(name = "heat_tolerance")
    private HeatToleranceEnum heatTolerance;

    @Column(name = "late_frost_tolerance")
    private LateFrostToleranceEnum lateFrostTolerance;

}
