/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 *  minecraft.class07211
 */
package net.caffeinemc.mods.sodium.client.model.light;

import minecraft.class07209;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.client.model.light.data.QuadLightData;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;

public interface LightPipeline {
    public void calculate(ModelQuadView var1, class07209 var2, QuadLightData var3, class07211 var4, class07211 var5, boolean var6, boolean var7);
}

