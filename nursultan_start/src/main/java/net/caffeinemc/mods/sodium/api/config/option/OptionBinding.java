/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.api.config.option;

public interface OptionBinding<V> {
    public V load();

    public void save(V var1);
}

