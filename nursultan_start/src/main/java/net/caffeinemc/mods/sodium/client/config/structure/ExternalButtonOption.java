/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.gui.options.control.Control
 *  net.caffeinemc.mods.sodium.client.gui.options.control.ExternalButtonControl
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import java.util.Collection;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.structure.StaticOption;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;
import net.caffeinemc.mods.sodium.client.gui.options.control.Control;
import net.caffeinemc.mods.sodium.client.gui.options.control.ExternalButtonControl;

public class ExternalButtonOption
extends StaticOption {
    final Consumer<class05096> currentScreenConsumer;

    public ExternalButtonOption(class01894 class018942, Collection<class01894> collection, class00392 class003922, DependentValue<Boolean> dependentValue, class00392 class003923, Consumer<class05096> consumer) {
        super(class018942, collection, class003922, dependentValue, class003923);
        this.currentScreenConsumer = consumer;
    }

    public Consumer<class05096> getCurrentScreenConsumer() {
        return this.currentScreenConsumer;
    }

    @Override
    Control createControl() {
        return new ExternalButtonControl(this, this.currentScreenConsumer);
    }
}

