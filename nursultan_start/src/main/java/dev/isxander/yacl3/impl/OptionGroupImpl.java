/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionGroup
 *  minecraft.class00392
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionGroup;
import minecraft.class00392;

public final class OptionGroupImpl
implements OptionGroup {
    private final class00392 name;
    private final OptionDescription description;
    private final ImmutableList<? extends Option<?>> options;
    private final boolean collapsed;
    private final boolean isRoot;

    public OptionDescription description() {
        return this.description;
    }

    public ImmutableList<? extends Option<?>> options() {
        return this.options;
    }

    public OptionGroupImpl(class00392 class003922, OptionDescription optionDescription, ImmutableList<? extends Option<?>> immutableList, boolean bl, boolean bl2) {
        this.name = class003922;
        this.description = optionDescription;
        this.options = immutableList;
        this.collapsed = bl;
        this.isRoot = bl2;
    }

    public class00392 name() {
        return this.name;
    }

    public class00392 tooltip() {
        return this.description.text();
    }

    public boolean isRoot() {
        return this.isRoot;
    }

    public boolean collapsed() {
        return this.collapsed;
    }
}

