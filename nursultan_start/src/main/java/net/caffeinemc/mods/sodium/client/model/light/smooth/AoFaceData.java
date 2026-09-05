/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 *  minecraft.class07211
 */
package net.caffeinemc.mods.sodium.client.model.light.smooth;

import minecraft.class07209;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.client.model.light.data.ArrayLightDataCache;
import net.caffeinemc.mods.sodium.client.model.light.data.LightDataAccess;
import net.caffeinemc.mods.sodium.client.model.light.smooth.AoNeighborInfo;

class AoFaceData {
    public final int[] lm = new int[4];
    public final float[] ao = new float[4];
    public final float[] bl = new float[4];
    public final float[] sl = new float[4];
    private int flags;

    AoFaceData() {
    }

    public void reset() {
        this.flags = 0;
    }

    private static float weightedSum(float[] fArray, float[] fArray2) {
        float f = fArray[0] * fArray2[0];
        float f2 = fArray[1] * fArray2[1];
        float f3 = fArray[2] * fArray2[2];
        float f4 = fArray[3] * fArray2[3];
        return f + f2 + f3 + f4;
    }

    public boolean hasLightData() {
        return (this.flags & 1) != 0;
    }

    public void unpackLightData() {
        int[] nArray = this.lm;
        float[] fArray = this.bl;
        float[] fArray2 = this.sl;
        fArray[0] = AoFaceData.unpackBlockLight(nArray[0]);
        fArray[1] = AoFaceData.unpackBlockLight(nArray[1]);
        fArray[2] = AoFaceData.unpackBlockLight(nArray[2]);
        fArray[3] = AoFaceData.unpackBlockLight(nArray[3]);
        fArray2[0] = AoFaceData.unpackSkyLight(nArray[0]);
        fArray2[1] = AoFaceData.unpackSkyLight(nArray[1]);
        fArray2[2] = AoFaceData.unpackSkyLight(nArray[2]);
        fArray2[3] = AoFaceData.unpackSkyLight(nArray[3]);
        this.flags |= 2;
    }

    private static float unpackBlockLight(int n) {
        return n & 0xFF;
    }

    static AoFaceData weightedMean(AoFaceData aoFaceData, float f, AoFaceData aoFaceData2, float f2, AoFaceData aoFaceData3) {
        aoFaceData3.ao[0] = aoFaceData.ao[0] * f + aoFaceData2.ao[0] * f2;
        aoFaceData3.ao[1] = aoFaceData.ao[1] * f + aoFaceData2.ao[1] * f2;
        aoFaceData3.ao[2] = aoFaceData.ao[2] * f + aoFaceData2.ao[2] * f2;
        aoFaceData3.ao[3] = aoFaceData.ao[3] * f + aoFaceData2.ao[3] * f2;
        if (!aoFaceData.hasUnpackedLightData()) {
            aoFaceData.unpackLightData();
        }
        if (!aoFaceData2.hasUnpackedLightData()) {
            aoFaceData2.unpackLightData();
        }
        aoFaceData3.bl[0] = (int)(aoFaceData.bl[0] * f + aoFaceData2.bl[0] * f2);
        aoFaceData3.bl[1] = (int)(aoFaceData.bl[1] * f + aoFaceData2.bl[1] * f2);
        aoFaceData3.bl[2] = (int)(aoFaceData.bl[2] * f + aoFaceData2.bl[2] * f2);
        aoFaceData3.bl[3] = (int)(aoFaceData.bl[3] * f + aoFaceData2.bl[3] * f2);
        aoFaceData3.sl[0] = (int)(aoFaceData.sl[0] * f + aoFaceData2.sl[0] * f2);
        aoFaceData3.sl[1] = (int)(aoFaceData.sl[1] * f + aoFaceData2.sl[1] * f2);
        aoFaceData3.sl[2] = (int)(aoFaceData.sl[2] * f + aoFaceData2.sl[2] * f2);
        aoFaceData3.sl[3] = (int)(aoFaceData.sl[3] * f + aoFaceData2.sl[3] * f2);
        aoFaceData3.lm[0] = AoFaceData.packLight(aoFaceData3.sl[0], aoFaceData3.bl[0]);
        aoFaceData3.lm[1] = AoFaceData.packLight(aoFaceData3.sl[1], aoFaceData3.bl[1]);
        aoFaceData3.lm[2] = AoFaceData.packLight(aoFaceData3.sl[2], aoFaceData3.bl[2]);
        aoFaceData3.lm[3] = AoFaceData.packLight(aoFaceData3.sl[3], aoFaceData3.bl[3]);
        return aoFaceData3;
    }

    public float getBlendedSkyLight(float[] fArray) {
        return AoFaceData.weightedSum(this.sl, fArray);
    }

    public void initLightData(LightDataAccess lightDataAccess, class07209 class072092, class07211 class072112, boolean bl) {
        boolean bl2;
        float f;
        int n;
        boolean bl3;
        float f2;
        int n2;
        boolean bl4;
        float f3;
        int n3;
        boolean bl5;
        float f4;
        int n4;
        boolean bl6;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = class072092.method_10263();
        int n10 = class072092.method_10264();
        int n11 = class072092.method_10260();
        if (bl) {
            n8 = n9 + class072112.P();
            n7 = n10 + class072112.s();
            n6 = n11 + class072112.T();
        } else {
            n8 = n9;
            n7 = n10;
            n6 = n11;
        }
        int n12 = lightDataAccess.get(n8, n7, n6);
        if (bl && ArrayLightDataCache.unpackFO(n12)) {
            int n13 = lightDataAccess.get(n9, n10, n11);
            n5 = ArrayLightDataCache.getLightmap(n13);
            bl6 = ArrayLightDataCache.unpackEM(n13);
        } else {
            n5 = ArrayLightDataCache.getLightmap(n12);
            bl6 = ArrayLightDataCache.unpackEM(n12);
        }
        float f5 = ArrayLightDataCache.unpackAO(n12);
        class07211[] class07211Array = AoNeighborInfo.get((class07211)class072112).faces;
        int n14 = lightDataAccess.get(n8, n7, n6, class07211Array[0]);
        int n15 = ArrayLightDataCache.getLightmap(n14);
        float f6 = ArrayLightDataCache.unpackAO(n14);
        boolean bl7 = ArrayLightDataCache.unpackOP(n14);
        boolean bl8 = ArrayLightDataCache.unpackEM(n14);
        int n16 = lightDataAccess.get(n8, n7, n6, class07211Array[1]);
        int n17 = ArrayLightDataCache.getLightmap(n16);
        float f7 = ArrayLightDataCache.unpackAO(n16);
        boolean bl9 = ArrayLightDataCache.unpackOP(n16);
        boolean bl10 = ArrayLightDataCache.unpackEM(n16);
        int n18 = lightDataAccess.get(n8, n7, n6, class07211Array[2]);
        int n19 = ArrayLightDataCache.getLightmap(n18);
        float f8 = ArrayLightDataCache.unpackAO(n18);
        boolean bl11 = ArrayLightDataCache.unpackOP(n18);
        boolean bl12 = ArrayLightDataCache.unpackEM(n18);
        int n20 = lightDataAccess.get(n8, n7, n6, class07211Array[3]);
        int n21 = ArrayLightDataCache.getLightmap(n20);
        float f9 = ArrayLightDataCache.unpackAO(n20);
        boolean bl13 = ArrayLightDataCache.unpackOP(n20);
        boolean bl14 = ArrayLightDataCache.unpackEM(n20);
        if (bl11 && bl7) {
            n4 = n15;
            f4 = f6;
            bl5 = bl8;
        } else {
            n3 = lightDataAccess.get(n8, n7, n6, class07211Array[0], class07211Array[2]);
            n4 = ArrayLightDataCache.getLightmap(n3);
            f4 = ArrayLightDataCache.unpackAO(n3);
            bl5 = ArrayLightDataCache.unpackEM(n3);
        }
        if (bl13 && bl7) {
            n3 = n15;
            f3 = f6;
            bl4 = bl8;
        } else {
            n2 = lightDataAccess.get(n8, n7, n6, class07211Array[0], class07211Array[3]);
            n3 = ArrayLightDataCache.getLightmap(n2);
            f3 = ArrayLightDataCache.unpackAO(n2);
            bl4 = ArrayLightDataCache.unpackEM(n2);
        }
        if (bl11 && bl9) {
            n2 = n17;
            f2 = f7;
            bl3 = bl10;
        } else {
            n = lightDataAccess.get(n8, n7, n6, class07211Array[1], class07211Array[2]);
            n2 = ArrayLightDataCache.getLightmap(n);
            f2 = ArrayLightDataCache.unpackAO(n);
            bl3 = ArrayLightDataCache.unpackEM(n);
        }
        if (bl13 && bl9) {
            n = n17;
            f = f7;
            bl2 = bl10;
        } else {
            int n22 = lightDataAccess.get(n8, n7, n6, class07211Array[1], class07211Array[3]);
            n = ArrayLightDataCache.getLightmap(n22);
            f = ArrayLightDataCache.unpackAO(n22);
            bl2 = ArrayLightDataCache.unpackEM(n22);
        }
        float[] fArray = this.ao;
        fArray[0] = (f9 + f6 + f3 + f5) * 0.25f;
        fArray[1] = (f8 + f6 + f4 + f5) * 0.25f;
        fArray[2] = (f8 + f7 + f2 + f5) * 0.25f;
        fArray[3] = (f9 + f7 + f + f5) * 0.25f;
        int[] nArray = this.lm;
        nArray[0] = AoFaceData.calculateCornerBrightness(n21, n15, n3, n5, bl14, bl8, bl4, bl6);
        nArray[1] = AoFaceData.calculateCornerBrightness(n19, n15, n4, n5, bl12, bl8, bl5, bl6);
        nArray[2] = AoFaceData.calculateCornerBrightness(n19, n17, n2, n5, bl12, bl10, bl3, bl6);
        nArray[3] = AoFaceData.calculateCornerBrightness(n21, n17, n, n5, bl14, bl10, bl2, bl6);
        this.flags |= 1;
    }

    public float getBlendedShade(float[] fArray) {
        return AoFaceData.weightedSum(this.ao, fArray);
    }

    private static float unpackSkyLight(int n) {
        return n >> 16 & 0xFF;
    }

    private static int calculateCornerBrightness(int n, int n2, int n3, int n4, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n5;
        int n6 = n & 0xFF;
        int n7 = n2 & 0xFF;
        int n8 = n3 & 0xFF;
        int n9 = n4 & 0xFF;
        if (n6 == 0 || n7 == 0 || n8 == 0 || n9 == 0) {
            n5 = AoFaceData.minNonZero(AoFaceData.minNonZero(n6, n7), AoFaceData.minNonZero(n8, n9));
            n6 = Math.max(n6, n5);
            n7 = Math.max(n7, n5);
            n8 = Math.max(n8, n5);
            n9 = Math.max(n9, n5);
        }
        n5 = n & 0xFF0000;
        int n10 = n2 & 0xFF0000;
        int n11 = n3 & 0xFF0000;
        int n12 = n4 & 0xFF0000;
        if (n5 == 0 || n10 == 0 || n11 == 0 || n12 == 0) {
            int n13 = AoFaceData.minNonZero(AoFaceData.minNonZero(n5, n10), AoFaceData.minNonZero(n11, n12));
            n5 = Math.max(n5, n13);
            n10 = Math.max(n10, n13);
            n11 = Math.max(n11, n13);
            n12 = Math.max(n12, n13);
        }
        n = n6 | n5;
        n2 = n7 | n10;
        n3 = n8 | n11;
        n4 = n9 | n12;
        if (bl) {
            n &= 0xFF0000;
            n |= 0xF0;
        }
        if (bl2) {
            n2 &= 0xFF0000;
            n2 |= 0xF0;
        }
        if (bl3) {
            n3 &= 0xFF0000;
            n3 |= 0xF0;
        }
        if (bl4) {
            n4 &= 0xFF0000;
            n4 |= 0xF0;
        }
        return n + n2 + n3 + n4 >> 2 & 0xFF00FF;
    }

    public float getBlendedBlockLight(float[] fArray) {
        return AoFaceData.weightedSum(this.bl, fArray);
    }

    public boolean hasUnpackedLightData() {
        return (this.flags & 2) != 0;
    }

    private static int minNonZero(int n, int n2) {
        if (n == 0) {
            return n2;
        }
        if (n2 == 0) {
            return n;
        }
        return Math.min(n, n2);
    }

    private static int packLight(float f, float f2) {
        return ((int)f & 0xFF) << 16 | (int)f2 & 0xFF;
    }
}

