package org.cnr.urbantreedb.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;
import org.springframework.data.util.StreamUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum MonthEnum {

    JAN("January"),
    FEB("February"),
    MAR("March"),
    APR("April"),
    MAY("May"),
    JUN("June"),
    JUL("July"),
    AUG("August"),
    SEP("September"),
    //SEPT("September"),
    OCT("October"),
    NOV("November"),
    DEC("December");


    public final String fullName;


    private MonthEnum(
            String fullName
    ) {

        this.fullName = fullName;
    }


    @JsonValue
    public String getFullName() {

        return fullName;
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
    public static MonthEnum from(String value) {
        Optional<MonthEnum> month = Arrays.stream(MonthEnum.values())
                .filter(e -> e.name().equalsIgnoreCase(value))
                .findFirst();
        return month.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }




}
