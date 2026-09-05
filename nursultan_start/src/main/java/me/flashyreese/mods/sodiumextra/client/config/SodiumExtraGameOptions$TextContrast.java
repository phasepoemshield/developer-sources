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

public enum SodiumExtraGameOptions$TextContrast implements TextProvider
{
    NONE("sodium-extra.option.text_contrast.none"),
    BACKGROUND("sodium-extra.option.text_contrast.background"),
    SHADOW("sodium-extra.option.text_contrast.shadow");

    private final class00392 text;

    private SodiumExtraGameOptions$TextContrast(String string2) {
        this.text = class00392.L((String)string2);
    }

    public class00392 getLocalizedName() {
        return this.text;
    }
}

