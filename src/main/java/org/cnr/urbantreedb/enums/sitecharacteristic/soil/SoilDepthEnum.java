package org.cnr.urbantreedb.enums.sitecharacteristic.soil;

public enum SoilDepthEnum {

    SHALLOW("shallow"), // (-inf, 1 m)
    MEAN("mean"), // [1 m, 3 m)
    DEEP("deep"); // [3 m, +inf)

    public final String label;

    private SoilDepthEnum(String label) {

        this.label = label;
    }


}
