/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.OptionGroup
 *  minecraft.class00392
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.OptionGroup;
import minecraft.class00392;

public final class ConfigCategoryImpl
implements ConfigCategory {
    private final class00392 name;
    private final ImmutableList<OptionGroup> groups;
    private final class00392 tooltip;

    public ConfigCategoryImpl(class00392 class003922, ImmutableList<OptionGroup> immutableList, class00392 class003923) {
        this.name = class003922;
        this.groups = immutableList;
        this.tooltip = class003923;
    }

    public class00392 name() {
        return this.name;
    }

    public ImmutableList<OptionGroup> groups() {
        return this.groups;
    }

    public class00392 tooltip() {
        return this.tooltip;
    }
}

