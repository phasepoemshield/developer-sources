/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.ConfigBuilder
 *  me.shedaniel.clothconfig2.api.ConfigCategory
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05936
 */
package me.shedaniel.clothconfig2.impl;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05936;

public class ConfigCategoryImpl
implements ConfigCategory {
    private final ConfigBuilder builder;
    private final List<Object> data;
    private class01894 background;
    private final class00392 categoryKey;
    private Supplier<Optional<class05936[]>> description = Optional::empty;

    ConfigCategoryImpl(ConfigBuilder configBuilder, class00392 class003922) {
        this.builder = configBuilder;
        this.data = Lists.newArrayList();
        this.categoryKey = class003922;
    }

    public ConfigCategory addEntry(AbstractConfigListEntry abstractConfigListEntry) {
        this.data.add(abstractConfigListEntry);
        return this;
    }

    public List<Object> getEntries() {
        return this.data;
    }

    public class01894 getBackground() {
        return this.background;
    }

    public void setBackground(class01894 class018942) {
        this.background = class018942;
    }

    public void removeCategory() {
        this.builder.removeCategory(this.categoryKey);
    }

    public Supplier<Optional<class05936[]>> getDescription() {
        return this.description;
    }

    public void setDescription(Supplier<Optional<class05936[]>> supplier) {
        this.description = supplier;
    }

    public class00392 getCategoryKey() {
        return this.categoryKey;
    }

    public ConfigCategory setCategoryBackground(class01894 class018942) {
        this.background = class018942;
        return this;
    }
}

