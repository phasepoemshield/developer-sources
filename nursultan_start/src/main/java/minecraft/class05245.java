/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00941
 *  minecraft.class01391
 *  minecraft.class01583
 *  minecraft.class07311
 *  org.joml.Matrix4f
 */
package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00941;
import minecraft.class01391;
import minecraft.class01583;
import minecraft.class05272;
import minecraft.class07311;
import org.joml.Matrix4f;

public final class class05245
extends Record
implements class00941 {
    private final class05272 glyph;
    final float x0;
    final float y0;
    final float x1;
    final float y1;
    final float depth;
    final int color;
    private final int shadowColor;
    private final float shadowOffset;

    boolean L() {
        return this.P() != 0;
    }

    public float M() {
        return this.x1;
    }

    public int P() {
        return this.shadowColor;
    }

    public class05245(class05272 class052722, float f, float f2, float f3, float f4, float f5, int n, int n2, float f6) {
        this.glyph = class052722;
        this.x0 = f;
        this.y0 = f2;
        this.x1 = f3;
        this.y1 = f4;
        this.depth = f5;
        this.color = n;
        this.shadowColor = n2;
        this.shadowOffset = f6;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05245.class, "glyph;x0;y0;x1;y1;depth;color;shadowColor;shadowOffset", "glyph", "x0", "y0", "x1", "y1", "depth", "color", "shadowColor", "shadowOffset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05245.class, "glyph;x0;y0;x1;y1;depth;color;shadowColor;shadowOffset", "glyph", "x0", "y0", "x1", "y1", "depth", "color", "shadowColor", "shadowOffset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05245.class, "glyph;x0;y0;x1;y1;depth;color;shadowColor;shadowOffset", "glyph", "x0", "y0", "x1", "y1", "depth", "color", "shadowColor", "shadowOffset"}, this);
    }

    public float B() {
        return this.y1;
    }

    public float Z() {
        return this.depth;
    }

    public float i() {
        return this.x0;
    }

    public float s() {
        return this.shadowOffset;
    }

    public float m() {
        return this.y1 + (this.L() ? this.shadowOffset : 0.0f);
    }

    public float U() {
        return this.x0;
    }

    public int z() {
        return this.color;
    }

    public class05272 u() {
        return this.glyph;
    }

    public GpuTextureView y() {
        return this.glyph.u;
    }

    public float E() {
        return this.y0;
    }

    public class07311 N(class01583 class015832) {
        return this.glyph.L.N(class015832);
    }

    public void N(Matrix4f matrix4f, class01391 class013912, int n, boolean bl) {
        this.glyph.N(this, matrix4f, class013912, n, false);
    }

    public RenderPipeline N() {
        return this.glyph.L.u();
    }

    public float W() {
        return this.x1 + (this.L() ? this.shadowOffset : 0.0f);
    }

    public float R() {
        return this.y0;
    }
}

