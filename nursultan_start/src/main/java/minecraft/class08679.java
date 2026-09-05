/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03386
 *  minecraft.class06202
 *  minecraft.class07529
 *  minecraft.class08188
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03386;
import minecraft.class06202;
import minecraft.class07529;
import minecraft.class08188;
import org.jspecify.annotations.Nullable;

public final class class08679
extends Record {
    private final @Nullable GpuTextureView texure0;
    private final @Nullable GpuTextureView texure1;
    private final @Nullable GpuTextureView texure2;
    private final @Nullable class08188 sampler0;
    private final @Nullable class08188 sampler1;
    private final @Nullable class08188 sampler2;
    private static final class08679 M = new class08679(null, null, null, null, null, null);
    private static int B;

    public static void L() {
        B = Math.round(100000.0f * (float)Math.random());
    }

    public @Nullable class08188 M() {
        return this.sampler0;
    }

    public class08679(@Nullable GpuTextureView gpuTextureView, @Nullable GpuTextureView gpuTextureView2, @Nullable GpuTextureView gpuTextureView3, @Nullable class08188 class081882, @Nullable class08188 class081883, @Nullable class08188 class081884) {
        this.texure0 = gpuTextureView;
        this.texure1 = gpuTextureView2;
        this.texure2 = gpuTextureView3;
        this.sampler0 = class081882;
        this.sampler1 = class081883;
        this.sampler2 = class081884;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08679.class, "texure0;texure1;texure2;sampler0;sampler1;sampler2", "texure0", "texure1", "texure2", "sampler0", "sampler1", "sampler2"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08679.class, "texure0;texure1;texure2;sampler0;sampler1;sampler2", "texure0", "texure1", "texure2", "sampler0", "sampler1", "sampler2"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08679.class, "texure0;texure1;texure2;sampler0;sampler1;sampler2", "texure0", "texure1", "texure2", "sampler0", "sampler1", "sampler2"}, this);
    }

    public @Nullable class08188 B() {
        return this.sampler1;
    }

    public @Nullable class08188 Z() {
        return this.sampler2;
    }

    public @Nullable GpuTextureView i() {
        return this.texure1;
    }

    public @Nullable GpuTextureView u() {
        return this.texure0;
    }

    public int y() {
        return class07529.l ? this.hashCode() * (B + 1) : this.hashCode();
    }

    public static class08679 y(GpuTextureView gpuTextureView, class08188 class081882) {
        return new class08679(gpuTextureView, null, ((class03386)class06202.Nq().i_5).T().N(), class081882, null, RenderSystem.getSamplerCache().N(FilterMode.LINEAR));
    }

    public static class08679 N() {
        return M;
    }

    public static class08679 N(GpuTextureView gpuTextureView, class08188 class081882, GpuTextureView gpuTextureView2, class08188 class081883) {
        return new class08679(gpuTextureView, gpuTextureView2, null, class081882, class081883, null);
    }

    public static class08679 N(GpuTextureView gpuTextureView, class08188 class081882) {
        return new class08679(gpuTextureView, null, null, class081882, null, null);
    }

    public @Nullable GpuTextureView R() {
        return this.texure2;
    }
}

