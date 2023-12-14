package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.cnr.urbantreedb.dto.apparence.BlossomDTO;
import org.cnr.urbantreedb.dto.apparence.CrownDTO;
import org.cnr.urbantreedb.dto.apparence.LeafDTO;
import org.cnr.urbantreedb.dto.distribution.DistributionDTO;

import java.time.OffsetDateTime;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TreeResponseDTO {

    @JsonProperty("tree_id")
    private Long treeId;

    @JsonProperty("family")
    private String family;

    @JsonProperty("genus")
    private String genus;

    @JsonProperty("species")
    private String species;

    @JsonProperty("binomial_name")
    private String binomialName;

    @JsonProperty("common_name")
    private Set<String> commonName;

    @JsonProperty("registration_datetime_utc")
    private OffsetDateTime registrationDatetimeUTC;

    @JsonProperty("update_datetime_utc")
    private OffsetDateTime updateDatetimeUTC;

    @JsonProperty("distribution")
    private DistributionDTO distribution;

    @JsonProperty("leaf")
    private LeafDTO leaf;

    @JsonProperty("crown")
    private CrownDTO crown;

    @JsonProperty("blossom")
    private BlossomDTO blossom;

}
