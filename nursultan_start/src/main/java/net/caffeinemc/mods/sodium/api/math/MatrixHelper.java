/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01423
 *  minecraft.class07211
 *  org.joml.Math
 *  org.joml.Matrix3f
 *  org.joml.Matrix4fc
 */
package net.caffeinemc.mods.sodium.api.math;

import minecraft.class01423;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import org.joml.Math;
import org.joml.Matrix3f;
import org.joml.Matrix4fc;

public class MatrixHelper {
    public static void rotateZYX(class01423 class014232, float f, float f2, float f3) {
        class014232.N().rotateZYX(f, f2, f3);
        class014232.y().rotateZYX(f, f2, f3);
    }

    public static int transformSafeNormal(Matrix3f matrix3f, float f, float f2, float f3) {
        float f4 = MatrixHelper.transformNormalX(matrix3f, f, f2, f3);
        float f5 = MatrixHelper.transformNormalY(matrix3f, f, f2, f3);
        float f6 = MatrixHelper.transformNormalZ(matrix3f, f, f2, f3);
        return NormI8.pack(f4, f5, f6);
    }

    public static float transformNormalX(Matrix3f matrix3f, float f, float f2, float f3) {
        return matrix3f.m00() * f + (matrix3f.m10() * f2 + matrix3f.m20() * f3);
    }

    public static float transformNormalZ(Matrix3f matrix3f, float f, float f2, float f3) {
        return matrix3f.m02() * f + (matrix3f.m12() * f2 + matrix3f.m22() * f3);
    }

    public static float transformNormalY(Matrix3f matrix3f, float f, float f2, float f3) {
        return matrix3f.m01() * f + (matrix3f.m11() * f2 + matrix3f.m21() * f3);
    }

    public static float transformPositionY(Matrix4fc matrix4fc, float f, float f2, float f3) {
        return matrix4fc.m01() * f + (matrix4fc.m11() * f2 + (matrix4fc.m21() * f3 + matrix4fc.m31()));
    }

    public static float transformPositionX(Matrix4fc matrix4fc, float f, float f2, float f3) {
        return matrix4fc.m00() * f + (matrix4fc.m10() * f2 + (matrix4fc.m20() * f3 + matrix4fc.m30()));
    }

    public static float transformPositionZ(Matrix4fc matrix4fc, float f, float f2, float f3) {
        return matrix4fc.m02() * f + (matrix4fc.m12() * f2 + (matrix4fc.m22() * f3 + matrix4fc.m32()));
    }

    public static int transformNormal(Matrix3f matrix3f, boolean bl, int n) {
        float f = NormI8.unpackX(n);
        float f2 = NormI8.unpackY(n);
        float f3 = NormI8.unpackZ(n);
        return MatrixHelper.transformNormal(matrix3f, bl, f, f2, f3);
    }

    public static int transformNormal(Matrix3f matrix3f, boolean bl, float f, float f2, float f3) {
        float f4 = MatrixHelper.transformNormalX(matrix3f, f, f2, f3);
        float f5 = MatrixHelper.transformNormalY(matrix3f, f, f2, f3);
        float f6 = MatrixHelper.transformNormalZ(matrix3f, f, f2, f3);
        if (!bl) {
            float f7 = Math.invsqrt((float)Math.fma((float)f4, (float)f4, (float)Math.fma((float)f5, (float)f5, (float)(f6 * f6))));
            f4 *= f7;
            f5 *= f7;
            f6 *= f7;
        }
        return NormI8.pack(f4, f5, f6);
    }

    public static int transformNormal(Matrix3f matrix3f, boolean bl, class07211 class072112) {
        float f;
        float f2;
        float f3;
        if (class072112 == class07211.field_11033) {
            f3 = -matrix3f.m10;
            f2 = -matrix3f.m11;
            f = -matrix3f.m12;
        } else if (class072112 == class07211.field_11036) {
            f3 = matrix3f.m10;
            f2 = matrix3f.m11;
            f = matrix3f.m12;
        } else if (class072112 == class07211.field_11043) {
            f3 = -matrix3f.m20;
            f2 = -matrix3f.m21;
            f = -matrix3f.m22;
        } else if (class072112 == class07211.field_11035) {
            f3 = matrix3f.m20;
            f2 = matrix3f.m21;
            f = matrix3f.m22;
        } else if (class072112 == class07211.field_11039) {
            f3 = -matrix3f.m00;
            f2 = -matrix3f.m01;
            f = -matrix3f.m02;
        } else if (class072112 == class07211.field_11034) {
            f3 = matrix3f.m00;
            f2 = matrix3f.m01;
            f = matrix3f.m02;
        } else {
            throw new IllegalArgumentException("An incorrect direction enum was provided..");
        }
        if (!bl) {
            float f4 = Math.invsqrt((float)Math.fma((float)f3, (float)f3, (float)Math.fma((float)f2, (float)f2, (float)(f * f))));
            f3 *= f4;
            f2 *= f4;
            f *= f4;
        }
        return NormI8.pack(f3, f2, f);
    }
}

