/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.structure.StatefulOptionBuilder
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
import net.caffeinemc.mods.sodium.api.config.structure.StatefulOptionBuilder;

public interface BooleanOptionBuilder
extends StatefulOptionBuilder<Boolean> {
    public BooleanOptionBuilder setFlags(class01894 ... var1);

    public BooleanOptionBuilder setFlags(OptionFlag ... var1);

    public BooleanOptionBuilder setName(class00392 var1);

    public BooleanOptionBuilder setEnabled(boolean var1);

    public BooleanOptionBuilder setApplyHook(Consumer<ConfigState> var1);

    public BooleanOptionBuilder setDefaultProvider(Function<ConfigState, Boolean> var1, class01894 ... var2);

    public BooleanOptionBuilder setImpact(OptionImpact var1);

    public BooleanOptionBuilder setBinding(Consumer<Boolean> var1, Supplier<Boolean> var2);

    public BooleanOptionBuilder setBinding(OptionBinding<Boolean> var1);

    public BooleanOptionBuilder setEnabledProvider(Function<ConfigState, Boolean> var1, class01894 ... var2);

    public BooleanOptionBuilder setStorageHandler(StorageEventHandler var1);

    public BooleanOptionBuilder setDefaultValue(Boolean var1);

    public BooleanOptionBuilder setControlHiddenWhenDisabled(boolean var1);

    public BooleanOptionBuilder setTooltip(Function<Boolean, class00392> var1);

    public BooleanOptionBuilder setTooltip(class00392 var1);
}

