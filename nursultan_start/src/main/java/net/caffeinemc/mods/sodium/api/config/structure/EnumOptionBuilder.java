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

import java.util.Set;
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
import net.caffeinemc.mods.sodium.api.config.structure.StatefulOptionBuilder;

public interface EnumOptionBuilder<E extends Enum<E>>
extends StatefulOptionBuilder<E> {
    @Override
    public EnumOptionBuilder<E> setFlags(class01894 ... var1);

    @Override
    public EnumOptionBuilder<E> setFlags(OptionFlag ... var1);

    @Override
    public EnumOptionBuilder<E> setName(class00392 var1);

    @Override
    public EnumOptionBuilder<E> setEnabled(boolean var1);

    @Override
    public EnumOptionBuilder<E> setApplyHook(Consumer<ConfigState> var1);

    @Override
    public EnumOptionBuilder<E> setDefaultProvider(Function<ConfigState, E> var1, class01894 ... var2);

    @Override
    public EnumOptionBuilder<E> setImpact(OptionImpact var1);

    @Override
    public EnumOptionBuilder<E> setBinding(Consumer<E> var1, Supplier<E> var2);

    @Override
    public EnumOptionBuilder<E> setBinding(OptionBinding<E> var1);

    public EnumOptionBuilder<E> setElementNameProvider(Function<E, class00392> var1);

    public EnumOptionBuilder<E> setAllowedValuesProvider(Function<ConfigState, Set<E>> var1, class01894 ... var2);

    @Override
    public EnumOptionBuilder<E> setEnabledProvider(Function<ConfigState, Boolean> var1, class01894 ... var2);

    @Override
    public EnumOptionBuilder<E> setStorageHandler(StorageEventHandler var1);

    public static <E extends Enum<E>> Function<E, class00392> nameProviderFrom(class00392 ... class00392Array) {
        return enum_ -> class00392Array[enum_.ordinal()];
    }

    @Override
    public EnumOptionBuilder<E> setDefaultValue(E var1);

    @Override
    public EnumOptionBuilder<E> setControlHiddenWhenDisabled(boolean var1);

    @Override
    public EnumOptionBuilder<E> setTooltip(class00392 var1);

    @Override
    public EnumOptionBuilder<E> setTooltip(Function<E, class00392> var1);

    public EnumOptionBuilder<E> setAllowedValues(Set<E> var1);
}

