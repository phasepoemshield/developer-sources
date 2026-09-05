/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import java.util.Collection;
import minecraft.class00392;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;

public abstract class StaticOption
extends Option {
    final class00392 tooltip;

    StaticOption(class01894 class018942, Collection<class01894> collection, class00392 class003922, DependentValue<Boolean> dependentValue, class00392 class003923) {
        super(class018942, collection, class003922, dependentValue);
        this.tooltip = class003923;
    }

    @Override
    public class00392 getTooltip() {
        return this.tooltip;
    }
}

