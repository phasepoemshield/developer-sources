/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.StorageEventHandler
 *  net.caffeinemc.mods.sodium.api.config.option.ControlValueFormatter
 *  net.caffeinemc.mods.sodium.api.config.option.OptionBinding
 *  net.caffeinemc.mods.sodium.api.config.option.OptionFlag
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 *  net.caffeinemc.mods.sodium.api.config.option.Range
 *  net.caffeinemc.mods.sodium.api.config.option.SteppedValidator
 */
package net.caffeinemc.mods.sodium.api.config.structure;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.StorageEventHandler;
import net.caffeinemc.mods.sodium.api.config.option.ControlValueFormatter;
import net.caffeinemc.mods.sodium.api.config.option.OptionBinding;
import net.caffeinemc.mods.sodium.api.config.option.OptionFlag;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.api.config.option.Range;
import net.caffeinemc.mods.sodium.api.config.option.SteppedValidator;
import net.caffeinemc.mods.sodium.api.config.structure.StatefulOptionBuilder;

public interface IntegerOptionBuilder
extends StatefulOptionBuilder<Integer> {
    public IntegerOptionBuilder setFlags(class01894 ... var1);

    public IntegerOptionBuilder setFlags(OptionFlag ... var1);

    @Override
    public IntegerOptionBuilder setName(class00392 var1);

    @Override
    public IntegerOptionBuilder setEnabled(boolean var1);

    public IntegerOptionBuilder setApplyHook(Consumer<ConfigState> var1);

    public IntegerOptionBuilder setDefaultProvider(Function<ConfigState, Integer> var1, class01894 ... var2);

    public IntegerOptionBuilder setRange(Range var1);

    public IntegerOptionBuilder setRange(int var1, int var2, int var3);

    public IntegerOptionBuilder setImpact(OptionImpact var1);

    public IntegerOptionBuilder setBinding(Consumer<Integer> var1, Supplier<Integer> var2);

    public IntegerOptionBuilder setBinding(OptionBinding<Integer> var1);

    public IntegerOptionBuilder setValidatorProvider(Function<ConfigState, ? extends SteppedValidator> var1, class01894 ... var2);

    @Override
    public IntegerOptionBuilder setEnabledProvider(Function<ConfigState, Boolean> var1, class01894 ... var2);

    public IntegerOptionBuilder setStorageHandler(StorageEventHandler var1);

    public IntegerOptionBuilder setValueFormatter(ControlValueFormatter var1);

    public IntegerOptionBuilder setValidator(SteppedValidator var1);

    public IntegerOptionBuilder setDefaultValue(Integer var1);

    public IntegerOptionBuilder setControlHiddenWhenDisabled(boolean var1);

    public IntegerOptionBuilder setTooltip(Function<Integer, class00392> var1);

    @Override
    public IntegerOptionBuilder setTooltip(class00392 var1);

    public IntegerOptionBuilder setRangeProvider(Function<ConfigState, ? extends SteppedValidator> var1, class01894 ... var2);
}

