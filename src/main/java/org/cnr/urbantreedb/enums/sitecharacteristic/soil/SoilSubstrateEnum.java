package org.cnr.urbantreedb.enums.sitecharacteristic.soil;

public enum SoilSubstrateEnum {


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

    private SoilSubstrateEnum(String label) {

        this.label = label;
    }


}
