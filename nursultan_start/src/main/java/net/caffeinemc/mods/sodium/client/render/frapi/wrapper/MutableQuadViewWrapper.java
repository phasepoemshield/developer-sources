/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class02022
 *  minecraft.class02584
 *  minecraft.class07211
 *  minecraft.class08388
 *  minecraft.class08743
 *  minecraft.class08915
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadTransform
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode
 *  net.fabricmc.fabric.api.util.TriState
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.frapi.wrapper;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import minecraft.class02022;
import minecraft.class02584;
import minecraft.class07211;
import minecraft.class08388;
import minecraft.class08743;
import minecraft.class08915;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.QuadViewWrapper;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.SodiumQuadAtlas;
import net.caffeinemc.mods.sodium.client.render.model.SodiumShadeMode;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadTransform;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode;
import net.fabricmc.fabric.api.util.TriState;
import org.jspecify.annotations.Nullable;

public class MutableQuadViewWrapper
extends QuadViewWrapper
implements QuadEmitter {
    protected static final QuadTransform NO_TRANSFORM = mutableQuadView -> true;
    private static final class02584[] TO_SODIUM = new class02584[]{class02584.field_52395, class02584.field_52396, class02584.field_52394};
    private final MutableQuadViewImpl mutableQuad;
    protected QuadTransform activeTransform = NO_TRANSFORM;
    private final ObjectArrayList<QuadTransform> transformStack = new ObjectArrayList();
    private final QuadTransform stackTransform = mutableQuadView -> {
        int n = this.transformStack.size() - 1;
        while (n >= 0) {
            if (((QuadTransform)this.transformStack.get(n--)).transform(mutableQuadView)) continue;
            return false;
        }
        return true;
    };

    public QuadEmitter color(int n, int n2) {
        this.mutableQuad.setColor(n, n2);
        return this;
    }

    public QuadEmitter pos(int n, float f, float f2, float f3) {
        this.mutableQuad.setPos(n, f, f2, f3);
        return this;
    }

    public MutableQuadViewWrapper(MutableQuadViewImpl mutableQuadViewImpl) {
        super(mutableQuadViewImpl);
        this.mutableQuad = mutableQuadViewImpl;
    }

    public QuadEmitter normal(int n, float f, float f2, float f3) {
        this.mutableQuad.setNormal(n, f, f2, f3);
        return this;
    }

    public QuadEmitter tag(int n) {
        this.mutableQuad.setTag(n);
        return this;
    }

    public QuadEmitter copyFrom(QuadView quadView) {
        this.mutableQuad.copyFrom(((QuadViewWrapper)quadView).getOriginal());
        return this;
    }

    public void popTransform() {
        this.transformStack.pop();
        if (this.transformStack.isEmpty()) {
            this.activeTransform = NO_TRANSFORM;
        } else if (this.transformStack.size() == 1) {
            this.activeTransform = (QuadTransform)this.transformStack.getFirst();
        }
    }

    public void pushTransform(QuadTransform quadTransform) {
        if (quadTransform == null) {
            throw new NullPointerException("QuadTransform cannot be null!");
        }
        this.transformStack.push((Object)quadTransform);
        if (this.transformStack.size() == 1) {
            this.activeTransform = quadTransform;
        } else if (this.transformStack.size() == 2) {
            this.activeTransform = this.stackTransform;
        }
    }

    public QuadEmitter glint(@Nullable class08915 class089152) {
        this.mutableQuad.setGlint(class089152);
        return this;
    }

    @Override
    public QuadAtlas atlas() {
        return this.mutableQuad.getQuadAtlas() == SodiumQuadAtlas.BLOCK ? QuadAtlas.BLOCK : QuadAtlas.ITEM;
    }

    public QuadEmitter atlas(QuadAtlas quadAtlas) {
        this.mutableQuad.setQuadAtlas(quadAtlas == QuadAtlas.BLOCK ? SodiumQuadAtlas.BLOCK : SodiumQuadAtlas.ITEM);
        return this;
    }

    public final QuadEmitter emit() {
        this.transformAndEmit();
        this.mutableQuad.clear();
        return this;
    }

    @Override
    public MutableQuadViewImpl getOriginal() {
        return this.mutableQuad;
    }

    public QuadEmitter uv(int n, float f, float f2) {
        this.mutableQuad.setUV(n, f, f2);
        return this;
    }

    public QuadEmitter spriteBake(class08388 class083882, int n) {
        this.mutableQuad.spriteBake(class083882, n);
        return this;
    }

    public QuadEmitter emissive(boolean bl) {
        this.mutableQuad.setEmissive(bl);
        return this;
    }

    public QuadEmitter cullFace(@Nullable class07211 class072112) {
        this.mutableQuad.setCullFace(class072112);
        return this;
    }

    public QuadEmitter shadeMode(ShadeMode shadeMode) {
        this.mutableQuad.setShadeMode(shadeMode == ShadeMode.ENHANCED ? SodiumShadeMode.ENHANCED : SodiumShadeMode.VANILLA);
        return this;
    }

    public QuadEmitter lightmap(int n, int n2) {
        this.mutableQuad.setLight(n, n2);
        return this;
    }

    public QuadEmitter renderLayer(@Nullable class08743 class087432) {
        this.mutableQuad.setRenderType(class087432);
        return this;
    }

    public QuadEmitter nominalFace(@Nullable class07211 class072112) {
        this.mutableQuad.setNominalFace(class072112);
        return this;
    }

    public QuadEmitter fromBakedQuad(class02022 class020222) {
        this.mutableQuad.fromBakedQuad(class020222);
        return this;
    }

    public QuadEmitter diffuseShade(boolean bl) {
        this.mutableQuad.setDiffuseShade(bl);
        return this;
    }

    public QuadEmitter ambientOcclusion(TriState triState) {
        this.mutableQuad.setAmbientOcclusion(TO_SODIUM[triState.ordinal()]);
        return this;
    }

    public final void transformAndEmit() {
        if (this.activeTransform.transform((MutableQuadView)this)) {
            this.mutableQuad.emitDirectly();
        }
    }

    public QuadEmitter tintIndex(int n) {
        this.mutableQuad.setTintIndex(n);
        return this;
    }
}

