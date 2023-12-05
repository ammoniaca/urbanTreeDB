package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TreeDTO {

    @NotBlank(message = "Family cannot be nul.")
    @JsonProperty("family")
    private String family;

    @NotBlank(message = "Genius cannot be empty.")
    @JsonProperty("genius")
    private String genius;

    @NotBlank(message = "Species cannot be null.")
    @JsonProperty("species")
    private String species;

    @NotEmpty(message = "Common name(s) cannot be empty.")
    @JsonProperty("common_name")
    private Set<String> commonNames;

    @NotNull(message = "Distribution cannot be null.")
    @JsonProperty("distribution")
    @Valid
    private DistributionDTO distributionDTO;

    @NotNull(message = "Blossom cannot be .")
    @JsonProperty("blossom")
    @Valid
    private BlossomDTO blossomDTO;

}
