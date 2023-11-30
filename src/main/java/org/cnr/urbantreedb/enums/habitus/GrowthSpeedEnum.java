package org.cnr.urbantreedb.enums.habitus;

public enum GrowthSpeedEnum {

    SLOW("slow"), // climax species, annual height growth below 10 cm, year to mean height above 81 years
    MEDIUM("medium"), // intermediate species, annual height growth from 10 to 50 cm, year to mean height between 26 and 80 years
    FAST("fast"); // pioneer species, annual height growth above 50 cm, year to mean height up to 25 years

    public final String label;

    private GrowthSpeedEnum(String label) {
        this.label = label;
    }
}
