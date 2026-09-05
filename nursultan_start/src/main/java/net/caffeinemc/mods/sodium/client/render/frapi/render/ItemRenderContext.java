/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01833
 *  minecraft.class02022
 *  minecraft.class02054
 *  minecraft.class02862
 *  minecraft.class03662
 *  minecraft.class05911
 *  minecraft.class06069
 *  minecraft.class07311
 *  minecraft.class08388
 *  minecraft.class08743
 *  minecraft.class08915
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  net.caffeinemc.mods.sodium.api.util.ColorMixer
 *  net.caffeinemc.mods.sodium.mixin.frapi.ItemRendererAccessor
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MeshView
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.frapi.render;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01833;
import minecraft.class02022;
import minecraft.class02054;
import minecraft.class02862;
import minecraft.class03662;
import minecraft.class05911;
import minecraft.class06069;
import minecraft.class07311;
import minecraft.class08388;
import minecraft.class08743;
import minecraft.class08915;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.api.util.ColorMixer;
import net.caffeinemc.mods.sodium.client.render.frapi.render.ItemRenderContext$ItemEmitter;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.ExtendedMutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.MutableQuadViewWrapper;
import net.caffeinemc.mods.sodium.client.render.helper.ColorHelper;
import net.caffeinemc.mods.sodium.client.render.model.AbstractRenderContext;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.QuadEncoder;
import net.caffeinemc.mods.sodium.client.render.model.SodiumQuadAtlas;
import net.caffeinemc.mods.sodium.client.render.texture.SpriteFinderCache;
import net.caffeinemc.mods.sodium.mixin.frapi.ItemRendererAccessor;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.jspecify.annotations.Nullable;

public class ItemRenderContext
extends AbstractRenderContext {
    private static final long ITEM_RANDOM_SEED = 42L;
    private static final int GLINT_COUNT = class08915.values().length;
    private @Nullable ItemRenderTypeGetter renderTypeGetter;
    private final MutableQuadViewImpl editorQuad = new ItemRenderContext$ItemEmitter(this);
    private final class06069 random = new class01833(42L);
    private final Supplier<class06069> randomSupplier = () -> {
        this.random.N(42L);
        return this.random;
    };
    private class03662 transformMode;
    private class01421 poseStack;
    private Matrix4f matPosition;
    private boolean trustedNormals;
    private Matrix3f matNormal;
    private class01407 bufferSource;
    private int lightmap;
    private int overlay;
    private int[] colors;
    private boolean ignoreQuadGlint;
    private class07311 defaultLayer;
    private class08915 defaultGlint;
    private class01423 specialGlintEntry;
    private final class01391[] vertexConsumerCache = new class01391[3 * GLINT_COUNT];

    public void renderItem(class03662 class036622, class01421 class014212, class01407 class014072, int n, int n2, int[] nArray, List<class02022> list, MeshView meshView, class07311 class073112, class08915 class089152, @Nullable ItemRenderTypeGetter itemRenderTypeGetter, boolean bl) {
        this.transformMode = class036622;
        this.matPosition = class014212.L().N();
        this.poseStack = class014212;
        this.trustedNormals = this.poseStack.L().N;
        this.matNormal = this.poseStack.L().y();
        this.bufferSource = class014072;
        this.lightmap = n;
        this.overlay = n2;
        this.colors = nArray;
        this.ignoreQuadGlint = bl;
        this.renderTypeGetter = itemRenderTypeGetter;
        this.defaultLayer = class073112;
        this.defaultGlint = class089152;
        this.bufferQuads(list, meshView);
        this.poseStack = null;
        this.bufferSource = null;
        this.colors = null;
        this.renderTypeGetter = null;
        this.specialGlintEntry = null;
        Arrays.fill(this.vertexConsumerCache, null);
    }

    @Override
    public MutableQuadViewImpl getForEmitting() {
        this.editorQuad.clear();
        return this.editorQuad;
    }

    private void bufferQuads(List<class02022> list, MeshView meshView) {
        MutableQuadViewWrapper mutableQuadViewWrapper = ((ExtendedMutableQuadViewImpl)this.getForEmitting()).getWrapper();
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            class02022 class020222 = list.get(i);
            mutableQuadViewWrapper.fromBakedQuad(class020222);
            mutableQuadViewWrapper.emit();
        }
        meshView.outputTo((QuadEmitter)mutableQuadViewWrapper);
    }

    private class01391 getVertexConsumer(SodiumQuadAtlas sodiumQuadAtlas, @Nullable class08743 class087432, @Nullable class08915 class089152) {
        class07311 class073112;
        if (this.renderTypeGetter != null) {
            class073112 = this.renderTypeGetter.renderType(sodiumQuadAtlas == SodiumQuadAtlas.BLOCK ? QuadAtlas.BLOCK : QuadAtlas.ITEM, class087432);
            if (class073112 == null) {
                class073112 = this.defaultLayer;
            }
        } else {
            class073112 = this.defaultLayer;
        }
        class08915 class089153 = this.ignoreQuadGlint || class089152 == null ? this.defaultGlint : class089152;
        if (class073112 == class05911.z()) {
            var6_6 = 0;
        } else if (class073112 == class05911.Z()) {
            var6_6 = GLINT_COUNT;
        } else if (class073112 == class05911.U()) {
            var6_6 = 2 * GLINT_COUNT;
        } else {
            return this.createVertexConsumer(class073112, class089153);
        }
        class01391 class013912 = this.vertexConsumerCache[var6_6 += class089153.ordinal()];
        if (class013912 == null) {
            this.vertexConsumerCache[var6_6] = class013912 = this.createVertexConsumer(class073112, class089153);
        }
        return class013912;
    }

    private void tintQuad(MutableQuadViewImpl mutableQuadViewImpl) {
        int n = mutableQuadViewImpl.getTintIndex();
        if (n != -1 && n < this.colors.length) {
            int n2 = this.colors[n];
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.setColor(i, ColorMixer.mulComponentWise((int)n2, (int)mutableQuadViewImpl.baseColor(i)));
            }
        }
    }

    private void shadeQuad(MutableQuadViewImpl mutableQuadViewImpl, boolean bl) {
        if (bl) {
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.setLight(i, 0xF000F0);
            }
        } else {
            int n = this.lightmap;
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.setLight(i, ColorHelper.maxBrightness(mutableQuadViewImpl.getLight(i), n));
            }
        }
    }

    private void bufferQuad(MutableQuadViewImpl mutableQuadViewImpl, class01391 class013912, boolean bl) {
        QuadEncoder.writeQuadVertices(mutableQuadViewImpl, class013912, this.overlay, this.matPosition, this.trustedNormals, this.matNormal);
        class08388 class083882 = mutableQuadViewImpl.sprite(bl ? SpriteFinderCache.forItemAtlas() : SpriteFinderCache.forBlockAtlas());
        if (class083882 != null) {
            SpriteUtil.INSTANCE.markSpriteActive(class083882);
        }
    }

    void renderQuad(MutableQuadViewImpl mutableQuadViewImpl) {
        boolean bl = mutableQuadViewImpl.emissive();
        class01391 class013912 = this.getVertexConsumer(mutableQuadViewImpl.getQuadAtlas(), mutableQuadViewImpl.getRenderType(), mutableQuadViewImpl.glint());
        this.tintQuad(mutableQuadViewImpl);
        this.shadeQuad(mutableQuadViewImpl, bl);
        this.bufferQuad(mutableQuadViewImpl, class013912, mutableQuadViewImpl.getQuadAtlas() == SodiumQuadAtlas.ITEM);
    }

    private class01391 createVertexConsumer(class07311 class073112, class08915 class089152) {
        if (class089152 == class08915.field_55343) {
            if (this.specialGlintEntry == null) {
                this.specialGlintEntry = this.poseStack.L().u();
                if (this.transformMode == class03662.field_4317) {
                    class02054.N((Matrix4f)this.specialGlintEntry.N(), (float)0.5f);
                } else if (this.transformMode.y()) {
                    class02054.N((Matrix4f)this.specialGlintEntry.N(), (float)0.75f);
                }
            }
            return ItemRendererAccessor.sodium$getSpecialFoilBuffer((class01407)this.bufferSource, (class07311)class073112, (class01423)this.specialGlintEntry);
        }
        return class02862.N((class01407)this.bufferSource, (class07311)class073112, (boolean)true, (class089152 != class08915.field_55341 ? 1 : 0) != 0);
    }
}

