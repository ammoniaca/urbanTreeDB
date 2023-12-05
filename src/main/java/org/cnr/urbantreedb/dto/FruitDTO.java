package org.cnr.urbantreedb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.enums.apparence.fruit.FruitColorEnum;
import org.cnr.urbantreedb.enums.apparence.fruit.InfructescenceEnum;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FruitDTO {

    @NotEmpty(message = "Fruit color cannot be empty.")
    @JsonProperty("color")
    private Set<FruitColorEnum> fruitColor;

    @NotNull(message = "Fruit odor ornamental cannot be null.")
    @JsonProperty("ornamental")
    private Boolean isFruitOrnamental;

    @NotNull(message = "Fruit infructescence cannot be null.")
    @JsonProperty("infructescence")
    private Set<InfructescenceEnum> infructescence;



}
