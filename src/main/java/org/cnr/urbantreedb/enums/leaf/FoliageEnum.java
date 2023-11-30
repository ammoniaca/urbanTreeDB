package org.cnr.urbantreedb.enums.leaf;

public enum FoliageEnum {

    EVERGREEN("evergreen"),
    DECIDUOS("deciduous");

    public final String label;

    private FoliageEnum(String label) {

        this.label = label;
    }


}
