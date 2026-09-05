/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.value;

public enum ValueType {
    NIL(false, false),
    BOOLEAN(false, false),
    INTEGER(true, false),
    FLOAT(true, false),
    STRING(false, true),
    BINARY(false, true),
    ARRAY(false, false),
    MAP(false, false),
    EXTENSION(false, false);

    private final boolean numberType;
    private final boolean rawType;

    private ValueType(boolean bl, boolean bl2) {
        this.numberType = bl;
        this.rawType = bl2;
    }

    public boolean isRawType() {
        return this.rawType;
    }

    public boolean isMapType() {
        return this == MAP;
    }

    public boolean isNilType() {
        return this == NIL;
    }

    public boolean isNumberType() {
        return this.numberType;
    }

    public boolean isArrayType() {
        return this == ARRAY;
    }

    public boolean isFloatType() {
        return this == FLOAT;
    }

    public boolean isBinaryType() {
        return this == BINARY;
    }

    public boolean isExtensionType() {
        return this == EXTENSION;
    }

    public boolean isStringType() {
        return this == STRING;
    }

    public boolean isIntegerType() {
        return this == INTEGER;
    }

    public boolean isBooleanType() {
        return this == BOOLEAN;
    }
}

