/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  me.shedaniel.clothconfig2.api.ConfigBuilder
 *  me.shedaniel.clothconfig2.api.ConfigCategory
 *  me.shedaniel.clothconfig2.api.Expandable
 *  me.shedaniel.clothconfig2.gui.ClothConfigScreen
 *  me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05096
 */
package me.shedaniel.clothconfig2.impl;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.Expandable;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen;
import me.shedaniel.clothconfig2.gui.GlobalizedClothConfigScreen;
import me.shedaniel.clothconfig2.impl.ConfigCategoryImpl;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05096;

public class ConfigBuilderImpl
implements ConfigBuilder {
    private Runnable savingRunnable;
    private class05096 parent;
    private class00392 title = class00392.L((String)"text.cloth-config.config");
    private boolean globalized = false;
    private boolean globalizedExpanded = true;
    private boolean editable = true;
    private boolean tabsSmoothScroll = true;
    private boolean listSmoothScroll = true;
    private boolean doesConfirmSave = true;
    private boolean transparentBackground = true;
    private class01894 defaultBackground = class01894.y((String)"textures/block/dirt.png");
    private Consumer<class05096> afterInitConsumer = class050962 -> {};
    private final Map<String, ConfigCategory> categoryMap = Maps.newLinkedHashMap();
    private String fallbackCategory = null;
    private boolean alwaysShowTabs = false;

    public class05096 build() {
        if (this.categoryMap.isEmpty() || this.fallbackCategory == null) {
            throw new NullPointerException("There cannot be no categories or fallback category!");
        }
        Object object = this.globalized ? new GlobalizedClothConfigScreen(this.parent, this.title, this.categoryMap, this.defaultBackground) : new ClothConfigScreen(this.parent, this.title, this.categoryMap, this.defaultBackground);
        object.setSavingRunnable(this.savingRunnable);
        object.setEditable(this.editable);
        object.setFallbackCategory(this.fallbackCategory == null ? null : class00392.y((String)this.fallbackCategory));
        object.setTransparentBackground(this.transparentBackground);
        object.setAlwaysShowTabs(this.alwaysShowTabs);
        object.setConfirmSave(this.doesConfirmSave);
        object.setAfterInitConsumer(this.afterInitConsumer);
        if (object instanceof Expandable) {
            ((Expandable)object).setExpanded(this.globalizedExpanded);
        }
        return object;
    }

    public ConfigBuilder setParentScreen(class05096 class050962) {
        this.parent = class050962;
        return this;
    }

    public ConfigBuilder removeCategory(class00392 class003922) {
        if (this.categoryMap.containsKey(class003922.getString()) && Objects.equals(this.fallbackCategory, class003922.getString())) {
            this.fallbackCategory = null;
        }
        if (!this.categoryMap.containsKey(class003922.getString())) {
            throw new NullPointerException("Category doesn't exist!");
        }
        this.categoryMap.remove(class003922.getString());
        return this;
    }

    public boolean doesConfirmSave() {
        return this.doesConfirmSave;
    }

    public Runnable getSavingRunnable() {
        return this.savingRunnable;
    }

    public void setGlobalized(boolean bl) {
        this.globalized = bl;
    }

    public boolean hasCategory(class00392 class003922) {
        return this.categoryMap.containsKey(class003922.getString());
    }

    public ConfigBuilder setEditable(boolean bl) {
        this.editable = bl;
        return this;
    }

    public ConfigBuilder setDoesConfirmSave(boolean bl) {
        this.doesConfirmSave = bl;
        return this;
    }

    public ConfigBuilder setAlwaysShowTabs(boolean bl) {
        this.alwaysShowTabs = bl;
        return this;
    }

    public boolean isAlwaysShowTabs() {
        return this.alwaysShowTabs;
    }

    public ConfigBuilder setSavingRunnable(Runnable runnable) {
        this.savingRunnable = runnable;
        return this;
    }

    public class05096 getParentScreen() {
        return this.parent;
    }

    public ConfigBuilder setTitle(class00392 class003922) {
        this.title = class003922;
        return this;
    }

    public boolean isEditable() {
        return this.editable;
    }

    public class00392 getTitle() {
        return this.title;
    }

    public ConfigBuilder setDefaultBackgroundTexture(class01894 class018942) {
        this.defaultBackground = class018942;
        return this;
    }

    public class01894 getDefaultBackgroundTexture() {
        return this.defaultBackground;
    }

    public ConfigBuilder setFallbackCategory(ConfigCategory configCategory) {
        this.fallbackCategory = Objects.requireNonNull(configCategory).getCategoryKey().getString();
        return this;
    }

    public ConfigCategory getOrCreateCategory(class00392 class003922) {
        if (this.categoryMap.containsKey(class003922.getString())) {
            return this.categoryMap.get(class003922.getString());
        }
        if (this.fallbackCategory == null) {
            this.fallbackCategory = class003922.getString();
        }
        return this.categoryMap.computeIfAbsent(class003922.getString(), string -> new ConfigCategoryImpl(this, class003922));
    }

    public ConfigBuilder setAfterInitConsumer(Consumer<class05096> consumer) {
        this.afterInitConsumer = consumer;
        return this;
    }

    public ConfigBuilder removeCategoryIfExists(class00392 class003922) {
        if (this.categoryMap.containsKey(class003922.getString()) && Objects.equals(this.fallbackCategory, class003922.getString())) {
            this.fallbackCategory = null;
        }
        this.categoryMap.remove(class003922.getString());
        return this;
    }

    public boolean isTabsSmoothScrolling() {
        return this.tabsSmoothScroll;
    }

    public boolean hasTransparentBackground() {
        return this.transparentBackground;
    }

    public boolean isListSmoothScrolling() {
        return this.listSmoothScroll;
    }

    public Consumer<class05096> getAfterInitConsumer() {
        return this.afterInitConsumer;
    }

    public ConfigBuilder setShouldListSmoothScroll(boolean bl) {
        this.listSmoothScroll = bl;
        return this;
    }

    public ConfigBuilder setTransparentBackground(boolean bl) {
        this.transparentBackground = bl;
        return this;
    }

    public void setGlobalizedExpanded(boolean bl) {
        this.globalizedExpanded = bl;
    }

    public ConfigBuilder setShouldTabsSmoothScroll(boolean bl) {
        this.tabsSmoothScroll = bl;
        return this;
    }
}

