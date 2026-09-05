/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.services;

import java.util.List;
import net.caffeinemc.mods.sodium.client.services.PlatformMixinOverrides$MixinOverride;
import net.caffeinemc.mods.sodium.client.services.Services;

public interface PlatformMixinOverrides {
    public static final PlatformMixinOverrides INSTANCE = Services.load(PlatformMixinOverrides.class);

    public static PlatformMixinOverrides getInstance() {
        return INSTANCE;
    }

    public List<PlatformMixinOverrides$MixinOverride> applyModOverrides();
}

