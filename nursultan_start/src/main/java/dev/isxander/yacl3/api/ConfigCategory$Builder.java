/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionAddable;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.api.OptionGroup$Builder;
import java.util.Collection;
import java.util.function.Supplier;
import minecraft.class00392;

public interface ConfigCategory$Builder
extends OptionAddable {
    @Override
    public ConfigCategory$Builder options(Collection<? extends Option<?>> var1);

    public ConfigCategory$Builder name(class00392 var1);

    public ConfigCategory$Builder group(OptionGroup var1);

    default public ConfigCategory$Builder group(Supplier<OptionGroup> supplier) {
        return this.group(supplier.get());
    }

    public ConfigCategory$Builder groups(Collection<OptionGroup> var1);

    @Override
    default public ConfigCategory$Builder option(Supplier<Option<?>> supplier) {
        OptionAddable.super.option(supplier);
        return this;
    }

    @Override
    public ConfigCategory$Builder option(Option<?> var1);

    public ConfigCategory build();

    public ConfigCategory$Builder tooltip(class00392 ... var1);

    default public ConfigCategory$Builder groupIf(boolean bl, Supplier<OptionGroup> supplier) {
        return bl ? this.group(supplier) : this;
    }

    default public ConfigCategory$Builder groupIf(boolean bl, OptionGroup optionGroup) {
        return bl ? this.group(optionGroup) : this;
    }

    @Override
    default public ConfigCategory$Builder optionsIf(boolean bl, Collection<? extends Option<?>> collection) {
        OptionAddable.super.optionsIf(bl, collection);
        return this;
    }

    default public ConfigCategory$Builder groupsIf(boolean bl, Collection<OptionGroup> collection) {
        return bl ? this.groups(collection) : this;
    }

    @Override
    default public ConfigCategory$Builder optionIf(boolean bl, Supplier<Option<?>> supplier) {
        OptionAddable.super.optionIf(bl, supplier);
        return this;
    }

    @Override
    default public ConfigCategory$Builder optionIf(boolean bl, Option<?> option) {
        OptionAddable.super.optionIf(bl, option);
        return this;
    }

    public OptionGroup.Builder rootGroupBuilder();
}

