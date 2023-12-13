package org.cnr.urbantreedb.enums.distribution;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.cnr.urbantreedb.exception.EnumArgumentNotValidException;
import org.springframework.data.util.StreamUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public enum ZoneEnum {

    EUROPE(100, "Europe"),
    NORTHERN_EUROPE(101, "Northern Europe"),
    MIDDLE_EUROPE(102, "Middle Europe"),
    SOUTHWESTERN_EUROPE(103, "Southwestern Europe"),
    EASTERN_EUROPE(104, "Eastern Europe"),
    AFRICA(200, "Africa"),
    NORTHEN_AFRICA (201, "Northen Africa"),
    MACARONESIA (202, "Macaronesia"),
    WEST_TROPICAL_AFRICA(203, "West Tropical Africa"),
    WEST_CENTRAL_TROPICAL_AFRICA(204, "West Central Tropical Africa"),
    NORTHEAST_TROPICAL_AFRICA(205, "Northeast Tropical Africa"),
    MIDDLE_ATLANTIC_OCEAN(206, "Middle Atlantic Ocean"),
    WESTERN_INDIAN_OCEAN(207, "Western Indian Ocean"),
    ASIA_TEMPERATE(300, "Asia Temperate"),
    SIBERIA(301, "Siberia"),
    RUSSIAN_FAR_EAST(302, "Russian Far East"),
    MIDDLE_ASIA(303, "Middle Asia"),
    CAUCASUS(304, "Caucasus"),
    WESTERN_ASIA(305, "Western Asia"),
    ARABIAN_PENINSULA(306, "Arabian Peninsula"),
    CHINA(305, "China"),
    MONGOLIA(306, "Mongolia"),
    EASTERN_ASIA(307, "Eastern Asia"),
    ASIA_TROPICAL(400, "Asia Tropical"),
    INDIAN_SUBCONTINENT(401, "Indian Subcontinent"),
    INDO_CHINA(402, "Indo-China"),
    MALESIA(403, "Malesia"),
    PAPUASIA(404, "Papuasia"),
    AUSTRALASIA(500, "Australasia"),
    AUSTRALIA(501, "Australia"),
    NEW_ZEALAND(502, "New Zealand"),
    PACIFIC(600, "Pacific"),
    SOUTH_WESTERN_PACIFIC(601, "South Western Pacific"),
    SOUTH_CENTRAL_PACIFIC(602, "South Central Pacific"),
    NORTH_WESTERN_PACIFIC(603, "North Western Pacific"),
    NORTH_CENTRAL_PACIFIC(604, "North Central Pacific"),
    NORTHERN_AMERICA(700, "Northern America"),
    SUBARCTIC_AMERICA(701, "Subarctic America"),
    WESTERN_CANADA(702, "Western Canada"),
    EASTERN_CANADA(703, "Eastern Canada"),
    NORTH_WESTERN_USA(704, "North Western USA"),
    NORTH_CENTRAL_USA(705, "North Central USA"),
    NORTH_EASTERN_USA(706, "North Eastern USA"),
    SOUTH_WESTERN_USA(707, "South Western USA"),
    SOUTH_CENTRAL_USA(708, "South Central USA"),
    SOUTH_EASTERN_USA(709, "South Eastern USA"),
    MEXICO(710, "Mexico"),
    SOUTHERN_AMERICA(800, "Southern America"),
    CENTRAL_AMERICA(801, "Central America"),
    CARIBBEAN(802, "Caribbean"),
    NORTHERN_SOUTH_AMERICA(803, "Northern South America"),
    WESTERN_SOUTH_AMERICA(804, "Western South America"),
    BRAZIL(805, "Brazil"),
    SOUTHERN_SOUTH_AMERICA(806, "Southern South America"),
    ANTARCTIC(900, "Antarctic"),
    SUBANTARCTIC_ISLANDS(901, "Subantarctic Islands"),
    ANTARCTIC_CONTINENT(902, "Antarctic continent");


    public final int code;
    private final String fullName;


    private ZoneEnum(int code, String fullName) {

        this.code = code;
        this.fullName = fullName;

    }

    @JsonValue
    public int getCode() {

        return code;
    }
/*
    public String getFullName() {
        return fullName;
    }*/

    private static String getErrorMessage(String value){
        StringBuilder errorMessage = new StringBuilder();;
        List<Integer> codes = Arrays.stream(values())
                .map(e -> valueOf(e.name()).code)
                .toList();
        List<String> fullNames = Arrays.stream(values())
                .map(e -> valueOf(e.name()).fullName)
                .toList();
        List<String> processedList = StreamUtils.zip(
                        codes.stream(),
                        fullNames.stream(),
                        (code, name) -> String.format("%s (%s)", code, name))
                .toList();
        errorMessage
                .append("Unknown value: ")
                .append(value)
                .append(". Allowed values are: [")
                .append(String.join(", ", processedList))
                .append("]");;
        return errorMessage.toString();
    }


    private static String getErrorMessage(int value){
        StringBuilder errorMessage = new StringBuilder();
        List<Integer> codes = Arrays.stream(values())
                .map(e -> valueOf(e.name()).code)
                .toList();
        List<String> fullNames = Arrays.stream(values())
                .map(e -> valueOf(e.name()).fullName)
                .toList();
        List<String> processedList = StreamUtils.zip(
                        codes.stream(),
                        fullNames.stream(),
                        (code, name) -> String.format("%s (%s)", code, name))
                .toList();
        errorMessage
                .append("Unknown value: ")
                .append(value).append(". Allowed values are: [")
                .append(String.join(", ", processedList))
                .append("]");
        return errorMessage.toString();
    }

    // Reverse lookup methods
    /*@JsonCreator
    public static ZoneEnum getZoneByValue(String value) {
        Optional<ZoneEnum> zone = Arrays.stream(ZoneEnum.values())
                .filter(e -> e.fullName.equalsIgnoreCase(value))
                .findFirst();
        return zone.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }
*/
    @JsonCreator
    public static ZoneEnum getZoneByValue(int value) {
        Optional<ZoneEnum> zone = Arrays.stream(ZoneEnum.values())
                .filter(e -> e.code == value)
                .findFirst();
        return zone.orElseThrow(
                () -> new EnumArgumentNotValidException(getErrorMessage(value))
        );
    }







    // Reverse lookup methods
/*    public static Optional<ZoneEnum> getZoneByCode(Integer valueCode) {
        return Arrays.stream(ZoneEnum.values())
                .filter(arealEnum -> arealEnum.code.equals(valueCode))
                .findFirst();





    private static String[] getNamesLabel(){
        return Arrays
                .stream(values())
                .map(e -> valueOf(e.name()).code)
                .toArray(String[]::new);
    }


    @JsonCreator
    public static ZoneEnum fromValues(String value) {

        for (ZoneEnum category : ZoneEnum.values()) {
            var xx = category.getNamesLabel();
            if (category.getNamesLabel().equals(value)) {
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
    }*/
}

