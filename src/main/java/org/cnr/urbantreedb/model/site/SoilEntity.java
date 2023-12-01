package org.cnr.urbantreedb.model.site;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.cnr.urbantreedb.enums.site.soil.*;

@Entity
public class SoilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long IdSoil;

    @Column(name = "ph_value")
    @Min(value=0, message = "pH value is greater than or equal to 0.")
    @Max(value = 14, message = "pH value is less than or equal to 14.")
    private double phValue;

    private SoilCompactionToleranceEnum soilCompactionTolerance;

    private WaterLoggingToleranceEnum waterLoggingTolerance;

    private SaltToleranceEnum saltTolerance;

    private SoilMoistureToleranceEnum soilMoistureTolerance;

    private SoilSubstrateTypologyEnum soilSubstrateTypology;

    private SoilDepthCategoryEnum soilDepthCategory;

}
