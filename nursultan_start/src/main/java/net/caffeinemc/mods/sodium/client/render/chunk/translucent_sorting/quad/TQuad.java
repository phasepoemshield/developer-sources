/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad;

import java.util.Arrays;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public abstract class TQuad {
    public static final float VERTEX_EPSILON = 1.0E-5f;
    static final int NORMAL_QUANTIZATION_STEPS = 4;
    private static final float INV_QUANTIZE_EPSILON = 256.0f;
    public static final float QUANTIZE_EPSILON = 0.00390625f;
    ModelQuadFacing facing;
    final int packedNormal;
    float[] extents;
    float accurateDotProduct;
    float quantizedDotProduct;
    Vector3fc center;
    Vector3fc quantizedNormal;
    Vector3fc accurateNormal;

    TQuad(ModelQuadFacing modelQuadFacing, int n) {
        if (modelQuadFacing.isAligned()) {
            n = ModelQuadFacing.PACKED_ALIGNED_NORMALS[modelQuadFacing.ordinal()];
        }
        this.facing = modelQuadFacing;
        this.packedNormal = n;
    }

    static {
        float f = 0.0021f;
        if (0.00390625f <= f) {
            if (Integer.bitCount(256) == 1) {
                throw new RuntimeException("epsilon is invalid: 0.00390625");
            }
        }
    }

    protected static boolean isInvalid(int n) {
        return Integer.bitCount(n) > 1;
    }

    public int getQuadHash() {
        int n = 1;
        n = 31 * n + Arrays.hashCode(this.extents);
        n = this.facing.isAligned() ? 31 * n + this.facing.hashCode() : 31 * n + this.packedNormal;
        n = 31 * n + Float.hashCode(this.quantizedDotProduct);
        return n;
    }

    public ModelQuadFacing useQuantizedFacing() {
        if (!this.facing.isAligned()) {
            this.getQuantizedNormal();
            this.facing = ModelQuadFacing.fromNormal((Vector3fc)this.quantizedNormal);
            this.quantizedDotProduct = this.facing.isAligned() ? TQuad.getAlignedDotProduct(this.facing, this.extents) : this.getCenter().dot(this.quantizedNormal);
        }
        return this.facing;
    }

    public int getPackedNormal() {
        return this.packedNormal;
    }

    public Vector3fc getQuantizedNormal() {
        if (this.quantizedNormal == null) {
            if (this.facing.isAligned()) {
                this.quantizedNormal = this.facing.getAlignedNormal();
            } else {
                this.computeQuantizedNormal();
            }
        }
        return this.quantizedNormal;
    }

    public static boolean extentsIntersect(float[] fArray, float[] fArray2) {
        for (int i = 0; i < 3; ++i) {
            int n = i + 3;
            if (!(fArray[i] <= fArray2[n]) && !(fArray2[i] <= fArray[n])) continue;
            return false;
        }
        return true;
    }

    public static boolean extentsIntersect(TQuad tQuad, TQuad tQuad2) {
        return TQuad.extentsIntersect(tQuad.extents, tQuad2.extents);
    }

    public static boolean extentsEqual(float[] fArray, float[] fArray2) {
        for (int i = 0; i < 6; ++i) {
            if (fArray[i] == fArray2[i]) continue;
            return false;
        }
        return true;
    }

    public boolean extentsEqual(float[] fArray) {
        return TQuad.extentsEqual(this.extents, fArray);
    }

    void initDotProduct() {
        if (this.facing.isAligned()) {
            this.accurateDotProduct = TQuad.getAlignedDotProduct(this.facing, this.extents);
        } else {
            float f = NormI8.unpackX((int)this.packedNormal);
            float f2 = NormI8.unpackY((int)this.packedNormal);
            float f3 = NormI8.unpackZ((int)this.packedNormal);
            this.accurateDotProduct = this.getCenter().dot(f, f2, f3);
        }
        this.quantizedDotProduct = this.accurateDotProduct;
    }

    public abstract float[] getVertexPositions();

    public ModelQuadFacing getFacing() {
        return this.facing;
    }

    public float[] getExtents() {
        return this.extents;
    }

    public Vector3fc getCenter() {
        if (this.center == null) {
            this.center = new Vector3f((this.extents[0] + this.extents[3]) / 2.0f, (this.extents[1] + this.extents[4]) / 2.0f, (this.extents[2] + this.extents[5]) / 2.0f);
        }
        return this.center;
    }

    public Vector3fc getAccurateNormal() {
        if (this.facing.isAligned()) {
            return this.facing.getAlignedNormal();
        }
        if (this.accurateNormal == null) {
            this.accurateNormal = new Vector3f(NormI8.unpackX((int)this.packedNormal), NormI8.unpackY((int)this.packedNormal), NormI8.unpackZ((int)this.packedNormal));
        }
        return this.accurateNormal;
    }

    public float getQuantizedDotProduct() {
        return this.quantizedDotProduct;
    }

    public float getAccurateDotProduct() {
        return this.accurateDotProduct;
    }

    private void computeQuantizedNormal() {
        float f = NormI8.unpackX((int)this.packedNormal);
        float f2 = NormI8.unpackY((int)this.packedNormal);
        float f3 = NormI8.unpackZ((int)this.packedNormal);
        float f4 = Math.max(Math.abs(f), Math.max(Math.abs(f2), Math.abs(f3)));
        if (f4 != 0.0f && f4 != 1.0f) {
            f /= f4;
            f2 /= f4;
            f3 /= f4;
        }
        Vector3f vector3f = new Vector3f((float)((int)(f * 4.0f)), (float)((int)(f2 * 4.0f)), (float)((int)(f3 * 4.0f)));
        vector3f.normalize();
        this.quantizedNormal = vector3f;
    }

    int initExtentsAndCenter(ChunkVertexEncoder$Vertex[] chunkVertexEncoder$VertexArray) {
        float f;
        float f2;
        float f3;
        int n;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = chunkVertexEncoder$VertexArray[3].x;
        float f8 = chunkVertexEncoder$VertexArray[3].y;
        float f9 = chunkVertexEncoder$VertexArray[3].z;
        int n2 = 0;
        float f10 = Float.NEGATIVE_INFINITY;
        float f11 = Float.NEGATIVE_INFINITY;
        float f12 = Float.NEGATIVE_INFINITY;
        float f13 = Float.POSITIVE_INFINITY;
        float f14 = Float.POSITIVE_INFINITY;
        float f15 = Float.POSITIVE_INFINITY;
        for (n = 0; n < 4; ++n) {
            f3 = chunkVertexEncoder$VertexArray[n].x;
            f2 = chunkVertexEncoder$VertexArray[n].y;
            f = chunkVertexEncoder$VertexArray[n].z;
            f10 = Math.max(f10, f3);
            f11 = Math.max(f11, f2);
            f12 = Math.max(f12, f);
            f13 = Math.min(f13, f3);
            f14 = Math.min(f14, f2);
            f15 = Math.min(f15, f);
            if (Math.abs(f3 - f7) >= 1.0E-5f || Math.abs(f2 - f8) >= 1.0E-5f || Math.abs(f - f9) >= 1.0E-5f) {
                f4 += f3;
                f5 += f2;
                f6 += f;
            } else {
                n2 |= 1 << n;
            }
            if (n == 3) continue;
            f7 = f3;
            f8 = f2;
            f9 = f;
        }
        if (this.facing != ModelQuadFacing.POS_X && this.facing != ModelQuadFacing.NEG_X && (f13 += 0.00390625f) > (f10 -= 0.00390625f)) {
            f13 = f10;
        }
        if (this.facing != ModelQuadFacing.POS_Y && this.facing != ModelQuadFacing.NEG_Y && (f14 += 0.00390625f) > (f11 -= 0.00390625f)) {
            f14 = f11;
        }
        if (this.facing != ModelQuadFacing.POS_Z && this.facing != ModelQuadFacing.NEG_Z && (f15 += 0.00390625f) > (f12 -= 0.00390625f)) {
            f15 = f12;
        }
        this.extents = new float[]{f10, f11, f12, f13, f14, f15};
        n = 4 - Integer.bitCount(n2);
        if (!(this.facing.isAligned() && n == 4 || n < 3)) {
            f3 = 1.0f / (float)n;
            f2 = f4 * f3;
            f = f5 * f3;
            float f16 = f6 * f3;
            this.center = new Vector3f(f2, f, f16);
        }
        return n2;
    }

    private static float getAlignedDotProduct(ModelQuadFacing modelQuadFacing, float[] fArray) {
        return fArray[modelQuadFacing.ordinal()] * (float)modelQuadFacing.getSign();
    }
}

