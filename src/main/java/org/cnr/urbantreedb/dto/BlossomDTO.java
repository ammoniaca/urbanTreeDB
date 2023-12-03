package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import org.cnr.urbantreedb.enums.apparence.blossom.BlossomColorEnum;
import org.cnr.urbantreedb.enums.apparence.blossom.BlossomPeriodEnum;

import java.util.List;
import java.util.Set;

public class BlossomDTO {

    @NotNull(message = "Blossom color cannot be null.")
    @JsonProperty("color")
    private Set<BlossomColorEnum> blossomColor;

    @NotNull(message = "Blossom odor cannot be null.")
    @JsonProperty("odor")
    private boolean isBlossomOdor;

    @NotNull(message = "Blossom period cannot be null.")
    @JsonProperty("period")
    private Set<BlossomPeriodEnum> blossomPeriod;

    @NotNull(message = "Blossom ornamental cannot be null.")
    @JsonProperty("ornamental")
    private boolean isBlossomOrnamental;

}
