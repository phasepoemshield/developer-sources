/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  org.apache.commons.lang3.Validate
 */
package net.caffeinemc.mods.sodium.client.config.builder;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00392;
import net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionGroupBuilder;
import net.caffeinemc.mods.sodium.client.config.builder.OptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.config.structure.OptionGroup;
import org.apache.commons.lang3.Validate;

class OptionGroupBuilderImpl
implements OptionGroupBuilder {
    private class00392 name;
    private final List<Option> options = new ArrayList<Option>();

    OptionGroupBuilderImpl() {
    }

    @Override
    public OptionGroupBuilder setName(class00392 class003922) {
        this.name = class003922;
        return this;
    }

    OptionGroup build() {
        Validate.notEmpty(this.options, (String)"At least one option must be added", (Object[])new Object[0]);
        return new OptionGroup(this.name, this.options);
    }

    @Override
    public OptionGroupBuilder addOption(OptionBuilder optionBuilder) {
        this.options.add((Option)((OptionBuilderImpl)optionBuilder).build());
        return this;
    }
}

