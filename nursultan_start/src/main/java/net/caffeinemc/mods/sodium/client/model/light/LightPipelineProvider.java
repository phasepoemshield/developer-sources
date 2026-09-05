/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.model.light;

import java.util.EnumMap;
import net.caffeinemc.mods.sodium.client.model.light.LightMode;
import net.caffeinemc.mods.sodium.client.model.light.LightPipeline;
import net.caffeinemc.mods.sodium.client.model.light.data.LightDataAccess;
import net.caffeinemc.mods.sodium.client.model.light.flat.FlatLightPipeline;
import net.caffeinemc.mods.sodium.client.model.light.smooth.SmoothLightPipeline;

public class LightPipelineProvider {
    private final EnumMap<LightMode, LightPipeline> lighters = new EnumMap(LightMode.class);

    public LightPipelineProvider(LightDataAccess lightDataAccess) {
        this.lighters.put(LightMode.SMOOTH, new SmoothLightPipeline(lightDataAccess));
        this.lighters.put(LightMode.FLAT, new FlatLightPipeline(lightDataAccess));
    }

    public LightPipeline getLighter(LightMode lightMode) {
        LightPipeline lightPipeline = this.lighters.get((Object)lightMode);
        if (lightPipeline == null) {
            throw new NullPointerException("No lighter exists for mode: " + lightMode.name());
        }
        return lightPipeline;
    }
}

