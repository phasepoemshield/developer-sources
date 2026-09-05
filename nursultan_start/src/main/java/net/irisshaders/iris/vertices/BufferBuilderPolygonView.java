/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package net.irisshaders.iris.vertices;

import net.irisshaders.iris.vertices.views.QuadView;
import org.lwjgl.system.MemoryUtil;

public class BufferBuilderPolygonView
implements QuadView {
    private long[] writeOffsets;
    private long pointer;

    @Override
    public float x(int n) {
        return MemoryUtil.memGetFloat((long)(this.pointer + this.writeOffsets[n]));
    }

    public void setup(long l, long[] lArray, int n, int n2) {
        this.pointer = l;
        this.writeOffsets = lArray;
    }

    @Override
    public float v(int n) {
        return MemoryUtil.memGetFloat((long)(this.pointer + this.writeOffsets[n] + 20L));
    }

    @Override
    public float z(int n) {
        return MemoryUtil.memGetFloat((long)(this.pointer + this.writeOffsets[n] + 8L));
    }

    @Override
    public float u(int n) {
        return MemoryUtil.memGetFloat((long)(this.pointer + this.writeOffsets[n] + 16L));
    }

    @Override
    public float y(int n) {
        return MemoryUtil.memGetFloat((long)(this.pointer + this.writeOffsets[n] + 4L));
    }
}

