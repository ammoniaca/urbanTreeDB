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

    @Max(value = 10)
    @Min(value = 0)
    @NotNull(message = "Tree crown transparency cannot be empty.")
    @JsonProperty("transparency")
    private Integer crownTransparencyLevel;

    @Min(value = 0)
    @NotNull(message = "Tree crown maximum radius cannot be empty.")
    @JsonProperty("maximum_radius")
    private Double maximumCrownRadius;

    @Min(value = 0)
    @NotNull(message = "Tree crown average radius cannot be empty.")
    @JsonProperty("average_radius")
    private Double averageCrownRadius;


}
