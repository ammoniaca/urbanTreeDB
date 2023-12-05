package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.enums.apparence.blossom.BlossomColorEnum;
import org.cnr.urbantreedb.enums.apparence.blossom.BlossomPeriodEnum;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BlossomDTO {

    @NotEmpty(message = "Blossom color cannot be null.")
    @JsonProperty("color")
    private Set<BlossomColorEnum> blossomColor;

    @NotNull(message = "Odor cannot be empty.")
    //@NotNull(message = "Blossom odor cannot be null.")
    @JsonProperty("odor")
    private Boolean isBlossomOdor;

    @NotEmpty(message = "Blossom period cannot be null.")
    @JsonProperty("period")
    private Set<BlossomPeriodEnum> blossomPeriod;

    @NotNull(message = "Blossom ornamental cannot be null.")
    @JsonProperty("ornamental")
    private Boolean isBlossomOrnamental;

}
