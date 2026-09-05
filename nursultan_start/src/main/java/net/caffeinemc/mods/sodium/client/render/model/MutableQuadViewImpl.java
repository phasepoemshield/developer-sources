/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02022
 *  minecraft.class02584
 *  minecraft.class07211
 *  minecraft.class08388
 *  minecraft.class08743
 *  minecraft.class08877
 *  minecraft.class08915
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.client.model.quad.BakedQuadView
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class02022;
import minecraft.class02584;
import minecraft.class07211;
import minecraft.class08388;
import minecraft.class08743;
import minecraft.class08877;
import minecraft.class08915;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.client.model.quad.BakedQuadView;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.ExtendedMutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.MutableQuadViewWrapper;
import net.caffeinemc.mods.sodium.client.render.helper.ListStorage;
import net.caffeinemc.mods.sodium.client.render.helper.TextureHelper;
import net.caffeinemc.mods.sodium.client.render.model.EncodingFormat;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl$1;
import net.caffeinemc.mods.sodium.client.render.model.QuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.SodiumQuadAtlas;
import net.caffeinemc.mods.sodium.client.render.model.SodiumShadeMode;
import net.caffeinemc.mods.sodium.client.render.texture.SodiumSpriteFinder;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public abstract class MutableQuadViewImpl
extends QuadViewImpl
implements ExtendedMutableQuadViewImpl,
ListStorage {
    private class08388 cachedSprite;
    private List<class08877> cachedList;
    static final int[] DEFAULT = (int[])EncodingFormat.EMPTY.clone();
    private MutableQuadViewWrapper wrapper;

    public MutableQuadViewImpl setLight(int n, int n2) {
        this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_LIGHTMAP] = n2;
        return this;
    }

    @Override
    public void load() {
        super.load();
        this.cachedSprite(null);
    }

    public void clear() {
        System.arraycopy(DEFAULT, 0, this.data, this.baseIndex, EncodingFormat.TOTAL_STRIDE);
        this.isGeometryInvalid = true;
        this.nominalFace = null;
        this.cachedSprite(null);
    }

    public MutableQuadViewImpl setColor(int n, int n2) {
        this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_COLOR] = n2;
        return this;
    }

    public MutableQuadViewImpl copyFrom(QuadViewImpl quadViewImpl) {
        System.arraycopy(quadViewImpl.data, quadViewImpl.baseIndex, this.data, this.baseIndex, EncodingFormat.TOTAL_STRIDE);
        this.nominalFace = quadViewImpl.nominalFace;
        this.isGeometryInvalid = quadViewImpl.isGeometryInvalid;
        if (!this.isGeometryInvalid) {
            this.faceNormal.set((Vector3fc)quadViewImpl.faceNormal);
        }
        if (quadViewImpl instanceof MutableQuadViewImpl) {
            MutableQuadViewImpl mutableQuadViewImpl = (MutableQuadViewImpl)quadViewImpl;
            this.cachedSprite(mutableQuadViewImpl.cachedSprite());
        } else {
            this.cachedSprite(null);
        }
        return this;
    }

    public MutableQuadViewImpl setPos(int n, float f, float f2, float f3) {
        int n2 = this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_X;
        this.data[n2] = Float.floatToRawIntBits(f);
        this.data[n2 + 1] = Float.floatToRawIntBits(f2);
        this.data[n2 + 2] = Float.floatToRawIntBits(f3);
        this.isGeometryInvalid = true;
        return this;
    }

    public MutableQuadViewImpl setAmbientOcclusion(class02584 class025842) {
        Objects.requireNonNull(class025842, "ambient occlusion TriState may not be null");
        this.data[this.baseIndex + 0] = EncodingFormat.ambientOcclusion(this.data[this.baseIndex + 0], class025842);
        return this;
    }

    public final void populateMissingNormals() {
        int n = this.normalFlags();
        if (n == 15) {
            return;
        }
        int n2 = this.packedFaceNormal();
        for (int i = 0; i < 4; ++i) {
            if ((n & 1 << i) != 0) continue;
            this.data[this.baseIndex + i * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_NORMAL] = n2;
        }
        this.normalFlags(15);
    }

    private void fromVanillaInternal(BakedQuadView bakedQuadView) {
        boolean bl = false;
        for (int i = 0; i < 4; ++i) {
            this.setPos(i, bakedQuadView.getX(i), bakedQuadView.getY(i), bakedQuadView.getZ(i));
            this.setColor(i, bakedQuadView.getColor(i));
            this.setUV(i, bakedQuadView.getTexU(i), bakedQuadView.getTexV(i));
            this.setLight(i, bakedQuadView.getMaxLightQuad(i));
            int n = bakedQuadView.getVertexNormal(i);
            if (n != 0) {
                bl = true;
            }
            this.setNormal(i, NormI8.unpackX((int)n), NormI8.unpackY((int)n), NormI8.unpackZ((int)n));
        }
        this.normalFlags(bl ? 15 : 0);
    }

    public final MutableQuadViewImpl setTag(int n) {
        this.data[this.baseIndex + 3] = n;
        return this;
    }

    @Override
    public MutableQuadViewWrapper getWrapper() {
        if (this.wrapper == null) {
            this.wrapper = new MutableQuadViewWrapper(this);
        }
        return this.wrapper;
    }

    public MutableQuadViewImpl setUV(int n, float f, float f2) {
        int n2 = this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_U;
        this.data[n2] = Float.floatToRawIntBits(f);
        this.data[n2 + 1] = Float.floatToRawIntBits(f2);
        this.cachedSprite(null);
        return this;
    }

    public MutableQuadViewImpl spriteBake(class08388 class083882, int n) {
        TextureHelper.bakeSprite(this, class083882, n);
        this.cachedSprite(class083882);
        return this;
    }

    public MutableQuadViewImpl setNormal(int n, float f, float f2, float f3) {
        this.normalFlags(this.normalFlags() | 1 << n);
        this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_NORMAL] = NormI8.pack((float)f, (float)f2, (float)f3);
        return this;
    }

    public MutableQuadViewImpl setGlint(class08915 class089152) {
        this.data[this.baseIndex + 0] = EncodingFormat.glint(this.data[this.baseIndex + 0], class089152);
        return this;
    }

    public class08388 sprite(SodiumSpriteFinder sodiumSpriteFinder) {
        class08388 class083882 = this.cachedSprite;
        if (class083882 == null) {
            this.cachedSprite = class083882 = sodiumSpriteFinder.find(this);
        }
        return class083882;
    }

    public MutableQuadViewImpl setRenderType(class08743 class087432) {
        this.data[this.baseIndex + 0] = EncodingFormat.renderLayer(this.data[this.baseIndex + 0], class087432);
        return this;
    }

    public MutableQuadViewImpl setDiffuseShade(boolean bl) {
        this.data[this.baseIndex + 0] = EncodingFormat.diffuseShade(this.data[this.baseIndex + 0], bl);
        return this;
    }

    public final MutableQuadViewImpl setCullFace(class07211 class072112) {
        this.data[this.baseIndex + 0] = EncodingFormat.cullFace(this.data[this.baseIndex + 0], class072112);
        this.setNominalFace(class072112);
        return this;
    }

    public final MutableQuadViewImpl setQuadAtlas(SodiumQuadAtlas sodiumQuadAtlas) {
        this.data[this.baseIndex + 0] = EncodingFormat.quadAtlas(this.data[this.baseIndex + 0], sodiumQuadAtlas);
        return this;
    }

    public final MutableQuadViewImpl fromBakedQuad(class02022 class020222) {
        this.fromVanillaInternal((BakedQuadView)class020222);
        this.setNominalFace(class020222.U());
        this.setDiffuseShade(class020222.W());
        this.setTintIndex(class020222.z());
        this.setAmbientOcclusion(((BakedQuadView)class020222).hasAO() ? class02584.field_52396 : class02584.field_52395);
        this.setEmissive(class020222.m() == 15);
        BakedQuadView bakedQuadView = (BakedQuadView)class020222;
        NormI8.unpack((int)bakedQuadView.getFaceNormal(), (Vector3f)this.faceNormal);
        this.data[this.baseIndex + 1] = bakedQuadView.getFaceNormal();
        int n = EncodingFormat.lightFace(this.data[this.baseIndex + 0], bakedQuadView.getLightFace());
        n = EncodingFormat.normalFace(n, bakedQuadView.getNormalFace());
        this.data[this.baseIndex + 0] = EncodingFormat.geometryFlags(n, bakedQuadView.getFlags());
        this.isGeometryInvalid = false;
        SodiumQuadAtlas sodiumQuadAtlas = SodiumQuadAtlas.of(class020222.E().method_45852());
        if (sodiumQuadAtlas == null) {
            sodiumQuadAtlas = SodiumQuadAtlas.BLOCK;
        }
        this.setQuadAtlas(sodiumQuadAtlas);
        this.cachedSprite(class020222.E());
        return this;
    }

    public abstract void emitDirectly();

    protected void normalFlags(int n) {
        this.data[this.baseIndex + 0] = EncodingFormat.normalFlags(this.data[this.baseIndex + 0], n);
    }

    public MutableQuadViewImpl setShadeMode(SodiumShadeMode sodiumShadeMode) {
        Objects.requireNonNull(sodiumShadeMode, "ShadeMode may not be null");
        this.data[this.baseIndex + 0] = EncodingFormat.shadeMode(this.data[this.baseIndex + 0], sodiumShadeMode);
        return this;
    }

    public class08388 cachedSprite() {
        return this.cachedSprite;
    }

    public void cachedSprite(class08388 class083882) {
        this.cachedSprite = class083882;
    }

    @Override
    public List<class08877> clearAndGet() {
        if (this.cachedList == null) {
            this.cachedList = new ArrayList<class08877>();
            return this.cachedList;
        }
        this.cachedList.clear();
        return this.cachedList;
    }

    public final MutableQuadViewImpl setNominalFace(class07211 class072112) {
        this.nominalFace = class072112;
        return this;
    }

    public MutableQuadViewImpl setEmissive(boolean bl) {
        this.data[this.baseIndex + 0] = EncodingFormat.emissive(this.data[this.baseIndex + 0], bl);
        return this;
    }

    public final MutableQuadViewImpl setTintIndex(int n) {
        this.data[this.baseIndex + 2] = n;
        return this;
    }

    static {
        MutableQuadViewImpl$1 quad = new MutableQuadViewImpl$1();
        quad.data = DEFAULT;
        quad.setColor(0, -1);
        quad.setColor(1, -1);
        quad.setColor(2, -1);
        quad.setColor(3, -1);
        quad.setCullFace(null);
        quad.setRenderType(null);
        quad.setDiffuseShade(true);
        quad.setQuadAtlas(SodiumQuadAtlas.BLOCK);
        quad.setAmbientOcclusion(class02584.field_52396);
        quad.setGlint(null);
        quad.setTintIndex(-1);
    }
}

