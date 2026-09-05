/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.vertex.VertexFormat;
import org.jspecify.annotations.Nullable;

public final class class08871
implements AutoCloseable {
    private GpuBuffer N;
    private @Nullable GpuBuffer y;
    private int L;
    private VertexFormat.class_5595 u;

    public int L() {
        return this.L;
    }

    public class08871(GpuBuffer gpuBuffer, @Nullable GpuBuffer gpuBuffer2, int n, VertexFormat.class_5595 class_55952) {
        this.N = gpuBuffer;
        this.y = gpuBuffer2;
        this.L = n;
        this.u = class_55952;
    }

    @Override
    public void close() {
        this.N.close();
        if (this.y != null) {
            this.y.close();
        }
    }

    public VertexFormat.class_5595 u() {
        return this.u;
    }

    public void y(GpuBuffer gpuBuffer) {
        this.N = gpuBuffer;
    }

    public @Nullable GpuBuffer y() {
        return this.y;
    }

    public void N_21(int n) {
        this.L = n;
    }

    public void N_89(@Nullable GpuBuffer gpuBuffer) {
        this.y = gpuBuffer;
    }

    public void N(VertexFormat.class_5595 class_55952) {
        this.u = class_55952;
    }

    public GpuBuffer N() {
        return this.N;
    }
}

