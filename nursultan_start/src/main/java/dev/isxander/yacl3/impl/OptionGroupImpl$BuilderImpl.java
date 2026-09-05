/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.ListOption
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.api.OptionGroup$Builder
 *  minecraft.class00392
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.ListOption;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.impl.OptionGroupImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import minecraft.class00392;
import org.apache.commons.lang3.Validate;

public final class OptionGroupImpl$BuilderImpl
implements OptionGroup.Builder {
    private class00392 name = class00392.i();
    private OptionDescription description = OptionDescription.EMPTY;
    private final List<Option<?>> options = new ArrayList();
    private boolean collapsed = false;

    public OptionGroup.Builder description(OptionDescription optionDescription) {
        Validate.notNull((Object)optionDescription, (String)"`description` must not be null", (Object[])new Object[0]);
        this.description = optionDescription;
        return this;
    }

    public OptionGroup.Builder options(Collection<? extends Option<?>> collection) {
        Validate.notEmpty(collection, (String)"`options` must not be empty", (Object[])new Object[0]);
        if (collection.stream().anyMatch(ListOption.class::isInstance)) {
            throw new UnsupportedOperationException("List options must not be added as an option but a group!");
        }
        this.options.addAll(collection);
        return this;
    }

    public OptionGroup.Builder name(class00392 class003922) {
        Validate.notNull((Object)class003922, (String)"`name` must not be null", (Object[])new Object[0]);
        this.name = class003922;
        return this;
    }

    public OptionGroup.Builder option(Option<?> option) {
        Validate.notNull(option, (String)"`option` must not be null", (Object[])new Object[0]);
        if (option instanceof ListOption) {
            throw new UnsupportedOperationException("List options must not be added as an option but a group!");
        }
        this.options.add(option);
        return this;
    }

    public OptionGroup build() {
        Validate.notEmpty(this.options, (String)"`options` must not be empty to build `OptionGroup`", (Object[])new Object[0]);
        return new OptionGroupImpl(this.name, this.description, ImmutableList.copyOf(this.options), this.collapsed, false);
    }

    public OptionGroup.Builder collapsed(boolean bl) {
        this.collapsed = bl;
        return this;
    }
}

