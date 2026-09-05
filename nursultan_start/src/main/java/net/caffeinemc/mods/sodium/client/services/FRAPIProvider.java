/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.services.Services
 */
package net.caffeinemc.mods.sodium.client.services;

import net.caffeinemc.mods.sodium.client.services.Services;

public interface FRAPIProvider {
    public static final FRAPIProvider INSTANCE = (FRAPIProvider)Services.loadOr(FRAPIProvider.class, () -> () -> {});

    private static /* synthetic */ FRAPIProvider lambda$static$1() {
        return () -> {};
    }

    public static FRAPIProvider getInstance() {
        return INSTANCE;
    }

    public void register();
}

