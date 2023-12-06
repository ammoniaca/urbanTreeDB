package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ClimateConditionDTO {

    @Max(value = 10)
    @Min(value = 0)
    @NotNull(message = "Drought tolerance cannot be empty.")
    @JsonProperty("drought_tolerance")
    private Integer droughtToleranceLevel;

    @Max(value = 10)
    @Min(value = 0)
    @NotNull(message = "Heat tolerance cannot be empty.")
    @JsonProperty("heat_tolerance")
    private Integer heatToleranceLevel;

    @Max(value = 10)
    @Min(value = 0)
    @NotNull(message = "Late frost tolerance cannot be empty.")
    @JsonProperty("late_frost_tolerance")
    private Integer lateFrostToleranceLevel;

    @Max(value = 10)
    @Min(value = 0)
    @NotNull(message = "Light requirement cannot be empty.")
    @JsonProperty("late_frost_tolerance")
    private Integer lightRequirementLevel;

    @Valid
    @Max(value = 50)
    @Min(value = -100)
    @NotNull(message = "Temperature cannot be empty.")
    @JsonProperty("temperature")
    private TemperatureDTO temperatureDTO;



}
