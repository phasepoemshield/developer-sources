/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  org.apache.commons.lang3.Validate
 */
package net.caffeinemc.mods.sodium.client.config.builder;

import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.structure.ExternalButtonOptionBuilder;
import net.caffeinemc.mods.sodium.client.config.builder.StaticOptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.structure.ExternalButtonOption;
import org.apache.commons.lang3.Validate;

class ExternalButtonOptionBuilderImpl
extends StaticOptionBuilderImpl<ExternalButtonOption>
implements ExternalButtonOptionBuilder {
    private Consumer<class05096> currentScreenConsumer;

    ExternalButtonOptionBuilderImpl(class01894 class018942) {
        super(class018942);
    }

    @Override
    public ExternalButtonOptionBuilder setName(class00392 class003922) {
        super.setName(class003922);
        return this;
    }

    @Override
    ExternalButtonOption build() {
        this.prepareBuild();
        return new ExternalButtonOption(this.id, this.getDependencies(), this.getName(), this.getEnabled(), this.getTooltip(), this.getCurrentScreenConsumer());
    }

    @Override
    public ExternalButtonOptionBuilder setEnabled(boolean bl) {
        super.setEnabled(bl);
        return this;
    }

    @Override
    public ExternalButtonOptionBuilder setScreenConsumer(Consumer<class05096> consumer) {
        this.currentScreenConsumer = consumer;
        return this;
    }

    @Override
    void validateData() {
        super.validateData();
        Validate.notNull(this.getCurrentScreenConsumer(), (String)"Screen provider must be set", (Object[])new Object[0]);
    }

    @Override
    Class<ExternalButtonOption> getOptionClass() {
        return ExternalButtonOption.class;
    }

    @Override
    public ExternalButtonOptionBuilder setEnabledProvider(Function<ConfigState, Boolean> function, class01894 ... class01894Array) {
        super.setEnabledProvider(function, class01894Array);
        return this;
    }

    Consumer<class05096> getCurrentScreenConsumer() {
        return (Consumer)this.getFirstNotNull(this.currentScreenConsumer, ExternalButtonOption::getCurrentScreenConsumer);
    }

    @Override
    public ExternalButtonOptionBuilder setTooltip(class00392 class003922) {
        super.setTooltip(class003922);
        return this;
    }
}

