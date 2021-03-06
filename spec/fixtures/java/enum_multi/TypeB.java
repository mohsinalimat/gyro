package com.gyro.tests;

/* DO NOT EDIT | Generated by gyro */

public enum TypeB {

    TYPE_ONE("type_b_one"),
    TYPE_TWO("type_b_two"),
    TYPE_THREE("type_b_three");

    private final String jsonValue;

    TypeB(final String jsonValue) {
        this.jsonValue = jsonValue;
    }

    public static TypeB get(final String jsonValue) {
        for (final TypeB type : TypeB.values()) {
            if (type.getJsonValue().equals(jsonValue)) {
                return type;
            }
        }
        return null;
    }

    public String getJsonValue() {
        return jsonValue;
    }
}
