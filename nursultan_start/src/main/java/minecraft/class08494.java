/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer$MappedView
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import java.nio.ByteBuffer;
import minecraft.class08523;

public class class08494
implements GpuBuffer.MappedView {
    private final Runnable N;
    private final class08523 y;
    private final ByteBuffer L;
    private boolean u;

    protected class08494(Runnable runnable, class08523 class085232, ByteBuffer byteBuffer) {
        this.N = runnable;
        this.y = class085232;
        this.L = byteBuffer;
    }

    public ByteBuffer data() {
        return this.L;
    }

    public void close() {
        if (this.u) {
            return;
        }
        this.u = true;
        this.N.run();
    }
}

