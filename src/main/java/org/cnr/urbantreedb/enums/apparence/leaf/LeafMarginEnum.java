package org.cnr.urbantreedb.enums.apparence.leaf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum LeafMarginEnum {

    CILIATE("ciliate"),
    CRENATE("crenate"),
    DENTATE("dentate"),
    DENTICULATE("denticulate"),
    DOUBLY_SERRATE("doubly-serrate"),
    ENTIRE("entire"),
    LOBATE("lobate"),
    SERRATE("serrate"),
    SERRULATE("serrulate"),
    SINUATE("sinuate"),
    SPINY("spiny"),
    UNDULATE("undulate");

    public final String lowerName;

    private LeafMarginEnum(String label) {

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
    public static LeafMarginEnum of(String value) {
        Optional<LeafMarginEnum> margin = Arrays.stream(LeafMarginEnum.values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return margin.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }



}
