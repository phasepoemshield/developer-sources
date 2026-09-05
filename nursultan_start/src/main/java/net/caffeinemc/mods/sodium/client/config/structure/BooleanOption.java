/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.StorageEventHandler
 *  net.caffeinemc.mods.sodium.api.config.option.OptionBinding
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 *  net.caffeinemc.mods.sodium.client.gui.options.control.Control
 *  net.caffeinemc.mods.sodium.client.gui.options.control.TickBoxControl
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import java.util.Collection;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.StorageEventHandler;
import net.caffeinemc.mods.sodium.api.config.option.OptionBinding;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.client.config.structure.StatefulOption;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;
import net.caffeinemc.mods.sodium.client.gui.options.control.Control;
import net.caffeinemc.mods.sodium.client.gui.options.control.TickBoxControl;

public class BooleanOption
extends StatefulOption<Boolean> {
    public BooleanOption(class01894 class018942, Collection<class01894> collection, class00392 class003922, DependentValue<Boolean> dependentValue, StorageEventHandler storageEventHandler, Function<Boolean, class00392> function, OptionImpact optionImpact, Set<class01894> set, DependentValue<Boolean> dependentValue2, Boolean bl, OptionBinding<Boolean> optionBinding, Consumer<ConfigState> consumer) {
        super(class018942, collection, class003922, dependentValue, storageEventHandler, function, optionImpact, set, dependentValue2, bl, optionBinding, consumer);
    }

    @Override
    Boolean validateValue(Boolean bl) {
        return bl;
    }

    @Override
    Control createControl() {
        return new TickBoxControl(this);
    }
}

