/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.lithium.common.LithiumMod
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 */
package net.caffeinemc.mods.lithium.fabric;

import net.caffeinemc.mods.lithium.common.LithiumMod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

public class LithiumFabricMod
implements ModInitializer {
    public void onInitialize() {
        ModContainer modContainer = (ModContainer)FabricLoader.getInstance().getModContainer("lithium").orElseThrow(NullPointerException::new);
        LithiumMod.onInitialization((String)modContainer.getMetadata().getVersion().getFriendlyString());
    }
}

