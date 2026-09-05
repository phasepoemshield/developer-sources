/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01391
 *  minecraft.class03255
 *  minecraft.class04995
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
import minecraft.class04995;
import minecraft.class08669;
import minecraft.class08679;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public final class class06985
extends Record
implements class08669 {
    private final RenderPipeline pipeline;
    private final class08679 textureSetup;
    private final Matrix3x2f pose;
    private final int tileWidth;
    private final int tileHeight;
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
        return this.tileHeight;
    }

    public int M() {
        return this.y1;
    }

    public class06985(RenderPipeline renderPipeline, class08679 class086792, Matrix3x2f matrix3x2f, int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, float f4, int n7, @Nullable class03255 class032552) {
        this(renderPipeline, class086792, matrix3x2f, n, n2, n3, n4, n5, n6, f, f2, f3, f4, n7, class032552, class06985.N(n3, n4, n5, n6, matrix3x2f, class032552));
    }

    public class06985(RenderPipeline renderPipeline, class08679 class086792, Matrix3x2f matrix3x2f, int n, int n2, int n3, int n4, int n5, int n6, float f, float f2, float f3, float f4, int n7, @Nullable class03255 class032552, @Nullable class03255 class032553) {
        this.pipeline = renderPipeline;
        this.textureSetup = class086792;
        this.pose = matrix3x2f;
        this.tileWidth = n;
        this.tileHeight = n2;
        this.x0 = n3;
        this.y0 = n4;
        this.x1 = n5;
        this.y1 = n6;
        this.u0 = f;
        this.u1 = f2;
        this.v0 = f3;
        this.v1 = f4;
        this.color = n7;
        this.scissorArea = class032552;
        this.bounds = class032553;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06985.class, "pipeline;textureSetup;pose;tileWidth;tileHeight;x0;y0;x1;y1;u0;u1;v0;v1;color;scissorArea;bounds", "pipeline", "textureSetup", "pose", "tileWidth", "tileHeight", "x0", "y0", "x1", "y1", "u0", "u1", "v0", "v1", "color", "scissorArea", "bounds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06985.class, "pipeline;textureSetup;pose;tileWidth;tileHeight;x0;y0;x1;y1;u0;u1;v0;v1;color;scissorArea;bounds", "pipeline", "textureSetup", "pose", "tileWidth", "tileHeight", "x0", "y0", "x1", "y1", "u0", "u1", "v0", "v1", "color", "scissorArea", "bounds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06985.class, "pipeline;textureSetup;pose;tileWidth;tileHeight;x0;y0;x1;y1;u0;u1;v0;v1;color;scissorArea;bounds", "pipeline", "textureSetup", "pose", "tileWidth", "tileHeight", "x0", "y0", "x1", "y1", "u0", "u1", "v0", "v1", "color", "scissorArea", "bounds"}, this);
    }

    public float B() {
        return this.u0;
    }

    public float Z() {
        return this.u1;
    }

    public int i() {
        return this.y0;
    }

    public float U() {
        return this.v1;
    }

    public float z() {
        return this.v0;
    }

    public int u() {
        return this.x0;
    }

    public int y() {
        return this.tileWidth;
    }

    public int E() {
        return this.color;
    }

    public Matrix3x2f N() {
        return this.pose;
    }

    private static @Nullable class03255 N(int n, int n2, int n3, int n4, Matrix3x2f matrix3x2f, @Nullable class03255 class032552) {
        class03255 class032553 = new class03255(n, n2, n3 - n, n4 - n2).y((Matrix3x2fc)matrix3x2f);
        return class032552 != null ? class032552.y(class032553) : class032553;
    }

    public @Nullable class03255 comp_4274() {
        return this.bounds;
    }

    public int R() {
        return this.x1;
    }

    public void method_70917(class01391 class013912) {
        int n = this.R() - this.u();
        int n2 = this.M() - this.i();
        for (int i = 0; i < n; i += this.y()) {
            float f;
            int n3;
            int n4 = n - i;
            if (this.y() <= n4) {
                n3 = this.y();
                f = this.Z();
            } else {
                n3 = n4;
                f = class04995.B((float)((float)n4 / (float)this.y()), (float)this.B(), (float)this.Z());
            }
            for (int j = 0; j < n2; j += this.L()) {
                float f2;
                int n5;
                int n6 = n2 - j;
                if (this.L() <= n6) {
                    n5 = this.L();
                    f2 = this.U();
                } else {
                    n5 = n6;
                    f2 = class04995.B((float)((float)n6 / (float)this.L()), (float)this.z(), (float)this.U());
                }
                int n7 = this.u() + i;
                int n8 = this.u() + i + n3;
                int n9 = this.i() + j;
                int n10 = this.i() + j + n5;
                class013912.N((Matrix3x2fc)this.N(), (float)n7, (float)n9).method_22913(this.B(), this.z()).method_39415(this.E());
                class013912.N((Matrix3x2fc)this.N(), (float)n7, (float)n10).method_22913(this.B(), f2).method_39415(this.E());
                class013912.N((Matrix3x2fc)this.N(), (float)n8, (float)n10).method_22913(f, f2).method_39415(this.E());
                class013912.N((Matrix3x2fc)this.N(), (float)n8, (float)n9).method_22913(f, this.z()).method_39415(this.E());
            }
        }
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

