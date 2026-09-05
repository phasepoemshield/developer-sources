/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package net.caffeinemc.mods.sodium.api.config.option;

import java.util.Locale;
import minecraft.class01894;

public enum OptionFlag {
    REQUIRES_RENDERER_RELOAD,
    REQUIRES_RENDERER_UPDATE,
    REQUIRES_ASSET_RELOAD,
    REQUIRES_VIDEOMODE_RELOAD,
    REQUIRES_GAME_RESTART;

    private final class01894 id = class01894.N((String)"sodium", (String)("builtin_option_flag." + this.name().toLowerCase(Locale.ROOT)));

    public class01894 getId() {
        return this.id;
    }
}

