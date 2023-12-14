package org.cnr.urbantreedb.enums.apparence.leaf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum LeafColoringEnum {

    CHIMERA("chimera"),
    GREEN("green"),
    RED("red");

    public final String lowerName;

    private LeafColoringEnum(String label) {

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
    public static LeafColoringEnum of(String value) {
        Optional<LeafColoringEnum> color = Arrays.stream(values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return color.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }

}
