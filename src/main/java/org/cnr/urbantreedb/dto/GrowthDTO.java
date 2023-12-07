package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.enums.apparence.habitus.GrowthDirectionEnum;
import org.cnr.urbantreedb.enums.apparence.habitus.HabitEnum;

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

    @Min(value = 0)
    @NotNull(message = "Maximum tree height cannot be empty.")
    @JsonProperty("maximum_height")
    private Double maximumTreeHeight;

    @Min(value = 0)
    @NotNull(message = "Average tree height cannot be empty.")
    @JsonProperty("average_height")
    private Double  averageTreeHeight;

    @Min(value = 0)
    @NotNull(message = "Maximum trunk diameter cannot be empty.")
    @JsonProperty("maximum_trunk_diameter")
    private Double maximumTrunkDiameter;

    @Min(value = 0)
    @NotNull(message = "Average trunk diameter cannot be empty.")
    @JsonProperty("average_trunk_diameter")
    private Double averageTrunkDiameter;

    @JsonProperty("bark_thickness")
    private Boolean isBarkThickness;

    @NotNull(message = "Multi-stem development cannot be empty.")
    @JsonProperty("multistem")
    private Boolean isMultiStemDevelopment;

    @Max(value = 10, message = "The growth speed is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The growth speed is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Growth speed cannot be empty.")
    @JsonProperty("speed")
    private Integer growthSpeedLevel;

    @Max(value = 3, message = "The tree size class is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 1, message = "The tree size class is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Size class speed cannot be empty.")
    @JsonProperty("size")
    private Integer treeSizeClass;

}
