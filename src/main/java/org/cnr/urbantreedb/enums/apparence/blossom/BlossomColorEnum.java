package org.cnr.urbantreedb.enums.apparence.blossom;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum BlossomColorEnum {

    BROWN("brown"),
    BLUE("blue"),
    YELLOW("yellow"),
    GREY("grey"),
    GREEN("green"),
    ORANGE("orange"),
    PINK("pink"),
    RED("red"),
    PURPLE("purple"),
    WHITE("white"),
    BLACK("black"),
    UNOBTRUSIVE("unobtrusive");

    public final String lowerName;

    private BlossomColorEnum(String lowerName) {

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
    public static BlossomColorEnum of(String value) {
        Optional<BlossomColorEnum> label = Arrays.stream(values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return label.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }


}
