/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  minecraft.class08388
 */
package net.caffeinemc.mods.sodium.client.render.helper;

import minecraft.class07211;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.client.render.helper.TextureHelper$VertexModifier;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;

public class TextureHelper {
    private static final float NORMALIZER = 0.0625f;
    public static final int BAKE_ROTATE_NONE = 0;
    public static final int BAKE_ROTATE_90 = 1;
    public static final int BAKE_ROTATE_180 = 2;
    public static final int BAKE_ROTATE_270 = 3;
    public static final int BAKE_LOCK_UV = 4;
    public static final int BAKE_FLIP_U = 8;
    public static final int BAKE_FLIP_V = 16;
    public static final int BAKE_NORMALIZED = 32;
    private static final TextureHelper$VertexModifier[] ROTATIONS = new TextureHelper$VertexModifier[]{null, (mutableQuadViewImpl, n) -> mutableQuadViewImpl.setUV(n, mutableQuadViewImpl.getTexV(n), 1.0f - mutableQuadViewImpl.getTexU(n)), (mutableQuadViewImpl, n) -> mutableQuadViewImpl.setUV(n, 1.0f - mutableQuadViewImpl.getTexU(n), 1.0f - mutableQuadViewImpl.getTexV(n)), (mutableQuadViewImpl, n) -> mutableQuadViewImpl.setUV(n, 1.0f - mutableQuadViewImpl.getTexV(n), mutableQuadViewImpl.getTexU(n))};
    private static final TextureHelper$VertexModifier[] UVLOCKERS = new TextureHelper$VertexModifier[6];

    private TextureHelper() {
    }

    static {
        TextureHelper.UVLOCKERS[class07211.field_11034.L()] = (mutableQuadViewImpl, n) -> mutableQuadViewImpl.setUV(n, 1.0f - mutableQuadViewImpl.getZ(n), 1.0f - mutableQuadViewImpl.getY(n));
        TextureHelper.UVLOCKERS[class07211.field_11039.L()] = (mutableQuadViewImpl, n) -> mutableQuadViewImpl.setUV(n, mutableQuadViewImpl.getZ(n), 1.0f - mutableQuadViewImpl.getY(n));
        TextureHelper.UVLOCKERS[class07211.field_11043.L()] = (mutableQuadViewImpl, n) -> mutableQuadViewImpl.setUV(n, 1.0f - mutableQuadViewImpl.getX(n), 1.0f - mutableQuadViewImpl.getY(n));
        TextureHelper.UVLOCKERS[class07211.field_11035.L()] = (mutableQuadViewImpl, n) -> mutableQuadViewImpl.setUV(n, mutableQuadViewImpl.getX(n), 1.0f - mutableQuadViewImpl.getY(n));
        TextureHelper.UVLOCKERS[class07211.field_11033.L()] = (mutableQuadViewImpl, n) -> mutableQuadViewImpl.setUV(n, mutableQuadViewImpl.getX(n), 1.0f - mutableQuadViewImpl.getZ(n));
        TextureHelper.UVLOCKERS[class07211.field_11036.L()] = (mutableQuadViewImpl, n) -> mutableQuadViewImpl.setUV(n, mutableQuadViewImpl.getX(n), mutableQuadViewImpl.getZ(n));
    }

    private static void interpolate(MutableQuadViewImpl mutableQuadViewImpl, class08388 class083882) {
        float f = class083882.method_4594();
        float f2 = class083882.method_4577() - f;
        float f3 = class083882.method_4593();
        float f4 = class083882.method_4575() - f3;
        for (int i = 0; i < 4; ++i) {
            mutableQuadViewImpl.setUV(i, f + mutableQuadViewImpl.getTexU(i) * f2, f3 + mutableQuadViewImpl.getTexV(i) * f4);
        }
    }

    private static void applyModifier(MutableQuadViewImpl mutableQuadViewImpl, TextureHelper$VertexModifier textureHelper$VertexModifier) {
        for (int i = 0; i < 4; ++i) {
            textureHelper$VertexModifier.apply(mutableQuadViewImpl, i);
        }
    }

    public static void bakeSprite(MutableQuadViewImpl mutableQuadViewImpl2, class08388 class083882, int n2) {
        if (mutableQuadViewImpl2.getNominalFace() != null && (4 & n2) != 0) {
            TextureHelper.applyModifier(mutableQuadViewImpl2, UVLOCKERS[mutableQuadViewImpl2.getNominalFace().L()]);
        } else if ((0x20 & n2) == 0) {
            TextureHelper.applyModifier(mutableQuadViewImpl2, (mutableQuadViewImpl, n) -> mutableQuadViewImpl.setUV(n, mutableQuadViewImpl.getTexU(n) * 0.0625f, mutableQuadViewImpl.getTexV(n) * 0.0625f));
        }
        int n3 = n2 & 3;
        if (n3 != 0) {
            TextureHelper.applyModifier(mutableQuadViewImpl2, ROTATIONS[n3]);
        }
        if ((8 & n2) != 0) {
            TextureHelper.applyModifier(mutableQuadViewImpl2, (mutableQuadViewImpl, n) -> mutableQuadViewImpl.setUV(n, 1.0f - mutableQuadViewImpl.getTexU(n), mutableQuadViewImpl.getTexV(n)));
        }
        if ((0x10 & n2) != 0) {
            TextureHelper.applyModifier(mutableQuadViewImpl2, (mutableQuadViewImpl, n) -> mutableQuadViewImpl.setUV(n, mutableQuadViewImpl.getTexU(n), 1.0f - mutableQuadViewImpl.getTexV(n)));
        }
        TextureHelper.interpolate(mutableQuadViewImpl2, class083882);
    }
}

