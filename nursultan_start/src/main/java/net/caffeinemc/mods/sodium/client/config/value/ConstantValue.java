/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.config.value;

import net.caffeinemc.mods.sodium.client.config.structure.Config;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;

public class ConstantValue<V>
implements DependentValue<V> {
    private final V value;

    public ConstantValue(V v) {
        this.value = v;
    }

    @Override
    public V get(Config config) {
        return this.value;
    }
}

