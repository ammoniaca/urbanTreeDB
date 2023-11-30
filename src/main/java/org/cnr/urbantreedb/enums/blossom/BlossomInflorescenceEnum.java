package org.cnr.urbantreedb.enums.blossom;

public enum BlossomInflorescenceEnum {

    EAR("ear"),
    UMBEL("umbel"),
    CATKIN("catkin"),
    CAPITULUM("capitulum"),
    PANICLE("panicle"),
    THYRSE("thyrse"),
    RACEME("raceme"),
    PLEICHCHASIUM("pleichchasium"),
    CONE("cone"),
    COMPOUNDED_UMBEL_EAR("compounded umbel or ear"),
    CYMOID("cymoid"),
    SIMPLE_INFLORESCENCES("simple inflorescences"),
    IN_CLUSTERS("in clusters");

    public final String label;

    private BlossomInflorescenceEnum(String label) {

        this.label = label;
    }


}
