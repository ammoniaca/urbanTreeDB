package org.cnr.urbantreedb.enums.apparence.leaf;

public enum LeafShapeEnum {

    ACICULAR("acicular"),
    ACUMINATE("acuminate"),
    ARISTATE("aristate"),
    CORDATE("cordate"),
    CUNEATE("cuneate"),
    DELTOID("deltoid"),
    DIGITATE("digitate"),
    ELLIPTIC("elliptic"),
    FALCATE("falcate"),
    FLABELLATE("flabellate"),
    HASTATE("hastate"),
    LANCEOLATE("lanceolate"),
    LINEAR("linear"),
    LOBED("lobed"),
    OBCORDATE("obcordate"),
    OBOVATE("obovate"),
    OBTUSE("obtuse"),
    OPPOSITE("opposite"),
    ORBICULAR("orbicular"),
    OVATE("ovate"),
    PALMATE("palmate"),
    PEDATE("pedate"),
    PINNATISECT("pinnatisect"),
    RENIFORM("reniform"),
    RHOMBOID("rhomboid"),
    SPATULATE("spatulate"),
    SPEAR("spear"),
    TRUNCATE("truncate");

    public final String label;

    private LeafShapeEnum(String label) {

        this.label = label;
    }


}
