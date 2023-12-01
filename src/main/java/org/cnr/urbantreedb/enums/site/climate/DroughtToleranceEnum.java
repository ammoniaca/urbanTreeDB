package org.cnr.urbantreedb.enums.site.climate;

public enum DroughtToleranceEnum {

    VERY_HIGH(6),
    HIGH(5),
    MODERATE_HIGH(4),
    MODERATE(3),
    MODERATE_LOW(2),
    LOW(1),
    VERY_LOW(0);

    public final int label;

    private DroughtToleranceEnum(int label) {

        this.label = label;
    }


}
