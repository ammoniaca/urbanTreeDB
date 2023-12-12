package org.cnr.urbantreedb.dto.site;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.enums.site.soil.SoilSubstrateTypologyEnum;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SoilConditionDTO {

    @Max(value = 10, message = "The soil salt tolerance is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The soil salt tolerance is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Soil salt tolerance cannot be empty.")
    @JsonProperty("salt")
    private Integer soilSaltToleranceLevel;

    @Max(value = 10, message = "The soil compaction tolerance is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The soil compaction tolerance is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Soil compaction tolerance cannot be empty.")
    @JsonProperty("compaction")
    private Integer soilCompactionToleranceLevel;

    @Max(value = 10, message = "The soil compaction tolerance is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The soil moisture tolerance is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Soil moisture tolerance cannot be empty.")
    @JsonProperty("moisture")
    private Integer soilMoistureToleranceLevel;

    @Max(value = 10, message = "The soil water logging tolerance is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The soil water logging tolerance is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Soil water logging tolerance cannot be empty.")
    @JsonProperty("water_logging")
    private Integer waterLoggingToleranceLevel;

    /*@Max(value = 2)
    @Min(value = 0)
    @NotNull(message = "Soil depth cannot be empty.")
    @JsonProperty("depth")
    private Integer soilDepthCategory;*/

    @NotEmpty(message = "Soil substrate cannot be empty.")
    @JsonProperty("substrate")
    private Set<SoilSubstrateTypologyEnum> soilSubstrateTypology;

    @Valid
    @NotEmpty(message = "Soil pH cannot be empty.")
    @JsonProperty("ph")
    private SoilPhDTO soilPhDTO;

}
