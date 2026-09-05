/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07185
 *  minecraft.class07211
 *  minecraft.class07212
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  org.joml.Vector3fc
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.helper;

import minecraft.class04995;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class07212;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import org.joml.Vector3fc;

@Environment(value=EnvType.CLIENT)
public final class GeometryHelper {
    public static final int CUBIC_FLAG = 1;
    public static final int AXIS_ALIGNED_FLAG = 2;
    public static final int LIGHT_FACE_FLAG = 4;
    public static final int FLAG_BIT_COUNT = 3;
    private static final float EPS_MIN = 1.0E-4f;
    private static final float EPS_MAX = 0.9999f;

    private GeometryHelper() {
    }

    public static boolean isParallelQuadOnFace(class07211 class072112, QuadView quadView) {
        float f = quadView.posByIndex(0, class072112.z().ordinal());
        return class072112.i() == class07212.field_11056 ? f >= 0.9999f : f <= 1.0E-4f;
    }

    private static boolean confirmSquareCorners(int n, int n2, QuadView quadView) {
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            float f = quadView.posByIndex(i, n);
            float f2 = quadView.posByIndex(i, n2);
            if (f <= 1.0E-4f) {
                if (f2 <= 1.0E-4f) {
                    n3 |= 1;
                    continue;
                }
                if (f2 >= 0.9999f) {
                    n3 |= 2;
                    continue;
                }
                return false;
            }
            if (f >= 0.9999f) {
                if (f2 <= 1.0E-4f) {
                    n3 |= 4;
                    continue;
                }
                if (f2 >= 0.9999f) {
                    n3 |= 8;
                    continue;
                }
                return false;
            }
            return false;
        }
        return n3 == 15;
    }

    public static class07185 longestAxis(Vector3fc vector3fc) {
        return GeometryHelper.longestAxis(vector3fc.x(), vector3fc.y(), vector3fc.z());
    }

    public static class07185 longestAxis(float f, float f2, float f3) {
        class07185 class071852 = class07185.field_11052;
        float f4 = Math.abs(f2);
        float f5 = Math.abs(f);
        if (f5 > f4) {
            class071852 = class07185.field_11048;
            f4 = f5;
        }
        return Math.abs(f3) > f4 ? class07185.field_11051 : class071852;
    }

    public static class07211 lightFace(QuadView quadView) {
        Vector3fc vector3fc = quadView.faceNormal();
        switch (GeometryHelper.longestAxis(vector3fc)) {
            case field_11048: {
                return vector3fc.x() > 0.0f ? class07211.field_11034 : class07211.field_11039;
            }
            case field_11052: {
                return vector3fc.y() > 0.0f ? class07211.field_11036 : class07211.field_11033;
            }
            case field_11051: {
                return vector3fc.z() > 0.0f ? class07211.field_11035 : class07211.field_11043;
            }
        }
        return class07211.field_11036;
    }

    public static int firstCubicVertex(QuadView quadView) {
        boolean bl;
        boolean bl2;
        float f = quadView.x(0);
        float f2 = quadView.y(0);
        float f3 = quadView.z(0);
        switch (quadView.lightFace()) {
            case field_11033: {
                bl2 = f > 1.0E-4f;
                bl = f3 < 0.9999f;
                break;
            }
            case field_11036: {
                bl2 = f > 1.0E-4f;
                bl = f3 > 1.0E-4f;
                break;
            }
            case field_11043: {
                bl2 = f < 0.9999f;
                bl = f2 < 0.9999f;
                break;
            }
            case field_11035: {
                bl2 = f > 1.0E-4f;
                bl = f2 < 0.9999f;
                break;
            }
            case field_11039: {
                bl2 = f3 > 1.0E-4f;
                bl = f2 < 0.9999f;
                break;
            }
            case field_11034: {
                bl2 = f3 < 0.9999f;
                bl = f2 < 0.9999f;
                break;
            }
            default: {
                return 0;
            }
        }
        int n = 0;
        if (bl2) {
            n ^= 1;
        }
        if (bl) {
            n ^= 3;
        }
        return n;
    }

    public static int computeShapeFlags(QuadView quadView) {
        class07211 class072112 = quadView.lightFace();
        int n = 0;
        if (GeometryHelper.isQuadParallelToFace(class072112, quadView)) {
            n |= 2;
            if (GeometryHelper.isParallelQuadOnFace(class072112, quadView)) {
                n |= 4;
            }
        }
        if (GeometryHelper.isQuadCubic(class072112, quadView)) {
            n |= 1;
        }
        return n;
    }

    public static boolean isQuadCubic(class07211 class072112, QuadView quadView) {
        int n;
        int n2;
        switch (class072112) {
            case field_11034: 
            case field_11039: {
                n2 = 1;
                n = 2;
                break;
            }
            case field_11036: 
            case field_11033: {
                n2 = 0;
                n = 2;
                break;
            }
            case field_11035: 
            case field_11043: {
                n2 = 1;
                n = 0;
                break;
            }
            default: {
                return false;
            }
        }
        return GeometryHelper.confirmSquareCorners(n2, n, quadView);
    }

    public static boolean isQuadParallelToFace(class07211 class072112, QuadView quadView) {
        int n = class072112.z().ordinal();
        float f = quadView.posByIndex(0, n);
        return class04995.y((float)f, (float)quadView.posByIndex(1, n)) && class04995.y((float)f, (float)quadView.posByIndex(2, n)) && class04995.y((float)f, (float)quadView.posByIndex(3, n));
    }
}

