/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02022
 *  minecraft.class02566
 *  minecraft.class03042
 *  minecraft.class04809
 *  net.caffeinemc.mods.sodium.api.math.MatrixHelper
 *  org.joml.Math
 *  org.joml.Matrix3f
 *  org.joml.Matrix3x2fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector2f
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import minecraft.class01423;
import minecraft.class02022;
import minecraft.class02566;
import minecraft.class03042;
import minecraft.class04809;
import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import org.joml.Math;
import org.joml.Matrix3f;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public interface class01391 {
    default public class01391 y(class01423 class014232, Vector3f vector3f) {
        return this.y(class014232, vector3f.x(), vector3f.y(), vector3f.z());
    }

    default public class01391 y(class01423 class014232, float f, float f2, float f3) {
        Matrix3f matrix3f = class014232.y();
        float f4 = MatrixHelper.transformNormalX((Matrix3f)matrix3f, (float)f, (float)f2, (float)f3);
        float f5 = MatrixHelper.transformNormalY((Matrix3f)matrix3f, (float)f, (float)f2, (float)f3);
        float f6 = MatrixHelper.transformNormalZ((Matrix3f)matrix3f, (float)f, (float)f2, (float)f3);
        if (!class014232.N) {
            float f7 = Math.invsqrt((float)Math.fma((float)f4, (float)f4, (float)Math.fma((float)f5, (float)f5, (float)(f6 * f6))));
            f4 *= f7;
            f5 *= f7;
            f6 *= f7;
        }
        return this.method_22914(f4, f5, f6);
    }

    default public void N(float f, float f2, float f3, int n, float f4, float f5, int n2, int n3, float f6, float f7, float f8) {
        this.method_22912(f, f2, f3);
        this.method_39415(n);
        this.method_22913(f4, f5);
        this.method_22922(n2);
        this.method_60803(n3);
        this.method_22914(f6, f7, f8);
    }

    default public class01391 N(class01423 class014232, Vector3f vector3f) {
        return this.N(class014232, vector3f.x(), vector3f.y(), vector3f.z());
    }

    default public class01391 N_26(Vector3fc vector3fc) {
        return this.method_22912(vector3fc.x(), vector3fc.y(), vector3fc.z());
    }

    default public void N(class01423 class014232, class02022 class020222, float[] fArray, float f, float f2, float f3, float f4, int[] nArray, int n) {
        Vector3fc vector3fc = class020222.U().m();
        Matrix4f matrix4f = class014232.N();
        Vector3f vector3f = class014232.N(vector3fc, new Vector3f());
        int n2 = class020222.m();
        for (int i = 0; i < 4; ++i) {
            Vector3fc vector3fc2 = class020222.N(i);
            long l = class020222.y(i);
            float f5 = fArray[i];
            int n3 = class02566.N((float)f4, (float)(f5 * f), (float)(f5 * f2), (float)(f5 * f3));
            int n4 = class03042.y((int)nArray[i], (int)n2);
            Vector3f vector3f2 = matrix4f.transformPosition(vector3fc2, new Vector3f());
            float f6 = class04809.N((long)l);
            float f7 = class04809.y((long)l);
            this.N(vector3f2.x(), vector3f2.y(), vector3f2.z(), n3, f6, f7, n, n4, vector3f.x(), vector3f.y(), vector3f.z());
        }
    }

    default public void N(class01423 class014232, class02022 class020222, float f, float f2, float f3, float f4, int n, int n2) {
        this.N(class014232, class020222, new float[]{1.0f, 1.0f, 1.0f, 1.0f}, f, f2, f3, f4, new int[]{n, n, n, n}, n2);
    }

    default public class01391 N(Matrix4fc matrix4fc, float f, float f2, float f3) {
        float f4 = MatrixHelper.transformPositionX((Matrix4fc)matrix4fc, (float)f, (float)f2, (float)f3);
        float f5 = MatrixHelper.transformPositionY((Matrix4fc)matrix4fc, (float)f, (float)f2, (float)f3);
        float f6 = MatrixHelper.transformPositionZ((Matrix4fc)matrix4fc, (float)f, (float)f2, (float)f3);
        return this.method_22912(f4, f5, f6);
    }

    default public class01391 N(Matrix3x2fc matrix3x2fc, float f, float f2) {
        Vector2f vector2f = matrix3x2fc.transformPosition(f, f2, new Vector2f());
        return this.method_22912(vector2f.x(), vector2f.y(), 0.0f);
    }

    default public class01391 N(class01423 class014232, float f, float f2, float f3) {
        return this.N((Matrix4fc)class014232.N(), f, f2, f3);
    }

    public class01391 method_1336(int var1, int var2, int var3, int var4);

    default public class01391 method_22915(float f, float f2, float f3, float f4) {
        return this.method_1336((int)(f * 255.0f), (int)(f2 * 255.0f), (int)(f3 * 255.0f), (int)(f4 * 255.0f));
    }

    default public class01391 method_22922(int n) {
        return this.method_60796(n & 0xFFFF, n >> 16 & 0xFFFF);
    }

    default public class01391 method_60803(int n) {
        return this.method_22921(n & 0xFFFF, n >> 16 & 0xFFFF);
    }

    public class01391 method_22913(float var1, float var2);

    public class01391 method_22912(float var1, float var2, float var3);

    public class01391 method_39415(int var1);

    public class01391 method_22914(float var1, float var2, float var3);

    public class01391 method_60796(int var1, int var2);

    public class01391 method_22921(int var1, int var2);

    public class01391 method_75298(float var1);
}

