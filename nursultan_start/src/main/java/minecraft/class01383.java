/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class05163
 *  net.caffeinemc.mods.sodium.client.render.viewport.Viewport
 *  net.caffeinemc.mods.sodium.client.render.viewport.ViewportProvider
 *  net.caffeinemc.mods.sodium.client.render.viewport.frustum.Frustum
 *  net.caffeinemc.mods.sodium.client.render.viewport.frustum.SimpleFrustum
 *  org.joml.FrustumIntersection
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3d
 *  org.joml.Vector4f
 */
package minecraft;

import minecraft.class00734;
import minecraft.class05163;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;
import net.caffeinemc.mods.sodium.client.render.viewport.ViewportProvider;
import net.caffeinemc.mods.sodium.client.render.viewport.frustum.Frustum;
import net.caffeinemc.mods.sodium.client.render.viewport.frustum.SimpleFrustum;
import org.joml.FrustumIntersection;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3d;
import org.joml.Vector4f;

public class class01383
implements ViewportProvider {
    public static final int field_34820 = 4;
    private final FrustumIntersection field_40823 = new FrustumIntersection();
    private final Matrix4f field_40824 = new Matrix4f();
    private Vector4f field_34821;
    private double field_20995;
    private double field_20996;
    private double field_20997;

    public class01383(Matrix4f matrix4f, Matrix4f matrix4f2) {
        this.method_23092(matrix4f, matrix4f2);
    }

    public class01383(class01383 class013832) {
        this.field_40823.set((Matrix4fc)class013832.field_40824);
        this.field_40824.set((Matrix4fc)class013832.field_40824);
        this.field_20995 = class013832.field_20995;
        this.field_20996 = class013832.field_20996;
        this.field_20997 = class013832.field_20997;
        this.field_34821 = class013832.field_34821;
    }

    public double method_62345() {
        return this.field_20997;
    }

    public Vector4f[] method_62342() {
        Vector4f[] vector4fArray = new Vector4f[]{new Vector4f(-1.0f, -1.0f, -1.0f, 1.0f), new Vector4f(1.0f, -1.0f, -1.0f, 1.0f), new Vector4f(1.0f, 1.0f, -1.0f, 1.0f), new Vector4f(-1.0f, 1.0f, -1.0f, 1.0f), new Vector4f(-1.0f, -1.0f, 1.0f, 1.0f), new Vector4f(1.0f, -1.0f, 1.0f, 1.0f), new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), new Vector4f(-1.0f, 1.0f, 1.0f, 1.0f)};
        Matrix4f matrix4f = this.field_40824.invert(new Matrix4f());
        for (int i = 0; i < 8; ++i) {
            matrix4f.transform(vector4fArray[i]);
            vector4fArray[i].div(vector4fArray[i].w());
        }
        return vector4fArray;
    }

    public class01383 method_38557(int n) {
        double d = Math.floor(this.field_20995 / (double)n) * (double)n;
        double d2 = Math.floor(this.field_20996 / (double)n) * (double)n;
        double d3 = Math.floor(this.field_20997 / (double)n) * (double)n;
        double d4 = Math.ceil(this.field_20995 / (double)n) * (double)n;
        double d5 = Math.ceil(this.field_20996 / (double)n) * (double)n;
        double d6 = Math.ceil(this.field_20997 / (double)n) * (double)n;
        while (this.field_40823.intersectAab((float)(d - this.field_20995), (float)(d2 - this.field_20996), (float)(d3 - this.field_20997), (float)(d4 - this.field_20995), (float)(d5 - this.field_20996), (float)(d6 - this.field_20997)) != -2) {
            this.field_20995 -= (double)(this.field_34821.x() * 4.0f);
            this.field_20996 -= (double)(this.field_34821.y() * 4.0f);
            this.field_20997 -= (double)(this.field_34821.z() * 4.0f);
        }
        return this;
    }

    public int method_62978(class05163 class051632) {
        return this.method_23089(class051632.B(), class051632.Z(), class051632.z(), class051632.U() + 1, class051632.E() + 1, class051632.W() + 1);
    }

    private void method_23092(Matrix4f matrix4f, Matrix4f matrix4f2) {
        matrix4f2.mul((Matrix4fc)matrix4f, this.field_40824);
        this.field_40823.set((Matrix4fc)this.field_40824);
        this.field_34821 = this.field_40824.transformTranspose(new Vector4f(0.0f, 0.0f, 1.0f, 0.0f));
    }

    public class01383 method_74403(float f) {
        this.field_20995 += (double)(this.field_34821.x * f);
        this.field_20996 += (double)(this.field_34821.y * f);
        this.field_20997 += (double)(this.field_34821.z * f);
        return this;
    }

    private int method_23089(double d, double d2, double d3, double d4, double d5, double d6) {
        float f = (float)(d - this.field_20995);
        float f2 = (float)(d2 - this.field_20996);
        float f3 = (float)(d3 - this.field_20997);
        float f4 = (float)(d4 - this.field_20995);
        float f5 = (float)(d5 - this.field_20996);
        float f6 = (float)(d6 - this.field_20997);
        return this.field_40823.intersectAab(f, f2, f3, f4, f5, f6);
    }

    public double method_62344() {
        return this.field_20996;
    }

    public void method_23088(double d, double d2, double d3) {
        this.field_20995 = d;
        this.field_20996 = d2;
        this.field_20997 = d3;
    }

    public double method_62343() {
        return this.field_20995;
    }

    public Viewport sodium$createViewport() {
        return new Viewport((Frustum)new SimpleFrustum(this.field_40823), new Vector3d(this.field_20995, this.field_20996, this.field_20997));
    }

    public boolean method_23093(class00734 class007342) {
        int n = this.method_23089(class007342.N, class007342.y, class007342.L, class007342.u, class007342.i, class007342.R);
        return n == -2 || n == -1;
    }

    public boolean method_74404(double d, double d2, double d3) {
        return this.field_40823.testPoint((float)(d - this.field_20995), (float)(d2 - this.field_20996), (float)(d3 - this.field_20997));
    }
}

