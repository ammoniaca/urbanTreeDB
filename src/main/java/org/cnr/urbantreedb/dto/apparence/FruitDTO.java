package org.cnr.urbantreedb.dto.apparence;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.enums.MonthEnum;
import org.cnr.urbantreedb.enums.apparence.fruit.FruitColorEnum;
import org.cnr.urbantreedb.enums.apparence.fruit.InfructescenceEnum;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FruitDTO {

    @NotNull(message = "Fruit ornamental cannot be null.")
    @JsonProperty("ornamental")
    private Boolean isFruitOrnamental;

    @NotEmpty(message = "Fruit color(s) cannot be empty.")
    @JsonProperty("color")
    private Set<FruitColorEnum> fruitColor;

    @NotEmpty(message = "Fruit infructescence(s) cannot be null.")
    @JsonProperty("infructescence")
    private Set<InfructescenceEnum> infructescence;

    @NotEmpty(message = "Fruit period cannot be null.")
    @JsonProperty("period")
    private Set<MonthEnum> period;



}
