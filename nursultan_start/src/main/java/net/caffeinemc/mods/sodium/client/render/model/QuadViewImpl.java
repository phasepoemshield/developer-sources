/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02584
 *  minecraft.class07211
 *  minecraft.class08388
 *  minecraft.class08743
 *  minecraft.class08915
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFlags
 *  org.joml.Vector2f
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.model;

import minecraft.class02584;
import minecraft.class07211;
import minecraft.class08388;
import minecraft.class08743;
import minecraft.class08915;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFlags;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.ExtendedQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.QuadViewWrapper;
import net.caffeinemc.mods.sodium.client.render.helper.ColorHelper;
import net.caffeinemc.mods.sodium.client.render.helper.GeometryHelper;
import net.caffeinemc.mods.sodium.client.render.helper.NormalHelper;
import net.caffeinemc.mods.sodium.client.render.model.EncodingFormat;
import net.caffeinemc.mods.sodium.client.render.model.SodiumQuadAtlas;
import net.caffeinemc.mods.sodium.client.render.model.SodiumShadeMode;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class QuadViewImpl
implements ModelQuadView,
ExtendedQuadViewImpl {
    protected class07211 nominalFace;
    protected boolean isGeometryInvalid = true;
    protected final Vector3f faceNormal = new Vector3f();
    public int[] data;
    public int baseIndex = 0;
    private QuadViewWrapper wrapper;

    public int getFlags() {
        return this.geometryFlags();
    }

    public int getLight(int n) {
        return this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_LIGHTMAP];
    }

    public void load() {
        this.isGeometryInvalid = false;
        this.nominalFace = this.getLightFace();
        NormI8.unpack((int)this.packedFaceNormal(), (Vector3f)this.faceNormal);
    }

    public final int getTag() {
        return this.data[this.baseIndex + 3];
    }

    public float getY(int n) {
        return Float.intBitsToFloat(this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_Y]);
    }

    public float getX(int n) {
        return Float.intBitsToFloat(this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_X]);
    }

    public float getZ(int n) {
        return Float.intBitsToFloat(this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_Z]);
    }

    public class08915 glint() {
        return EncodingFormat.glint(this.data[this.baseIndex + 0]);
    }

    public int baseColor(int n) {
        return this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_COLOR];
    }

    public float normalZ(int n) {
        return this.hasNormal(n) ? NormI8.unpackZ((int)this.data[this.normalIndex(n)]) : Float.NaN;
    }

    public float normalX(int n) {
        return this.hasNormal(n) ? NormI8.unpackX((int)this.data[this.normalIndex(n)]) : Float.NaN;
    }

    public float normalY(int n) {
        return this.hasNormal(n) ? NormI8.unpackY((int)this.data[this.normalIndex(n)]) : Float.NaN;
    }

    public int getColor(int n) {
        return ColorHelper.toVanillaColor(this.baseColor(n));
    }

    public boolean hasAllVertexNormals() {
        return (this.normalFlags() & 0xF) == 15;
    }

    @Override
    public QuadViewWrapper getWrapper() {
        if (this.wrapper == null) {
            this.wrapper = new QuadViewWrapper(this);
        }
        return this.wrapper;
    }

    public float posByIndex(int n, int n2) {
        return Float.intBitsToFloat(this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + (EncodingFormat.VERTEX_X + n2)]);
    }

    public final ModelQuadFacing normalFace() {
        this.computeGeometry();
        return EncodingFormat.normalFace(this.data[this.baseIndex + 0]);
    }

    public Vector3f copyPos(int n, Vector3f vector3f) {
        if (vector3f == null) {
            vector3f = new Vector3f();
        }
        int n2 = this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_X;
        vector3f.set(Float.intBitsToFloat(this.data[n2]), Float.intBitsToFloat(this.data[n2 + 1]), Float.intBitsToFloat(this.data[n2 + 2]));
        return vector3f;
    }

    public float getTexU(int n) {
        return Float.intBitsToFloat(this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_U]);
    }

    public boolean hasShade() {
        return this.diffuseShade();
    }

    public Vector2f copyUv(int n, Vector2f vector2f) {
        if (vector2f == null) {
            vector2f = new Vector2f();
        }
        int n2 = this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_U;
        vector2f.set(Float.intBitsToFloat(this.data[n2]), Float.intBitsToFloat(this.data[n2 + 1]));
        return vector2f;
    }

    public boolean emissive() {
        return EncodingFormat.emissive(this.data[this.baseIndex + 0]);
    }

    public float getTexV(int n) {
        return Float.intBitsToFloat(this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_V]);
    }

    public boolean hasNormal(int n) {
        return (this.normalFlags() & 1 << n) != 0;
    }

    public final Vector3f faceNormal() {
        this.computeGeometry();
        return this.faceNormal;
    }

    public Vector3f copyNormal(int n, Vector3f vector3f) {
        if (this.hasNormal(n)) {
            if (vector3f == null) {
                vector3f = new Vector3f();
            }
            int n2 = this.data[this.normalIndex(n)];
            NormI8.unpack((int)n2, (Vector3f)vector3f);
            return vector3f;
        }
        return null;
    }

    public class08388 getSprite() {
        throw new UnsupportedOperationException("Not available for QuadViewImpl.");
    }

    public final void toVanilla(int[] nArray, int n) {
        System.arraycopy(this.data, this.baseIndex + 4, nArray, n, EncodingFormat.QUAD_STRIDE);
        int n2 = n + 3;
        for (int i = 0; i < 4; ++i) {
            nArray[n2] = ColorHelper.toVanillaColor(nArray[n2]);
            n2 += EncodingFormat.VANILLA_VERTEX_STRIDE;
        }
    }

    public final int packedFaceNormal() {
        this.computeGeometry();
        return this.data[this.baseIndex + 1];
    }

    public int getVertexNormal(int n) {
        return this.data[this.normalIndex(n)];
    }

    public int getMaxLightQuad(int n) {
        return this.getLight(n);
    }

    public int normalFlags() {
        return EncodingFormat.normalFlags(this.data[this.baseIndex + 0]);
    }

    public boolean diffuseShade() {
        return EncodingFormat.diffuseShade(this.data[this.baseIndex + 0]);
    }

    protected void computeGeometry() {
        if (this.isGeometryInvalid) {
            int n;
            this.isGeometryInvalid = false;
            NormalHelper.computeFaceNormal(this.faceNormal, this);
            this.data[this.baseIndex + 1] = n = NormI8.pack((Vector3fc)this.faceNormal);
            class07211 class072112 = GeometryHelper.lightFace(this);
            this.data[this.baseIndex + 0] = EncodingFormat.lightFace(this.data[this.baseIndex + 0], class072112);
            this.data[this.baseIndex + 0] = EncodingFormat.normalFace(this.data[this.baseIndex + 0], ModelQuadFacing.fromPackedNormal((int)n));
            this.data[this.baseIndex + 0] = EncodingFormat.geometryFlags(this.data[this.baseIndex + 0], ModelQuadFlags.getQuadFlags((ModelQuadView)this, (class07211)class072112));
        }
    }

    public class02584 ambientOcclusion() {
        return EncodingFormat.ambientOcclusion(this.data[this.baseIndex + 0]);
    }

    public int getFaceNormal() {
        return this.packedFaceNormal();
    }

    public class07211 getLightFace() {
        this.computeGeometry();
        return EncodingFormat.lightFace(this.data[this.baseIndex + 0]);
    }

    public int geometryFlags() {
        this.computeGeometry();
        return EncodingFormat.geometryFlags(this.data[this.baseIndex + 0]);
    }

    public int getTintIndex() {
        return this.data[this.baseIndex + 2];
    }

    public final class07211 getNominalFace() {
        return this.nominalFace;
    }

    public SodiumQuadAtlas getQuadAtlas() {
        return EncodingFormat.quadAtlas(this.data[this.baseIndex + 0]);
    }

    public int packedNormal(int n) {
        return this.data[this.normalIndex(n)];
    }

    public final class07211 getCullFace() {
        return EncodingFormat.cullFace(this.data[this.baseIndex + 0]);
    }

    public SodiumShadeMode getShadeMode() {
        return EncodingFormat.shadeMode(this.data[this.baseIndex + 0]);
    }

    public boolean hasVertexNormals() {
        return this.normalFlags() != 0;
    }

    protected final int normalIndex(int n) {
        return this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_NORMAL;
    }

    public class08743 getRenderType() {
        return EncodingFormat.renderLayer(this.data[this.baseIndex + 0]);
    }
}

