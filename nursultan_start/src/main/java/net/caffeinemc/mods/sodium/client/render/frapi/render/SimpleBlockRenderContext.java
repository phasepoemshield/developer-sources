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
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.frapi.render;

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
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.ExtendedMutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.helper.ColorHelper;
import net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.QuadEncoder;
import net.caffeinemc.mods.sodium.client.render.texture.SpriteFinderCache;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider;
import org.jspecify.annotations.Nullable;

public class SimpleBlockRenderContext
extends AbstractBlockRenderContext {
    public static final ThreadLocal<SimpleBlockRenderContext> POOL = ThreadLocal.withInitial(SimpleBlockRenderContext::new);
    private final class06069 random = class06069.R();
    private BlockVertexConsumerProvider vertexConsumers;
    private float red;
    private float green;
    private float blue;
    private int light;
    private @Nullable class08743 lastRenderLayer;
    private @Nullable class01391 lastVertexConsumer;
    private class01423 matrices;
    private int overlay;

    @Override
    public void processQuad(MutableQuadViewImpl mutableQuadViewImpl) {
        class01391 class013912;
        class08743 class087432;
        class08743 class087433 = mutableQuadViewImpl.getRenderType();
        class08743 class087434 = class087432 = class087433 == null ? this.defaultRenderType : class087433;
        if (class087432 == this.lastRenderLayer) {
            class013912 = this.lastVertexConsumer;
        } else {
            this.lastVertexConsumer = class013912 = this.vertexConsumers.getBuffer(class087432);
            this.lastRenderLayer = class087432;
        }
        if (mutableQuadViewImpl.getTintIndex() != -1) {
            float f = this.red;
            float f2 = this.green;
            float f3 = this.blue;
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.setColor(i, class02566.N((int)mutableQuadViewImpl.baseColor(i), (float)f, (float)f2, (float)f3));
            }
        }
        if (mutableQuadViewImpl.emissive()) {
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.setLight(i, 0xF000F0);
            }
        } else {
            int n = this.light;
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.setLight(i, ColorHelper.maxBrightness(mutableQuadViewImpl.getLight(i), n));
            }
        }
        QuadEncoder.writeQuadVertices(mutableQuadViewImpl, class013912, this.overlay, this.matrices.N(), this.matrices.N, this.matrices.y());
        SpriteUtil.INSTANCE.markSpriteActive(mutableQuadViewImpl.sprite(SpriteFinderCache.forBlockAtlas()));
    }

    public void bufferModel(class01423 class014232, BlockVertexConsumerProvider blockVertexConsumerProvider, class08887 class088872, float f, float f2, float f3, int n, int n2, class07295 class072952, class07209 class072092, class00500 class005002) {
        this.matrices = class014232;
        this.overlay = n2;
        this.prepareAoInfo(true);
        this.vertexConsumers = blockVertexConsumerProvider;
        this.defaultRenderType = class05885.N((class00500)class005002);
        this.red = class04995.N((float)f, (float)0.0f, (float)1.0f);
        this.green = class04995.N((float)f2, (float)0.0f, (float)1.0f);
        this.blue = class04995.N((float)f3, (float)0.0f, (float)1.0f);
        this.light = n;
        this.level = class072952;
        this.state = class005002;
        this.pos = class072092;
        this.random.N(42L);
        class088872.emitQuads((QuadEmitter)((ExtendedMutableQuadViewImpl)this.getForEmitting()).getWrapper(), class072952, class072092, class005002, this.random, class072112 -> false);
        this.level = null;
        this.state = null;
        this.pos = null;
        this.vertexConsumers = null;
        this.lastRenderLayer = null;
        this.lastVertexConsumer = null;
    }
}

