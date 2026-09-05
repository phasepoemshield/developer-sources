/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.buffer;

import net.caffeinemc.mods.sodium.client.gl.util.EnumBit;

public enum GlBufferStorageFlags implements EnumBit
{
    PERSISTENT(64),
    MAP_READ(1),
    MAP_WRITE(2),
    CLIENT_STORAGE(512),
    COHERENT(128);

    private final int bits;

    private GlBufferStorageFlags(int n2) {
        this.bits = n2;
    }

    @Override
    public int getBits() {
        return this.bits;
    }
}

