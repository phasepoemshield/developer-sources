/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 */
package net.caffeinemc.mods.sodium.client.config.value;

import java.util.Collection;
import java.util.Set;
import java.util.function.Function;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.client.config.structure.Config;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;

public class DynamicValue<V>
implements ConfigState,
DependentValue<V> {
    private final Set<class01894> dependencies;
    private class01894 parentOption = null;
    private final Function<ConfigState, V> provider;
    private Config state;
    private V valueCache;

    public DynamicValue(Function<ConfigState, V> function, class01894[] class01894Array) {
        this.provider = function;
        this.dependencies = Set.of(class01894Array);
    }

    @Override
    public V get(Config config) {
        if (this.valueCache != null) {
            return this.valueCache;
        }
        this.state = config;
        this.valueCache = this.provider.apply(this);
        this.state = null;
        return this.valueCache;
    }

    public boolean readBooleanOption(class01894 class018942) {
        boolean bl = this.getReadType(class018942);
        return this.state.readBooleanOption(class018942, bl);
    }

    public int readIntOption(class01894 class018942) {
        boolean bl = this.getReadType(class018942);
        return this.state.readIntOption(class018942, bl);
    }

    public <E extends Enum<E>> E readEnumOption(class01894 class018942, Class<E> clazz) {
        boolean bl = this.getReadType(class018942);
        return this.state.readEnumOption(class018942, clazz, bl);
    }

    @Override
    public Collection<class01894> getDependencies() {
        return this.dependencies;
    }

    public void allowReadingParentOption(class01894 class018942) {
        this.parentOption = class018942;
    }

    public void invalidateCache() {
        this.valueCache = null;
    }

    private boolean getReadType(class01894 class018942) {
        if (!this.dependencies.contains(class018942)) {
            if (class018942.equals((Object)this.parentOption)) {
                return true;
            }
            throw new IllegalStateException("Attempted to read option value that is not a declared dependency");
        }
        return false;
    }
}

