/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class04453
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class08743
 *  minecraft.class08877
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  net.caffeinemc.mods.sodium.client.render.model.AmbientOcclusionMode
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry
 */
package net.caffeinemc.mods.sodium.fabric.block;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class04453;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class08743;
import minecraft.class08877;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.render.model.AmbientOcclusionMode;
import net.caffeinemc.mods.sodium.client.services.PlatformBlockAccess;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;

public class FabricBlockAccess
implements PlatformBlockAccess {
    @Override
    public int getLightEmission(class00500 class005002, class07295 class072952, class07209 class072092) {
        return class005002.m();
    }

    @Override
    public boolean shouldOccludeFluid(class07211 class072112, class00500 class005002, class04688 class046882) {
        return class005002.Y().N().N(class046882.N());
    }

    @Override
    public boolean shouldSkipRender(class07290 class072902, class00500 class005002, class00500 class005003, class07209 class072092, class07209 class072093, class07211 class072112) {
        return false;
    }

    private float normalShade(class07295 class072952, float f, float f2, float f3, boolean bl) {
        float f4 = 0.0f;
        float f5 = 0.0f;
        if (f > 0.0f) {
            f4 += f * class072952.method_24852(class07211.field_11034, bl);
            f5 += f;
        } else if (f < 0.0f) {
            f4 += -f * class072952.method_24852(class07211.field_11039, bl);
            f5 -= f;
        }
        if (f2 > 0.0f) {
            f4 += f2 * class072952.method_24852(class07211.field_11036, bl);
            f5 += f2;
        } else if (f2 < 0.0f) {
            f4 += -f2 * class072952.method_24852(class07211.field_11033, bl);
            f5 -= f2;
        }
        if (f3 > 0.0f) {
            f4 += f3 * class072952.method_24852(class07211.field_11035, bl);
            f5 += f3;
        } else if (f3 < 0.0f) {
            f4 += -f3 * class072952.method_24852(class07211.field_11043, bl);
            f5 -= f3;
        }
        return f4 / f5;
    }

    @Override
    public float getNormalVectorShade(ModelQuadView modelQuadView, class07295 class072952, boolean bl) {
        return this.normalShade(class072952, NormI8.unpackX((int)modelQuadView.getFaceNormal()), NormI8.unpackY((int)modelQuadView.getFaceNormal()), NormI8.unpackZ((int)modelQuadView.getFaceNormal()), bl);
    }

    @Override
    public boolean shouldShowFluidOverlay(class00500 class005002, class07295 class072952, class07209 class072092, class04688 class046882) {
        return FluidRenderHandlerRegistry.INSTANCE.isBlockTransparent(class005002.i());
    }

    @Override
    public AmbientOcclusionMode usesAmbientOcclusion(class08877 class088772, class00500 class005002, class08743 class087432, class07295 class072952, class07209 class072092) {
        return class088772.y() ? AmbientOcclusionMode.DEFAULT : AmbientOcclusionMode.DISABLED;
    }

    @Override
    public boolean shouldBlockEntityGlow(class00394 class003942, class04453 class044532) {
        return false;
    }

    @Override
    public boolean platformHasBlockData() {
        return true;
    }
}

