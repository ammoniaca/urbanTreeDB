package org.cnr.urbantreedb.enums.apparence.habitus;

public enum GrowthDirectionEnum {

    UPRIGHT("upright"),
    SQUARROSE("squarrose"),
    OVERHANGING("overhanging"),
    CORKSCREW_LIKE("corkscrew-like"),
    TWISTED("twisted"),
    CLIMBING("climbing"),
    GROUND_LYING("ground-lying"),
    CREEPING("creeping");

    public final String label;

    private GrowthDirectionEnum(String label) {

        this.label = label;
    }

}
