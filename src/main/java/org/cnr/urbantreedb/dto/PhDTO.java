package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PhDTO {

    @JsonProperty("min")
    private Double pHMin;

    @JsonProperty("max")
    private Double pHMax;




}
