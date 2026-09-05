/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class04995
 *  minecraft.class07211
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  org.joml.Vector3f
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.helper;

import minecraft.class00753;
import minecraft.class04995;
import minecraft.class07211;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.impl.client.indigo.renderer.helper.GeometryHelper;
import org.joml.Vector3f;

@Environment(value=EnvType.CLIENT)
public final class NormalHelper {
    private static final float PACK = 127.0f;
    private static final float UNPACK = 0.007874016f;

    private NormalHelper() {
    }

    public static int packNormal(Vector3f vector3f) {
        return NormalHelper.packNormal(vector3f.x(), vector3f.y(), vector3f.z());
    }

    public static int packNormal(float f, float f2, float f3) {
        f = class04995.N((float)f, (float)-1.0f, (float)1.0f);
        f2 = class04995.N((float)f2, (float)-1.0f, (float)1.0f);
        f3 = class04995.N((float)f3, (float)-1.0f, (float)1.0f);
        return (int)(f * 127.0f) & 0xFF | ((int)(f2 * 127.0f) & 0xFF) << 8 | ((int)(f3 * 127.0f) & 0xFF) << 16;
    }

    public static int packNormal(Vector3f vector3f, float f) {
        return NormalHelper.packNormal(vector3f.x(), vector3f.y(), vector3f.z(), f);
    }

    public static int packNormal(float f, float f2, float f3, float f4) {
        f = class04995.N((float)f, (float)-1.0f, (float)1.0f);
        f2 = class04995.N((float)f2, (float)-1.0f, (float)1.0f);
        f3 = class04995.N((float)f3, (float)-1.0f, (float)1.0f);
        f4 = class04995.N((float)f4, (float)-1.0f, (float)1.0f);
        return (int)(f * 127.0f) & 0xFF | ((int)(f2 * 127.0f) & 0xFF) << 8 | ((int)(f3 * 127.0f) & 0xFF) << 16 | ((int)(f4 * 127.0f) & 0xFF) << 24;
    }

    public static float unpackNormalZ(int n) {
        return (float)((byte)(n >>> 16 & 0xFF)) * 0.007874016f;
    }

    public static float unpackNormalX(int n) {
        return (float)((byte)(n & 0xFF)) * 0.007874016f;
    }

    public static float unpackNormalW(int n) {
        return (float)((byte)(n >>> 24 & 0xFF)) * 0.007874016f;
    }

    public static void unpackNormal(int n, Vector3f vector3f) {
        vector3f.set(NormalHelper.unpackNormalX(n), NormalHelper.unpackNormalY(n), NormalHelper.unpackNormalZ(n));
    }

    public static float unpackNormalY(int n) {
        return (float)((byte)(n >>> 8 & 0xFF)) * 0.007874016f;
    }

    public static void computeFaceNormal(Vector3f vector3f, QuadView quadView) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        class07211 class072112 = quadView.nominalFace();
        if (class072112 != null && GeometryHelper.isQuadParallelToFace(class072112, quadView)) {
            class00753 class007532 = class072112.E();
            vector3f.set((float)class007532.method_10263(), (float)class007532.method_10264(), (float)class007532.method_10260());
            return;
        }
        float f7 = quadView.x(0);
        float f8 = quadView.y(0);
        float f9 = quadView.z(0);
        float f10 = quadView.x(1);
        float f11 = quadView.y(1);
        float f12 = quadView.z(1);
        float f13 = quadView.x(2);
        float f14 = quadView.y(2);
        float f15 = quadView.z(2);
        float f16 = quadView.x(3);
        float f17 = quadView.y(3);
        float f18 = f14 - f8;
        float f19 = quadView.z(3);
        float f20 = f19 - f12;
        float f21 = f18 * f20 - (f6 = f15 - f9) * (f5 = f17 - f11);
        float f22 = (float)Math.sqrt(f21 * f21 + (f4 = f6 * (f3 = f16 - f10) - (f2 = f13 - f7) * f20) * f4 + (f = f2 * f5 - f18 * f3) * f);
        if (f22 != 0.0f) {
            f21 /= f22;
            f4 /= f22;
            f /= f22;
        }
        vector3f.set(f21, f4, f);
    }
}

