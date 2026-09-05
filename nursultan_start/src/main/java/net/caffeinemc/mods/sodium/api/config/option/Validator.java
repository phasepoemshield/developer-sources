/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.api.config.option;

import java.util.function.Supplier;

public interface Validator<V> {
    public V getValidatedValue(V var1, Supplier<V> var2);
}

