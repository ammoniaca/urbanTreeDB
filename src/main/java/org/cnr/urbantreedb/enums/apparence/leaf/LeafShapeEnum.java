package org.cnr.urbantreedb.enums.apparence.leaf;

public enum LeafShapeEnum {

    SINGLE_LEAF("single leaf"),
    ODD_PINNATE("odd-pinnate"),
    EVEN_PINNATE("even-pinnate"),
    BI_PINNATE("bi-pinnate"),
    TRIFOLIATE("trifoliate"),
    DIGITATE("digitate");

    public final String label;

    private LeafShapeEnum(String label) {

        this.label = label;
    }


}
