package org.cnr.urbantreedb.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;
import org.springframework.data.util.StreamUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum InfranameEnum {

    SSP("subspecies"),
    VAR("variety"),
    CV("cultivar"),
    X("hybrid");

    public final String fullName;


    private InfranameEnum(
            String fullName
    ) {

        this.fullName = fullName;
    }

    private static String getErrorMessage(String value){
        List<String> codes = Arrays.stream(values())
                .map(Enum::name)
                .toList();
        List<String> fullNames = Arrays.stream(values())
                .map(e -> valueOf(e.name()).fullName)
                .toList();
        List<String> processedList = StreamUtils.zip(
                        codes.stream(),
                        fullNames.stream(),
                        (code, name) -> String.format("%s (%s)", code.toLowerCase(), name))
                .toList();
        return "Unknown value: " +
                value +
                ". Allowed values are: [" +
                String.join(", ", processedList) +
                "]";
    }

    @JsonCreator
    public static InfranameEnum from(String value) {
        Optional<InfranameEnum> label = Arrays.stream(values())
                .filter(e -> e.name().equalsIgnoreCase(value))
                .findFirst();
        return label.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }



}
