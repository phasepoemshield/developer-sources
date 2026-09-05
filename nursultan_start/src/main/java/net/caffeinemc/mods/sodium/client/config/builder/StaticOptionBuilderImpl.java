/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  org.apache.commons.lang3.Validate
 */
package net.caffeinemc.mods.sodium.client.config.builder;

import minecraft.class00392;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder;
import net.caffeinemc.mods.sodium.client.config.builder.OptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.structure.StaticOption;
import org.apache.commons.lang3.Validate;

abstract class StaticOptionBuilderImpl<O extends StaticOption>
extends OptionBuilderImpl<O> {
    private class00392 tooltip;

    StaticOptionBuilderImpl(class01894 class018942) {
        super(class018942);
    }

    @Override
    void validateData() {
        Validate.notNull((Object)this.getTooltip(), (String)"Tooltip must be set", (Object[])new Object[0]);
        Validate.notBlank((CharSequence)this.getTooltip().getString(), (String)"Tooltip must not be blank", (Object[])new Object[0]);
    }

    class00392 getTooltip() {
        return (class00392)this.getFirstNotNull(this.tooltip, StaticOption::getTooltip);
    }

    @Override
    public OptionBuilder setTooltip(class00392 class003922) {
        Validate.notNull((Object)class003922, (String)"Argument must not be null", (Object[])new Object[0]);
        this.tooltip = class003922;
        return this;
    }
}

