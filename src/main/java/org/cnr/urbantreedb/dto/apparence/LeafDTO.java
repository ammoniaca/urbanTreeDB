package org.cnr.urbantreedb.dto.apparence;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.enums.MonthEnum;
import org.cnr.urbantreedb.enums.apparence.leaf.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LeafDTO {

    @NotNull(message = "Deciduous cannot be empty.")
    @JsonProperty("deciduous")
    private Boolean isDeciduous;

    @NotNull(message = "Ornamental cannot be empty.")
    @JsonProperty("ornamental")
    private Boolean isLeafOrnamental;

    @NotNull(message = "Foliage ornamental cannot be empty.")
    @JsonProperty("foliage_ornamental")
    private Boolean isFoliageOrnamental;

    @NotNull(message = "Single leaf size cannot be empty.")
    @JsonProperty("size")
    private Double singleLeafSize;

    @NotEmpty(message = "Leaf shape(s) cannot be empty.")
    @JsonProperty("shape")
    private Set<LeafShapeEnum> leafShape;

    @NotEmpty(message = "Leaf arrangement(s) cannot be empty.")
    @JsonProperty("arrangement")
    private Set<LeafArrangementEnum> leafArrangement;

    @NotEmpty(message = "Leaf margin(s) cannot be empty.")
    @JsonProperty("margin")
    private Set<LeafMarginEnum> leafMargin;

    @NotEmpty(message = "Leaf venation(s) cannot be empty.")
    @JsonProperty("venation")
    private Set<LeafVenationEnum> leafVenation;

    @NotEmpty(message = "Leaf color(s) cannot be empty.")
    @JsonProperty("color")
    private Set<LeafColoringEnum> leafColor;

    @NotEmpty(message = "Leaf foliage(s) color cannot be empty.")
    @JsonProperty("foliage")
    private Set<FoliageColoringEnum> foliageColor;

    @NotEmpty(message = "Foliage period cannot be empty.")
    @JsonProperty("foliage_period")
    private Set<MonthEnum> foliagePeriod;

}
