/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package net.irisshaders.iris.vertices.sodium;

import net.irisshaders.iris.vertices.views.QuadView;
import org.lwjgl.system.MemoryUtil;

public class QuadViewEntity
implements QuadView {
    private long writePointer;
    private int stride;

    @Override
    public float x(int n) {
        return MemoryUtil.memGetFloat((long)(this.writePointer - (long)this.stride * (3L - (long)n)));
    }

    public void setup(long l, int n) {
        this.writePointer = l;
        this.stride = n;
    }

    @Override
    public float v(int n) {
        return MemoryUtil.memGetFloat((long)(this.writePointer + 20L - (long)this.stride * (3L - (long)n)));
    }

    @Override
    public float z(int n) {
        return MemoryUtil.memGetFloat((long)(this.writePointer + 8L - (long)this.stride * (3L - (long)n)));
    }

    @Override
    public float u(int n) {
        return MemoryUtil.memGetFloat((long)(this.writePointer + 16L - (long)this.stride * (3L - (long)n)));
    }

    @Override
    public float y(int n) {
        return MemoryUtil.memGetFloat((long)(this.writePointer + 4L - (long)this.stride * (3L - (long)n)));
    }
}

