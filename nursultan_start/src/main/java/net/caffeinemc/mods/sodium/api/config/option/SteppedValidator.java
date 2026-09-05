/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.api.config.option;

import java.util.function.Supplier;
import net.caffeinemc.mods.sodium.api.config.option.Validator;

public interface SteppedValidator
extends Validator<Integer> {
    public int min();

    public int max();

    public int step();

    @Override
    default public Integer getValidatedValue(Integer n, Supplier<Integer> supplier) {
        if (this.isValueValid(n)) {
            return n;
        }
        return supplier.get();
    }

    default public boolean isValueValid(int n) {
        int n2 = this.min();
        return n >= n2 && n <= this.max() && (n - n2) % this.step() == 0;
    }
}

