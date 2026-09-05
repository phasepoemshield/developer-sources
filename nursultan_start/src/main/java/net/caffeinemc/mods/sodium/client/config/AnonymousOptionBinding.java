/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.config.option.OptionBinding
 */
package net.caffeinemc.mods.sodium.client.config;

import java.util.function.Consumer;
import java.util.function.Supplier;
import net.caffeinemc.mods.sodium.api.config.option.OptionBinding;

public class AnonymousOptionBinding<V>
implements OptionBinding<V> {
    private final Consumer<V> save;
    private final Supplier<V> load;

    public AnonymousOptionBinding(Consumer<V> consumer, Supplier<V> supplier) {
        this.save = consumer;
        this.load = supplier;
    }

    public V load() {
        return this.load.get();
    }

    public void save(V v) {
        this.save.accept(v);
    }
}

