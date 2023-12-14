package org.cnr.urbantreedb.enums;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public enum Month {

    JANUARY(1, "January"),
    FEBRUARY(2, "February"),
    MARCH(3, "March"),
    APRIL(4, "April"),
    MAY(5, "May"),
    JUNE(6, "June"),
    JULY(7, "July"),
    AUGUST(8, "August"),
    SEPTEMBER(9, "September"),
    OCTOBER(10, "October"),
    NOVEMBER(11, "November"),
    DECEMBER(12, "December");

    public final int code;
    public final String lowerName;


    private Month(
            int code,
            String lowerName
    ) {
        this.code = code;
        this.lowerName = lowerName;
    }

    public int getCode() {
        return code;
    }

    public String getLowerName() {
        return lowerName;
    }

}
