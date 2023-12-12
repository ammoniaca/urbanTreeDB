package org.cnr.urbantreedb.enums.apparence.blossom;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;

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

    public final String label;

    private BlossomColorEnum(String label) {

        this.label = label;
    }

    @JsonValue
    public String getLabel(){

        return this.label;
    }

    private static String[] getNamesLabel(){
        return Arrays
                .stream(values())
                .map(e -> valueOf(e.name()).label)
                .toArray(String[]::new);
    }

    @JsonCreator
    public static BlossomColorEnum fromValues(String value) {
        var yy = BlossomColorEnum.values();
        for (BlossomColorEnum category : BlossomColorEnum.values()) {
            var xx = category;
            if (category.getLabel().equalsIgnoreCase(value)) {
                return category;
            }
        }
        throw new EnumArgumentNotValidException(
                "Unknown enum type "
                        + value
                        + ", allowed values are: "
                        + Arrays.toString(getNamesLabel()),
                "color"
        );
    }

}
