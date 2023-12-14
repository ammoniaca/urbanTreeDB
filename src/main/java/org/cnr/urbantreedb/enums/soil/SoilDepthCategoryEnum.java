package org.cnr.urbantreedb.enums.soil;

public enum SoilDepthCategoryEnum {

    SHALLOW("shallow"), // (-inf, 1 m)
    MEAN("mean"), // [1 m, 3 m)
    DEEP("deep"); // [3 m, +inf)

    public final String label;

    private SoilDepthCategoryEnum(String label) {

        this.label = label;
    }


}
