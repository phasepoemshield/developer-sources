/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  minecraft.class08388
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView
 */
package net.fabricmc.fabric.impl.renderer;

import minecraft.class07211;
import minecraft.class08388;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView;
import net.fabricmc.fabric.impl.renderer.QuadSpriteBaker$VertexModifier;

@Environment(value=EnvType.CLIENT)
public final class QuadSpriteBaker {
    private static final float NORMALIZER = 0.0625f;
    private static final QuadSpriteBaker$VertexModifier[] ROTATIONS = new QuadSpriteBaker$VertexModifier[]{null, (mutableQuadView, n) -> mutableQuadView.uv(n, mutableQuadView.v(n), 1.0f - mutableQuadView.u(n)), (mutableQuadView, n) -> mutableQuadView.uv(n, 1.0f - mutableQuadView.u(n), 1.0f - mutableQuadView.v(n)), (mutableQuadView, n) -> mutableQuadView.uv(n, 1.0f - mutableQuadView.v(n), mutableQuadView.u(n))};
    private static final QuadSpriteBaker$VertexModifier[] UVLOCKERS = new QuadSpriteBaker$VertexModifier[6];

    private QuadSpriteBaker() {
    }

    static {
        QuadSpriteBaker.UVLOCKERS[class07211.field_11033.L()] = (mutableQuadView, n) -> mutableQuadView.uv(n, mutableQuadView.x(n), 1.0f - mutableQuadView.z(n));
        QuadSpriteBaker.UVLOCKERS[class07211.field_11036.L()] = (mutableQuadView, n) -> mutableQuadView.uv(n, mutableQuadView.x(n), mutableQuadView.z(n));
        QuadSpriteBaker.UVLOCKERS[class07211.field_11043.L()] = (mutableQuadView, n) -> mutableQuadView.uv(n, 1.0f - mutableQuadView.x(n), 1.0f - mutableQuadView.y(n));
        QuadSpriteBaker.UVLOCKERS[class07211.field_11035.L()] = (mutableQuadView, n) -> mutableQuadView.uv(n, mutableQuadView.x(n), 1.0f - mutableQuadView.y(n));
        QuadSpriteBaker.UVLOCKERS[class07211.field_11039.L()] = (mutableQuadView, n) -> mutableQuadView.uv(n, mutableQuadView.z(n), 1.0f - mutableQuadView.y(n));
        QuadSpriteBaker.UVLOCKERS[class07211.field_11034.L()] = (mutableQuadView, n) -> mutableQuadView.uv(n, 1.0f - mutableQuadView.z(n), 1.0f - mutableQuadView.y(n));
    }

    private static void interpolate(MutableQuadView mutableQuadView, class08388 class083882) {
        float f = class083882.method_4594();
        float f2 = class083882.method_4577() - f;
        float f3 = class083882.method_4593();
        float f4 = class083882.method_4575() - f3;
        for (int i = 0; i < 4; ++i) {
            mutableQuadView.uv(i, f + mutableQuadView.u(i) * f2, f3 + mutableQuadView.v(i) * f4);
        }
    }

    private static void applyModifier(MutableQuadView mutableQuadView, QuadSpriteBaker$VertexModifier quadSpriteBaker$VertexModifier) {
        for (int i = 0; i < 4; ++i) {
            quadSpriteBaker$VertexModifier.apply(mutableQuadView, i);
        }
    }

    public static void bakeSprite(MutableQuadView mutableQuadView2, class08388 class083882, int n2) {
        if (mutableQuadView2.nominalFace() != null && (4 & n2) != 0) {
            QuadSpriteBaker.applyModifier(mutableQuadView2, UVLOCKERS[mutableQuadView2.nominalFace().L()]);
        } else if ((0x20 & n2) == 0) {
            QuadSpriteBaker.applyModifier(mutableQuadView2, (mutableQuadView, n) -> mutableQuadView.uv(n, mutableQuadView.u(n) * 0.0625f, mutableQuadView.v(n) * 0.0625f));
        }
        int n3 = n2 & 3;
        if (n3 != 0) {
            QuadSpriteBaker.applyModifier(mutableQuadView2, ROTATIONS[n3]);
        }
        if ((8 & n2) != 0) {
            QuadSpriteBaker.applyModifier(mutableQuadView2, (mutableQuadView, n) -> mutableQuadView.uv(n, 1.0f - mutableQuadView.u(n), mutableQuadView.v(n)));
        }
        if ((0x10 & n2) != 0) {
            QuadSpriteBaker.applyModifier(mutableQuadView2, (mutableQuadView, n) -> mutableQuadView.uv(n, mutableQuadView.u(n), 1.0f - mutableQuadView.v(n)));
        }
        QuadSpriteBaker.interpolate(mutableQuadView2, class083882);
    }
}

