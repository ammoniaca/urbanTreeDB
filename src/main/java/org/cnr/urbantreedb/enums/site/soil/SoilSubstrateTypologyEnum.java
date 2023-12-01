package org.cnr.urbantreedb.enums.site.soil;

public enum SoilSubstrateTypologyEnum {


    GRAVEL("gravel"),
    PYRITE("pyrite"),
    SAND("sand"),
    SILT("silt"),
    CLAY("clay"),
    HUMUS("humus"),
    PEAT("peat"),
    POROUS("porous"),
    CALCAREOUS("calcareous");

    public final String label;

    private SoilSubstrateTypologyEnum(String label) {

        this.label = label;
    }


}
