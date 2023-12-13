package org.cnr.urbantreedb.enums.apparence.leaf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum LeafShapeEnum {

    ACICULAR("acicular"),
    ACUMINATE("acuminate"),
    ARISTATE("aristate"),
    CORDATE("cordate"),
    CUNEATE("cuneate"),
    DELTOID("deltoid"),
    DIGITATE("digitate"),
    ELLIPTIC("elliptic"),
    FALCATE("falcate"),
    FLABELLATE("flabellate"),
    HASTATE("hastate"),
    LANCEOLATE("lanceolate"),
    LINEAR("linear"),
    LOBED("lobed"),
    OBCORDATE("obcordate"),
    OBOVATE("obovate"),
    OBTUSE("obtuse"),
    OPPOSITE("opposite"),
    ORBICULAR("orbicular"),
    OVATE("ovate"),
    PALMATE("palmate"),
    PEDATE("pedate"),
    PINNATISECT("pinnatisect"),
    RENIFORM("reniform"),
    RHOMBOID("rhomboid"),
    SPATULATE("spatulate"),
    SPEAR("spear"),
    TRUNCATE("truncate");

    public final String lowerName;

    private LeafShapeEnum(String lowercaseName) {

        this.lowerName = lowercaseName;
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
    public static LeafShapeEnum of(String value) {
        Optional<LeafShapeEnum> shape = Arrays.stream(LeafShapeEnum.values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return shape.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }

}
