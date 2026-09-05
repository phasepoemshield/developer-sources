/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.blaze3d.vertex;

public enum VertexFormatElement$Usage {
    POSITION("Position"),
    NORMAL("Normal"),
    COLOR("Vertex Color"),
    UV("UV"),
    GENERIC("Generic");

    private final String name;

    private VertexFormatElement$Usage(String string2) {
        this.name = string2;
    }

    public String toString() {
        return this.name;
    }
}

