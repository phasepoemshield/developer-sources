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
 *  minecraft.class07311
 *  minecraft.class07923
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Supplier;
import minecraft.class00405;
import minecraft.class01391;
import minecraft.class01583;
import minecraft.class06596;
import minecraft.class07311;
import minecraft.class07923;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

final class class06598
extends Record
implements class06596 {
    private final Supplier<class07923> skin;
    private final boolean hat;
    private final float x;
    private final float y;
    private final int color;
    private final int shadowColor;
    private final float shadowOffset;
    private final class00405 style;

    public Supplier<class07923> L() {
        return this.skin;
    }

    @Override
    public int M() {
        return this.color;
    }

    class06598(Supplier<class07923> supplier, boolean bl, float f, float f2, int n, int n2, float f3, class00405 class004052) {
        this.skin = supplier;
        this.hat = bl;
        this.x = f;
        this.y = f2;
        this.color = n;
        this.shadowColor = n2;
        this.shadowOffset = f3;
        this.style = class004052;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06598.class, "skin;hat;x;y;color;shadowColor;shadowOffset;style", "skin", "hat", "x", "y", "color", "shadowColor", "shadowOffset", "style"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06598.class, "skin;hat;x;y;color;shadowColor;shadowOffset;style", "skin", "hat", "x", "y", "color", "shadowColor", "shadowOffset", "style"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06598.class, "skin;hat;x;y;color;shadowColor;shadowOffset;style", "skin", "hat", "x", "y", "color", "shadowColor", "shadowOffset", "style"}, this);
    }

    @Override
    public int B() {
        return this.shadowColor;
    }

    @Override
    public float Z() {
        return this.shadowOffset;
    }

    @Override
    public float i() {
        return this.x;
    }

    public class00405 z() {
        return this.style;
    }

    public boolean u() {
        return this.hat;
    }

    public GpuTextureView y() {
        return this.skin.get().u();
    }

    public RenderPipeline N() {
        return this.skin.get().i().u();
    }

    public class07311 N(class01583 class015832) {
        return this.skin.get().i().N(class015832);
    }

    @Override
    public void N(Matrix4f matrix4f, class01391 class013912, int n, float f, float f2, float f3, int n2) {
        float f4 = f + this.U();
        float f5 = f + this.W();
        float f6 = f2 + this.E();
        float f7 = f2 + this.m();
        class06598.N(matrix4f, class013912, n, f4, f5, f6, f7, f3, n2, 8.0f, 8.0f, 8, 8, 64, 64);
        if (this.hat) {
            class06598.N(matrix4f, class013912, n, f4, f5, f6, f7, f3, n2, 40.0f, 8.0f, 8, 8, 64, 64);
        }
    }

    private static void N(Matrix4f matrix4f, class01391 class013912, int n, float f, float f2, float f3, float f4, float f5, int n2, float f6, float f7, int n3, int n4, int n5, int n6) {
        float f8 = (f6 + 0.0f) / (float)n5;
        float f9 = (f6 + (float)n3) / (float)n5;
        float f10 = (f7 + 0.0f) / (float)n6;
        float f11 = (f7 + (float)n4) / (float)n6;
        class013912.N((Matrix4fc)matrix4f, f, f3, f5).method_22913(f8, f10).method_39415(n2).method_60803(n);
        class013912.N((Matrix4fc)matrix4f, f, f4, f5).method_22913(f8, f11).method_39415(n2).method_60803(n);
        class013912.N((Matrix4fc)matrix4f, f2, f4, f5).method_22913(f9, f11).method_39415(n2).method_60803(n);
        class013912.N((Matrix4fc)matrix4f, f2, f3, f5).method_22913(f9, f10).method_39415(n2).method_60803(n);
    }

    @Override
    public float R() {
        return this.y;
    }
}

