/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.api.config.option;

import net.caffeinemc.mods.sodium.api.config.option.SteppedValidator;

public record Range(int min, int max, int step) implements SteppedValidator
{
    public Range {
        if (n > n2) {
            throw new IllegalArgumentException("Min must be less than or equal to max");
        }
        if (n3 <= 0) {
            throw new IllegalArgumentException("Step must be greater than 0");
        }
    }
}

