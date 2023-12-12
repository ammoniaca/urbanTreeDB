package org.cnr.urbantreedb.dto.site;


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
public class TemperatureDTO {

    //TODO: Fahrenheit (°F), Celsius (°C), Kelvin (K)

    @Max(value = 70, message = "The low temperature is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = -100, message = "The low temperature is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Low temperature cannot be empty.")
    @JsonProperty("lower")
    private Double lowerTemperature;

    @Max(value = 70, message = "The optimal temperature is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = -100, message = "The optimal temperature is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Optimal temperature cannot be empty.")
    @JsonProperty("optimal")
    private Double optimalTemperature;

    @Max(value = 70, message = "The high temperature is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = -100, message = "The high temperature is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "High temperature cannot be empty.")
    @JsonProperty("upper")
    private Double upperTemperature;

}
