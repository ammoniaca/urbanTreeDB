package org.cnr.urbantreedb.enums.distribution;

public enum arealEnum {


    // UN M49 (standard country o area codes for statistical use)
    AFRICA("002"),
    NORTHERN_AFRICA("015"),
    WESTERN_AFRICA("011"),
    EASTERN_AFRICA("014"),
    MIDDLE_AFRICA("017"),
    SOUTHERN_AFRICA("018"),
    NORTH_AMERICA("003"),
    NORTHERN_AMERICA("021"),
    SOUTH_AMERICA("005"),
    CENTRAL_AMERICA("013"),
    CARIBBEAN("029"),
    ASIA("142"),
    EASTERN_ASIA("030"),
    SOUTHERN_ASIA("034"),
    SOUTH_EASTERN_ASIA("035"),
    CENTRAL_ASIA("143"),
    WESTERN_ASIA("145"),
    EUROPE("150"),
    SOUTHERN_EUROPE("039"),
    EASTERN_EUROPE("151"),
    NORTHERN_EUROPE("154"),
    WESTERN_EUROPE("155"),
    OCEANIA("009"),
    AUSTRALIA_NEW_ZEALAND("053"),
    MELANESIA("054"),
    MICRONESIA("057"),
    POLYNESIA("061");


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

    public final String label;

    private arealEnum(String label) {

        this.label = label;
    }

}
