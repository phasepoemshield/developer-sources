/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01391
 *  minecraft.class01423
 *  minecraft.class02566
 *  minecraft.class04995
 *  minecraft.class05885
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08743
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider
 *  net.fabricmc.fabric.impl.client.indigo.renderer.helper.ColorHelper
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.render;

import minecraft.class00500;
import minecraft.class01391;
import minecraft.class01423;
import minecraft.class02566;
import minecraft.class04995;
import minecraft.class05885;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08743;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider;
import net.fabricmc.fabric.impl.client.indigo.renderer.helper.ColorHelper;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableQuadViewImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.AbstractRenderContext;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class SimpleBlockRenderContext
extends AbstractRenderContext {
    public static final ThreadLocal<SimpleBlockRenderContext> POOL = ThreadLocal.withInitial(SimpleBlockRenderContext::new);
    private final class06069 random = class06069.R();
    private BlockVertexConsumerProvider vertexConsumers;
    private class08743 defaultRenderLayer;
    private float red;
    private float green;
    private float blue;
    private int light;
    private @Nullable class08743 lastRenderLayer;
    private @Nullable class01391 lastVertexConsumer;

    private void tintQuad(MutableQuadViewImpl mutableQuadViewImpl) {
        if (mutableQuadViewImpl.tintIndex() != -1) {
            float f = this.red;
            float f2 = this.green;
            float f3 = this.blue;
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.color(i, class02566.N((int)mutableQuadViewImpl.color(i), (float)f, (float)f2, (float)f3));
            }
        }
    }

    private void shadeQuad(MutableQuadViewImpl mutableQuadViewImpl, boolean bl) {
        if (bl) {
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.lightmap(i, 0xF000F0);
            }
        } else {
            int n = this.light;
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.lightmap(i, ColorHelper.maxLight((int)mutableQuadViewImpl.lightmap(i), (int)n));
            }
        }
    }

    @Override
    protected void bufferQuad(MutableQuadViewImpl mutableQuadViewImpl) {
        class01391 class013912;
        class08743 class087432;
        class08743 class087433 = mutableQuadViewImpl.renderLayer();
        class08743 class087434 = class087432 = class087433 == null ? this.defaultRenderLayer : class087433;
        if (class087432 == this.lastRenderLayer) {
            class013912 = this.lastVertexConsumer;
        } else {
            this.lastVertexConsumer = class013912 = this.vertexConsumers.getBuffer(class087432);
            this.lastRenderLayer = class087432;
        }
        this.tintQuad(mutableQuadViewImpl);
        this.shadeQuad(mutableQuadViewImpl, mutableQuadViewImpl.emissive());
        this.bufferQuad(mutableQuadViewImpl, class013912);
    }

    public void bufferModel(class01423 class014232, BlockVertexConsumerProvider blockVertexConsumerProvider, class08887 class088872, float f, float f2, float f3, int n, int n2, class07295 class072952, class07209 class072092, class00500 class005002) {
        this.matrices = class014232;
        this.overlay = n2;
        this.vertexConsumers = blockVertexConsumerProvider;
        this.defaultRenderLayer = class05885.N((class00500)class005002);
        this.red = class04995.N((float)f, (float)0.0f, (float)1.0f);
        this.green = class04995.N((float)f2, (float)0.0f, (float)1.0f);
        this.blue = class04995.N((float)f3, (float)0.0f, (float)1.0f);
        this.light = n;
        this.random.N(42L);
        class088872.emitQuads(this.getEmitter(), class072952, class072092, class005002, this.random, class072112 -> false);
        this.matrices = null;
        this.vertexConsumers = null;
        this.lastRenderLayer = null;
        this.lastVertexConsumer = null;
    }
}

