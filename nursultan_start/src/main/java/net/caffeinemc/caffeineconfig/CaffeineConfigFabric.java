/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.CustomValue
 *  net.fabricmc.loader.api.metadata.CustomValue$CvType
 *  net.fabricmc.loader.api.metadata.ModMetadata
 */
package net.caffeinemc.caffeineconfig;

import java.util.Map;
import net.caffeinemc.caffeineconfig.CaffeineConfig;
import net.caffeinemc.caffeineconfig.CaffeineConfigPlatform;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.api.metadata.ModMetadata;

public class CaffeineConfigFabric
implements CaffeineConfigPlatform {
    @Override
    public void applyModOverrides(CaffeineConfig caffeineConfig, String string) {
        for (ModContainer modContainer : FabricLoader.getInstance().getAllMods()) {
            ModMetadata modMetadata = modContainer.getMetadata();
            if (!modMetadata.containsCustomValue(string)) continue;
            CustomValue customValue = modMetadata.getCustomValue(string);
            if (customValue.getType() != CustomValue.CvType.OBJECT) {
                caffeineConfig.getLogger().warn("Mod '{}' contains invalid {} option overrides, ignoring", (Object)modMetadata.getId(), (Object)caffeineConfig.getModName());
                continue;
            }
            for (Map.Entry entry : customValue.getAsObject()) {
                if (((CustomValue)entry.getValue()).getType() != CustomValue.CvType.BOOLEAN) {
                    caffeineConfig.getLogger().warn("Mod '{}' attempted to override option '{}' with an invalid value, ignoring", (Object)modMetadata.getId(), entry.getKey());
                    continue;
                }
                caffeineConfig.applyModOverride(modMetadata.getId(), (String)entry.getKey(), ((CustomValue)entry.getValue()).getAsBoolean());
            }
        }
    }
}

