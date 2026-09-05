/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02477
 */
package net.fabricmc.fabric.api.item.v1;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class02477;

public interface FabricComponentMapBuilder {
    default public <T> T getOrCreate(class02477<T> class024772, Supplier<T> supplier) {
        throw new AssertionError((Object)"Implemented in Mixin");
    }

    default public boolean contains(class02477<?> class024772) {
        throw new AssertionError((Object)"Implemented in Mixin");
    }

    default public <T> T getOrDefault(class02477<T> class024772, T t) {
        Objects.requireNonNull(t, "Cannot insert null values to component map builder");
        return (T)this.getOrCreate(class024772, () -> t);
    }

    default public <T> List<T> getOrEmpty(class02477<List<T>> class024772) {
        throw new AssertionError((Object)"Implemented in Mixin");
    }
}

