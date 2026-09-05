/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00941
 *  minecraft.class01391
 *  minecraft.class03255
 *  minecraft.class08188
 *  minecraft.class08669
 *  minecraft.class08679
 *  org.joml.Matrix3x2fc
 *  org.joml.Matrix4f
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00941;
import minecraft.class01391;
import minecraft.class03255;
import minecraft.class08188;
import minecraft.class08669;
import minecraft.class08679;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.jspecify.annotations.Nullable;

public final class class08654
extends Record
implements class08669 {
    private final Matrix3x2fc pose;
    private final class00941 renderable;
    private final @Nullable class03255 scissorArea;

    public class08654(Matrix3x2fc matrix3x2fc, class00941 class009412, @Nullable class03255 class032552) {
        this.pose = matrix3x2fc;
        this.renderable = class009412;
        this.scissorArea = class032552;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08654.class, "pose;renderable;scissorArea", "pose", "renderable", "scissorArea"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08654.class, "pose;renderable;scissorArea", "pose", "renderable", "scissorArea"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08654.class, "pose;renderable;scissorArea", "pose", "renderable", "scissorArea"}, this);
    }

    public class00941 y() {
        return this.renderable;
    }

    public Matrix3x2fc N() {
        return this.pose;
    }

    public @Nullable class03255 comp_4274() {
        return null;
    }

    public void method_70917(class01391 class013912) {
        this.renderable.N(new Matrix4f().mul(this.pose), class013912, 0xF000F0, true);
    }

    public RenderPipeline comp_4055() {
        return this.renderable.N();
    }

    public class08679 comp_4056() {
        return class08679.y((GpuTextureView)this.renderable.y(), (class08188)RenderSystem.getSamplerCache().N(FilterMode.NEAREST));
    }

    public @Nullable class03255 comp_4069() {
        return this.scissorArea;
    }
}

