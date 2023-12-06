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

    @Max(value = 14)
    @Min(value = 0)
    @NotNull(message = "Soil pH min cannot be empty.")
    @JsonProperty("min")
    private Double pHMin;

    @Max(value = 14)
    @Min(value = 0)
    @NotNull(message = "Soil pH max cannot be empty.")
    @JsonProperty("max")
    private Double pHMax;




}
