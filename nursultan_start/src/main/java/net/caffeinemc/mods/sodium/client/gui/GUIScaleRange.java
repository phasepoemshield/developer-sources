/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.config.option.SteppedValidator
 */
package net.caffeinemc.mods.sodium.client.gui;

import net.caffeinemc.mods.sodium.api.config.option.SteppedValidator;

public record GUIScaleRange(int max) implements SteppedValidator
{
    public int min() {
        return 0;
    }

    public int step() {
        return 1;
    }

    public boolean isValueValid(int n) {
        return n >= this.min();
    }
}

