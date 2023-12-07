package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.enums.apparence.habitus.CrownShapeEnum;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CrownDTO {

    @NotEmpty(message = "Tree crown shape(s) cannot be empty.")
    @JsonProperty("shape")
    private Set<CrownShapeEnum> crownShape;

    @Max(value = 10, message = "The crown transparency is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The crown transparency is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Tree crown transparency cannot be empty.")
    @JsonProperty("transparency")
    private Integer crownTransparencyLevel;

    @Max(value = 300, message = "The crown maximum radius is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The crown maximum radius is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Tree crown maximum radius cannot be empty.")
    @JsonProperty("maximum_radius")
    private Double maximumCrownRadius;

    @Max(value = 300, message = "The crown average radius is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The crown average radius is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Tree crown average radius cannot be empty.")
    @JsonProperty("average_radius")
    private Double averageCrownRadius;


}
