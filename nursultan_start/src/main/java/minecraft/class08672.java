/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  minecraft.class00056
 *  minecraft.class00312
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class08394
 *  minecraft.class08647
 *  minecraft.class08651
 *  minecraft.class08661
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import minecraft.class00056;
import minecraft.class00312;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class08394;
import minecraft.class08647;
import minecraft.class08651;
import minecraft.class08661;
import minecraft.class08679;
import org.jspecify.annotations.Nullable;

public abstract class class08672<T extends class08647>
implements AutoCloseable {
    protected final class01422 N;
    private @Nullable GpuTexture y;
    private @Nullable GpuTextureView L;
    private @Nullable GpuTexture u;
    private @Nullable GpuTextureView i;
    private final class00056 R = new class00056("PIP - " + this.getClass().getSimpleName(), -1000.0f, 1000.0f, true);

    protected class08672(class01422 class014222) {
        this.N = class014222;
    }

    @Override
    public void close() {
        if (this.y != null) {
            this.y.close();
        }
        if (this.L != null) {
            this.L.close();
        }
        if (this.u != null) {
            this.u.close();
        }
        if (this.i != null) {
            this.i.close();
        }
        this.R.close();
    }

    protected abstract String y();

    protected abstract void N(T var1, class01421 var2);

    public void N(T t, class08651 class086512, int n) {
        boolean bl;
        int n2 = (t.M() - t.i()) * n;
        int n3 = (t.B() - t.R()) * n;
        boolean bl2 = bl = this.y == null || this.y.getWidth(0) != n2 || this.y.getHeight(0) != n3;
        if (!bl && this.N(t)) {
            this.N(t, class086512);
            return;
        }
        this.N(bl, n2, n3);
        RenderSystem.outputColorTextureOverride = this.L;
        RenderSystem.outputDepthTextureOverride = this.i;
        class01421 class014212 = new class01421();
        class014212.N((float)n2 / 2.0f, this.N(n3, n), 0.0f);
        float f = (float)n * t.N();
        class014212.y(f, f, -f);
        this.N(t, class014212);
        this.N.u();
        RenderSystem.outputColorTextureOverride = null;
        RenderSystem.outputDepthTextureOverride = null;
        this.N(t, class086512);
    }

    private void N(boolean bl, int n, int n2) {
        if (this.y != null && bl) {
            this.y.close();
            this.y = null;
            this.L.close();
            this.L = null;
            this.u.close();
            this.u = null;
            this.i.close();
            this.i = null;
        }
        GpuDevice gpuDevice = RenderSystem.getDevice();
        if (this.y == null) {
            this.y = gpuDevice.createTexture(() -> "UI " + this.y() + " texture", 12, TextureFormat.RGBA8, n, n2, 1, 1);
            this.L = gpuDevice.createTextureView(this.y);
            this.u = gpuDevice.createTexture(() -> "UI " + this.y() + " depth texture", 8, TextureFormat.DEPTH32, n, n2, 1, 1);
            this.i = gpuDevice.createTextureView(this.u);
        }
        gpuDevice.createCommandEncoder().clearColorAndDepthTextures(this.y, 0, this.u, 1.0);
        RenderSystem.setProjectionMatrix((GpuBufferSlice)this.R.y((float)n, (float)n2), (class00312)class00312.field_54954);
    }

    protected boolean N(T t) {
        return false;
    }

    protected float N(int n, int n2) {
        return n;
    }

    protected void N(T t, class08651 class086512) {
        class086512.N(new class08661(class08394.Np, class08679.N(this.L, RenderSystem.getSamplerCache().y(FilterMode.NEAREST)), t.E(), t.i(), t.R(), t.M(), t.B(), 0.0f, 1.0f, 1.0f, 0.0f, -1, t.Z(), null));
    }

    public abstract Class<T> N();
}

