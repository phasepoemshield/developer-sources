/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07209
 *  minecraft.class07211
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  org.joml.Vector3f
 */
package net.caffeinemc.mods.sodium.client.model.light.smooth;

import minecraft.class04995;
import minecraft.class07209;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.client.model.light.LightPipeline;
import net.caffeinemc.mods.sodium.client.model.light.data.LightDataAccess;
import net.caffeinemc.mods.sodium.client.model.light.data.QuadLightData;
import net.caffeinemc.mods.sodium.client.model.light.smooth.AoFaceData;
import net.caffeinemc.mods.sodium.client.model.light.smooth.AoNeighborInfo;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import org.joml.Vector3f;

public class SmoothLightPipeline
implements LightPipeline {
    private final LightDataAccess lightCache;
    private final AoFaceData[] cachedFaceData = new AoFaceData[12];
    private long cachedPos = Long.MIN_VALUE;
    private final float[] weights = new float[4];
    private final Vector3f vertexNormal = new Vector3f();
    private final AoFaceData tmpFace = new AoFaceData();

    public SmoothLightPipeline(LightDataAccess lightDataAccess) {
        this.lightCache = lightDataAccess;
        for (int i = 0; i < this.cachedFaceData.length; ++i) {
            this.cachedFaceData[i] = new AoFaceData();
        }
    }

    private static float clamp(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    @Override
    public void calculate(ModelQuadView modelQuadView, class07209 class072092, QuadLightData quadLightData, class07211 class072112, class07211 class072113, boolean bl, boolean bl2) {
        this.updateCachedData(class072092.method_10063());
        int n = modelQuadView.getFlags();
        AoNeighborInfo aoNeighborInfo = AoNeighborInfo.get(class072113);
        if ((n & 4) != 0 || (n & 2) != 0 && LightDataAccess.unpackFC(this.lightCache.get(class072092))) {
            if ((n & 1) == 0) {
                this.applyAlignedFullFace(aoNeighborInfo, class072092, class072113, quadLightData, bl);
            } else {
                this.applyAlignedPartialFace(aoNeighborInfo, modelQuadView, class072092, class072113, quadLightData, bl);
            }
        } else if ((n & 2) != 0) {
            this.applyParallelFace(aoNeighborInfo, modelQuadView, class072092, class072113, quadLightData, bl);
        } else if (bl2) {
            this.applyIrregularFace(class072092, modelQuadView, quadLightData, bl);
        } else {
            this.applyNonParallelFace(aoNeighborInfo, modelQuadView, class072092, class072113, quadLightData, bl);
        }
    }

    private void applyAlignedPartialFaceVertex(class07209 class072092, class07211 class072112, float[] fArray, int n, QuadLightData quadLightData, boolean bl, boolean bl2) {
        float f;
        AoFaceData aoFaceData = this.getCachedFaceData(class072092, class072112, bl, bl2);
        if (!aoFaceData.hasUnpackedLightData()) {
            aoFaceData.unpackLightData();
        }
        float f2 = aoFaceData.getBlendedSkyLight(fArray);
        float f3 = aoFaceData.getBlendedBlockLight(fArray);
        quadLightData.br[n] = f = aoFaceData.getBlendedShade(fArray);
        quadLightData.lm[n] = SmoothLightPipeline.getLightMapCoord(f2, f3);
    }

    private void applyInsetPartialFaceVertex(class07209 class072092, class07211 class072112, float f, float f2, float[] fArray, int n, QuadLightData quadLightData, boolean bl) {
        AoFaceData aoFaceData;
        AoFaceData aoFaceData2 = this.getCachedFaceData(class072092, class072112, false, bl);
        if (!aoFaceData2.hasUnpackedLightData()) {
            aoFaceData2.unpackLightData();
        }
        if (!(aoFaceData = this.getCachedFaceData(class072092, class072112, true, bl)).hasUnpackedLightData()) {
            aoFaceData.unpackLightData();
        }
        float f3 = aoFaceData2.getBlendedShade(fArray) * f + aoFaceData.getBlendedShade(fArray) * f2;
        float f4 = aoFaceData2.getBlendedSkyLight(fArray) * f + aoFaceData.getBlendedSkyLight(fArray) * f2;
        float f5 = aoFaceData2.getBlendedBlockLight(fArray) * f + aoFaceData.getBlendedBlockLight(fArray) * f2;
        quadLightData.br[n] = f3;
        quadLightData.lm[n] = SmoothLightPipeline.getLightMapCoord(f4, f5);
    }

    private void applyParallelFace(AoNeighborInfo aoNeighborInfo, ModelQuadView modelQuadView, class07209 class072092, class07211 class072112, QuadLightData quadLightData, boolean bl) {
        for (int i = 0; i < 4; ++i) {
            float f = SmoothLightPipeline.clamp(modelQuadView.getX(i));
            float f2 = SmoothLightPipeline.clamp(modelQuadView.getY(i));
            float f3 = SmoothLightPipeline.clamp(modelQuadView.getZ(i));
            float[] fArray = this.weights;
            aoNeighborInfo.calculateCornerWeights(f, f2, f3, fArray);
            float f4 = aoNeighborInfo.getDepth(f, f2, f3);
            if (class04995.y((float)f4, (float)1.0f)) {
                this.applyAlignedPartialFaceVertex(class072092, class072112, fArray, i, quadLightData, false, bl);
                continue;
            }
            this.applyInsetPartialFaceVertex(class072092, class072112, f4, 1.0f - f4, fArray, i, quadLightData, bl);
        }
        this.applyAmbientLighting(quadLightData.br, class072112, bl);
    }

    private void updateCachedData(long l) {
        if (this.cachedPos != l) {
            for (AoFaceData aoFaceData : this.cachedFaceData) {
                aoFaceData.reset();
            }
            this.cachedPos = l;
        }
    }

    private void applyIrregularFace(class07209 class072092, ModelQuadView modelQuadView, QuadLightData quadLightData, boolean bl) {
        float[] fArray = this.weights;
        float[] fArray2 = quadLightData.br;
        int[] nArray = quadLightData.lm;
        for (int i = 0; i < 4; ++i) {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            Object object;
            Vector3f vector3f = NormI8.unpack((int)modelQuadView.getAccurateNormal(i), (Vector3f)this.vertexNormal);
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = vector3f.x();
            if (!class04995.y((float)0.0f, (float)f13)) {
                class07211 class072112 = f13 > 0.0f ? class07211.field_11034 : class07211.field_11039;
                object = this.gatherInsetFace(modelQuadView, class072092, i, class072112, bl);
                AoNeighborInfo.get(class072112).calculateCornerWeights(modelQuadView.getX(i), modelQuadView.getY(i), modelQuadView.getZ(i), fArray);
                float f14 = f13 * f13;
                f6 = ((AoFaceData)object).getBlendedShade(fArray) * this.getAmbientBrightness(class072112, bl);
                f5 = ((AoFaceData)object).getBlendedSkyLight(fArray);
                f4 = ((AoFaceData)object).getBlendedBlockLight(fArray);
                f7 += f14 * f6;
                f8 += f14 * f5;
                f9 += f14 * f4;
                f10 = f6;
                f11 = f5;
                f12 = f4;
            }
            if (!class04995.y((float)0.0f, (float)(f3 = vector3f.y()))) {
                object = f3 > 0.0f ? class07211.field_11036 : class07211.field_11033;
                AoFaceData aoFaceData = this.gatherInsetFace(modelQuadView, class072092, i, (class07211)object, bl);
                AoNeighborInfo.get((class07211)object).calculateCornerWeights(modelQuadView.getX(i), modelQuadView.getY(i), modelQuadView.getZ(i), fArray);
                f6 = f3 * f3;
                f5 = aoFaceData.getBlendedShade(fArray) * this.getAmbientBrightness((class07211)object, bl);
                f4 = aoFaceData.getBlendedSkyLight(fArray);
                f2 = aoFaceData.getBlendedBlockLight(fArray);
                f7 += f6 * f5;
                f8 += f6 * f4;
                f9 += f6 * f2;
                f10 = Math.max(f10, f5);
                f11 = Math.max(f11, f4);
                f12 = Math.max(f12, f2);
            }
            if (!class04995.y((float)0.0f, (float)(f = vector3f.z()))) {
                class07211 class072113 = f > 0.0f ? class07211.field_11035 : class07211.field_11043;
                AoFaceData aoFaceData = this.gatherInsetFace(modelQuadView, class072092, i, class072113, bl);
                AoNeighborInfo.get(class072113).calculateCornerWeights(modelQuadView.getX(i), modelQuadView.getY(i), modelQuadView.getZ(i), fArray);
                f5 = f * f;
                f4 = aoFaceData.getBlendedShade(fArray) * this.getAmbientBrightness(class072113, bl);
                f2 = aoFaceData.getBlendedSkyLight(fArray);
                float f15 = aoFaceData.getBlendedBlockLight(fArray);
                f7 += f5 * f4;
                f8 += f5 * f2;
                f9 += f5 * f15;
                f10 = Math.max(f10, f4);
                f11 = Math.max(f11, f2);
                f12 = Math.max(f12, f15);
            }
            fArray2[i] = (f7 + f10) * 0.5f;
            nArray[i] = ((int)((f8 + f11) * 0.5f) & 0xF0) << 16 | (int)((f9 + f12) * 0.5f) & 0xF0;
        }
    }

    private AoFaceData gatherInsetFace(ModelQuadView modelQuadView, class07209 class072092, int n, class07211 class072112, boolean bl) {
        float f = AoNeighborInfo.get(class072112).getDepth(modelQuadView.getX(n), modelQuadView.getY(n), modelQuadView.getZ(n));
        if (class04995.y((float)f, (float)0.0f)) {
            return this.getCachedFaceData(class072092, class072112, true, bl);
        }
        if (class04995.y((float)f, (float)1.0f)) {
            return this.getCachedFaceData(class072092, class072112, false, bl);
        }
        this.tmpFace.reset();
        float f2 = 1.0f - f;
        return AoFaceData.weightedMean(this.getCachedFaceData(class072092, class072112, true, bl), f2, this.getCachedFaceData(class072092, class072112, false, bl), f, this.tmpFace);
    }

    private static int getLightMapCoord(float f, float f2) {
        return ((int)f & 0xFF) << 16 | (int)f2 & 0xFF;
    }

    private AoFaceData getCachedFaceData(class07209 class072092, class07211 class072112, boolean bl, boolean bl2) {
        AoFaceData aoFaceData = this.cachedFaceData[bl ? class072112.ordinal() : class072112.ordinal() + 6];
        if (aoFaceData.hasLightData()) {
            return aoFaceData;
        }
        aoFaceData.initLightData(this.lightCache, class072092, class072112, bl);
        aoFaceData.unpackLightData();
        return aoFaceData;
    }

    private void applyAlignedFullFace(AoNeighborInfo aoNeighborInfo, class07209 class072092, class07211 class072112, QuadLightData quadLightData, boolean bl) {
        AoFaceData aoFaceData = this.getCachedFaceData(class072092, class072112, true, bl);
        aoNeighborInfo.mapCorners(aoFaceData.lm, aoFaceData.ao, quadLightData.lm, quadLightData.br);
        this.applyAmbientLighting(quadLightData.br, class072112, bl);
    }

    private void applyAmbientLighting(float[] fArray, class07211 class072112, boolean bl) {
        float f = this.getAmbientBrightness(class072112, bl);
        int n = 0;
        while (n < fArray.length) {
            int n2 = n++;
            fArray[n2] = fArray[n2] * f;
        }
    }

    private float getAmbientBrightness(class07211 class072112, boolean bl) {
        return this.lightCache.getLevel().method_24852(class072112, bl);
    }

    private void applyNonParallelFace(AoNeighborInfo aoNeighborInfo, ModelQuadView modelQuadView, class07209 class072092, class07211 class072112, QuadLightData quadLightData, boolean bl) {
        for (int i = 0; i < 4; ++i) {
            float f = SmoothLightPipeline.clamp(modelQuadView.getX(i));
            float f2 = SmoothLightPipeline.clamp(modelQuadView.getY(i));
            float f3 = SmoothLightPipeline.clamp(modelQuadView.getZ(i));
            float[] fArray = this.weights;
            aoNeighborInfo.calculateCornerWeights(f, f2, f3, fArray);
            float f4 = aoNeighborInfo.getDepth(f, f2, f3);
            if (class04995.y((float)f4, (float)0.0f)) {
                this.applyAlignedPartialFaceVertex(class072092, class072112, fArray, i, quadLightData, true, bl);
                continue;
            }
            if (class04995.y((float)f4, (float)1.0f)) {
                this.applyAlignedPartialFaceVertex(class072092, class072112, fArray, i, quadLightData, false, bl);
                continue;
            }
            this.applyInsetPartialFaceVertex(class072092, class072112, f4, 1.0f - f4, fArray, i, quadLightData, bl);
        }
        this.applyAmbientLighting(quadLightData.br, class072112, bl);
    }

    private void applyAlignedPartialFace(AoNeighborInfo aoNeighborInfo, ModelQuadView modelQuadView, class07209 class072092, class07211 class072112, QuadLightData quadLightData, boolean bl) {
        for (int i = 0; i < 4; ++i) {
            float f = SmoothLightPipeline.clamp(modelQuadView.getX(i));
            float f2 = SmoothLightPipeline.clamp(modelQuadView.getY(i));
            float f3 = SmoothLightPipeline.clamp(modelQuadView.getZ(i));
            float[] fArray = this.weights;
            aoNeighborInfo.calculateCornerWeights(f, f2, f3, fArray);
            this.applyAlignedPartialFaceVertex(class072092, class072112, fArray, i, quadLightData, true, bl);
        }
        this.applyAmbientLighting(quadLightData.br, class072112, bl);
    }
}

