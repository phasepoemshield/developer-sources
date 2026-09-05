/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class02022
 *  minecraft.class02054
 *  minecraft.class02566
 *  minecraft.class02862
 *  minecraft.class03662
 *  minecraft.class05911
 *  minecraft.class07311
 *  minecraft.class08743
 *  minecraft.class08915
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MeshView
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter
 *  net.fabricmc.fabric.impl.client.indigo.renderer.helper.ColorHelper
 *  net.fabricmc.fabric.mixin.client.indigo.renderer.ItemRendererAccessor
 *  org.joml.Matrix4f
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.render;

import java.util.Arrays;
import java.util.List;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class02022;
import minecraft.class02054;
import minecraft.class02566;
import minecraft.class02862;
import minecraft.class03662;
import minecraft.class05911;
import minecraft.class07311;
import minecraft.class08743;
import minecraft.class08915;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;
import net.fabricmc.fabric.impl.client.indigo.renderer.helper.ColorHelper;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableQuadViewImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.AbstractRenderContext;
import net.fabricmc.fabric.mixin.client.indigo.renderer.ItemRendererAccessor;
import org.joml.Matrix4f;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class ItemRenderContext
extends AbstractRenderContext {
    private static final int GLINT_COUNT = class08915.values().length;
    private class03662 displayContext;
    private class01407 vertexConsumers;
    private int light;
    private int[] tints;
    private class07311 defaultLayer;
    private @Nullable ItemRenderTypeGetter renderTypeGetter;
    private class08915 defaultGlint;
    private boolean ignoreQuadGlint;
    private class01423 specialGlintEntry;
    private final class01391[] vertexConsumerCache = new class01391[3 * GLINT_COUNT];

    public void renderItem(class03662 class036622, class01421 class014212, class01407 class014072, int n, int n2, int[] nArray, List<class02022> list, MeshView meshView, class07311 class073112, @Nullable ItemRenderTypeGetter itemRenderTypeGetter, class08915 class089152, boolean bl) {
        this.displayContext = class036622;
        this.matrices = class014212.L();
        this.vertexConsumers = class014072;
        this.light = n;
        this.overlay = n2;
        this.tints = nArray;
        this.defaultLayer = class073112;
        this.renderTypeGetter = itemRenderTypeGetter;
        this.defaultGlint = class089152;
        this.ignoreQuadGlint = bl;
        this.bufferQuads(list, meshView);
        this.matrices = null;
        this.vertexConsumers = null;
        this.tints = null;
        this.defaultLayer = null;
        this.renderTypeGetter = null;
        this.specialGlintEntry = null;
        Arrays.fill(this.vertexConsumerCache, null);
    }

    private void bufferQuads(List<class02022> list, MeshView meshView) {
        QuadEmitter quadEmitter = this.getEmitter();
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            class02022 class020222 = list.get(i);
            quadEmitter.fromBakedQuad(class020222);
            quadEmitter.emit();
        }
        meshView.outputTo(quadEmitter);
    }

    private class01391 getVertexConsumer(QuadAtlas quadAtlas, @Nullable class08743 class087432, @Nullable class08915 class089152) {
        class07311 class073112;
        if (this.renderTypeGetter != null) {
            class073112 = this.renderTypeGetter.renderType(quadAtlas, class087432);
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
        int n = mutableQuadViewImpl.tintIndex();
        if (n >= 0 && n < this.tints.length) {
            int n2 = this.tints[n];
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.color(i, class02566.N((int)mutableQuadViewImpl.color(i), (int)n2));
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
        class01391 class013912 = this.getVertexConsumer(mutableQuadViewImpl.atlas(), mutableQuadViewImpl.renderLayer(), mutableQuadViewImpl.glint());
        this.tintQuad(mutableQuadViewImpl);
        this.shadeQuad(mutableQuadViewImpl, mutableQuadViewImpl.emissive());
        this.bufferQuad(mutableQuadViewImpl, class013912);
    }

    private class01391 createVertexConsumer(class07311 class073112, class08915 class089152) {
        if (class089152 == class08915.field_55343) {
            if (this.specialGlintEntry == null) {
                this.specialGlintEntry = this.matrices.u();
                if (this.displayContext == class03662.field_4317) {
                    class02054.N((Matrix4f)this.specialGlintEntry.N(), (float)0.5f);
                } else if (this.displayContext.y()) {
                    class02054.N((Matrix4f)this.specialGlintEntry.N(), (float)0.75f);
                }
            }
            return ItemRendererAccessor.fabric_getDynamicDisplayGlintConsumer((class01407)this.vertexConsumers, (class07311)class073112, (class01423)this.specialGlintEntry);
        }
        return class02862.N((class01407)this.vertexConsumers, (class07311)class073112, (boolean)true, (class089152 != class08915.field_55341 ? 1 : 0) != 0);
    }
}

