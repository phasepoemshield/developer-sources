/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00570
 *  minecraft.class01296
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.fabric.level;

import minecraft.class00394;
import minecraft.class00570;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.services.PlatformLevelAccess;
import net.caffeinemc.mods.sodium.client.world.SodiumAuxiliaryLightManager;
import org.jspecify.annotations.Nullable;

public class FabricLevelAccess
implements PlatformLevelAccess {
    @Override
    public @Nullable SodiumAuxiliaryLightManager getLightManager(class00570 class005702, class01296 class012962) {
        return null;
    }

    @Override
    public @Nullable Object getBlockEntityData(class00394 class003942) {
        return class003942.getRenderData();
    }
}

