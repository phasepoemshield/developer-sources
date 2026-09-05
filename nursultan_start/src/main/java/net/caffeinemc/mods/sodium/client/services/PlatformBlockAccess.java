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
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  net.caffeinemc.mods.sodium.client.render.model.AmbientOcclusionMode
 */
package net.caffeinemc.mods.sodium.client.services;

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
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.render.model.AmbientOcclusionMode;
import net.caffeinemc.mods.sodium.client.services.Services;

public interface PlatformBlockAccess {
    public static final PlatformBlockAccess INSTANCE = Services.load(PlatformBlockAccess.class);

    public static PlatformBlockAccess getInstance() {
        return INSTANCE;
    }

    public int getLightEmission(class00500 var1, class07295 var2, class07209 var3);

    public boolean shouldOccludeFluid(class07211 var1, class00500 var2, class04688 var3);

    public boolean shouldSkipRender(class07290 var1, class00500 var2, class00500 var3, class07209 var4, class07209 var5, class07211 var6);

    public float getNormalVectorShade(ModelQuadView var1, class07295 var2, boolean var3);

    public boolean shouldShowFluidOverlay(class00500 var1, class07295 var2, class07209 var3, class04688 var4);

    public AmbientOcclusionMode usesAmbientOcclusion(class08877 var1, class00500 var2, class08743 var3, class07295 var4, class07209 var5);

    public boolean shouldBlockEntityGlow(class00394 var1, class04453 var2);

    public boolean platformHasBlockData();
}

