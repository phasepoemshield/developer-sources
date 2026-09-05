/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01391
 *  minecraft.class02566
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class08743
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode
 *  net.fabricmc.fabric.impl.client.indigo.Indigo
 *  net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoCalculator
 *  net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoConfig
 *  net.fabricmc.fabric.impl.client.indigo.renderer.helper.ColorHelper
 *  org.joml.Vector3fc
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.render;

import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01391;
import minecraft.class02566;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode;
import net.fabricmc.fabric.impl.client.indigo.Indigo;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoCalculator;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoConfig;
import net.fabricmc.fabric.impl.client.indigo.renderer.helper.ColorHelper;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableQuadViewImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.QuadViewImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.AbstractRenderContext;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.BlockRenderInfo;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.LightDataProvider;
import org.joml.Vector3fc;

@Environment(value=EnvType.CLIENT)
public abstract class AbstractTerrainRenderContext
extends AbstractRenderContext {
    protected final BlockRenderInfo blockInfo = new BlockRenderInfo();
    protected final LightDataProvider lightDataProvider;
    private final AoCalculator aoCalc;
    private int cachedTintIndex = -1;
    private int cachedTint;
    private final class07218 lightPos = new class07218();

    protected void prepare(class07209 class072092, class00500 class005002) {
        this.blockInfo.prepareForBlock(class072092, class005002);
        this.aoCalc.clear();
        this.cachedTintIndex = -1;
    }

    protected AbstractTerrainRenderContext() {
        this.lightDataProvider = this.createLightDataProvider(this.blockInfo);
        this.aoCalc = new AoCalculator(this.blockInfo, this.lightDataProvider);
    }

    protected abstract LightDataProvider createLightDataProvider(BlockRenderInfo var1);

    protected abstract class01391 getVertexConsumer(class08743 var1);

    private float normalShade(float f, float f2, float f3, boolean bl) {
        float f4 = 0.0f;
        float f5 = 0.0f;
        if (f > 0.0f) {
            f4 += f * this.blockInfo.blockView.method_24852(class07211.field_11034, bl);
            f5 += f;
        } else if (f < 0.0f) {
            f4 += -f * this.blockInfo.blockView.method_24852(class07211.field_11039, bl);
            f5 -= f;
        }
        if (f2 > 0.0f) {
            f4 += f2 * this.blockInfo.blockView.method_24852(class07211.field_11036, bl);
            f5 += f2;
        } else if (f2 < 0.0f) {
            f4 += -f2 * this.blockInfo.blockView.method_24852(class07211.field_11033, bl);
            f5 -= f2;
        }
        if (f3 > 0.0f) {
            f4 += f3 * this.blockInfo.blockView.method_24852(class07211.field_11035, bl);
            f5 += f3;
        } else if (f3 < 0.0f) {
            f4 += -f3 * this.blockInfo.blockView.method_24852(class07211.field_11043, bl);
            f5 -= f3;
        }
        return f4 / f5;
    }

    private void tintQuad(MutableQuadViewImpl mutableQuadViewImpl) {
        int n = mutableQuadViewImpl.tintIndex();
        if (n != -1) {
            int n2;
            if (n == this.cachedTintIndex) {
                n2 = this.cachedTint;
            } else {
                this.cachedTint = n2 = this.blockInfo.blockColor(n);
                this.cachedTintIndex = n;
            }
            for (int i = 0; i < 4; ++i) {
                mutableQuadViewImpl.color(i, class02566.N((int)mutableQuadViewImpl.color(i), (int)n2));
            }
        }
    }

    private void shadeQuad(MutableQuadViewImpl mutableQuadViewImpl, boolean bl, boolean bl2, boolean bl3) {
        if (bl) {
            this.aoCalc.compute((QuadViewImpl)mutableQuadViewImpl, bl3);
            if (bl2) {
                for (int i = 0; i < 4; ++i) {
                    mutableQuadViewImpl.color(i, class02566.y((int)mutableQuadViewImpl.color(i), (float)this.aoCalc.ao[i]));
                    mutableQuadViewImpl.lightmap(i, 0xF000F0);
                }
            } else {
                for (int i = 0; i < 4; ++i) {
                    mutableQuadViewImpl.color(i, class02566.y((int)mutableQuadViewImpl.color(i), (float)this.aoCalc.ao[i]));
                    mutableQuadViewImpl.lightmap(i, ColorHelper.maxLight((int)mutableQuadViewImpl.lightmap(i), (int)this.aoCalc.light[i]));
                }
            }
        } else {
            this.shadeFlatQuad(mutableQuadViewImpl, bl3);
            if (bl2) {
                for (int i = 0; i < 4; ++i) {
                    mutableQuadViewImpl.lightmap(i, 0xF000F0);
                }
            } else {
                int n = this.flatLight(mutableQuadViewImpl);
                for (int i = 0; i < 4; ++i) {
                    mutableQuadViewImpl.lightmap(i, ColorHelper.maxLight((int)mutableQuadViewImpl.lightmap(i), (int)n));
                }
            }
        }
    }

    @Override
    protected void bufferQuad(MutableQuadViewImpl mutableQuadViewImpl) {
        if (this.blockInfo.shouldCullSide(mutableQuadViewImpl.cullFace())) {
            return;
        }
        boolean bl = this.blockInfo.effectiveAo(mutableQuadViewImpl.ambientOcclusion());
        boolean bl2 = mutableQuadViewImpl.shadeMode() == ShadeMode.VANILLA;
        class01391 class013912 = this.getVertexConsumer(this.blockInfo.effectiveRenderLayer(mutableQuadViewImpl.renderLayer()));
        this.tintQuad(mutableQuadViewImpl);
        this.shadeQuad(mutableQuadViewImpl, bl, mutableQuadViewImpl.emissive(), bl2);
        this.bufferQuad(mutableQuadViewImpl, class013912);
    }

    private void shadeFlatQuad(MutableQuadViewImpl mutableQuadViewImpl, boolean bl) {
        block9: {
            boolean bl2;
            block7: {
                float f;
                block10: {
                    block8: {
                        bl2 = mutableQuadViewImpl.diffuseShade();
                        if ((Indigo.AMBIENT_OCCLUSION_MODE != AoConfig.HYBRID || bl) && Indigo.AMBIENT_OCCLUSION_MODE != AoConfig.ENHANCED) break block7;
                        if (!mutableQuadViewImpl.hasAllVertexNormals()) break block8;
                        for (int i = 0; i < 4; ++i) {
                            float f2 = this.normalShade(mutableQuadViewImpl.normalX(i), mutableQuadViewImpl.normalY(i), mutableQuadViewImpl.normalZ(i), bl2);
                            mutableQuadViewImpl.color(i, class02566.y((int)mutableQuadViewImpl.color(i), (float)f2));
                        }
                        break block9;
                    }
                    if ((mutableQuadViewImpl.geometryFlags() & 2) != 0) {
                        f = this.blockInfo.blockView.method_24852(mutableQuadViewImpl.lightFace(), bl2);
                    } else {
                        Vector3fc vector3fc = mutableQuadViewImpl.faceNormal();
                        f = this.normalShade(vector3fc.x(), vector3fc.y(), vector3fc.z(), bl2);
                    }
                    if (!mutableQuadViewImpl.hasVertexNormals()) break block10;
                    for (int i = 0; i < 4; ++i) {
                        float f3 = mutableQuadViewImpl.hasNormal(i) ? this.normalShade(mutableQuadViewImpl.normalX(i), mutableQuadViewImpl.normalY(i), mutableQuadViewImpl.normalZ(i), bl2) : f;
                        mutableQuadViewImpl.color(i, class02566.y((int)mutableQuadViewImpl.color(i), (float)f3));
                    }
                    break block9;
                }
                if (f == 1.0f) break block9;
                for (int i = 0; i < 4; ++i) {
                    mutableQuadViewImpl.color(i, class02566.y((int)mutableQuadViewImpl.color(i), (float)f));
                }
                break block9;
            }
            float f = this.blockInfo.blockView.method_24852(mutableQuadViewImpl.lightFace(), bl2);
            if (f != 1.0f) {
                for (int i = 0; i < 4; ++i) {
                    mutableQuadViewImpl.color(i, class02566.y((int)mutableQuadViewImpl.color(i), (float)f));
                }
            }
        }
    }

    private int flatLight(MutableQuadViewImpl mutableQuadViewImpl) {
        class00500 class005002 = this.blockInfo.blockState;
        class07209 class072092 = this.blockInfo.blockPos;
        this.lightPos.N((class00753)class072092);
        if (mutableQuadViewImpl.cullFace() != null) {
            this.lightPos.N(mutableQuadViewImpl.cullFace());
        } else {
            int n = mutableQuadViewImpl.geometryFlags();
            if ((n & 4) != 0 || (n & 2) != 0 && class005002.W((class07290)this.blockInfo.blockView, class072092)) {
                this.lightPos.N(mutableQuadViewImpl.lightFace());
            }
        }
        return this.lightDataProvider.light((class07209)this.lightPos, class005002);
    }
}

