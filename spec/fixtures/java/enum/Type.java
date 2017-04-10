package com.gyro.tests;

/* DO NOT EDIT | Generated by gyro */

public enum Type {

    TYPE_ONE("type_one"),
    TYPE_TWO("type_two"),
    TYPE_THREE("type_three");

    private final String jsonValue;

    Type(final String jsonValue) {
        this.jsonValue = jsonValue;
    }

    public static Type get(final String jsonValue) {
        for (final Type type : Type.values()) {
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
