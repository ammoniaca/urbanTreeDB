package org.cnr.urbantreedb.enums.apparence.leaf;

public enum LeafArrangementEnum {

    ALTERNATE("alternate"),
    BIPENNATE("bipennate"),
    OPPOSITE("opposite"),
    PERFOLIATE("perfoliate"),
    ODD_PINNATE("odd-pinnate"),
    EVEN_PINNATE("even-pinnate"),
    ROSETTE("rosette"),
    TRIFOLIATE("trifoliate"),
    TRIPINNATE("tripinnate"),
    UNIFOLIATE("unifoliate"),
    WHORLED("whorled");

    public final String label;

    private LeafArrangementEnum(String label) {

        this.label = label;
    }


}
