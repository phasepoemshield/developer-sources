/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.api.minecraft;

public interface BlockChangeRecord {
    public short getY(int var1);

    default public short getY() {
        return this.getY(-1);
    }

    public void setBlockId(int var1);

    public int getBlockId();

    public byte getSectionY();

    public byte getSectionZ();

    public byte getSectionX();
}

