package org.cnr.urbantreedb.enums.apparence.leaf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum LeafArrangementEnum {

    ALTERNATE("alternate"),
    BIPENNATE("bipennate"),
    OPPOSITE("opposite"),
    PERFOLIATE("perfoliate"),
    ODD_PINNATE("odd-pinnate"),
    EVEN_PINNATE("even-pinnate"),
    ROSETTE("rosette"),
    TRIFOLIATE("trifoliate"),
    TRIPINNATE("tripinnate"),
    UNIFOLIATE("unifoliate"),
    WHORLED("whorled");

    public final String lowerName;

    private LeafArrangementEnum(String lowercaseName) {

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
    public static LeafArrangementEnum of(String value) {
        Optional<LeafArrangementEnum> arrangement = Arrays.stream(LeafArrangementEnum.values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return arrangement.orElseThrow(
                () -> new EnumArgumentNotValidException(
                        getErrorMessage(value)
                )
        );
    }
}
