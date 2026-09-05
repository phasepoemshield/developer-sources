/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.jtracy.MemoryPool
 *  com.mojang.jtracy.TracyClient
 *  minecraft.class08882
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import minecraft.class08882;
import org.jspecify.annotations.Nullable;

public class class08523
extends GpuBuffer {
    protected static final MemoryPool N = TracyClient.createMemoryPool((String)"GPU Buffers");
    protected boolean y;
    public final @Nullable Supplier<String> L;
    private final class08882 R;
    public final int u;
    protected @Nullable ByteBuffer i;

    protected class08523(@Nullable Supplier<String> supplier, class08882 class088822, int n, long l, int n2, @Nullable ByteBuffer byteBuffer) {
        super(n, l);
        this.L = supplier;
        this.R = class088822;
        this.u = n2;
        this.i = byteBuffer;
        int n3 = (int)Math.min(l, Integer.MAX_VALUE);
        N.malloc((long)n2, n3);
    }

    public void close() {
        if (this.y) {
            return;
        }
        this.y = true;
        if (this.i != null) {
            this.R.N(this.u, this.usage());
            this.i = null;
        }
        GlStateManager._glDeleteBuffers((int)this.u);
        N.free((long)this.u);
    }

    public boolean isClosed() {
        return this.y;
    }
}

