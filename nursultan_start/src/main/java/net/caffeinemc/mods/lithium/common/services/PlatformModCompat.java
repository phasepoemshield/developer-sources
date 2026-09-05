/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07234
 */
package net.caffeinemc.mods.lithium.common.services;

import minecraft.class00500;
import minecraft.class07234;
import net.caffeinemc.mods.lithium.common.services.Services;

public interface PlatformModCompat {
    public static final PlatformModCompat INSTANCE = Services.load(PlatformModCompat.class);

    public boolean canHopperInteractWithApiBlockInventory(class07234 var1, class00500 var2, boolean var3);
}

