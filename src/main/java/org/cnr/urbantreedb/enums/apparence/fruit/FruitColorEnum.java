package org.cnr.urbantreedb.enums.apparence.fruit;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum FruitColorEnum {

    BLUE("blue"),
    BLUE_BLACK("blue-black"),
    BROWN("brown"),
    YELLOW("yellow"),
    GREY("grey"),
    GREEN("green"),
    LIGHT_BROWN("light-brown"),
    CORAL_RED("coral-red"),
    ORANGE("orange"),
    PINK("pink"),
    PURPLE("purple"),
    ROSE("rose"),
    RED("red"),
    REDDISH_BLACK("reddish-black"),
    UNOBSTRUSIVE("unobstrusive"),
    VIOLET("violet"),
    WHITE("white");

    public final String lowerName;

    private FruitColorEnum(String lowerName) {

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
    public static FruitColorEnum of(String value) {
        Optional<FruitColorEnum> label = Arrays.stream(values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return label.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }



}
