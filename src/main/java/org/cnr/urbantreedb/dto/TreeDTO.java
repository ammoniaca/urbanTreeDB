package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TreeDTO {

    @NotNull(message = "Family cannot be nul.")
    @JsonProperty("family")
    private String family;

    @NotNull(message = "Genius cannot be null.")
    @JsonProperty("genius")
    private String genius;

    @NotNull(message = "Species cannot be null.")
    @JsonProperty("species")
    private String species;

    @NotNull(message = "Common name(s) cannot be null.")
    @JsonProperty("common_name")
    private Set<String> commonName;

    @NotNull(message = "Distribution cannot be null.")
    @JsonProperty("distribution")
    private DistributionDTO distributionDTO;

    @NotNull(message = "Blossom cannot be null.")
    @JsonProperty("blossom")
    private BlossomDTO blossomDTO;




}
