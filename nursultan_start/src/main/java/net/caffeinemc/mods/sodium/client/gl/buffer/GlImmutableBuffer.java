/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.buffer;

import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferStorageFlags;
import net.caffeinemc.mods.sodium.client.gl.util.EnumBitField;

public class GlImmutableBuffer
extends GlBuffer {
    private final EnumBitField<GlBufferStorageFlags> flags;

    public EnumBitField<GlBufferStorageFlags> getFlags() {
        return this.flags;
    }

    public GlImmutableBuffer(EnumBitField<GlBufferStorageFlags> enumBitField) {
        this.flags = enumBitField;
    }
}

