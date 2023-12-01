package org.cnr.urbantreedb.enums.sitecharacteristic.soil;

public enum WaterLoggingToleranceEnum {

    VERY_HIGH(6),
    HIGH(5),
    MODERATE_HIGH(4),
    MODERATE(3),
    MODERATE_LOW(2),
    LOW(1),
    VERY_LOW(0);

    public final int label;

    private WaterLoggingToleranceEnum(int label) {

        this.label = label;
    }


}
