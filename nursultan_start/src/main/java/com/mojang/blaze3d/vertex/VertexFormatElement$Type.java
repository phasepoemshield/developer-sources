/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.blaze3d.vertex;

public enum VertexFormatElement$Type {
    FLOAT(4, "Float"),
    UBYTE(1, "Unsigned Byte"),
    BYTE(1, "Byte"),
    USHORT(2, "Unsigned Short"),
    SHORT(2, "Short"),
    UINT(4, "Unsigned Int"),
    INT(4, "Int");

    private final int size;
    private final String name;

    private VertexFormatElement$Type(int n2, String string2) {
        this.size = n2;
        this.name = string2;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        return this.name;
    }
}

