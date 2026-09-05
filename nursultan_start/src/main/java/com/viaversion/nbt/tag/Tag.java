/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.nbt.tag;

import java.io.DataOutput;
import java.io.IOException;

public interface Tag {
    public Object getValue();

    public void write(DataOutput var1) throws IOException;

    public Tag copy();

    public String asRawString();

    public int getTagId();
}

