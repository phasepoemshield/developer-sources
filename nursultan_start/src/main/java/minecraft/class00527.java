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

final class class00527
extends Record {
    private final String samplerName;
    final GpuTextureView view;
    private final class08188 sampler;

    public class08188 L() {
        return this.sampler;
    }

    class00527(String string, GpuTextureView gpuTextureView, class08188 class081882) {
        this.samplerName = string;
        this.view = gpuTextureView;
        this.sampler = class081882;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00527.class, "samplerName;view;sampler", "samplerName", "view", "sampler"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00527.class, "samplerName;view;sampler", "samplerName", "view", "sampler"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00527.class, "samplerName;view;sampler", "samplerName", "view", "sampler"}, this);
    }

    public GpuTextureView y() {
        return this.view;
    }

    public String N() {
        return this.samplerName;
    }
}

