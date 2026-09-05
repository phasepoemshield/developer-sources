/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer$MappedView
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.logging.LogUtils
 *  minecraft.class04995
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class00063;
import minecraft.class00084;
import minecraft.class04995;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00091<T extends class00063>
implements AutoCloseable {
    private static final Logger N = LogUtils.getLogger();
    private final List<class00084> y = new ArrayList<class00084>();
    private final int L;
    private class00084 u;
    private int i;
    private int R;
    private @Nullable T M;
    private final String B;

    public class00091(String string, int n, int n2) {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.L = class04995.i((int)n, (int)gpuDevice.getUniformOffsetAlignment());
        this.R = class04995.L((int)n2);
        this.i = 0;
        this.u = new class00084(() -> string + " x" + this.L, 130, this.L * this.R);
        this.B = string;
    }

    @Override
    public void close() {
        Iterator<class00084> iterator = this.y.iterator();
        while (iterator.hasNext()) {
            iterator.next().close();
        }
        this.u.close();
    }

    public GpuBufferSlice[] N(T[] TArray) {
        int n;
        if (TArray.length == 0) {
            return new GpuBufferSlice[0];
        }
        if (this.i + TArray.length > this.R) {
            n = class04995.L((int)Math.max(this.R + 1, TArray.length));
            N.info("Resizing {}, capacity limit of {} reached during a single frame. New capacity will be {}.", new Object[]{this.B, this.R, n});
            this.N(n);
        }
        n = this.i * this.L;
        GpuBufferSlice[] gpuBufferSliceArray = new GpuBufferSlice[TArray.length];
        try (GpuBuffer.MappedView mappedView = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.u.y().slice((long)n, (long)(TArray.length * this.L)), false, true);){
            ByteBuffer byteBuffer = mappedView.data();
            for (int i = 0; i < TArray.length; ++i) {
                T t = TArray[i];
                gpuBufferSliceArray[i] = this.u.y().slice((long)(n + i * this.L), (long)this.L);
                byteBuffer.position(i * this.L);
                t.N(byteBuffer);
            }
        }
        this.i += TArray.length;
        this.M = TArray[TArray.length - 1];
        return gpuBufferSliceArray;
    }

    private void N(int n) {
        this.R = n;
        this.i = 0;
        this.M = null;
        this.y.add(this.u);
        this.u = new class00084(() -> this.B + " x" + this.L, 130, this.L * this.R);
    }

    public void N() {
        this.i = 0;
        this.M = null;
        this.u.L();
        if (!this.y.isEmpty()) {
            Iterator<class00084> iterator = this.y.iterator();
            while (iterator.hasNext()) {
                iterator.next().close();
            }
            this.y.clear();
        }
    }

    public GpuBufferSlice N(T t) {
        int n;
        if (this.M != null && this.M.equals(t)) {
            return this.u.y().slice((long)((this.i - 1) * this.L), (long)this.L);
        }
        if (this.i >= this.R) {
            n = this.R * 2;
            N.info("Resizing {}, capacity limit of {} reached during a single frame. New capacity will be {}.", new Object[]{this.B, this.R, n});
            this.N(n);
        }
        n = this.i * this.L;
        try (GpuBuffer.MappedView mappedView = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.u.y().slice((long)n, (long)this.L), false, true);){
            t.N(mappedView.data());
        }
        ++this.i;
        this.M = t;
        return this.u.y().slice((long)n, (long)this.L);
    }
}

