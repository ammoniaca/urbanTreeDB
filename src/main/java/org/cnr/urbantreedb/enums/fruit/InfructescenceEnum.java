package org.cnr.urbantreedb.enums.fruit;

public enum InfructescenceEnum {

    POME("pome"),
    FOLLICLE_FRUIT("follicle fruit"),
    BERRY("berry"),
    WING_NUT("wing nut"),
    LEGUME("legume"),
    CAPSULE("capsule"),
    NUT("nut"),
    SILIQUE("silique"),
    SCHIZOCARP("schizocarp"),
    DRUPE("drupe"),
    CONE("cone"),
    CATKIN("catkin");

    public final String label;

    private InfructescenceEnum(String label) {

        this.label = label;
    }
}
