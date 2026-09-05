/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.aocalc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
class AoFaceData {
    float a0;
    float a1;
    float a2;
    float a3;
    int b0;
    int b1;
    int b2;
    int b3;
    int s0;
    int s1;
    int s2;
    int s3;

    AoFaceData() {
    }

    void l1(int n) {
        this.b1 = n & 0xFFFF;
        this.s1 = n >>> 16 & 0xFFFF;
    }

    void l2(int n) {
        this.b2 = n & 0xFFFF;
        this.s2 = n >>> 16 & 0xFFFF;
    }

    int weightedCombinedLight(float[] fArray) {
        return this.weightedSkyLight(fArray) << 16 | this.weightedBlockLight(fArray);
    }

    void toArrays(float[] fArray, int[] nArray, int[] nArray2, int n) {
        int n2 = nArray2[n];
        int n3 = nArray2[(n + 1) % 4];
        int n4 = nArray2[(n + 2) % 4];
        int n5 = nArray2[(n + 3) % 4];
        fArray[n2] = this.a0;
        fArray[n3] = this.a1;
        fArray[n4] = this.a2;
        fArray[n5] = this.a3;
        nArray[n2] = this.s0 << 16 | this.b0;
        nArray[n3] = this.s1 << 16 | this.b1;
        nArray[n4] = this.s2 << 16 | this.b2;
        nArray[n5] = this.s3 << 16 | this.b3;
    }

    float weightedAo(float[] fArray) {
        return this.a0 * fArray[0] + this.a1 * fArray[1] + this.a2 * fArray[2] + this.a3 * fArray[3];
    }

    static AoFaceData weightedMean(AoFaceData aoFaceData, float f, AoFaceData aoFaceData2, float f2, AoFaceData aoFaceData3) {
        aoFaceData3.a0 = aoFaceData.a0 * f + aoFaceData2.a0 * f2;
        aoFaceData3.a1 = aoFaceData.a1 * f + aoFaceData2.a1 * f2;
        aoFaceData3.a2 = aoFaceData.a2 * f + aoFaceData2.a2 * f2;
        aoFaceData3.a3 = aoFaceData.a3 * f + aoFaceData2.a3 * f2;
        aoFaceData3.b0 = (int)((float)aoFaceData.b0 * f + (float)aoFaceData2.b0 * f2);
        aoFaceData3.b1 = (int)((float)aoFaceData.b1 * f + (float)aoFaceData2.b1 * f2);
        aoFaceData3.b2 = (int)((float)aoFaceData.b2 * f + (float)aoFaceData2.b2 * f2);
        aoFaceData3.b3 = (int)((float)aoFaceData.b3 * f + (float)aoFaceData2.b3 * f2);
        aoFaceData3.s0 = (int)((float)aoFaceData.s0 * f + (float)aoFaceData2.s0 * f2);
        aoFaceData3.s1 = (int)((float)aoFaceData.s1 * f + (float)aoFaceData2.s1 * f2);
        aoFaceData3.s2 = (int)((float)aoFaceData.s2 * f + (float)aoFaceData2.s2 * f2);
        aoFaceData3.s3 = (int)((float)aoFaceData.s3 * f + (float)aoFaceData2.s3 * f2);
        return aoFaceData3;
    }

    int weightedBlockLight(float[] fArray) {
        return (int)((float)this.b0 * fArray[0] + (float)this.b1 * fArray[1] + (float)this.b2 * fArray[2] + (float)this.b3 * fArray[3]) & 0xFF;
    }

    int weightedSkyLight(float[] fArray) {
        return (int)((float)this.s0 * fArray[0] + (float)this.s1 * fArray[1] + (float)this.s2 * fArray[2] + (float)this.s3 * fArray[3]) & 0xFF;
    }

    void l0(int n) {
        this.b0 = n & 0xFFFF;
        this.s0 = n >>> 16 & 0xFFFF;
    }

    void l3(int n) {
        this.b3 = n & 0xFFFF;
        this.s3 = n >>> 16 & 0xFFFF;
    }
}

