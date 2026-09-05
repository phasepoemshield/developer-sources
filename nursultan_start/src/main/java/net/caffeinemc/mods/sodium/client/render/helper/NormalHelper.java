/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class07211
 *  org.joml.Vector3f
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.render.helper;

import minecraft.class00753;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.client.render.helper.GeometryHelper;
import net.caffeinemc.mods.sodium.client.render.model.QuadViewImpl;
import org.joml.Vector3f;
import org.jspecify.annotations.NonNull;

public abstract class NormalHelper {
    private NormalHelper() {
    }

    public static void computeFaceNormal(@NonNull Vector3f vector3f, QuadViewImpl quadViewImpl) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        class07211 class072112 = quadViewImpl.getNominalFace();
        if (class072112 != null && GeometryHelper.isQuadParallelToFace(class072112, quadViewImpl)) {
            class00753 class007532 = class072112.E();
            vector3f.set((float)class007532.method_10263(), (float)class007532.method_10264(), (float)class007532.method_10260());
            return;
        }
        float f7 = quadViewImpl.getX(0);
        float f8 = quadViewImpl.getY(0);
        float f9 = quadViewImpl.getZ(0);
        float f10 = quadViewImpl.getX(1);
        float f11 = quadViewImpl.getY(1);
        float f12 = quadViewImpl.getZ(1);
        float f13 = quadViewImpl.getX(2);
        float f14 = quadViewImpl.getY(2);
        float f15 = quadViewImpl.getZ(2);
        float f16 = quadViewImpl.getX(3);
        float f17 = quadViewImpl.getY(3);
        float f18 = f14 - f8;
        float f19 = quadViewImpl.getZ(3);
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

