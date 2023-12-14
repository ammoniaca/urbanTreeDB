package org.cnr.urbantreedb.enums.likertscale;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum Point3ScaleLevelEnum {

    HIGH("high"),
    MEDIUM("medium"),
    LOW("low");

    public final String lowerName;

    private Point3ScaleLevelEnum(String label) {

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
    public static Point3ScaleLevelEnum of(String value) {
        Optional<Point3ScaleLevelEnum> label = Arrays.stream(values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return label.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }

}
