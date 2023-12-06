package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.objenesis.SpringObjenesis;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TreeDTO {

    @NotBlank(message = "Tree family cannot be nul.")
    @JsonProperty("family")
    private String family;

    @NotBlank(message = "Tree genius cannot be empty.")
    @JsonProperty("genius")
    private String genius;

    @NotBlank(message = "Tree species cannot be null.")
    @JsonProperty("species")
    private String species;

    @NotEmpty(message = "Tree common name(s) cannot be empty.")
    @JsonProperty("common_name")
    private Set<String> commonNames;

    @Valid
    @NotNull(message = "Tree distribution parameters cannot be empty.")
    @JsonProperty("distribution")
    private DistributionDTO distributionDTO;

    @Valid
    @NotNull(message = "Tree blossom parameters cannot be empty.")
    @JsonProperty("blossom")
    private BlossomDTO blossomDTO;

    @Valid
    @NotNull(message = "Tree fruit parameters cannot be empty.")
    @JsonProperty("fruit")
    private FruitDTO fruitDTO;

    @Valid
    @NotNull(message = "Tree crown parameters cannot be empty.")
    @JsonProperty("crown")
    private CrownDTO crownDTO;

    @Valid
    @NotNull(message = "Tree leaf parameters cannot be empty.")
    @JsonProperty("leaf")
    private LeafDTO leafDTO;

    @Valid
    @NotNull(message = "Tree growth parameters cannot be empty.")
    @JsonProperty("growth")
    private GrowthDTO growthDTO;

    @JsonProperty("climate")
    private ClimateConditionDTO climateConditionDTO;


}
