package org.cnr.urbantreedb.dto.apparence;

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

    @NotEmpty(message = "Blossom color(s) cannot be empty.")
    @JsonProperty("color")
    private Set<BlossomColorEnum> blossomColor;

    @NotNull(message = "Blossom odor cannot be empty.")
    @JsonProperty("odor")
    private Boolean isBlossomOdor;

    @NotEmpty(message = "Blossom period(s) cannot be empty.")
    @JsonProperty("period")
    private Set<BlossomPeriodEnum> blossomPeriod;

    @NotNull(message = "Blossom ornamental cannot be empty.")
    @JsonProperty("ornamental")
    private Boolean isBlossomOrnamental;

}
