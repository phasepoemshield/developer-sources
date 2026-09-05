/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.services;

import java.util.List;
import java.util.Map;
import net.caffeinemc.mods.lithium.common.config.Option;
import net.caffeinemc.mods.lithium.common.services.PlatformMixinOverrides$MixinOverride;
import net.caffeinemc.mods.lithium.common.services.Services;

public interface PlatformMixinOverrides {
    public static final PlatformMixinOverrides INSTANCE = Services.load(PlatformMixinOverrides.class);

    public static PlatformMixinOverrides getInstance() {
        return INSTANCE;
    }

    public void applyLithiumCompat(Map<String, Option> var1);

    public List<PlatformMixinOverrides$MixinOverride> applyModOverrides();
}

