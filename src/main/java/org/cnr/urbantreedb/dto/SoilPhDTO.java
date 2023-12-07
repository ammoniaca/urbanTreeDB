package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SoilPhDTO {

    @Max(value = 14, message = "The soil pH is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The soil pH is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Soil pH min cannot be empty.")
    @JsonProperty("lower")
    private Double lowerPH;

    @Max(value = 14, message = "The soil pH is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The soil pH is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Soil pH optimal cannot be empty.")
    @JsonProperty("optimal")
    private Double optimalPH;

    @Max(value = 14, message = "The soil pH is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The soil pH is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Soil pH max cannot be empty.")
    @JsonProperty("upper")
    private Double upperPH;




}
