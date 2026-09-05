/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00570
 *  minecraft.class01296
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.services;

import minecraft.class00394;
import minecraft.class00570;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.services.Services;
import net.caffeinemc.mods.sodium.client.world.SodiumAuxiliaryLightManager;
import org.jspecify.annotations.Nullable;

public interface PlatformLevelAccess {
    public static final PlatformLevelAccess INSTANCE = Services.load(PlatformLevelAccess.class);

    public static PlatformLevelAccess getInstance() {
        return INSTANCE;
    }

    public @Nullable SodiumAuxiliaryLightManager getLightManager(class00570 var1, class01296 var2);

    public @Nullable Object getBlockEntityData(class00394 var1);
}

