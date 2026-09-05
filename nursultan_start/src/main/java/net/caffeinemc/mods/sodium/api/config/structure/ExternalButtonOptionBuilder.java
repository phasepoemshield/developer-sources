/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 */
package net.caffeinemc.mods.sodium.api.config.structure;

import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder;

public interface ExternalButtonOptionBuilder
extends OptionBuilder {
    @Override
    public ExternalButtonOptionBuilder setName(class00392 var1);

    @Override
    public ExternalButtonOptionBuilder setEnabled(boolean var1);

    public ExternalButtonOptionBuilder setScreenConsumer(Consumer<class05096> var1);

    @Override
    public ExternalButtonOptionBuilder setEnabledProvider(Function<ConfigState, Boolean> var1, class01894 ... var2);

    @Override
    public ExternalButtonOptionBuilder setTooltip(class00392 var1);
}

