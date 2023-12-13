package org.cnr.urbantreedb.enums.apparence.leaf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum LeafVenationEnum {

    ARCUATE("arcuate"),
    CROSS_VENULATE("cross-venulate"),
    DICHOTOMOUS("dichotomous"),
    LONGITUDINAL("longitudinal"),
    PALMATE("palmate"),
    PARALLEL("parallel"),
    PINNATE("pinnate"),
    RETICULATE("reticulate"),
    ROTATE("rotate");

    public final String lowerName;

    private LeafVenationEnum(String label) {

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
    public static LeafVenationEnum of(String value) {
        Optional<LeafVenationEnum> venation = Arrays.stream(LeafVenationEnum.values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return venation.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }


}
