/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.nbt.tag;

import com.viaversion.nbt.tag.Tag;

public interface NumberTag
extends Tag {
    public double asDouble();

    @Override
    public Number getValue();

    @Override
    default public NumberTag copy() {
        return this;
    }

    public int asInt();

    default public boolean asBoolean() {
        return this.asByte() != 0;
    }

    public long asLong();

    public short asShort();

    public float asFloat();

    public byte asByte();
}

