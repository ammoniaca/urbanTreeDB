package org.cnr.urbantreedb.enums.apparence.blossom;

public enum BlossomColorEnum {

    BROWN("brown"),
    BLUE("blue"),
    YELLOW("yellow"),
    GREY("grey"),
    GREEN("green"),
    ORANGE("orange"),
    PINK("pink"),
    RED("red"),
    PURPLE("purple"),
    WHITE("white"),
    BLACK("black"),
    UNOBTRUSIVE("unobtrusive");

    public final String label;

    private BlossomColorEnum(String label) {

        this.label = label;
    }

}
