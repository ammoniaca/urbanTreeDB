package org.cnr.urbantreedb.enums.apparence.leaf;

public enum LeafMarginEnum {

    CILIATE("ciliate"),
    CRENATE("crenate"),
    DENTATE("dentate"),
    DENTICULATE("denticulate"),
    DOUBLY_SERRATE("doubly-serrate"),
    ENTIRE("entire"),
    LOBATE("lobate"),
    SERRATE("serrate"),
    SERRULATE("serrulate"),
    SINUATE("sinuate"),
    SPINY("spiny"),
    UNDULATE("undulate");

    public final String label;

    private LeafMarginEnum(String label) {

        this.label = label;
    }
}
