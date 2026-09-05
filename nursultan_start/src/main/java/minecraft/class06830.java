/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08188
 */
package minecraft;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class08188;

public final class class06830
extends Record {
    private final GpuTextureView textureView;
    private final class08188 sampler;

    public class06830(GpuTextureView gpuTextureView, class08188 class081882) {
        this.textureView = gpuTextureView;
        this.sampler = class081882;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06830.class, "textureView;sampler", "textureView", "sampler"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06830.class, "textureView;sampler", "textureView", "sampler"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06830.class, "textureView;sampler", "textureView", "sampler"}, this);
    }

    public class08188 y() {
        return this.sampler;
    }

    public GpuTextureView N() {
        return this.textureView;
    }
}

