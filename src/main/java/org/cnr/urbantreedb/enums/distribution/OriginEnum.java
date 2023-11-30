package org.cnr.urbantreedb.enums.distribution;

public enum OriginEnum {


    ASIA("Asia"),
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
    CULTIVATED_PLANTS("cultivated plants");

    public final String label;

    private OriginEnum(String label) {

        this.label = label;
    }

}
