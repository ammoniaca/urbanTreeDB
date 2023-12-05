package org.cnr.urbantreedb.enums.apparence.leaf;

public enum LeafVenationEnum {

    ARCUATE("arcuate"),
    CROSS_VENULATE("cross-venulate"),
    DICHOTOMOUS("dichotomous"),
    LONGITUDINAL("longitudinal"),
    PALMATE("palmate"),
    PARALLEL("parallel"),
    PINNATE("pinnate"),
    RETICULATE("reticulate"),
    ROTATE("rotate");

    public final String label;

    private LeafVenationEnum(String label) {

        this.label = label;
    }



}
