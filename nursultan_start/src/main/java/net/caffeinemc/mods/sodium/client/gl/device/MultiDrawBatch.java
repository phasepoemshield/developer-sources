/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.system.Pointer
 */
package net.caffeinemc.mods.sodium.client.gl.device;

import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Pointer;

public final class MultiDrawBatch {
    public final long pElementPointer;
    public final long pElementCount;
    public final long pBaseVertex;
    public int size;
    public boolean isFilled;

    public MultiDrawBatch(int n) {
        this.pElementPointer = MemoryUtil.nmemAlignedAlloc((long)32L, (long)((long)n * (long)Pointer.POINTER_SIZE));
        MemoryUtil.memSet((long)this.pElementPointer, (int)0, (long)((long)n * (long)Pointer.POINTER_SIZE));
        this.pElementCount = MemoryUtil.nmemAlignedAlloc((long)32L, (long)((long)n * 4L));
        this.pBaseVertex = MemoryUtil.nmemAlignedAlloc((long)32L, (long)((long)n * 4L));
    }

    public void clear() {
        this.size = 0;
        this.isFilled = false;
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public void delete() {
        MemoryUtil.nmemAlignedFree((long)this.pElementPointer);
        MemoryUtil.nmemAlignedFree((long)this.pElementCount);
        MemoryUtil.nmemAlignedFree((long)this.pBaseVertex);
    }

    public int getIndexBufferSize() {
        int n = 0;
        for (int i = 0; i < this.size; ++i) {
            n = Math.max(n, MemoryUtil.memGetInt((long)(this.pElementCount + (long)i * 4L)));
        }
        return n;
    }
}

