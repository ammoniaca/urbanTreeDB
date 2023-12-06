package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;
import org.cnr.urbantreedb.enums.site.soil.SoilDepthCategoryEnum;
import org.cnr.urbantreedb.enums.site.soil.SoilSubstrateTypologyEnum;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SoilConditionDTO {

    @Max(value = 10)
    @Min(value = 0)
    @JsonProperty("salt_tolerance")
    private Integer saltSoilToleranceLevel;

    @Max(value = 10)
    @Min(value = 0)
    @JsonProperty("compaction_tolerance")
    private Integer soilCompactionToleranceLevel;

    @Max(value = 10)
    @Min(value = 0)
    @JsonProperty("moisture_tolerance")
    private Integer soilMoistureToleranceLevel;

    @Max(value = 10)
    @Min(value = 0)
    @JsonProperty("water_logging_tolerance")
    private Integer waterLoggingToleranceLevel;

    @Max(value = 2)
    @Min(value = 0)
    @JsonProperty("depth")
    private Integer soilDepthCategory;

    @JsonProperty("substrate")
    private Set<SoilSubstrateTypologyEnum> soilSubstrateTypologyEnum;


}
