/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder
 */
package net.caffeinemc.mods.sodium.api.config;

import net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder;

public interface ConfigEntryPoint {
    default public void registerConfigEarly(ConfigBuilder configBuilder) {
    }

    public void registerConfigLate(ConfigBuilder var1);
}

