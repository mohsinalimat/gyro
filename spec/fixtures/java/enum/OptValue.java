package fr.ganfra.realm;

/* DO NOT EDIT | Generated by dbgenerator */

public enum OptValue {

    OPT_VALUE_ONE("opt_value_one"),
    OPT_VALUE_TWO("opt_value_two"),
    OPT_VALUE_THREE("opt_value_three");

    private final String jsonValue;

    OptValue(final String jsonValue) {
        this.jsonValue = jsonValue;
    }

    public static OptValue get(final String jsonValue) {
        for (final OptValue type : OptValue.values()) {
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
