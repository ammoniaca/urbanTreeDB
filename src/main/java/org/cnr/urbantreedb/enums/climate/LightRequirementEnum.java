package org.cnr.urbantreedb.enums.climate;

public enum LightRequirementEnum {

    SUNNY("sunny"),
    HALF_SUNNY("half sunny"),
    HALF_SHADY("half shady"),
    SHADY("shady");

    public final String label;

    private LightRequirementEnum(String label) {

        this.label = label;
    }


}
