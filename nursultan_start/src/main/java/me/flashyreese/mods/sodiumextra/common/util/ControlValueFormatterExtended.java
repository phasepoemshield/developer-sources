/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06202
 *  minecraft.class06221
 *  net.caffeinemc.mods.sodium.api.config.option.ControlValueFormatter
 */
package me.flashyreese.mods.sodiumextra.common.util;

import minecraft.class00392;
import minecraft.class06202;
import minecraft.class06221;
import net.caffeinemc.mods.sodium.api.config.option.ControlValueFormatter;

public interface ControlValueFormatterExtended
extends ControlValueFormatter {
    public static ControlValueFormatter resolution() {
        class06221 class062212 = class06202.Nq().Nt().v();
        return n -> {
            if (class062212 == null) {
                return class00392.L((String)"options.fullscreen.unavailable");
            }
            return n == 0 ? class00392.L((String)"options.fullscreen.current") : class00392.y((String)class062212.N(n - 1).toString());
        };
    }

    public static ControlValueFormatter ticks() {
        return n -> class00392.N((String)"sodium-extra.units.ticks", (Object[])new Object[]{n});
    }
}

