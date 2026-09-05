/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01587
 *  minecraft.class01833
 *  minecraft.class02584
 *  minecraft.class05885
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  minecraft.class08743
 *  minecraft.class08887
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.api.util.ColorMixer
 *  net.caffeinemc.mods.sodium.client.model.light.LightMode
 *  net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider
 *  net.caffeinemc.mods.sodium.client.model.light.data.LightDataAccess
 *  net.caffeinemc.mods.sodium.client.model.light.data.SingleBlockLightDataCache
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 */
package net.caffeinemc.mods.sodium.client.render.frapi.render;

import minecraft.class00500;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01587;
import minecraft.class01833;
import minecraft.class02584;
import minecraft.class05885;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import minecraft.class08743;
import minecraft.class08887;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.util.ColorMixer;
import net.caffeinemc.mods.sodium.client.model.light.LightMode;
import net.caffeinemc.mods.sodium.client.model.light.LightPipelineProvider;
import net.caffeinemc.mods.sodium.client.model.light.data.LightDataAccess;
import net.caffeinemc.mods.sodium.client.model.light.data.SingleBlockLightDataCache;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.ExtendedMutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.QuadEncoder;
import net.caffeinemc.mods.sodium.client.render.model.SodiumShadeMode;
import net.caffeinemc.mods.sodium.client.render.texture.SpriteFinderCache;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class NonTerrainBlockRenderContext
extends AbstractBlockRenderContext {
    public static final ThreadLocal<NonTerrainBlockRenderContext> POOL = ThreadLocal.withInitial(NonTerrainBlockRenderContext::new);
    private class01587 colorMap;
    private final SingleBlockLightDataCache lightDataCache = new SingleBlockLightDataCache();
    private BlockVertexConsumerProvider vertexConsumer;
    private Matrix4f matPosition;
    private boolean trustedNormals;
    private Matrix3f matNormal;
    private int overlay;

    public NonTerrainBlockRenderContext() {
        this.lighters = new LightPipelineProvider((LightDataAccess)this.lightDataCache);
        this.random = new class01833(42L);
    }

    @Override
    public void processQuad(MutableQuadViewImpl mutableQuadViewImpl) {
        class02584 class025842 = mutableQuadViewImpl.ambientOcclusion();
        SodiumShadeMode sodiumShadeMode = mutableQuadViewImpl.getShadeMode();
        LightMode lightMode = class025842 == class02584.field_52396 ? this.defaultLightMode : (this.useAmbientOcclusion && class025842 != class02584.field_52395 ? LightMode.SMOOTH : LightMode.FLAT);
        boolean bl = mutableQuadViewImpl.emissive();
        class01391 class013912 = this.getVertexConsumer(mutableQuadViewImpl.getRenderType());
        this.tintQuad(mutableQuadViewImpl);
        this.shadeQuad(mutableQuadViewImpl, lightMode, bl, sodiumShadeMode);
        this.bufferQuad(mutableQuadViewImpl, class013912);
    }

    private class01391 getVertexConsumer(class08743 class087432) {
        return this.vertexConsumer.getBuffer(class087432 == null ? this.defaultRenderType : class087432);
    }

    private void tintQuad(MutableQuadViewImpl mutableQuadViewImpl) {
        if (mutableQuadViewImpl.getTintIndex() != -1) {
            int n = 0xFF000000 | this.colorMap.N(this.state, this.level, this.pos, mutableQuadViewImpl.getTintIndex());
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.setColor(i, ColorMixer.mulComponentWise((int)n, (int)mutableQuadViewImpl.baseColor(i)));
            }
        }
    }

    @Override
    public void shadeQuad(MutableQuadViewImpl mutableQuadViewImpl, LightMode lightMode, boolean bl, SodiumShadeMode sodiumShadeMode) {
        super.shadeQuad(mutableQuadViewImpl, lightMode, bl, sodiumShadeMode);
        float[] fArray = this.quadLightData.br;
        for (int i = 0; i < 4; ++i) {
            mutableQuadViewImpl.setColor(i, ColorARGB.mulRGB((int)mutableQuadViewImpl.baseColor(i), (float)fArray[i]));
        }
    }

    private void bufferQuad(MutableQuadViewImpl mutableQuadViewImpl, class01391 class013912) {
        QuadEncoder.writeQuadVertices(mutableQuadViewImpl, class013912, this.overlay, this.matPosition, this.trustedNormals, this.matNormal);
        class08388 class083882 = mutableQuadViewImpl.sprite(SpriteFinderCache.forBlockAtlas());
        if (class083882 != null) {
            SpriteUtil.INSTANCE.markSpriteActive(class083882);
        }
    }

    public void renderModel(class07295 class072952, class01587 class015872, class08887 class088872, class00500 class005002, class07209 class072092, class01421 class014212, BlockVertexConsumerProvider blockVertexConsumerProvider, boolean bl, long l, int n) {
        this.level = class072952;
        this.state = class005002;
        this.pos = class072092;
        this.colorMap = class015872;
        this.vertexConsumer = blockVertexConsumerProvider;
        this.matPosition = class014212.L().N();
        this.trustedNormals = class014212.L().N;
        this.matNormal = class014212.L().y();
        this.overlay = n;
        this.defaultRenderType = class05885.N((class00500)class005002);
        this.lightDataCache.reset(class072092, class072952);
        this.prepareCulling(bl);
        this.random.N(l);
        class088872.emitQuads((QuadEmitter)((ExtendedMutableQuadViewImpl)this.getForEmitting()).getWrapper(), class072952, class072092, class005002, this.random, this::isFaceCulled);
        this.defaultRenderType = null;
        this.level = null;
        this.lightDataCache.release();
        this.vertexConsumer = null;
    }
}

