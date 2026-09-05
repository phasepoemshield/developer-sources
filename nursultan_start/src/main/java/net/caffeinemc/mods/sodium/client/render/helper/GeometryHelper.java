/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07185
 *  minecraft.class07211
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.helper;

import minecraft.class04995;
import minecraft.class07185;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.render.model.QuadViewImpl;
import org.joml.Vector3fc;

public abstract class GeometryHelper {
    public static final int FLAG_BIT_COUNT = 3;

    private GeometryHelper() {
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

    public static class07211 lightFace(ModelQuadView modelQuadView) {
        float f = NormI8.unpackX((int)modelQuadView.getFaceNormal());
        float f2 = NormI8.unpackY((int)modelQuadView.getFaceNormal());
        float f3 = NormI8.unpackZ((int)modelQuadView.getFaceNormal());
        return switch (GeometryHelper.longestAxis(f, f2, f3)) {
            case class07185.field_11048 -> {
                if (f > 0.0f) {
                    yield class07211.field_11034;
                }
                yield class07211.field_11039;
            }
            case class07185.field_11052 -> {
                if (f2 > 0.0f) {
                    yield class07211.field_11036;
                }
                yield class07211.field_11033;
            }
            case class07185.field_11051 -> {
                if (f3 > 0.0f) {
                    yield class07211.field_11035;
                }
                yield class07211.field_11043;
            }
            default -> class07211.field_11036;
        };
    }

    public static boolean isQuadParallelToFace(class07211 class072112, QuadViewImpl quadViewImpl) {
        int n = class072112.z().ordinal();
        float f = quadViewImpl.posByIndex(0, n);
        return class04995.y((float)f, (float)quadViewImpl.posByIndex(1, n)) && class04995.y((float)f, (float)quadViewImpl.posByIndex(2, n)) && class04995.y((float)f, (float)quadViewImpl.posByIndex(3, n));
    }
}

