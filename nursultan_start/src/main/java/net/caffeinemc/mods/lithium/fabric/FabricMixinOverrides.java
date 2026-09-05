/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.lithium.common.config.Option
 *  net.caffeinemc.mods.lithium.common.services.PlatformMixinOverrides
 *  net.caffeinemc.mods.lithium.common.services.PlatformMixinOverrides$MixinOverride
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.CustomValue
 *  net.fabricmc.loader.api.metadata.CustomValue$CvType
 *  net.fabricmc.loader.api.metadata.ModMetadata
 */
package net.caffeinemc.mods.lithium.fabric;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.caffeinemc.mods.lithium.common.config.Option;
import net.caffeinemc.mods.lithium.common.services.PlatformMixinOverrides;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.api.metadata.ModMetadata;

public class FabricMixinOverrides
implements PlatformMixinOverrides {
    protected static final String JSON_KEY_LITHIUM_OPTIONS = "lithium:options";

    public void applyLithiumCompat(Map<String, Option> map) {
        if (FabricLoader.getInstance().isModLoaded("worldedit")) {
            map.get("mixin.compat.worldedit").addModOverride(true, "lithium");
        }
    }

    public List<PlatformMixinOverrides.MixinOverride> applyModOverrides() {
        ArrayList<PlatformMixinOverrides.MixinOverride> arrayList = new ArrayList<PlatformMixinOverrides.MixinOverride>();
        for (ModContainer modContainer : FabricLoader.getInstance().getAllMods()) {
            ModMetadata modMetadata = modContainer.getMetadata();
            if (!modMetadata.containsCustomValue(JSON_KEY_LITHIUM_OPTIONS)) continue;
            CustomValue customValue = modMetadata.getCustomValue(JSON_KEY_LITHIUM_OPTIONS);
            if (customValue.getType() != CustomValue.CvType.OBJECT) {
                System.out.printf("[Lithium] Mod '%s' contains invalid Lithium option overrides, ignoring", modMetadata.getId());
                continue;
            }
            for (Map.Entry entry : customValue.getAsObject()) {
                if (((CustomValue)entry.getValue()).getType() != CustomValue.CvType.BOOLEAN) {
                    System.out.printf("[Lithium] Mod '%s' attempted to override option '%s' with an invalid value, ignoring", modMetadata.getId(), entry.getKey());
                    continue;
                }
                arrayList.add(new PlatformMixinOverrides.MixinOverride(modMetadata.getId(), (String)entry.getKey(), ((CustomValue)entry.getValue()).getAsBoolean()));
            }
        }
        return arrayList;
    }
}

