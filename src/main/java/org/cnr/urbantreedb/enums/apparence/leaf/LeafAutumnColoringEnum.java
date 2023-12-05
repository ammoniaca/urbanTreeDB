package org.cnr.urbantreedb.enums.apparence.leaf;

public enum LeafAutumnColoringEnum {

    YELLOW("yellow"),
    RED("red"),
    ORANGE("orange"),
    BROWN("brown"),
    GREEN("green"),
    UNOBTRUSIVE("unobtrusive");

    public final String label;

    private LeafAutumnColoringEnum(String label) {

        this.label = label;
    }


}
