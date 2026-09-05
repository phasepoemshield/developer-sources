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
 *  minecraft.class07915
 *  org.joml.Matrix4f
 */
package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00405;
import minecraft.class01391;
import minecraft.class01583;
import minecraft.class05272;
import minecraft.class07311;
import minecraft.class07915;
import org.joml.Matrix4f;

final class class05274
extends Record
implements class07915 {
    final float x;
    final float y;
    private final int color;
    private final int shadowColor;
    private final class05272 glyph;
    final class00405 style;
    private final float boldOffset;
    final float shadowOffset;

    boolean L() {
        return this.M() != 0;
    }

    public int M() {
        return this.shadowColor;
    }

    public float T() {
        return this.x + this.glyph.y.N(this.style.L());
    }

    class05274(float f, float f2, int n, int n2, class05272 class052722, class00405 class004052, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.color = n;
        this.shadowColor = n2;
        this.glyph = class052722;
        this.style = class004052;
        this.boldOffset = f3;
        this.shadowOffset = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05274.class, "x;y;color;shadowColor;glyph;style;boldOffset;shadowOffset", "x", "y", "color", "shadowColor", "glyph", "style", "boldOffset", "shadowOffset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05274.class, "x;y;color;shadowColor;glyph;style;boldOffset;shadowOffset", "x", "y", "color", "shadowColor", "glyph", "style", "boldOffset", "shadowOffset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05274.class, "x;y;color;shadowColor;glyph;style;boldOffset;shadowOffset", "x", "y", "color", "shadowColor", "glyph", "style", "boldOffset", "shadowOffset"}, this);
    }

    public class05272 B() {
        return this.glyph;
    }

    public float Z() {
        return this.boldOffset;
    }

    public float i() {
        return this.y;
    }

    public float m() {
        return this.glyph.u(this);
    }

    public float j() {
        return this.shadowOffset;
    }

    public float U() {
        return this.glyph.N(this);
    }

    public class00405 z() {
        return this.style;
    }

    public float u() {
        return this.x;
    }

    public GpuTextureView y() {
        return this.glyph.u;
    }

    public float E() {
        return this.glyph.y(this);
    }

    public void N(Matrix4f matrix4f, class01391 class013912, int n, boolean bl) {
        this.glyph.N(this, matrix4f, class013912, n, bl);
    }

    public class07311 N(class01583 class015832) {
        return this.glyph.L.N(class015832);
    }

    public RenderPipeline N() {
        return this.glyph.L.u();
    }

    public float W() {
        return this.glyph.L(this);
    }

    public int R() {
        return this.color;
    }
}

