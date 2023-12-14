package org.cnr.urbantreedb.dto.apparence;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.enums.apparence.growth.GrowthDirectionEnum;
import org.cnr.urbantreedb.enums.apparence.habitus.HabitEnum;
import org.cnr.urbantreedb.enums.likertscale.Point3ScaleLevelEnum;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class GrowthDTO {

    @NotEmpty(message = "Tree habit(s) cannot be empty.")
    @JsonProperty("habit")
    private Set<HabitEnum> habit;

    @NotEmpty(message = "Tree growth direction(s) cannot be empty.")
    @JsonProperty("direction")
    private Set<GrowthDirectionEnum> growthDirection;


    @Max(value = 150, message = "The Theoretical maximum tree height is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 1, message = "The Theoretical maximum tree height is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Theoretical maximum tree height cannot be empty.")
    @JsonProperty("height")
    private Double theoreticalMaximumTreeHeight;

    /*@Min(value = 0)
    @NotNull(message = "Average tree height cannot be empty.")
    @JsonProperty("average_height")
    private Double  averageTreeHeight;*/

    @Max(value = 30, message = "The Theoretical maximum trunk diameter is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The Theoretical maximum trunk diameter is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Theoretical maximum trunk diameter cannot be empty.")
    @JsonProperty("diameter")
    private Double theoreticalMaximumTrunkDiameter;

/*    @Min(value = 0)
    @NotNull(message = "Average trunk diameter cannot be empty.")
    @JsonProperty("average_trunk_diameter")
    private Double averageTrunkDiameter;*/

    //@Max(value = 10, message = "The growth speed is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    //@Min(value = 0, message = "The growth speed is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    /**
     * HIGH: pioneer species, annual height growth above 50 cm, year to mean height up to 25 years
     * MEDIUM: intermediate species, annual height growth from 10 to 50 cm, year to mean height between 26 and 80 years
     * SLOW : climax species, annual height growth below 10 cm, year to mean height above 81 years
     */
    @NotNull(message = "Growth speed cannot be empty.")
    @JsonProperty("speed")
    private Point3ScaleLevelEnum growthSpeedLevel;

    @Max(value = 3, message = "The tree size class is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 1, message = "The tree size class is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Size class speed cannot be empty.")
    @JsonProperty("size")
    private Integer treeSizeClass;

}
