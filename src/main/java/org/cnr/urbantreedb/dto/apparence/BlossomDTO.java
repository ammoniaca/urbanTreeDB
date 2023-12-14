package org.cnr.urbantreedb.dto.apparence;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.enums.MonthEnum;
import org.cnr.urbantreedb.enums.apparence.blossom.BlossomColorEnum;
import org.cnr.urbantreedb.enums.apparence.blossom.BlossomInflorescenceEnum;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BlossomDTO {

    @NotNull(message = "Blossom odor cannot be empty.")
    @JsonProperty("odor")
    private Boolean isBlossomOdor;

    @NotNull(message = "Blossom ornamental cannot be empty.")
    @JsonProperty("ornamental")
    private Boolean isBlossomOrnamental;

    @NotNull(message = "Blossom inflorescence cannot be empty.")
    @JsonProperty("inflorescence")
    private Set<BlossomInflorescenceEnum> inflorescence;

    @NotEmpty(message = "Blossom color(s) cannot be empty.")
    @JsonProperty("color")
    private Set<BlossomColorEnum> blossomColor;

    @NotEmpty(message = "Blossom period(s) cannot be empty.")
    @JsonProperty("period")
    private Set<MonthEnum> blossomPeriod;

}
