/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01391
 *  minecraft.class03255
 *  minecraft.class08669
 *  minecraft.class08679
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01391;
import minecraft.class03255;
import minecraft.class08669;
import minecraft.class08679;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public final class class08661
extends Record
implements class08669 {
    private final RenderPipeline pipeline;
    private final class08679 textureSetup;
    private final Matrix3x2f pose;
    private final int x0;
    private final int y0;
    private final int x1;
    private final int y1;
    private final float u0;
    private final float u1;
    private final float v0;
    private final float v1;
    private final int color;
    private final @Nullable class03255 scissorArea;
    private final @Nullable class03255 bounds;

    public int L() {
        return this.y0;
    }

    public float M() {
        return this.u1;
    }

    public class08661(RenderPipeline renderPipeline, class08679 class086792, Matrix3x2f matrix3x2f, int n, int n2, int n3, int n4, float f, float f2, float f3, float f4, int n5, @Nullable class03255 class032552) {
        this(renderPipeline, class086792, matrix3x2f, n, n2, n3, n4, f, f2, f3, f4, n5, class032552, class08661.N(n, n2, n3, n4, matrix3x2f, class032552));
    }

    public class08661(RenderPipeline renderPipeline, class08679 class086792, Matrix3x2f matrix3x2f, int n, int n2, int n3, int n4, float f, float f2, float f3, float f4, int n5, @Nullable class03255 class032552, @Nullable class03255 class032553) {
        this.pipeline = renderPipeline;
        this.textureSetup = class086792;
        this.pose = matrix3x2f;
        this.x0 = n;
        this.y0 = n2;
        this.x1 = n3;
        this.y1 = n4;
        this.u0 = f;
        this.u1 = f2;
        this.v0 = f3;
        this.v1 = f4;
        this.color = n5;
        this.scissorArea = class032552;
        this.bounds = class032553;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08661.class, "pipeline;textureSetup;pose;x0;y0;x1;y1;u0;u1;v0;v1;color;scissorArea;bounds", "pipeline", "textureSetup", "pose", "x0", "y0", "x1", "y1", "u0", "u1", "v0", "v1", "color", "scissorArea", "bounds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08661.class, "pipeline;textureSetup;pose;x0;y0;x1;y1;u0;u1;v0;v1;color;scissorArea;bounds", "pipeline", "textureSetup", "pose", "x0", "y0", "x1", "y1", "u0", "u1", "v0", "v1", "color", "scissorArea", "bounds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08661.class, "pipeline;textureSetup;pose;x0;y0;x1;y1;u0;u1;v0;v1;color;scissorArea;bounds", "pipeline", "textureSetup", "pose", "x0", "y0", "x1", "y1", "u0", "u1", "v0", "v1", "color", "scissorArea", "bounds"}, this);
    }

    public float B() {
        return this.v0;
    }

    public float Z() {
        return this.v1;
    }

    public int i() {
        return this.y1;
    }

    public int z() {
        return this.color;
    }

    public int u() {
        return this.x1;
    }

    public int y() {
        return this.x0;
    }

    private static @Nullable class03255 N(int n, int n2, int n3, int n4, Matrix3x2f matrix3x2f, @Nullable class03255 class032552) {
        class03255 class032553 = new class03255(n, n2, n3 - n, n4 - n2).y((Matrix3x2fc)matrix3x2f);
        return class032552 != null ? class032552.y(class032553) : class032553;
    }

    public Matrix3x2f N() {
        return this.pose;
    }

    public @Nullable class03255 comp_4274() {
        return this.bounds;
    }

    public float R() {
        return this.u0;
    }

    public void method_70917(class01391 class013912) {
        class013912.N((Matrix3x2fc)this.N(), (float)this.y(), (float)this.L()).method_22913(this.R(), this.B()).method_39415(this.z());
        class013912.N((Matrix3x2fc)this.N(), (float)this.y(), (float)this.i()).method_22913(this.R(), this.Z()).method_39415(this.z());
        class013912.N((Matrix3x2fc)this.N(), (float)this.u(), (float)this.i()).method_22913(this.M(), this.Z()).method_39415(this.z());
        class013912.N((Matrix3x2fc)this.N(), (float)this.u(), (float)this.L()).method_22913(this.M(), this.B()).method_39415(this.z());
    }

    public RenderPipeline comp_4055() {
        return this.pipeline;
    }

    public class08679 comp_4056() {
        return this.textureSetup;
    }

    public @Nullable class03255 comp_4069() {
        return this.scissorArea;
    }
}

