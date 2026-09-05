/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00392
 *  org.apache.commons.lang3.Validate
 */
package net.caffeinemc.mods.sodium.client.config.builder;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00392;
import net.caffeinemc.mods.sodium.api.config.structure.OptionBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionGroupBuilder;
import net.caffeinemc.mods.sodium.api.config.structure.OptionPageBuilder;
import net.caffeinemc.mods.sodium.client.config.builder.OptionGroupBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.builder.PageBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.structure.OptionGroup;
import net.caffeinemc.mods.sodium.client.config.structure.OptionPage;
import org.apache.commons.lang3.Validate;

class OptionPageBuilderImpl
extends PageBuilderImpl
implements OptionPageBuilder {
    private final List<OptionGroup> groups = new ArrayList<OptionGroup>();
    private final List<OptionBuilder> looseOptions = new ArrayList<OptionBuilder>();

    OptionPageBuilderImpl() {
    }

    @Override
    public OptionPageBuilderImpl setName(class00392 class003922) {
        super.setName(class003922);
        return this;
    }

    @Override
    OptionPage build() {
        this.prepareBuild();
        if (!this.looseOptions.isEmpty()) {
            OptionGroupBuilderImpl optionGroupBuilderImpl = new OptionGroupBuilderImpl();
            this.looseOptions.forEach(optionGroupBuilderImpl::addOption);
            this.addOptionGroup(optionGroupBuilderImpl);
        }
        return new OptionPage(this.name, (ImmutableList<OptionGroup>)ImmutableList.copyOf(this.groups));
    }

    @Override
    void prepareBuild() {
        super.prepareBuild();
        if (this.looseOptions.isEmpty()) {
            Validate.notEmpty(this.groups, (String)"At least one group or loose option must be added", (Object[])new Object[0]);
        }
    }

    @Override
    public OptionPageBuilder addOption(OptionBuilder optionBuilder) {
        this.looseOptions.add(optionBuilder);
        return this;
    }

    @Override
    public OptionPageBuilder addOptionGroup(OptionGroupBuilder optionGroupBuilder) {
        this.groups.add(((OptionGroupBuilderImpl)optionGroupBuilder).build());
        return this;
    }
}

