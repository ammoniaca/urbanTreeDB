package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.dto.apparence.BlossomDTO;
import org.cnr.urbantreedb.dto.apparence.LeafDTO;
import org.cnr.urbantreedb.dto.distribution.DistributionDTO;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TreeRequestDTO {

    @NotBlank(message = "Tree family cannot be empty.")
    @JsonProperty("family")
    private String family;

    @NotBlank(message = "Tree genus cannot be empty.")
    @JsonProperty("genus")
    private String genus;

    @NotBlank(message = "Tree species cannot be null.")
    @JsonProperty("species")
    private String species;

    @JsonProperty("infraname")
    private String infraname;

    @NotEmpty(message = "Tree common name(s) cannot be empty.")
    @JsonProperty("common_name")
    private Set<String> commonName;

    //TODO Infraname (subspecies (spp), variety (var), cultivar (cv), and hybrid)  ‘spp.’ or ‘var.’

    @Valid
    @NotNull(message = "Tree distribution parameters cannot be empty.")
    @JsonProperty("distribution")
    private DistributionDTO distribution;

    @Valid
    @NotNull(message = "Tree leaf parameters cannot be empty.")
    @JsonProperty("leaf")
    private LeafDTO leafDTO;

    /*
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
    @NotNull(message = "Tree growth parameters cannot be empty.")
    @JsonProperty("growth")
    private GrowthDTO growthDTO;

    @JsonProperty("climate")
    private ClimateConditionDTO climateConditionDTO;
*/


}
