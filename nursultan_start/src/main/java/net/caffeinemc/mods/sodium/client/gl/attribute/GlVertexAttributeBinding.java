/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.attribute;

import net.caffeinemc.mods.sodium.client.gl.attribute.GlVertexAttribute;

public class GlVertexAttributeBinding
extends GlVertexAttribute {
    private final int index;

    public GlVertexAttributeBinding(int n, GlVertexAttribute glVertexAttribute) {
        super(glVertexAttribute.getFormat(), glVertexAttribute.getSize(), glVertexAttribute.getCount(), glVertexAttribute.isNormalized(), glVertexAttribute.getPointer(), glVertexAttribute.getStride(), glVertexAttribute.isIntType());
        this.index = n;
    }

    public int getIndex() {
        return this.index;
    }
}

