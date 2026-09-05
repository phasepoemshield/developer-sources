/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00405
 *  minecraft.class01391
 *  minecraft.class01583
 *  minecraft.class03504
 *  minecraft.class06596
 *  minecraft.class07311
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00405;
import minecraft.class01391;
import minecraft.class01583;
import minecraft.class03504;
import minecraft.class06596;
import minecraft.class07311;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

final class class00920
extends Record
implements class06596 {
    private final class03504 renderTypes;
    private final GpuTextureView textureView;
    private final class08388 sprite;
    private final float x;
    private final float y;
    private final int color;
    private final int shadowColor;
    private final float shadowOffset;
    private final class00405 style;

    public class03504 L() {
        return this.renderTypes;
    }

    public int M() {
        return this.color;
    }

    class00920(class03504 class035042, GpuTextureView gpuTextureView, class08388 class083882, float f, float f2, int n, int n2, float f3, class00405 class004052) {
        this.renderTypes = class035042;
        this.textureView = gpuTextureView;
        this.sprite = class083882;
        this.x = f;
        this.y = f2;
        this.color = n;
        this.shadowColor = n2;
        this.shadowOffset = f3;
        this.style = class004052;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00920.class, "renderTypes;textureView;sprite;x;y;color;shadowColor;shadowOffset;style", "renderTypes", "textureView", "sprite", "x", "y", "color", "shadowColor", "shadowOffset", "style"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00920.class, "renderTypes;textureView;sprite;x;y;color;shadowColor;shadowOffset;style", "renderTypes", "textureView", "sprite", "x", "y", "color", "shadowColor", "shadowOffset", "style"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00920.class, "renderTypes;textureView;sprite;x;y;color;shadowColor;shadowOffset;style", "renderTypes", "textureView", "sprite", "x", "y", "color", "shadowColor", "shadowOffset", "style"}, this);
    }

    public int B() {
        return this.shadowColor;
    }

    public float Z() {
        return this.shadowOffset;
    }

    public float i() {
        return this.x;
    }

    public class00405 z() {
        return this.style;
    }

    public class08388 u() {
        return this.sprite;
    }

    public GpuTextureView y() {
        return this.textureView;
    }

    private void N(CallbackInfo callbackInfo) {
        SpriteUtil.INSTANCE.markSpriteActive(this.sprite);
    }

    public class07311 N(class01583 class015832) {
        return this.renderTypes.N(class015832);
    }

    public RenderPipeline N() {
        return this.renderTypes.u();
    }

    public void N(Matrix4f matrix4f, class01391 class013912, int n, float f, float f2, float f3, int n2) {
        this.N((CallbackInfo)null);
        float f4 = f + this.U();
        float f5 = f + this.W();
        float f6 = f2 + this.E();
        float f7 = f2 + this.m();
        class013912.N((Matrix4fc)matrix4f, f4, f6, f3).method_22913(this.sprite.method_4594(), this.sprite.method_4593()).method_39415(n2).method_60803(n);
        class013912.N((Matrix4fc)matrix4f, f4, f7, f3).method_22913(this.sprite.method_4594(), this.sprite.method_4575()).method_39415(n2).method_60803(n);
        class013912.N((Matrix4fc)matrix4f, f5, f7, f3).method_22913(this.sprite.method_4577(), this.sprite.method_4575()).method_39415(n2).method_60803(n);
        class013912.N((Matrix4fc)matrix4f, f5, f6, f3).method_22913(this.sprite.method_4577(), this.sprite.method_4593()).method_39415(n2).method_60803(n);
    }

    public float R() {
        return this.y;
    }
}

