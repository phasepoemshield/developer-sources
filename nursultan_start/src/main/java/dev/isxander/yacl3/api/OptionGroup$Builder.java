/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionAddable;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionGroup;
import java.util.Collection;
import java.util.function.Supplier;
import minecraft.class00392;

public interface OptionGroup$Builder
extends OptionAddable {
    public OptionGroup$Builder description(OptionDescription var1);

    @Override
    public OptionGroup$Builder options(Collection<? extends Option<?>> var1);

    public OptionGroup$Builder name(class00392 var1);

    @Override
    default public OptionGroup$Builder option(Supplier<Option<?>> supplier) {
        OptionAddable.super.option(supplier);
        return this;
    }

    @Override
    public OptionGroup$Builder option(Option<?> var1);

    public OptionGroup build();

    @Override
    default public OptionGroup$Builder optionsIf(boolean bl, Collection<? extends Option<?>> collection) {
        OptionAddable.super.optionsIf(bl, collection);
        return this;
    }

    @Override
    default public OptionGroup$Builder optionIf(boolean bl, Supplier<Option<?>> supplier) {
        OptionAddable.super.optionIf(bl, supplier);
        return this;
    }

    @Override
    default public OptionGroup$Builder optionIf(boolean bl, Option<?> option) {
        OptionAddable.super.optionIf(bl, option);
        return this;
    }

    public OptionGroup$Builder collapsed(boolean var1);
}

