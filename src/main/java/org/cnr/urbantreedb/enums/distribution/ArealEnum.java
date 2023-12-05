package org.cnr.urbantreedb.enums.distribution;

import java.util.Arrays;
import java.util.Optional;

public enum ArealEnum {


    // UN M49 (standard country o area codes for statistical use)
    AFRICA("002", "Africa"),
    NORTHERN_AFRICA("015", "Northern Africa"),
    WESTERN_AFRICA("011", "Western Africa"),
    EASTERN_AFRICA("014", "Eastern Africa"),
    MIDDLE_AFRICA("017", "Middle Africa"),
    SOUTHERN_AFRICA("018", "Southern Africa"),
    NORTH_AMERICA("003", "North America"),
    NORTHERN_AMERICA("021", "Northern America"),
    SOUTH_AMERICA("005", "South America"),
    CENTRAL_AMERICA("013", "Central America"),
    CARIBBEAN("029", "Caribbean"),
    ASIA("142", "Asia"),
    EASTERN_ASIA("030", "Eastern Asia"),
    SOUTHERN_ASIA("034", "Southern Asia"),
    SOUTH_EASTERN_ASIA("035", "South-eastern Asia"),
    CENTRAL_ASIA("143", "Central Asia"),
    WESTERN_ASIA("145", "Western Asia"),
    EUROPE("150", "Europe"),
    SOUTHERN_EUROPE("039", "Southern Europe"),
    EASTERN_EUROPE("151", "Eastern Europe"),
    NORTHERN_EUROPE("154", "Northern Europe"),
    WESTERN_EUROPE("155", "Western Europe"),
    OCEANIA("009", "Oceania"),
    AUSTRALIA_NEW_ZEALAND("053", "Australia and New Zealand"),
    MELANESIA("054", "Melanesia"),
    MICRONESIA("057", "Micronesia"),
    POLYNESIA("061", "Polynesia");


    public final String code;
    private final String fullName;


    private ArealEnum(String code, String fullName) {

        this.code = code;
        this.fullName = fullName;

    }

    public String getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }

    // Reverse lookup methods
    public static Optional<ArealEnum> getArealByCode(String value) {
        return Arrays.stream(ArealEnum.values())
                .filter(arealEnum -> arealEnum.code.equals(value))
                .findFirst();
    }





    /*ASIA("Asia"),
    AFRICA("Africa"),
    AMERICA("America"),
    EUROPE("Europe"),
    OCEANIA("Oceania"),
    EAST_ASIA("East Asia"),
    SOUTH_ASIA("South Asia"),
    SOUTHEAST_ASIA("Southeast Asia"),
    CENTRAL_ASIA("Central Asia"),
    NORTH_AFRICA("North Africa"),
    WEST_AFRICA("West Africa"),
    CENTRAL_AFRICA("Central Africa"),
    EAST_AFRICA("East Africa"),
    NORTH_AMERICA("North America"),
    CENTRAL_AMERICA("Central America"),
    SOUTH_AMERICA("South America"),
    WESTERN_EUROPE("Western Europe"),
    CENTRAL_EUROPE("Central Europe"),
    EASTERN_EUROPE("Eastern Europe"),
    NORTHERN_EUROPE("Northern Europe"),
    AUSTRALIA("Australia"),
    NEW_ZEALAND("New Zealand"),
    PACIFIC_ISLANDS("Pacific Islands"),
    CULTIVATED_PLANTS("Cultivated plants");*/



}
