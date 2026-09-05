/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class02020
 *  minecraft.class02022
 *  minecraft.class02023
 *  minecraft.class02032
 *  minecraft.class04995
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07295
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  net.fabricmc.fabric.impl.client.indigo.renderer.mesh.QuadViewImpl
 *  net.fabricmc.fabric.impl.client.indigo.renderer.render.BlockRenderInfo
 *  net.fabricmc.fabric.impl.client.indigo.renderer.render.LightDataProvider
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.aocalc;

import minecraft.class00500;
import minecraft.class00753;
import minecraft.class02020;
import minecraft.class02022;
import minecraft.class02023;
import minecraft.class02032;
import minecraft.class04995;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07295;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.impl.client.indigo.Indigo;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoConfig;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoFace;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoFaceData;
import net.fabricmc.fabric.impl.client.indigo.renderer.helper.GeometryHelper;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.QuadViewImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.BlockRenderInfo;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.LightDataProvider;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public class AoCalculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(AoCalculator.class);
    private final BlockRenderInfo blockInfo;
    private final LightDataProvider dataProvider;
    private final class07218 lightPos = new class07218();
    private final class07218 searchPos = new class07218();
    private final AoFaceData[] faceData = new AoFaceData[24];
    private int completionFlags = 0;
    private final float[] w = new float[4];
    public final float[] ao = new float[4];
    public final int[] light = new int[4];
    private final class02032 vanillaCalc = new class02032();
    private final Vector3f vanillaPos0 = new Vector3f();
    private final Vector3f vanillaPos1 = new Vector3f();
    private final Vector3f vanillaPos2 = new Vector3f();
    private final Vector3f vanillaPos3 = new Vector3f();
    private final AoFaceData tmpFace = new AoFaceData();
    private final Vector3f vertexNormal = new Vector3f();

    public AoCalculator(BlockRenderInfo blockRenderInfo, LightDataProvider lightDataProvider) {
        this.blockInfo = blockRenderInfo;
        this.dataProvider = lightDataProvider;
        for (int i = 0; i < 24; ++i) {
            this.faceData[i] = new AoFaceData();
        }
    }

    public void clear() {
        this.completionFlags = 0;
    }

    public void compute(QuadViewImpl quadViewImpl, boolean bl) {
        AoConfig aoConfig = Indigo.AMBIENT_OCCLUSION_MODE;
        switch (aoConfig) {
            case VANILLA: {
                this.calcVanilla(quadViewImpl);
                break;
            }
            case EMULATE: {
                this.calcFastVanilla(quadViewImpl);
                break;
            }
            case HYBRID: {
                if (bl) {
                    this.calcFastVanilla(quadViewImpl);
                    break;
                }
                this.calcEnhanced(quadViewImpl);
                break;
            }
            case ENHANCED: {
                this.calcEnhanced(quadViewImpl);
            }
        }
        if (Indigo.DEBUG_COMPARE_LIGHTING && bl && (aoConfig == AoConfig.EMULATE || aoConfig == AoConfig.HYBRID)) {
            float[] fArray = new float[4];
            int[] nArray = new int[4];
            this.calcVanilla(quadViewImpl, fArray, nArray);
            for (int i = 0; i < 4; ++i) {
                if (this.light[i] == nArray[i] && class04995.y((float)this.ao[i], (float)fArray[i])) continue;
                LOGGER.info(String.format("Mismatch for %s @ %s", this.blockInfo.blockState.toString(), this.blockInfo.blockPos.toString()));
                LOGGER.info(String.format("Flags = %d, LightFace = %s", quadViewImpl.geometryFlags(), quadViewImpl.lightFace().toString()));
                LOGGER.info(String.format("    Old Brightness: %.2f, %.2f, %.2f, %.2f", Float.valueOf(fArray[0]), Float.valueOf(fArray[1]), Float.valueOf(fArray[2]), Float.valueOf(fArray[3])));
                LOGGER.info(String.format("    New Brightness: %.2f, %.2f, %.2f, %.2f", Float.valueOf(this.ao[0]), Float.valueOf(this.ao[1]), Float.valueOf(this.ao[2]), Float.valueOf(this.ao[3])));
                LOGGER.info(String.format("    Old Light: %s, %s, %s, %s", Integer.toHexString(nArray[0]), Integer.toHexString(nArray[1]), Integer.toHexString(nArray[2]), Integer.toHexString(nArray[3])));
                LOGGER.info(String.format("    New Light: %s, %s, %s, %s", Integer.toHexString(this.light[0]), Integer.toHexString(this.light[1]), Integer.toHexString(this.light[2]), Integer.toHexString(this.light[3])));
                break;
            }
        }
    }

    private void fullFace(QuadViewImpl quadViewImpl, class07211 class072112, AoFaceData aoFaceData) {
        aoFaceData.toArrays(this.ao, this.light, AoFace.get((class07211)class072112).vertexMap, GeometryHelper.firstCubicVertex((QuadView)quadViewImpl));
    }

    private static int meanLight(int n, int n2, int n3, int n4, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (Indigo.FIX_MEAN_LIGHT_CALCULATION) {
            int n5 = n & 0xFFFF;
            int n6 = n >>> 16 & 0xFFFF;
            int n7 = n2 & 0xFFFF;
            int n8 = n2 >>> 16 & 0xFFFF;
            int n9 = n3 & 0xFFFF;
            int n10 = n3 >>> 16 & 0xFFFF;
            int n11 = n4 & 0xFFFF;
            int n12 = n4 >>> 16 & 0xFFFF;
            int n13 = 65536;
            int n14 = 65536;
            if (bl) {
                n13 = n5;
                n14 = n6;
            }
            if (bl2) {
                n13 = Math.min(n13, n7);
                n14 = Math.min(n14, n8);
            }
            if (bl3) {
                n13 = Math.min(n13, n9);
                n14 = Math.min(n14, n10);
            }
            if (bl4) {
                n13 = Math.min(n13, n11);
                n14 = Math.min(n14, n12);
            }
            n = Math.max(n6, n14 &= 0xFFFF) << 16 | Math.max(n5, n13 &= 0xFFFF);
            n2 = Math.max(n8, n14) << 16 | Math.max(n7, n13);
            n3 = Math.max(n10, n14) << 16 | Math.max(n9, n13);
            n4 = Math.max(n12, n14) << 16 | Math.max(n11, n13);
            return AoCalculator.meanInnerLight(n, n2, n3, n4);
        }
        return AoCalculator.vanillaMeanLight(n, n2, n3, n4);
    }

    private AoFaceData gatherInsetFace(QuadViewImpl quadViewImpl, int n, class07211 class072112, boolean bl) {
        float f = AoFace.get(class072112).computeDepth(quadViewImpl, n);
        if (class04995.y((float)f, (float)0.0f)) {
            return this.computeFace(class072112, true, bl);
        }
        if (class04995.y((float)f, (float)1.0f)) {
            return this.computeFace(class072112, false, bl);
        }
        float f2 = 1.0f - f;
        return AoFaceData.weightedMean(this.computeFace(class072112, true, bl), f2, this.computeFace(class072112, false, bl), f, this.tmpFace);
    }

    private void blendedFullFace(QuadViewImpl quadViewImpl, class07211 class072112, boolean bl) {
        this.fullFace(quadViewImpl, class072112, this.blendedInsetFace(quadViewImpl, 0, class072112, bl));
    }

    private void calcEnhanced(QuadViewImpl quadViewImpl) {
        switch (quadViewImpl.geometryFlags()) {
            case 7: {
                this.vanillaFullFace(quadViewImpl, quadViewImpl.lightFace(), true, quadViewImpl.diffuseShade());
                break;
            }
            case 6: {
                this.vanillaPartialFace(quadViewImpl, quadViewImpl.lightFace(), true, quadViewImpl.diffuseShade());
                break;
            }
            case 3: {
                this.blendedFullFace(quadViewImpl, quadViewImpl.lightFace(), quadViewImpl.diffuseShade());
                break;
            }
            case 2: {
                this.blendedPartialFace(quadViewImpl, quadViewImpl.lightFace(), quadViewImpl.diffuseShade());
                break;
            }
            default: {
                this.irregularFace(quadViewImpl, quadViewImpl.diffuseShade());
            }
        }
    }

    private void vanillaPartialFace(QuadViewImpl quadViewImpl, class07211 class072112, boolean bl, boolean bl2) {
        this.partialFace(quadViewImpl, class072112, this.computeFace(class072112, bl, bl2));
    }

    private static int vanillaMeanLight(int n, int n2, int n3, int n4) {
        if (n == 0) {
            n = n4;
        }
        if (n2 == 0) {
            n2 = n4;
        }
        if (n3 == 0) {
            n3 = n4;
        }
        return n + n2 + n3 + n4 >> 2 & 0xFF00FF;
    }

    private static int meanInnerLight(int n, int n2, int n3, int n4) {
        return n + n2 + n3 + n4 >> 2 & 0xFF00FF;
    }

    private void calcFastVanilla(QuadViewImpl quadViewImpl) {
        boolean bl;
        int n = quadViewImpl.geometryFlags();
        boolean bl2 = bl = (n & 4) != 0;
        if (!bl && (n & 2) != 0 && this.blockInfo.blockState.W((class07290)this.blockInfo.blockView, this.blockInfo.blockPos)) {
            bl = true;
        }
        if ((n & 1) == 0) {
            this.vanillaPartialFace(quadViewImpl, quadViewImpl.lightFace(), bl, quadViewImpl.diffuseShade());
        } else {
            this.vanillaFullFace(quadViewImpl, quadViewImpl.lightFace(), bl, quadViewImpl.diffuseShade());
        }
    }

    private void vanillaFullFace(QuadViewImpl quadViewImpl, class07211 class072112, boolean bl, boolean bl2) {
        this.fullFace(quadViewImpl, class072112, this.computeFace(class072112, bl, bl2));
    }

    private void irregularFace(QuadViewImpl quadViewImpl, boolean bl) {
        Vector3fc vector3fc = quadViewImpl.faceNormal();
        float[] fArray = this.w;
        float[] fArray2 = this.ao;
        int[] nArray = this.light;
        for (int i = 0; i < 4; ++i) {
            float f;
            int n;
            float f2;
            int n2;
            float f3;
            AoFaceData aoFaceData;
            Vector3fc vector3fc2 = quadViewImpl.hasNormal(i) ? quadViewImpl.copyNormal(i, this.vertexNormal) : vector3fc;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            float f7 = 0.0f;
            int n3 = 0;
            int n4 = 0;
            float f8 = vector3fc2.x();
            if (!class04995.y((float)0.0f, (float)f8)) {
                class07211 class072112 = f8 > 0.0f ? class07211.field_11034 : class07211.field_11039;
                aoFaceData = this.gatherInsetFace(quadViewImpl, i, class072112, bl);
                AoFace.get(class072112).computeCornerWeights(quadViewImpl, i, fArray);
                float f9 = f8 * f8;
                f3 = aoFaceData.weightedAo(fArray);
                int n5 = aoFaceData.weightedSkyLight(fArray);
                n2 = aoFaceData.weightedBlockLight(fArray);
                f4 += f9 * f3;
                f5 += f9 * (float)n5;
                f6 += f9 * (float)n2;
                f7 = f3;
                n3 = n5;
                n4 = n2;
            }
            if (!class04995.y((float)0.0f, (float)(f2 = vector3fc2.y()))) {
                aoFaceData = f2 > 0.0f ? class07211.field_11036 : class07211.field_11033;
                AoFaceData aoFaceData2 = this.gatherInsetFace(quadViewImpl, i, (class07211)aoFaceData, bl);
                AoFace.get((class07211)aoFaceData).computeCornerWeights(quadViewImpl, i, fArray);
                f3 = f2 * f2;
                float f10 = aoFaceData2.weightedAo(fArray);
                n2 = aoFaceData2.weightedSkyLight(fArray);
                n = aoFaceData2.weightedBlockLight(fArray);
                f4 += f3 * f10;
                f5 += f3 * (float)n2;
                f6 += f3 * (float)n;
                f7 = Math.max(f7, f10);
                n3 = Math.max(n3, n2);
                n4 = Math.max(n4, n);
            }
            if (!class04995.y((float)0.0f, (float)(f = vector3fc2.z()))) {
                class07211 class072113 = f > 0.0f ? class07211.field_11035 : class07211.field_11043;
                AoFaceData aoFaceData3 = this.gatherInsetFace(quadViewImpl, i, class072113, bl);
                AoFace.get(class072113).computeCornerWeights(quadViewImpl, i, fArray);
                float f11 = f * f;
                float f12 = aoFaceData3.weightedAo(fArray);
                n = aoFaceData3.weightedSkyLight(fArray);
                int n6 = aoFaceData3.weightedBlockLight(fArray);
                f4 += f11 * f12;
                f5 += f11 * (float)n;
                f6 += f11 * (float)n6;
                f7 = Math.max(f7, f12);
                n3 = Math.max(n3, n);
                n4 = Math.max(n4, n6);
            }
            fArray2[i] = (f4 + f7) * 0.5f;
            nArray[i] = ((int)((f5 + (float)n3) * 0.5f) & 0xFF) << 16 | (int)((f6 + (float)n4) * 0.5f) & 0xFF;
        }
    }

    private AoFaceData blendedInsetFace(QuadViewImpl quadViewImpl, int n, class07211 class072112, boolean bl) {
        float f = AoFace.get(class072112).computeDepth(quadViewImpl, n);
        float f2 = 1.0f - f;
        return AoFaceData.weightedMean(this.computeFace(class072112, true, bl), f2, this.computeFace(class072112, false, bl), f, this.tmpFace);
    }

    private void partialFace(QuadViewImpl quadViewImpl, class07211 class072112, AoFaceData aoFaceData) {
        AoFace aoFace = AoFace.get(class072112);
        float[] fArray = this.w;
        for (int i = 0; i < 4; ++i) {
            aoFace.computeCornerWeights(quadViewImpl, i, fArray);
            this.light[i] = aoFaceData.weightedCombinedLight(fArray);
            this.ao[i] = aoFaceData.weightedAo(fArray);
        }
    }

    private void calcVanilla(QuadViewImpl quadViewImpl) {
        this.calcVanilla(quadViewImpl, this.ao, this.light);
    }

    private void calcVanilla(QuadViewImpl quadViewImpl, float[] fArray, int[] nArray) {
        class02022 class020222 = new class02022((Vector3fc)quadViewImpl.copyPos(0, this.vanillaPos0), (Vector3fc)quadViewImpl.copyPos(1, this.vanillaPos1), (Vector3fc)quadViewImpl.copyPos(2, this.vanillaPos2), (Vector3fc)quadViewImpl.copyPos(3, this.vanillaPos3), 0L, 0L, 0L, 0L, -1, quadViewImpl.lightFace(), null, true, 0);
        class02020.N((class07295)this.blockInfo.blockView, (class00500)this.blockInfo.blockState, (class07209)this.blockInfo.blockPos, (class02022)class020222, (class02023)this.vanillaCalc);
        this.vanillaCalc.N(this.blockInfo.blockView, this.blockInfo.blockState, this.blockInfo.blockPos, quadViewImpl.lightFace(), quadViewImpl.diffuseShade());
        System.arraycopy(this.vanillaCalc.u, 0, fArray, 0, 4);
        System.arraycopy(this.vanillaCalc.i, 0, nArray, 0, 4);
    }

    private void blendedPartialFace(QuadViewImpl quadViewImpl, class07211 class072112, boolean bl) {
        this.partialFace(quadViewImpl, class072112, this.blendedInsetFace(quadViewImpl, 0, class072112, bl));
    }

    private AoFaceData computeFace(class07211 class072112, boolean bl, boolean bl2) {
        int n = bl2 ? (bl ? class072112.L() : class072112.L() + 6) : (bl ? class072112.L() + 12 : class072112.L() + 18);
        int n2 = 1 << n;
        AoFaceData aoFaceData = this.faceData[n];
        if ((this.completionFlags & n2) == 0) {
            this.completionFlags |= n2;
            this.computeFace(aoFaceData, class072112, bl, bl2);
        }
        return aoFaceData;
    }

    private void computeFace(AoFaceData aoFaceData, class07211 class072112, boolean bl, boolean bl2) {
        boolean bl3;
        int n;
        boolean bl4;
        int n2;
        float f;
        boolean bl5;
        int n3;
        float f2;
        boolean bl6;
        int n4;
        float f3;
        boolean bl7;
        int n5;
        float f4;
        boolean bl8;
        class07295 class072952 = this.blockInfo.blockView;
        class07209 class072092 = this.blockInfo.blockPos;
        class00500 class005002 = this.blockInfo.blockState;
        class07218 class072182 = this.lightPos;
        class07218 class072183 = this.searchPos;
        if (bl) {
            class072182.N((class00753)class072092, class072112);
        } else {
            class072182.N((class00753)class072092);
        }
        AoFace aoFace = AoFace.get(class072112);
        class072183.N((class00753)class072182, aoFace.neighbors[0]);
        class00500 class005003 = class072952.method_8320((class07209)class072183);
        int n6 = this.dataProvider.light((class07209)class072183, class005003);
        float f5 = this.dataProvider.ao((class07209)class072183, class005003);
        if (!Indigo.FIX_SMOOTH_LIGHTING_OFFSET) {
            class072183.N(class072112);
            class005003 = class072952.method_8320((class07209)class072183);
        }
        boolean bl9 = !class005003.U((class07290)class072952, (class07209)class072183) || class005003.z() == 0;
        class072183.N((class00753)class072182, aoFace.neighbors[1]);
        class005003 = class072952.method_8320((class07209)class072183);
        int n7 = this.dataProvider.light((class07209)class072183, class005003);
        float f6 = this.dataProvider.ao((class07209)class072183, class005003);
        if (!Indigo.FIX_SMOOTH_LIGHTING_OFFSET) {
            class072183.N(class072112);
            class005003 = class072952.method_8320((class07209)class072183);
        }
        boolean bl10 = !class005003.U((class07290)class072952, (class07209)class072183) || class005003.z() == 0;
        class072183.N((class00753)class072182, aoFace.neighbors[2]);
        class005003 = class072952.method_8320((class07209)class072183);
        int n8 = this.dataProvider.light((class07209)class072183, class005003);
        float f7 = this.dataProvider.ao((class07209)class072183, class005003);
        if (!Indigo.FIX_SMOOTH_LIGHTING_OFFSET) {
            class072183.N(class072112);
            class005003 = class072952.method_8320((class07209)class072183);
        }
        boolean bl11 = !class005003.U((class07290)class072952, (class07209)class072183) || class005003.z() == 0;
        class072183.N((class00753)class072182, aoFace.neighbors[3]);
        class005003 = class072952.method_8320((class07209)class072183);
        int n9 = this.dataProvider.light((class07209)class072183, class005003);
        float f8 = this.dataProvider.ao((class07209)class072183, class005003);
        if (!Indigo.FIX_SMOOTH_LIGHTING_OFFSET) {
            class072183.N(class072112);
            class005003 = class072952.method_8320((class07209)class072183);
        }
        boolean bl12 = bl8 = !class005003.U((class07290)class072952, (class07209)class072183) || class005003.z() == 0;
        if (!bl11 && !bl9) {
            f4 = f5;
            n5 = n6;
            bl7 = false;
        } else {
            class072183.N((class00753)class072182, aoFace.neighbors[0]).N(aoFace.neighbors[2]);
            class005003 = class072952.method_8320((class07209)class072183);
            f4 = this.dataProvider.ao((class07209)class072183, class005003);
            n5 = this.dataProvider.light((class07209)class072183, class005003);
            boolean bl13 = bl7 = !class005003.U((class07290)class072952, (class07209)class072183) || class005003.z() == 0;
        }
        if (!bl8 && !bl9) {
            f3 = f5;
            n4 = n6;
            bl6 = false;
        } else {
            class072183.N((class00753)class072182, aoFace.neighbors[0]).N(aoFace.neighbors[3]);
            class005003 = class072952.method_8320((class07209)class072183);
            f3 = this.dataProvider.ao((class07209)class072183, class005003);
            n4 = this.dataProvider.light((class07209)class072183, class005003);
            boolean bl14 = bl6 = !class005003.U((class07290)class072952, (class07209)class072183) || class005003.z() == 0;
        }
        if (!bl11 && !bl10) {
            f2 = f6;
            n3 = n7;
            bl5 = false;
        } else {
            class072183.N((class00753)class072182, aoFace.neighbors[1]).N(aoFace.neighbors[2]);
            class005003 = class072952.method_8320((class07209)class072183);
            f2 = this.dataProvider.ao((class07209)class072183, class005003);
            n3 = this.dataProvider.light((class07209)class072183, class005003);
            boolean bl15 = bl5 = !class005003.U((class07290)class072952, (class07209)class072183) || class005003.z() == 0;
        }
        if (!bl8 && !bl10) {
            f = f6;
            n2 = n7;
            bl4 = false;
        } else {
            class072183.N((class00753)class072182, aoFace.neighbors[1]).N(aoFace.neighbors[3]);
            class005003 = class072952.method_8320((class07209)class072183);
            f = this.dataProvider.ao((class07209)class072183, class005003);
            n2 = this.dataProvider.light((class07209)class072183, class005003);
            bl4 = !class005003.U((class07290)class072952, (class07209)class072183) || class005003.z() == 0;
        }
        class072183.N((class00753)class072092, class072112);
        class005003 = class072952.method_8320((class07209)class072183);
        if (bl && !class005003.t()) {
            n = this.dataProvider.light((class07209)class072183, class005003);
            bl3 = !class005003.U((class07290)class072952, (class07209)class072183) || class005003.z() == 0;
        } else {
            n = this.dataProvider.light(class072092, class005002);
            bl3 = !class005002.U((class07290)class072952, class072092) || class005002.z() == 0;
        }
        float f9 = this.dataProvider.ao((class07209)class072182, class072952.method_8320((class07209)class072182));
        float f10 = class072952.method_24852(class072112, bl2);
        aoFaceData.a0 = (f8 + f5 + f3 + f9) * 0.25f * f10;
        aoFaceData.a1 = (f7 + f5 + f4 + f9) * 0.25f * f10;
        aoFaceData.a2 = (f7 + f6 + f2 + f9) * 0.25f * f10;
        aoFaceData.a3 = (f8 + f6 + f + f9) * 0.25f * f10;
        aoFaceData.l0(AoCalculator.meanLight(n9, n6, n4, n, bl8, bl9, bl6, bl3));
        aoFaceData.l1(AoCalculator.meanLight(n8, n6, n5, n, bl11, bl9, bl7, bl3));
        aoFaceData.l2(AoCalculator.meanLight(n8, n7, n3, n, bl11, bl10, bl5, bl3));
        aoFaceData.l3(AoCalculator.meanLight(n9, n7, n2, n, bl8, bl10, bl4, bl3));
    }
}

