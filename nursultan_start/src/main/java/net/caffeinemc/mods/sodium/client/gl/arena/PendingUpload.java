/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 */
package net.caffeinemc.mods.sodium.client.gl.arena;

import net.caffeinemc.mods.sodium.client.gl.arena.GlBufferSegment;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;

public class PendingUpload {
    private final NativeBuffer data;
    private GlBufferSegment result;

    public GlBufferSegment getResult() {
        if (this.result == null) {
            throw new IllegalStateException("Result not computed");
        }
        return this.result;
    }

    public PendingUpload(NativeBuffer nativeBuffer) {
        this.data = nativeBuffer;
    }

    public int getLength() {
        return this.data.getLength();
    }

    protected void setResult(GlBufferSegment glBufferSegment) {
        if (this.result != null) {
            throw new IllegalStateException("Result already provided");
        }
        this.result = glBufferSegment;
    }

    public NativeBuffer getDataBuffer() {
        return this.data;
    }
}

