package org.cnr.urbantreedb.enums.apparence.leaf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum FoliageColoringEnum {

    YELLOW("yellow"),
    RED("red"),
    ORANGE("orange"),
    BROWN("brown"),
    GREEN("green"),
    UNOBTRUSIVE("unobtrusive");

    public final String lowerName;

    private FoliageColoringEnum(String label) {

        this.lowerName = label;
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
    public static FoliageColoringEnum of(String value) {
        Optional<FoliageColoringEnum> foliage = Arrays.stream(values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return foliage.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }

}
