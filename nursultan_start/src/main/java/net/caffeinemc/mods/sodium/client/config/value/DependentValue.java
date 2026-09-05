/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package net.caffeinemc.mods.sodium.client.config.value;

import java.util.Collection;
import java.util.Set;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.client.config.structure.Config;

public interface DependentValue<V> {
    public V get(Config var1);

    default public Collection<class01894> getDependencies() {
        return Set.of();
    }
}

