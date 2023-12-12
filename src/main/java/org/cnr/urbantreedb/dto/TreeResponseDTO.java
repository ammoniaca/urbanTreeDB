package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.OffsetDateTime;

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

    @JsonProperty("registration_datetime_utc")
    private OffsetDateTime registrationDatetimeUTC;

    @JsonProperty("update_datetime_utc")
    private OffsetDateTime updateDatetimeUTC;

}
