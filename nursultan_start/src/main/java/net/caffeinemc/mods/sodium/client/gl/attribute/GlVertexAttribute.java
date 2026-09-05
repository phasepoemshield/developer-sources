/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.attribute;

import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexAttributeFormat;

public class GlVertexAttribute {
    private final int format;
    private final int count;
    private final int pointer;
    private final int size;
    private final int stride;
    private final boolean normalized;
    private final boolean intType;

    public boolean isNormalized() {
        return this.normalized;
    }

    public int getFormat() {
        return this.format;
    }

    public int getSize() {
        return this.size;
    }

    protected GlVertexAttribute(int n, int n2, int n3, boolean bl, int n4, int n5, boolean bl2) {
        this.format = n;
        this.size = n2;
        this.count = n3;
        this.normalized = bl;
        this.pointer = n4;
        this.stride = n5;
        this.intType = bl2;
    }

    public GlVertexAttribute(GlVertexAttributeFormat glVertexAttributeFormat, int n, boolean bl, int n2, int n3, boolean bl2) {
        this(glVertexAttributeFormat.typeId(), glVertexAttributeFormat.size() * n, n, bl, n2, n3, bl2);
    }

    public int getCount() {
        return this.count;
    }

    public int getStride() {
        return this.stride;
    }

    public boolean isIntType() {
        return this.intType;
    }

    public int getPointer() {
        return this.pointer;
    }
}

