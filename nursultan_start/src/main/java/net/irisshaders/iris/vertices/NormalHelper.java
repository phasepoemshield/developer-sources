/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.vertices;

import net.irisshaders.iris.vertices.NormI8;
import net.irisshaders.iris.vertices.views.QuadView;
import net.irisshaders.iris.vertices.views.TriView;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;

public abstract class NormalHelper {
    private static final float EPS = 1.0E-20f;

    private NormalHelper() {
    }

    public static int computeTangentSmooth(float f, float f2, float f3, TriView triView) {
        float f4;
        float f5;
        float f6 = triView.x(0);
        float f7 = triView.y(0);
        float f8 = triView.z(0);
        float f9 = triView.x(1);
        float f10 = triView.y(1);
        float f11 = triView.z(1);
        float f12 = triView.x(2);
        float f13 = triView.y(2);
        float f14 = triView.z(2);
        float f15 = f6 * f + f7 * f2 + f8 * f3;
        float f16 = f9 * f + f10 * f2 + f11 * f3;
        float f17 = f12 * f + f13 * f2 + f14 * f3;
        f6 -= f15 * f;
        f7 -= f15 * f2;
        f8 -= f15 * f3;
        f9 -= f16 * f;
        f10 -= f16 * f2;
        f11 -= f16 * f3;
        f12 -= f17 * f;
        f13 -= f17 * f2;
        f14 -= f17 * f3;
        float f18 = f9 - f6;
        float f19 = f10 - f7;
        float f20 = f11 - f8;
        float f21 = f12 - f6;
        float f22 = f13 - f7;
        float f23 = f14 - f8;
        float f24 = triView.u(0);
        float f25 = triView.v(0);
        float f26 = triView.u(1);
        float f27 = triView.v(1);
        float f28 = triView.u(2);
        float f29 = f26 - f24;
        float f30 = triView.v(2);
        float f31 = f30 - f25;
        float f32 = f29 * f31 - (f5 = f28 - f24) * (f4 = f27 - f25);
        float f33 = (double)f32 == 0.0 ? 1.0f : 1.0f / f32;
        float f34 = f33 * (f31 * f18 - f4 * f21);
        float f35 = f33 * (f31 * f19 - f4 * f22);
        float f36 = f33 * (f31 * f20 - f4 * f23);
        float f37 = NormalHelper.rsqrt(f34 * f34 + f35 * f35 + f36 * f36);
        f34 *= f37;
        f35 *= f37;
        float f38 = f33 * (-f5 * f18 + f29 * f21);
        float f39 = f33 * (-f5 * f19 + f29 * f22);
        float f40 = f33 * (-f5 * f20 + f29 * f23);
        float f41 = NormalHelper.rsqrt(f38 * f38 + f39 * f39 + f40 * f40);
        float f42 = f35 * f3 - (f36 *= f37) * f2;
        float f43 = f36 * f - f34 * f3;
        float f44 = f34 * f2 - f35 * f;
        float f45 = (f38 *= f41) * f42 + (f39 *= f41) * f43 + (f40 *= f41) * f44;
        float f46 = f45 < 0.0f ? -1.0f : 1.0f;
        return NormI8.pack(f34, f35, f36, f46);
    }

    public static int computeTangent(Vector4f vector4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25 = f9 - f4;
        float f26 = f10 - f5;
        float f27 = f11 - f6;
        float f28 = f14 - f4;
        float f29 = f15 - f5;
        float f30 = f16 - f6;
        float f31 = f12 - f7;
        float f32 = f18 - f8;
        float f33 = f17 - f7;
        float f34 = f13 - f8;
        float f35 = f31 * f32 - f33 * f34;
        float f36 = (double)f35 == 0.0 ? 1.0f : 1.0f / f35;
        float f37 = f36 * (f32 * f25 - f34 * f28);
        float f38 = f36 * (f32 * f26 - f34 * f29);
        float f39 = f36 * (f32 * f27 - f34 * f30);
        if ((f37 *= (f24 = NormalHelper.rsqrt(f37 * f37 + f38 * f38 + f39 * f39))) == 0.0f && (f38 *= f24) == 0.0f && (f39 *= f24) == 0.0f) {
            return -1;
        }
        float f40 = f36 * (-f33 * f25 + f31 * f28);
        float f41 = f36 * (-f33 * f26 + f31 * f29);
        float f42 = f36 * (-f33 * f27 + f31 * f30);
        float f43 = (f23 = (f40 *= (f22 = NormalHelper.rsqrt(f40 * f40 + f41 * f41 + f42 * f42))) * (f21 = f38 * f3 - f39 * f2) + (f41 *= f22) * (f20 = f39 * f - f37 * f3) + (f42 *= f22) * (f19 = f37 * f2 - f38 * f)) < 0.0f ? -1.0f : 1.0f;
        if (vector4f != null) {
            vector4f.set(f37, f38, f39, f43);
        }
        return NormI8.pack(f37, f38, f39, f43);
    }

    public static int computeTangent(float f, float f2, float f3, TriView triView) {
        float f4;
        float f5;
        float f6 = triView.x(0);
        float f7 = triView.y(0);
        float f8 = triView.z(0);
        float f9 = triView.x(1);
        float f10 = triView.y(1);
        float f11 = triView.z(1);
        float f12 = triView.x(2);
        float f13 = triView.y(2);
        float f14 = triView.z(2);
        float f15 = f9 - f6;
        float f16 = f10 - f7;
        float f17 = f11 - f8;
        float f18 = f12 - f6;
        float f19 = f13 - f7;
        float f20 = f14 - f8;
        float f21 = triView.u(0);
        float f22 = triView.v(0);
        float f23 = triView.u(1);
        float f24 = triView.v(1);
        float f25 = triView.u(2);
        float f26 = f23 - f21;
        float f27 = triView.v(2);
        float f28 = f27 - f22;
        float f29 = f26 * f28 - (f5 = f25 - f21) * (f4 = f24 - f22);
        float f30 = (double)f29 == 0.0 ? 1.0f : 1.0f / f29;
        float f31 = f30 * (f28 * f15 - f4 * f18);
        float f32 = f30 * (f28 * f16 - f4 * f19);
        float f33 = f30 * (f28 * f17 - f4 * f20);
        float f34 = NormalHelper.rsqrt(f31 * f31 + f32 * f32 + f33 * f33);
        f31 *= f34;
        f32 *= f34;
        float f35 = f30 * (-f5 * f15 + f26 * f18);
        float f36 = f30 * (-f5 * f16 + f26 * f19);
        float f37 = f30 * (-f5 * f17 + f26 * f20);
        float f38 = NormalHelper.rsqrt(f35 * f35 + f36 * f36 + f37 * f37);
        float f39 = f32 * f3 - (f33 *= f34) * f2;
        float f40 = f33 * f - f31 * f3;
        float f41 = f31 * f2 - f32 * f;
        float f42 = (f35 *= f38) * f39 + (f36 *= f38) * f40 + (f37 *= f38) * f41;
        float f43 = f42 < 0.0f ? -1.0f : 1.0f;
        return NormI8.pack(f31, f32, f33, f43);
    }

    public static int computeTangent(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return NormalHelper.computeTangent(null, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    public static void computeFaceNormalManual(Vector3f vector3f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        float f13 = f7 - f;
        float f14 = f8 - f2;
        float f15 = f9 - f3;
        float f16 = f10 - f4;
        float f17 = f11 - f5;
        float f18 = f12 - f6;
        float f19 = f14 * f18 - f15 * f17;
        float f20 = f15 * f16 - f13 * f18;
        float f21 = f13 * f17 - f14 * f16;
        vector3f.set(f19, f20, f21);
        vector3f.normalize();
    }

    public static void computeFaceNormalFlipped(Vector3f vector3f, QuadView quadView) {
        float f = quadView.x(3);
        float f2 = quadView.y(3);
        float f3 = quadView.z(3);
        float f4 = quadView.x(2);
        float f5 = quadView.y(2);
        float f6 = quadView.z(2);
        float f7 = quadView.x(1);
        float f8 = quadView.y(1);
        float f9 = quadView.z(1);
        float f10 = quadView.x(0);
        float f11 = quadView.y(0);
        float f12 = quadView.z(0);
        NormalHelper.computeFaceNormalManual(vector3f, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12);
    }

    public static void computeFaceNormalTri(Vector3f vector3f, TriView triView) {
        float f = triView.x(0);
        float f2 = triView.y(0);
        float f3 = triView.z(0);
        float f4 = triView.x(1);
        float f5 = triView.y(1);
        float f6 = triView.z(1);
        float f7 = triView.x(2);
        float f8 = triView.y(2);
        float f9 = triView.z(2);
        NormalHelper.computeFaceNormalManual(vector3f, f, f2, f3, f4, f5, f6, f7, f8, f9, f, f2, f3);
    }

    public static int encodeNormalTangent(Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3, Vector3f vector3f4, Vector3f vector3f5) {
        int n = NormalHelper.encodeNormal(vector3f.x, vector3f.y, vector3f.z);
        int n2 = NormalHelper.packDiamondByte((Vector3fc)vector3f, (Vector3fc)vector3f2, vector3f3, vector3f4, vector3f5);
        return n2 << 24 | n;
    }

    private static void onbFromUnitNormal(float f, float f2, float f3, Vector3f vector3f, Vector3f vector3f2) {
        float f4 = f3 >= 0.0f ? 1.0f : -1.0f;
        float f5 = -1.0f / (f4 + f3);
        float f6 = f * f2 * f5;
        vector3f.set(1.0f + f4 * f * f * f5, f4 * f6, -f4 * f).normalize();
        vector3f2.set(f2 * vector3f.z - f3 * vector3f.y, f3 * vector3f.x - f * vector3f.z, f * vector3f.y - f2 * vector3f.x);
    }

    public static int packDiamondByte(Vector3fc vector3fc, Vector3fc vector3fc2, Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3) {
        vector3f2.set(vector3fc).normalize();
        float f = vector3f2.x;
        float f2 = vector3f2.y;
        float f3 = vector3f2.z;
        NormalHelper.onbFromUnitNormal(f, f2, f3, vector3f, vector3f2);
        float f4 = f * vector3fc2.x() + f2 * vector3fc2.y() + f3 * vector3fc2.z();
        vector3f3.set(vector3fc2).sub(f * f4, f2 * f4, f3 * f4);
        if (vector3f3.lengthSquared() > 1.0E-20f) {
            vector3f3.normalize();
        } else {
            vector3f3.set((Vector3fc)vector3f);
        }
        float f5 = vector3f3.dot((Vector3fc)vector3f);
        float f6 = vector3f3.dot((Vector3fc)vector3f2);
        float f7 = NormalHelper.encodeDiamond(f5, f6);
        int n = Math.min(256, Math.max(0, Math.round(f7 * 256.0f)));
        return n & 0xFF;
    }

    public static int invertPackedNormal(int n) {
        int n2 = -(n & 0xFF);
        int n3 = -(n >> 8 & 0xFF);
        int n4 = -(n >> 16 & 0xFF);
        return n & 0xFF000000 | (n4 &= 0xFF) << 16 | (n3 &= 0xFF) << 8 | (n2 &= 0xFF);
    }

    private static float encodeDiamond(float f, float f2) {
        float f3 = Math.abs(f) + Math.abs(f2);
        if (f3 <= 1.0E-20f) {
            return 0.5f;
        }
        float f4 = f / f3;
        float f5 = f2 >= 0.0f ? 1.0f : -1.0f;
        return -f5 * 0.25f * f4 + 0.5f + f5 * 0.25f;
    }

    public static int encodeNormal(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6 = 1.0f / (Math.abs(f) + Math.abs(f2) + Math.abs(f3));
        float f7 = f * f6;
        float f8 = f2 * f6;
        if (f3 > 0.0f) {
            f5 = f7;
            f4 = f8;
        } else {
            f5 = (1.0f - Math.abs(f8)) * NormalHelper.signNotZero(f7);
            f4 = (1.0f - Math.abs(f7)) * NormalHelper.signNotZero(f8);
        }
        int n = NormalHelper.snorm12(f5);
        int n2 = NormalHelper.snorm12(f4);
        return (n & 0xFFF) << 12 | n2 & 0xFFF;
    }

    private static float signNotZero(float f) {
        return f >= 0.0f ? 1.0f : -1.0f;
    }

    public static void computeFaceNormal(Vector3f vector3f, QuadView quadView) {
        float f = quadView.x(0);
        float f2 = quadView.y(0);
        float f3 = quadView.z(0);
        float f4 = quadView.x(1);
        float f5 = quadView.y(1);
        float f6 = quadView.z(1);
        float f7 = quadView.x(2);
        float f8 = quadView.y(2);
        float f9 = quadView.z(2);
        float f10 = quadView.x(3);
        float f11 = quadView.y(3);
        float f12 = quadView.z(3);
        NormalHelper.computeFaceNormalManual(vector3f, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12);
    }

    private static float rsqrt(float f) {
        if (f == 0.0f) {
            return 1.0f;
        }
        return (float)(1.0 / Math.sqrt(f));
    }

    private static int snorm12(float f) {
        float f2 = Math.max(-1.0f, Math.min(1.0f, f));
        int n = Math.round(f2 * 2047.0f);
        if (n == -2048) {
            n = -2047;
        }
        return n;
    }
}

