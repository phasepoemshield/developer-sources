/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03585
 *  org.apache.commons.lang3.tuple.Triple
 *  org.joml.Math
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
package minecraft;

import minecraft.class03585;
import org.apache.commons.lang3.tuple.Triple;
import org.joml.Math;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class class02054 {
    private static final float N = 3.0f + 2.0f * Math.sqrt((float)2.0f);
    private static final class03585 y = class03585.N((float)0.7853982f);

    public static boolean L(Matrix4fc matrix4fc) {
        return class02054.N(matrix4fc, 16);
    }

    private class02054() {
    }

    public static boolean y(Matrix4fc matrix4fc) {
        return class02054.N(matrix4fc, 8);
    }

    private static boolean y(Matrix4fc matrix4fc, int n) {
        return (matrix4fc.properties() & n) != 0;
    }

    public static boolean N(Matrix4fc matrix4fc, int n) {
        if (class02054.y(matrix4fc, n)) {
            return true;
        }
        if (matrix4fc instanceof Matrix4f) {
            ((Matrix4f)matrix4fc).determineProperties();
            return class02054.y(matrix4fc, n);
        }
        return false;
    }

    public static boolean N(Matrix4fc matrix4fc) {
        return class02054.N(matrix4fc, 4);
    }

    public static Triple<Quaternionf, Vector3f, Quaternionf> N(Matrix3f matrix3f) {
        Matrix3f matrix3f2 = new Matrix3f((Matrix3fc)matrix3f);
        matrix3f2.transpose();
        matrix3f2.mul((Matrix3fc)matrix3f);
        Quaternionf quaternionf = class02054.N(matrix3f2, 5);
        float f = matrix3f2.m00;
        float f2 = matrix3f2.m11;
        boolean bl = (double)f < 1.0E-6;
        boolean bl2 = (double)f2 < 1.0E-6;
        Matrix3f matrix3f3 = matrix3f2;
        Matrix3f matrix3f4 = matrix3f.rotate((Quaternionfc)quaternionf);
        Quaternionf quaternionf2 = new Quaternionf();
        Quaternionf quaternionf3 = new Quaternionf();
        class03585 class035852 = bl ? class02054.N(matrix3f4.m11, -matrix3f4.m10) : class02054.N(matrix3f4.m00, matrix3f4.m01);
        Quaternionf quaternionf4 = class035852.L(quaternionf3);
        Matrix3f matrix3f5 = class035852.L(matrix3f3);
        quaternionf2.mul((Quaternionfc)quaternionf4);
        matrix3f5.transpose().mul((Matrix3fc)matrix3f4);
        matrix3f3 = matrix3f4;
        class035852 = bl ? class02054.N(matrix3f5.m22, -matrix3f5.m20) : class02054.N(matrix3f5.m00, matrix3f5.m02);
        class035852 = class035852.N();
        Quaternionf quaternionf5 = class035852.y(quaternionf3);
        Matrix3f matrix3f6 = class035852.y(matrix3f3);
        quaternionf2.mul((Quaternionfc)quaternionf5);
        matrix3f6.transpose().mul((Matrix3fc)matrix3f5);
        matrix3f3 = matrix3f5;
        class035852 = bl2 ? class02054.N(matrix3f6.m22, -matrix3f6.m21) : class02054.N(matrix3f6.m11, matrix3f6.m12);
        Quaternionf quaternionf6 = class035852.N(quaternionf3);
        Matrix3f matrix3f7 = class035852.N(matrix3f3);
        quaternionf2.mul((Quaternionfc)quaternionf6);
        matrix3f7.transpose().mul((Matrix3fc)matrix3f6);
        Vector3f vector3f = new Vector3f(matrix3f7.m00, matrix3f7.m11, matrix3f7.m22);
        return Triple.of((Object)quaternionf2, (Object)vector3f, (Object)quaternionf.conjugate());
    }

    public static Matrix4f N(Matrix4f matrix4f, float f) {
        return matrix4f.set(matrix4f.m00() * f, matrix4f.m01() * f, matrix4f.m02() * f, matrix4f.m03() * f, matrix4f.m10() * f, matrix4f.m11() * f, matrix4f.m12() * f, matrix4f.m13() * f, matrix4f.m20() * f, matrix4f.m21() * f, matrix4f.m22() * f, matrix4f.m23() * f, matrix4f.m30() * f, matrix4f.m31() * f, matrix4f.m32() * f, matrix4f.m33() * f);
    }

    private static void N(Matrix3f matrix3f, Matrix3f matrix3f2) {
        matrix3f.mul((Matrix3fc)matrix3f2);
        matrix3f2.transpose();
        matrix3f2.mul((Matrix3fc)matrix3f);
        matrix3f.set((Matrix3fc)matrix3f2);
    }

    private static void N(Matrix3f matrix3f, Matrix3f matrix3f2, Quaternionf quaternionf, Quaternionf quaternionf2) {
        Quaternionf quaternionf3;
        class03585 class035852;
        if (matrix3f.m01 * matrix3f.m01 + matrix3f.m10 * matrix3f.m10 > 1.0E-6f) {
            class035852 = class02054.N(matrix3f.m00, 0.5f * (matrix3f.m01 + matrix3f.m10), matrix3f.m11);
            quaternionf3 = class035852.L(quaternionf);
            quaternionf2.mul((Quaternionfc)quaternionf3);
            class035852.L(matrix3f2);
            class02054.N(matrix3f, matrix3f2);
        }
        if (matrix3f.m02 * matrix3f.m02 + matrix3f.m20 * matrix3f.m20 > 1.0E-6f) {
            class035852 = class02054.N(matrix3f.m00, 0.5f * (matrix3f.m02 + matrix3f.m20), matrix3f.m22).N();
            quaternionf3 = class035852.y(quaternionf);
            quaternionf2.mul((Quaternionfc)quaternionf3);
            class035852.y(matrix3f2);
            class02054.N(matrix3f, matrix3f2);
        }
        if (matrix3f.m12 * matrix3f.m12 + matrix3f.m21 * matrix3f.m21 > 1.0E-6f) {
            class035852 = class02054.N(matrix3f.m11, 0.5f * (matrix3f.m12 + matrix3f.m21), matrix3f.m22);
            quaternionf3 = class035852.N(quaternionf);
            quaternionf2.mul((Quaternionfc)quaternionf3);
            class035852.N(matrix3f2);
            class02054.N(matrix3f, matrix3f2);
        }
    }

    public static Quaternionf N(Matrix3f matrix3f, int n) {
        Quaternionf quaternionf = new Quaternionf();
        Matrix3f matrix3f2 = new Matrix3f();
        Quaternionf quaternionf2 = new Quaternionf();
        for (int i = 0; i < n; ++i) {
            class02054.N(matrix3f, matrix3f2, quaternionf2, quaternionf);
        }
        quaternionf.normalize();
        return quaternionf;
    }

    private static class03585 N(float f, float f2, float f3) {
        float f4 = f2;
        float f5 = 2.0f * (f - f3);
        if (N * f4 * f4 < f5 * f5) {
            return class03585.N((float)f4, (float)f5);
        }
        return y;
    }

    private static class03585 N(float f, float f2) {
        float f3 = (float)java.lang.Math.hypot(f, f2);
        float f4 = f3 > 1.0E-6f ? f2 : 0.0f;
        float f5 = Math.abs((float)f) + Math.max((float)f3, (float)1.0E-6f);
        if (f < 0.0f) {
            float f6 = f4;
            f4 = f5;
            f5 = f6;
        }
        return class03585.N((float)f4, (float)f5);
    }
}

