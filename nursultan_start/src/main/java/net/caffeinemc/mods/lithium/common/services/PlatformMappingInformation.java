/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.services;

import net.caffeinemc.mods.lithium.common.services.Services;

public interface PlatformMappingInformation {
    public static final PlatformMappingInformation INSTANCE = Services.load(PlatformMappingInformation.class);

    public String mapMethodName(String var1, String var2, String var3, String var4, String var5);
}

