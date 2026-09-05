/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01404
 *  minecraft.class01414
 *  minecraft.class02054
 *  minecraft.class04673
 *  minecraft.class07211
 *  minecraft.class08388
 *  minecraft.class08510
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadTransform
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  net.fabricmc.fabric.api.renderer.v1.model.ModelBakeSettingsHelper$1
 *  net.fabricmc.fabric.api.renderer.v1.model.ModelBakeSettingsHelper$2
 *  net.fabricmc.fabric.api.renderer.v1.model.ModelBakeSettingsHelper$3
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package net.fabricmc.fabric.api.renderer.v1.model;

import java.util.EnumMap;
import java.util.Map;
import minecraft.class01404;
import minecraft.class01414;
import minecraft.class02054;
import minecraft.class04673;
import minecraft.class07211;
import minecraft.class08388;
import minecraft.class08510;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadTransform;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.api.renderer.v1.model.ModelBakeSettingsHelper;
import net.fabricmc.fabric.api.renderer.v1.model.ModelBakeSettingsHelper$4;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;
import net.fabricmc.fabric.api.renderer.v1.sprite.SpriteFinderGetter;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector4f;

@Environment(value=EnvType.CLIENT)
public final class ModelBakeSettingsHelper {
    private static final class07211[] DIRECTIONS = class07211.values();

    private ModelBakeSettingsHelper() {
    }

    public static class04673 of(class01404 class014042, boolean bl) {
        Matrix4fc matrix4fc = class014042.L();
        if (class02054.N((Matrix4fc)matrix4fc)) {
            return class08510.N;
        }
        if (!bl) {
            return new 1(class014042);
        }
        EnumMap<class07211, Matrix4fc> enumMap = new EnumMap<class07211, Matrix4fc>(class07211.class);
        EnumMap<class07211, Matrix4f> enumMap2 = new EnumMap<class07211, Matrix4f>(class07211.class);
        for (class07211 class072112 : DIRECTIONS) {
            Matrix4fc matrix4fc2 = class01414.N((class01404)class014042, (class07211)class072112).L();
            enumMap.put(class072112, matrix4fc2);
            enumMap2.put(class072112, matrix4fc2.invert(new Matrix4f()));
        }
        return new 2(class014042, enumMap, enumMap2);
    }

    public static class04673 multiply(class04673 class046732, class04673 class046733) {
        Object object;
        if (class02054.N((Matrix4fc)class046732.method_3509().L())) {
            return class046733;
        }
        if (class02054.N((Matrix4fc)class046733.method_3509().L())) {
            return class046732;
        }
        class01404 class014042 = class046732.method_3509().N(class046733.method_3509());
        boolean bl = false;
        boolean bl2 = false;
        for (class07211 class072112 : DIRECTIONS) {
            if (!bl && !class02054.N((Matrix4fc)class046732.method_68011(class072112))) {
                bl = true;
            }
            if (bl2 || class02054.N((Matrix4fc)class046733.method_68011(class072112))) continue;
            bl2 = true;
        }
        if (bl & bl2) {
            object = new EnumMap(class07211.class);
            EnumMap<class07211, Matrix4f> enumMap = new EnumMap<class07211, Matrix4f>(class07211.class);
            for (class07211 class072113 : DIRECTIONS) {
                object.put(class072113, class046732.method_68011(class072113).mul(class046733.method_68011(class072113), new Matrix4f()));
                enumMap.put(class072113, class046733.method_68012(class072113).mul(class046732.method_68012(class072113), new Matrix4f()));
            }
            return new 3(class014042, (Map)object, enumMap);
        }
        object = bl ? class046732 : class046733;
        return new ModelBakeSettingsHelper$4(class014042, (class04673)object);
    }

    private static float getFrameFromV(class08388 class083882, float f) {
        float f2 = class083882.method_4575() - class083882.method_4593();
        return (f - class083882.method_4593()) / f2;
    }

    public static QuadTransform asQuadTransform(class04673 class046732, SpriteFinderGetter spriteFinderGetter) {
        Matrix4fc matrix4fc = class046732.method_3509().L();
        if (class02054.N((Matrix4fc)matrix4fc)) {
            return mutableQuadView -> true;
        }
        Matrix3f matrix3f = matrix4fc.normal(new Matrix3f());
        Vector4f vector4f = new Vector4f();
        Vector3f vector3f = new Vector3f();
        return mutableQuadView -> {
            class07211 class072112 = mutableQuadView.lightFace();
            Matrix4fc matrix4fc2 = class046732.method_68012(class072112);
            if (!class02054.N((Matrix4fc)matrix4fc2)) {
                SpriteFinder spriteFinder = spriteFinderGetter.spriteFinder(mutableQuadView.atlas());
                class08388 class083882 = spriteFinder.find((QuadView)mutableQuadView);
                for (int i = 0; i < 4; ++i) {
                    float f = ModelBakeSettingsHelper.getFrameFromU(class083882, mutableQuadView.u(i));
                    float f2 = ModelBakeSettingsHelper.getFrameFromV(class083882, mutableQuadView.v(i));
                    vector3f.set(f - 0.5f, f2 - 0.5f, 0.0f);
                    matrix4fc2.transformPosition(vector3f);
                    f = vector3f.x + 0.5f;
                    f2 = vector3f.y + 0.5f;
                    mutableQuadView.uv(i, class083882.method_4580(f), class083882.method_4570(f2));
                }
            }
            for (int i = 0; i < 4; ++i) {
                vector4f.set(mutableQuadView.x(i) - 0.5f, mutableQuadView.y(i) - 0.5f, mutableQuadView.z(i) - 0.5f, 1.0f);
                vector4f.mul(matrix4fc);
                mutableQuadView.pos(i, vector4f.x + 0.5f, vector4f.y + 0.5f, vector4f.z + 0.5f);
                if (!mutableQuadView.hasNormal(i)) continue;
                mutableQuadView.copyNormal(i, vector3f);
                vector3f.mul((Matrix3fc)matrix3f);
                vector3f.normalize();
                mutableQuadView.normal(i, vector3f);
            }
            class07211 class072113 = mutableQuadView.cullFace();
            if (class072113 != null) {
                mutableQuadView.cullFace(class07211.N((Matrix4fc)matrix4fc, (class07211)class072113));
            }
            return true;
        };
    }

    private static float getFrameFromU(class08388 class083882, float f) {
        float f2 = class083882.method_4577() - class083882.method_4594();
        return (f - class083882.method_4594()) / f2;
    }
}

