package org.cnr.urbantreedb.enums;

public enum CrownTransparencyEnum {


    LOW("low"), // leaf area index (LAI) of adult tree above 6.5
    MEDIUM("medium"), // LAI from 4 to 6.5
    HIGH("high"); // high (LAI below 3.9)

    public final String label;

    private CrownTransparencyEnum(String label) {
        this.label = label;
    }

}
