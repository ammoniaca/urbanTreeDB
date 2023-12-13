package org.cnr.urbantreedb.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;
import org.springframework.data.util.StreamUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum MonthEnum {

    JANUARY(1, "January"),
    FEBRUARY(2, "February"),
    MARCH(3, "March"),
    APRIL(4, "April"),
    MAY(5, "May"),
    JUNE(6, "June"),
    JULY(7, "July"),
    AUGUST(8, "August"),
    SEPTEMBER(9, "September"),
    OCTOBER(10, "October"),
    NOVEMBER(11, "November"),
    DECEMBER(12, "December");


    public final int code;
    public final String lowerName;


    private MonthEnum(
            int code,
            String lowerName
    ) {
        this.code = code;
        this.lowerName = lowerName;
    }

    @JsonValue
    public int getCode() {

        return code;
    }

    @JsonValue
    public String getLowerName() {

        return lowerName;
    }

    private static String getErrorMessage(String value){
        List<Integer> codes = Arrays.stream(values())
                .map(e -> valueOf(e.name()).code)
                .toList();
        List<String> fullNames = Arrays.stream(values())
                .map(e -> valueOf(e.name()).lowerName)
                .toList();
        List<String> processedList = StreamUtils.zip(
                        codes.stream(),
                        fullNames.stream(),
                        (code, name) -> String.format("%s (%s)", code, name))
                .toList();
        return "Unknown value: " +
                value +
                ". Allowed values are: [" +
                String.join(", ", processedList) +
                "]";
    }

    private static String getErrorMessage(int value){
        List<Integer> codes = Arrays.stream(values())
                .map(e -> valueOf(e.name()).code)
                .toList();
        List<String> fullNames = Arrays.stream(values())
                .map(e -> valueOf(e.name()).lowerName)
                .toList();
        List<String> processedList = StreamUtils.zip(
                        codes.stream(),
                        fullNames.stream(),
                        (code, name) -> String.format("%s (%s)", code, name))
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
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return month.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }

    @JsonCreator
    public static MonthEnum from(int value) {
        Optional<MonthEnum> month = Arrays.stream(MonthEnum.values())
                .filter(e -> e.code == value)
                .findFirst();
        return month.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }


}
