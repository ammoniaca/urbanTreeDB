package org.cnr.urbantreedb.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TemperatureDTO {

    //TODO: Fahrenheit (°F), Celsius (°C), Kelvin (K)

    @NotNull(message = "Low temperature cannot be empty.")
    @JsonProperty("low")
    private Double lowTemperature;

    @NotNull(message = "Optimal temperature cannot be empty.")
    @JsonProperty("optimal")
    private Double optimalTemperature;

    @NotNull(message = "High temperature cannot be empty.")
    @JsonProperty("high")
    private Double highTemperature;

}
