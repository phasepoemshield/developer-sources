/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuFence
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class00084
implements AutoCloseable {
    private static final int N = 3;
    private final GpuBuffer[] y = new GpuBuffer[3];
    private final @Nullable GpuFence[] L = new GpuFence[3];
    private final int u;
    private int i = 0;

    public void L() {
        if (this.L[this.i] != null) {
            this.L[this.i].close();
        }
        this.L[this.i] = RenderSystem.getDevice().createCommandEncoder().createFence();
        this.i = (this.i + 1) % 3;
    }

    public class00084(Supplier<String> supplier, int n, int n2) {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        if ((n & 1) == 0 && (n & 2) == 0) {
            throw new IllegalArgumentException("MappableRingBuffer requires at least one of USAGE_MAP_READ or USAGE_MAP_WRITE");
        }
        for (int i = 0; i < 3; ++i) {
            int n3 = i;
            this.y[i] = gpuDevice.createBuffer(() -> (String)supplier.get() + " #" + n3, n, (long)n2);
            this.L[i] = null;
        }
        this.u = n2;
    }

    @Override
    public void close() {
        for (int i = 0; i < 3; ++i) {
            this.y[i].close();
            if (this.L[i] == null) continue;
            this.L[i].close();
        }
    }

    public GpuBuffer y() {
        GpuFence gpuFence = this.L[this.i];
        if (gpuFence != null) {
            gpuFence.awaitCompletion(Long.MAX_VALUE);
            gpuFence.close();
            this.L[this.i] = null;
        }
        return this.y[this.i];
    }

    public int N() {
        return this.u;
    }
}

