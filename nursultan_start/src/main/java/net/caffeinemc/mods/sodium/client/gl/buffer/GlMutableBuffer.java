/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.buffer;

import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;

public class GlMutableBuffer
extends GlBuffer {
    private long size = 0L;

    public long getSize() {
        return this.size;
    }

    public void setSize(long l) {
        this.size = l;
    }
}

