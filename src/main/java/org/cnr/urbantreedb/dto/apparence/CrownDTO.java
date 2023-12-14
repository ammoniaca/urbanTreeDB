package org.cnr.urbantreedb.dto.apparence;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.enums.apparence.crown.CrownShapeEnum;
import org.cnr.urbantreedb.enums.likertscale.Point3ScaleLevelEnum;

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

    // @Max(value = 3, message = "The crown transparency is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    // @Min(value = 0, message = "The crown transparency is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    /**
     * HIGH = leaf area index (LAI) of adult tree above 6.5
     * MEDIUM = LAI from 4 to 6.5
     * LOW = LAI below 3.9
     */
    @NotNull(message = "Tree crown density cannot be empty.")
    @JsonProperty("density")
    private Point3ScaleLevelEnum crownDensityLevel;

    @Max(value = 300, message = "The theoretical maximum crown radius is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 1, message = "The theoretical maximum crown radius is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Tree maximum crown radius cannot be empty.")
    @JsonProperty("radius")
    private Double theoreticalMaximumCrownRadius;

/*
    @Max(value = 300, message = "The average crown radius is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The average crown radius is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Tree crown average radius cannot be empty.")
    @JsonProperty("average_radius")
    private Double averageCrownRadius;
*/


}
