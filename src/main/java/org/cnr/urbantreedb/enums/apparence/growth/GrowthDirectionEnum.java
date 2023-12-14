package org.cnr.urbantreedb.enums.apparence.growth;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.enums.apparence.fruit.FruitColorEnum;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum GrowthDirectionEnum {

    UPRIGHT("upright"),
    SQUARROSE("squarrose"),
    OVERHANGING("overhanging"),
    CORKSCREW_LIKE("corkscrew-like"),
    TWISTED("twisted"),
    CLIMBING("climbing"),
    GROUND_LYING("ground-lying"),
    CREEPING("creeping");

    public final String lowerName;

    private GrowthDirectionEnum(String lowerName) {

        this.lowerName = lowerName;
    }


    @JsonValue
    public String getLowerName() {
        return lowerName;
    }

    private static String getErrorMessage(String value){
        List<String> namesList = Arrays.stream(values())
                .map(e -> valueOf(e.name()).lowerName)
                .toList();
        return "Unknown value: " +
                value + ". Allowed values are: [" +
                String.join(", ", namesList) +
                "]";
    }

    @JsonCreator
    public static GrowthDirectionEnum of(String value) {
        Optional<GrowthDirectionEnum> label = Arrays.stream(values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return label.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }

}
