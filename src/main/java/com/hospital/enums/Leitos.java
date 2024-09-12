package com.hospital.enums;

public enum Leitos {

    ICU(1),
    INFIRMARY (2);

    private final int unit;

    Leitos(int unit) {
        this.unit = unit;
    }

    public int getUnit() {
        return unit;
    }
}
