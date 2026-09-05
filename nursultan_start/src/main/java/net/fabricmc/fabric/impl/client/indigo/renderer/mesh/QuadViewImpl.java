/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  minecraft.class08743
 *  minecraft.class08915
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode
 *  net.fabricmc.fabric.api.util.TriState
 *  net.fabricmc.fabric.impl.client.indigo.renderer.helper.GeometryHelper
 *  net.fabricmc.fabric.impl.client.indigo.renderer.helper.NormalHelper
 *  org.joml.Vector2f
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.mesh;

import minecraft.class07211;
import minecraft.class08743;
import minecraft.class08915;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode;
import net.fabricmc.fabric.api.util.TriState;
import net.fabricmc.fabric.impl.client.indigo.renderer.helper.GeometryHelper;
import net.fabricmc.fabric.impl.client.indigo.renderer.helper.NormalHelper;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.EncodingFormat;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class QuadViewImpl
implements QuadView {
    protected @Nullable class07211 nominalFace;
    protected boolean isGeometryInvalid = true;
    protected final Vector3f faceNormal = new Vector3f();
    protected int[] data;
    protected int baseIndex = 0;

    public final int color(int n) {
        return this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_COLOR];
    }

    public final void load() {
        this.isGeometryInvalid = false;
        this.nominalFace = this.lightFace();
        NormalHelper.unpackNormal((int)this.packedFaceNormal(), (Vector3f)this.faceNormal);
    }

    public final float x(int n) {
        return Float.intBitsToFloat(this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_X]);
    }

    public final float v(int n) {
        return Float.intBitsToFloat(this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_V]);
    }

    public final float z(int n) {
        return Float.intBitsToFloat(this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_Z]);
    }

    public final float u(int n) {
        return Float.intBitsToFloat(this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_U]);
    }

    public final float y(int n) {
        return Float.intBitsToFloat(this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_Y]);
    }

    public final int tag() {
        return this.data[this.baseIndex + 3];
    }

    public @Nullable class08915 glint() {
        return EncodingFormat.glint(this.data[this.baseIndex + 0]);
    }

    public QuadAtlas atlas() {
        return EncodingFormat.quadAtlas(this.data[this.baseIndex + 0]);
    }

    public final float normalZ(int n) {
        return this.hasNormal(n) ? NormalHelper.unpackNormalZ((int)this.data[this.normalIndex(n)]) : Float.NaN;
    }

    public final float normalX(int n) {
        return this.hasNormal(n) ? NormalHelper.unpackNormalX((int)this.data[this.normalIndex(n)]) : Float.NaN;
    }

    public final float normalY(int n) {
        return this.hasNormal(n) ? NormalHelper.unpackNormalY((int)this.data[this.normalIndex(n)]) : Float.NaN;
    }

    public final boolean hasAllVertexNormals() {
        return (this.normalFlags() & 0xF) == 15;
    }

    public final float posByIndex(int n, int n2) {
        return Float.intBitsToFloat(this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_X + n2]);
    }

    public final Vector3f copyPos(int n, @Nullable Vector3f vector3f) {
        if (vector3f == null) {
            vector3f = new Vector3f();
        }
        int n2 = this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_X;
        vector3f.set(Float.intBitsToFloat(this.data[n2]), Float.intBitsToFloat(this.data[n2 + 1]), Float.intBitsToFloat(this.data[n2 + 2]));
        return vector3f;
    }

    public final Vector2f copyUv(int n, @Nullable Vector2f vector2f) {
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

    public final @Nullable class07211 cullFace() {
        return EncodingFormat.cullFace(this.data[this.baseIndex + 0]);
    }

    public ShadeMode shadeMode() {
        return EncodingFormat.shadeMode(this.data[this.baseIndex + 0]);
    }

    public final boolean hasNormal(int n) {
        return (this.normalFlags() & 1 << n) != 0;
    }

    public final class07211 lightFace() {
        this.computeGeometry();
        return EncodingFormat.lightFace(this.data[this.baseIndex + 0]);
    }

    public final Vector3fc faceNormal() {
        this.computeGeometry();
        return this.faceNormal;
    }

    public final @Nullable Vector3f copyNormal(int n, @Nullable Vector3f vector3f) {
        if (this.hasNormal(n)) {
            if (vector3f == null) {
                vector3f = new Vector3f();
            }
            int n2 = this.data[this.normalIndex(n)];
            NormalHelper.unpackNormal((int)n2, (Vector3f)vector3f);
            return vector3f;
        }
        return null;
    }

    public final int lightmap(int n) {
        return this.data[this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_LIGHTMAP];
    }

    public @Nullable class08743 renderLayer() {
        return EncodingFormat.renderLayer(this.data[this.baseIndex + 0]);
    }

    public final @Nullable class07211 nominalFace() {
        return this.nominalFace;
    }

    public final int packedFaceNormal() {
        this.computeGeometry();
        return this.data[this.baseIndex + 1];
    }

    public final int normalFlags() {
        return EncodingFormat.normalFlags(this.data[this.baseIndex + 0]);
    }

    public boolean diffuseShade() {
        return EncodingFormat.diffuseShade(this.data[this.baseIndex + 0]);
    }

    protected final void computeGeometry() {
        if (this.isGeometryInvalid) {
            this.isGeometryInvalid = false;
            NormalHelper.computeFaceNormal((Vector3f)this.faceNormal, (QuadView)this);
            this.data[this.baseIndex + 1] = NormalHelper.packNormal((Vector3f)this.faceNormal);
            this.data[this.baseIndex + 0] = EncodingFormat.lightFace(this.data[this.baseIndex + 0], GeometryHelper.lightFace((QuadView)this));
            this.data[this.baseIndex + 0] = EncodingFormat.geometryFlags(this.data[this.baseIndex + 0], GeometryHelper.computeShapeFlags((QuadView)this));
        }
    }

    public TriState ambientOcclusion() {
        return EncodingFormat.ambientOcclusion(this.data[this.baseIndex + 0]);
    }

    public final int geometryFlags() {
        this.computeGeometry();
        return EncodingFormat.geometryFlags(this.data[this.baseIndex + 0]);
    }

    public final boolean hasVertexNormals() {
        return this.normalFlags() != 0;
    }

    protected final int normalIndex(int n) {
        return this.baseIndex + n * EncodingFormat.VERTEX_STRIDE + EncodingFormat.VERTEX_NORMAL;
    }

    public final int tintIndex() {
        return this.data[this.baseIndex + 2];
    }
}

