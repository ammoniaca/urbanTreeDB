package org.cnr.urbantreedb.enums.apparence.habitus;

public enum HabitEnum {

    TREE("tree"),
    SHRUB("shrub"), // Arbusto
    BUSH("bush"); // cespuglio


    public final String label;

    private HabitEnum(String label) {

        this.label = label;
    }

}
