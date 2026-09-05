/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.TextureFormat
 *  minecraft.class08066
 *  minecraft.class08391
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import minecraft.class03433;
import minecraft.class08066;
import minecraft.class08391;
import org.jspecify.annotations.Nullable;

public class class03453
extends class08066 {
    public static final int Z = 854;
    public static final int z = 480;
    static final class03433 U = new class03433(854, 480);

    private void L(int n, int n2) {
        class03433 class034332 = this.u(n, n2);
        if (this.i == null || this.M == null) {
            throw new IllegalStateException("Missing color and/or depth textures");
        }
        this.N = class034332.N;
        this.y = class034332.y;
    }

    public class03453(int n, int n2) {
        super("Main", true);
        this.L(n, n2);
    }

    private class03433 u(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        for (class03433 class034332 : class03433.N(n, n2)) {
            if (this.i != null) {
                this.i.close();
                this.i = null;
            }
            if (this.R != null) {
                this.R.close();
                this.R = null;
            }
            if (this.M != null) {
                this.M.close();
                this.M = null;
            }
            if (this.B != null) {
                this.B.close();
                this.B = null;
            }
            this.i = this.N(class034332);
            this.M = this.y(class034332);
            if (this.i == null || this.M == null) continue;
            this.R = RenderSystem.getDevice().createTextureView(this.i);
            this.B = RenderSystem.getDevice().createTextureView(this.M);
            return class034332;
        }
        throw new RuntimeException("Unrecoverable GL_OUT_OF_MEMORY (" + (this.i == null ? "missing color" : "have color") + ", " + (this.M == null ? "missing depth" : "have depth") + ")");
    }

    private @Nullable GpuTexture y(class03433 class034332) {
        try {
            return RenderSystem.getDevice().createTexture(() -> this.L + " / Depth", 15, TextureFormat.DEPTH32, class034332.N, class034332.y, 1, 1);
        }
        catch (class08391 class083912) {
            return null;
        }
    }

    private @Nullable GpuTexture N(class03433 class034332) {
        try {
            return RenderSystem.getDevice().createTexture(() -> this.L + " / Color", 15, TextureFormat.RGBA8, class034332.N, class034332.y, 1, 1);
        }
        catch (class08391 class083912) {
            return null;
        }
    }
}

