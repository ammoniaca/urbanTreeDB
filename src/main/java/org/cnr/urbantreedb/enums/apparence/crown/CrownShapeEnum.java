package org.cnr.urbantreedb.enums.apparence.crown;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum CrownShapeEnum {

    BUSHY("bushy"),
    COLUMNAR("columnar"),
    CONICAL("conical"),
    DROOPING("drooping"),
    FASTIGIATE("fastigiate"),
    FOUNTAIN("fountain"),
    FULL_CROWNED("full-crowned"),
    HALF_ELLIPSOID("half-ellipsoid"),
    IRREGULAR("irregular"),
    LAYERED("layered"),
    OPEN("open"),
    OVAL("oval"),
    PYRAMIDAL("pyramidal"),
    ROUND("round"),
    SHRUBBY("shrubby"),
    SEMI_UPRIGHT("semi-upright"),
    SPREADING("spreading"),
    UMBRELLA_LIKE("umbrella-like"),
    UPRIGHT("upright"),
    UPRIGHT_FUNNEL("upright-funnel"),
    VASE("vase"),
    WEEPING("weeping"),
    WIND_SHAPED("wind-shaped");


    public final String lowerName;

    private CrownShapeEnum(String lowerName) {

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
    public static CrownShapeEnum of(String value) {
        Optional<CrownShapeEnum> label = Arrays.stream(CrownShapeEnum.values())
                .filter(e -> e.lowerName.equalsIgnoreCase(value))
                .findFirst();
        return label.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }



}














