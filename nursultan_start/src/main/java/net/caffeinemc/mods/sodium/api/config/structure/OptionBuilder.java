/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 */
package net.caffeinemc.mods.sodium.api.config.structure;

import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;

public interface OptionBuilder {
    public OptionBuilder setName(class00392 var1);

    public OptionBuilder setEnabled(boolean var1);

    public OptionBuilder setEnabledProvider(Function<ConfigState, Boolean> var1, class01894 ... var2);

    public OptionBuilder setTooltip(class00392 var1);
}

