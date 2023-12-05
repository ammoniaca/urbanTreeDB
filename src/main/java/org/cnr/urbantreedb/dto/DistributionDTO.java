package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.enums.distribution.ArealEnum;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DistributionDTO {

    @NotNull(message = "Neophyte cannot be null.")
    @JsonProperty("neophyte")
    private Boolean isNeophyte;

    @NotEmpty(message = "Areal cannot be null.")
    @JsonProperty("areal")
    private Set<ArealEnum> areal;

}
