/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.StorageEventHandler
 *  net.caffeinemc.mods.sodium.api.config.option.OptionBinding
 *  net.caffeinemc.mods.sodium.api.config.option.OptionFlag
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 */
package net.caffeinemc.mods.sodium.api.config.structure;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.StorageEventHandler;
import net.caffeinemc.mods.sodium.api.config.option.OptionBinding;
import net.caffeinemc.mods.sodium.api.config.option.OptionFlag;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder;

public interface StatefulOptionBuilder<V>
extends OptionBuilder {
    public StatefulOptionBuilder<V> setFlags(OptionFlag ... var1);

    public StatefulOptionBuilder<V> setFlags(class01894 ... var1);

    @Override
    public StatefulOptionBuilder<V> setName(class00392 var1);

    @Override
    public OptionBuilder setEnabled(boolean var1);

    public StatefulOptionBuilder<V> setApplyHook(Consumer<ConfigState> var1);

    public StatefulOptionBuilder<V> setDefaultProvider(Function<ConfigState, V> var1, class01894 ... var2);

    public StatefulOptionBuilder<V> setImpact(OptionImpact var1);

    public StatefulOptionBuilder<V> setBinding(OptionBinding<V> var1);

    public StatefulOptionBuilder<V> setBinding(Consumer<V> var1, Supplier<V> var2);

    @Override
    public OptionBuilder setEnabledProvider(Function<ConfigState, Boolean> var1, class01894 ... var2);

    public StatefulOptionBuilder<V> setStorageHandler(StorageEventHandler var1);

    public StatefulOptionBuilder<V> setDefaultValue(V var1);

    public StatefulOptionBuilder<V> setControlHiddenWhenDisabled(boolean var1);

    @Override
    public StatefulOptionBuilder<V> setTooltip(class00392 var1);

    public StatefulOptionBuilder<V> setTooltip(Function<V, class00392> var1);
}

