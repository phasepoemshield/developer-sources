/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.systems.GpuQuery
 *  com.mojang.blaze3d.systems.RenderSystem
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuQuery;
import com.mojang.blaze3d.systems.RenderSystem;
import minecraft.class04371;
import minecraft.class04379;
import org.jspecify.annotations.Nullable;

public class class04368 {
    private @Nullable CommandEncoder N;
    private @Nullable GpuQuery y;

    public void L() {
        RenderSystem.assertOnRenderThread();
        if (this.y != null) {
            throw new IllegalStateException("Current profile not ended");
        }
        this.N = RenderSystem.getDevice().createCommandEncoder();
        this.y = this.N.timerQueryBegin();
    }

    public class04379 u() {
        RenderSystem.assertOnRenderThread();
        if (this.y == null || this.N == null) {
            throw new IllegalStateException("endProfile called before beginProfile");
        }
        this.N.timerQueryEnd(this.y);
        class04379 class043792 = new class04379(this.y);
        this.y = null;
        this.N = null;
        return class043792;
    }

    public boolean y() {
        return this.y != null;
    }

    public static class04368 N() {
        return class04371.N;
    }
}

