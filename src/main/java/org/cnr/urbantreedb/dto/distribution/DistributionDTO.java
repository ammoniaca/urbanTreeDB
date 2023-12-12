package org.cnr.urbantreedb.dto.distribution;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.enums.distribution.ZoneEnum;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DistributionDTO {

    @NotNull(message = "Neophyte cannot be empty.")
    @JsonProperty("neophyte")
    private Boolean isNeophyte; // True = introduced to Europe after 1492

    /*@NotEmpty(message = "Zone code(s) cannot be empty.")
    @JsonProperty("zones")
    private Set<ZoneEnum> zones;
*/
}
