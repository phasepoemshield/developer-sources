/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  net.caffeinemc.mods.sodium.client.gui.options.TextProvider
 */
package me.flashyreese.mods.sodiumextra.client.config;

import minecraft.class00392;
import net.caffeinemc.mods.sodium.client.gui.options.TextProvider;

public enum SodiumExtraGameOptions$OverlayCorner implements TextProvider
{
    TOP_LEFT("sodium-extra.option.overlay_corner.top_left"),
    TOP_RIGHT("sodium-extra.option.overlay_corner.top_right"),
    BOTTOM_LEFT("sodium-extra.option.overlay_corner.bottom_left"),
    BOTTOM_RIGHT("sodium-extra.option.overlay_corner.bottom_right");

    private final class00392 text;

    private SodiumExtraGameOptions$OverlayCorner(String string2) {
        this.text = class00392.L((String)string2);
    }

    public class00392 getLocalizedName() {
        return this.text;
    }
}

