package org.cnr.urbantreedb.enums.apparence.fruit;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.enums.apparence.leaf.LeafMarginEnum;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum InfructescenceEnum {

    POME("pome"),
    FOLLICLE_FRUIT("follicle"),
    BERRY("berry"),
    WING_NUT("wing-nut"),
    LEGUME("legume"),
    CAPSULE("capsule"),
    NUT("nut"),
    SILIQUE("silique"),
    SCHIZOCARP("schizocarp"),
    DRUPE("drupe"),
    CONE("cone"),
    CATKIN("catkin"),
    OTHER("other");

    public final String lowerName;

    private InfructescenceEnum(String lowerName) {

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
    public static InfructescenceEnum of(String value) {
        Optional<InfructescenceEnum> label = Arrays.stream(values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return label.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }



}
