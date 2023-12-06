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

    @Column(name = "min_ph_value")
    @Min(value=0, message = "pH value is greater than or equal to 0.")
    @Max(value = 14, message = "pH value is less than or equal to 14.")
    private double pHMin;

    @Column(name = "max_ph_value")
    @Min(value=0, message = "pH value need to be greater than or equal to 0.")
    @Max(value = 14, message = "pH value need to be less than or equal to 14.")
    private double phMax;

    private Integer soilCompactionTolerance;

    private Integer waterLoggingTolerance;

    private Integer saltTolerance;

    private Integer soilMoistureTolerance;

    private SoilSubstrateTypologyEnum soilSubstrateTypology;

    private SoilDepthCategoryEnum soilDepthCategory;

}
