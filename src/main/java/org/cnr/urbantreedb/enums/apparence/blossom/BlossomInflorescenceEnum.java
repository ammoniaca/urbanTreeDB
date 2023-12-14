package org.cnr.urbantreedb.enums.apparence.blossom;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.enums.apparence.leaf.FoliageColoringEnum;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum BlossomInflorescenceEnum {

    EAR("ear"),
    UMBEL("umbel"),
    CATKIN("catkin"),
    CAPITULUM("capitulum"),
    PANICLE("panicle"),
    THYRSE("thyrse"),
    RACEME("raceme"),
    PLEICHCHASIUM("pleichchasium"),
    CONE("cone"),
    COMPOUNDED_UMBEL_EAR("compounded"),
    CYMOID("cymoid"),
    SIMPLE_INFLORESCENCES("inflorescences"),
    IN_CLUSTERS("clusters");

    public final String lowerName;

    private BlossomInflorescenceEnum(String lowerName) {

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
    public static BlossomInflorescenceEnum of(String value) {
        Optional<BlossomInflorescenceEnum> label = Arrays.stream(values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return label.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }


}
