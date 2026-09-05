/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.state;

import java.util.Arrays;
import net.caffeinemc.mods.sodium.client.gl.array.GlVertexArray;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferTarget;

public class GlStateTracker {
    private static final int UNASSIGNED_HANDLE = -1;
    private final int[] bufferState = new int[GlBufferTarget.COUNT];
    private int vertexArrayState;

    public void clear() {
        Arrays.fill(this.bufferState, -1);
        this.vertexArrayState = -1;
    }

    public void notifyBufferDeleted(GlBuffer glBuffer) {
        for (GlBufferTarget glBufferTarget : GlBufferTarget.VALUES) {
            if (this.bufferState[glBufferTarget.ordinal()] != glBuffer.handle()) continue;
            this.bufferState[glBufferTarget.ordinal()] = -1;
        }
    }

    public void notifyVertexArrayDeleted(GlVertexArray glVertexArray) {
        if (this.vertexArrayState == glVertexArray.handle()) {
            this.vertexArrayState = -1;
        }
    }

    public boolean makeVertexArrayActive(GlVertexArray glVertexArray) {
        boolean bl;
        int n = glVertexArray == null ? 0 : glVertexArray.handle();
        boolean bl2 = bl = this.vertexArrayState != n;
        if (bl) {
            this.vertexArrayState = n;
            Arrays.fill(this.bufferState, -1);
        }
        return bl;
    }

    public boolean makeBufferActive(GlBufferTarget glBufferTarget, GlBuffer glBuffer) {
        boolean bl;
        boolean bl2 = bl = this.bufferState[glBufferTarget.ordinal()] != glBuffer.handle();
        if (bl) {
            this.bufferState[glBufferTarget.ordinal()] = glBuffer.handle();
        }
        return bl;
    }
}

