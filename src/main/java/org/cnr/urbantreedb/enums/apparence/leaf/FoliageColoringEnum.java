package org.cnr.urbantreedb.enums.apparence.leaf;

public enum FoliageColoringEnum {

    YELLOW("yellow"),
    RED("red"),
    ORANGE("orange"),
    BROWN("brown"),
    GREEN("green"),
    UNOBTRUSIVE("unobtrusive");

    public final String label;

    private FoliageColoringEnum(String label) {

        this.label = label;
    }


}
