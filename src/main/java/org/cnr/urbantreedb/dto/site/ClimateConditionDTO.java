package org.cnr.urbantreedb.dto.site;

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

    @Max(value = 10, message = "The drought tolerance is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The drought tolerance is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Drought tolerance cannot be empty.")
    @JsonProperty("drought")
    private Integer droughtToleranceLevel;

    @Max(value = 10, message = "The heat tolerance is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The heat tolerance is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Heat tolerance cannot be empty.")
    @JsonProperty("heat")
    private Integer heatToleranceLevel;

    @Max(value = 10, message = "The late frost tolerance is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The late frost tolerance is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Late frost tolerance cannot be empty.")
    @JsonProperty("late_frost")
    private Integer lateFrostToleranceLevel;

    @Max(value = 10, message = "The light requirement is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The light requirement is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Light requirement cannot be empty.")
    @JsonProperty("light")
    private Integer lightRequirementLevel;

    @Valid
    @NotNull(message = "Temperature cannot be empty.")
    @JsonProperty("temperature")
    private TemperatureDTO temperatureDTO;



}
