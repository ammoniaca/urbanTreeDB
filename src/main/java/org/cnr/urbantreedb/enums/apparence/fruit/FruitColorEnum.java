package org.cnr.urbantreedb.enums.apparence.fruit;

public enum FruitColorEnum {

    BLUE("blue"),
    BLUE_BLACK("blue-black"),
    BROWN("brown"),
    YELLOW("yellow"),
    GREY("grey"),
    GREEN("green"),
    LIGHT_BROWN("light brown"),
    CORAL_RED("coral red"),
    ORANGE("orange"),
    PINK("pink"),
    PURPLE("purple"),
    ROSE("rose"),
    RED("red"),
    REDDISH_BLACK("reddish black"),
    UNOBSTRUSIVE("unobstrusive"),
    VIOLET("violet"),
    WHITE("white");

    public final String label;

    private FruitColorEnum(String label) {

        this.label = label;
    }



}
