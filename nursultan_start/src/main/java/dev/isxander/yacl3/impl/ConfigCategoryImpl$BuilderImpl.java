/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.ConfigCategory$Builder
 *  dev.isxander.yacl3.api.ListOption
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.api.OptionGroup$Builder
 *  dev.isxander.yacl3.impl.OptionGroupImpl
 *  dev.isxander.yacl3.impl.utils.YACLConstants
 *  minecraft.class00392
 *  minecraft.class05216
 *  minecraft.class05220
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.ListOption;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.impl.ConfigCategoryImpl;
import dev.isxander.yacl3.impl.ConfigCategoryImpl$BuilderImpl$RootGroupBuilder;
import dev.isxander.yacl3.impl.OptionGroupImpl;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import minecraft.class00392;
import minecraft.class05216;
import minecraft.class05220;
import org.apache.commons.lang3.Validate;

public final class ConfigCategoryImpl$BuilderImpl
implements ConfigCategory.Builder {
    private class00392 name;
    private final List<Option<?>> rootOptions = new ArrayList();
    private final ConfigCategoryImpl$BuilderImpl$RootGroupBuilder rootGroupBuilder = new ConfigCategoryImpl$BuilderImpl$RootGroupBuilder(this);
    private final List<OptionGroup> groups = new ArrayList<OptionGroup>();
    private final List<class00392> tooltipLines = new ArrayList<class00392>();

    public ConfigCategory.Builder options(Collection<? extends Option<?>> collection) {
        Validate.notNull(collection, (String)"`options` must not be null", (Object[])new Object[0]);
        if (collection.stream().anyMatch(ListOption.class::isInstance)) {
            throw new UnsupportedOperationException("List options must not be added as an option but a group!");
        }
        this.rootOptions.addAll(collection);
        return this;
    }

    public ConfigCategory.Builder name(class00392 class003922) {
        Validate.notNull((Object)class003922, (String)"`name` cannot be null", (Object[])new Object[0]);
        this.name = class003922;
        return this;
    }

    public ConfigCategory.Builder group(OptionGroup optionGroup) {
        Validate.notNull((Object)optionGroup, (String)"`group` must not be null", (Object[])new Object[0]);
        this.groups.add(optionGroup);
        return this;
    }

    public ConfigCategory.Builder groups(Collection<OptionGroup> collection) {
        Validate.notEmpty(collection, (String)"`groups` must not be empty", (Object[])new Object[0]);
        this.groups.addAll(collection);
        return this;
    }

    public ConfigCategory.Builder option(Option<?> option) {
        Validate.notNull(option, (String)"`option` must not be null", (Object[])new Object[0]);
        if (option instanceof ListOption) {
            ListOption listOption = (ListOption)option;
            YACLConstants.LOGGER.warn("Adding list option as an option is not supported! Rerouting to group!");
            return this.group((OptionGroup)listOption);
        }
        this.rootOptions.add(option);
        return this;
    }

    public ConfigCategory build() {
        Validate.notNull((Object)this.name, (String)"`name` must not be null to build `ConfigCategory`", (Object[])new Object[0]);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(new OptionGroupImpl(class05220.N, OptionDescription.EMPTY, ImmutableList.copyOf(this.rootOptions), false, true));
        arrayList.addAll(this.groups);
        Validate.notEmpty(arrayList, (String)"at least one option must be added to build `ConfigCategory`", (Object[])new Object[0]);
        class05216 class052162 = class00392.i();
        boolean bl = true;
        for (class00392 class003922 : this.tooltipLines) {
            if (class003922.method_10851() == class05220.N.method_10851()) continue;
            if (!bl) {
                class052162.i("\n");
            }
            bl = false;
            class052162.y(class003922);
        }
        return new ConfigCategoryImpl(this.name, (ImmutableList<OptionGroup>)ImmutableList.copyOf(arrayList), (class00392)class052162);
    }

    public ConfigCategory.Builder tooltip(class00392 ... class00392Array) {
        Validate.notEmpty((Object[])class00392Array, (String)"`tooltips` cannot be empty", (Object[])new Object[0]);
        this.tooltipLines.addAll(List.of(class00392Array));
        return this;
    }

    public OptionGroup.Builder rootGroupBuilder() {
        return this.rootGroupBuilder;
    }
}

