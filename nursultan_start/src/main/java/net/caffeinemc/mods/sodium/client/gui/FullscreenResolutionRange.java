/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 *  minecraft.class06221
 *  minecraft.class08844
 *  net.caffeinemc.mods.sodium.api.config.option.SteppedValidator
 */
package net.caffeinemc.mods.sodium.client.gui;

import minecraft.class06202;
import minecraft.class06221;
import minecraft.class08844;
import net.caffeinemc.mods.sodium.api.config.option.SteppedValidator;

public class FullscreenResolutionRange
implements SteppedValidator {
    public int min() {
        return 0;
    }

    public int max() {
        class06221 class062212;
        class08844 class088442 = class06202.Nq().Nt();
        if (class088442 != null && (class062212 = class088442.v()) != null) {
            return class062212.i() - 1;
        }
        return 1;
    }

    public int step() {
        return 1;
    }

    public boolean isValueValid(int n) {
        return n >= this.min();
    }
}

