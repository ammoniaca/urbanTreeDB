package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.dto.apparence.*;
import org.cnr.urbantreedb.dto.distribution.DistributionDTO;
import org.cnr.urbantreedb.enums.InfranameEnum;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TreeRequestDTO {

    @Valid
    @NotBlank(message = "Tree family cannot be empty.")
    @JsonProperty("family")
    private String family;

    @Valid
    @NotBlank(message = "Tree genus cannot be empty.")
    @JsonProperty("genus")
    private String genus;

    @Valid
    @NotBlank(message = "Tree species cannot be null.")
    @JsonProperty("species")
    private String species;

    //TODO Infraname (subspecies (spp), variety (var), cultivar (cv), and hybrid)  ‘spp.’ or ‘var.’
    @JsonProperty("infraname")
    private InfranameEnum infraname;

    // postName
    @JsonProperty("postname")
    private String postname;

    //@NotEmpty(message = "Tree common name(s) cannot be empty.")
    @JsonProperty("common_name")
    private Set<String> commonName;

    @Valid
    //@NotNull(message = "Tree distribution parameters cannot be empty.")
    @JsonProperty("distribution")
    private DistributionDTO distribution;

    @Valid
    @NotNull(message = "Tree leaf parameters cannot be empty.")
    @JsonProperty("leaf")
    private LeafDTO leaf;

    @Valid
    @NotNull(message = "Tree crown parameters cannot be empty.")
    @JsonProperty("crown")
    private CrownDTO crown;

    @Valid
    @NotNull(message = "Tree blossom parameters cannot be empty.")
    @JsonProperty("blossom")
    private BlossomDTO blossom;

    @Valid
    @NotNull(message = "Tree fruit parameters cannot be empty.")
    @JsonProperty("fruit")
    private FruitDTO fruit;

    @Valid
    @NotNull(message = "Tree growth parameters cannot be empty.")
    @JsonProperty("growth")
    private GrowthDTO growth;


}
