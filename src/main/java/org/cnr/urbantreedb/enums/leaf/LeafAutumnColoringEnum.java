package org.cnr.urbantreedb.enums.leaf;

public enum LeafAutumnColoringEnum {

    YELLOW("yellow"),
    RED("red"),
    ORANGE("orange"),
    BROWN("brown"),
    UNOBTRUSIVE("unobtrusive");

    public final String label;

    private LeafAutumnColoringEnum(String label) {

        this.label = label;
    }


}
