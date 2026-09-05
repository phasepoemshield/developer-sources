/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.impl.ConfigBuilderImpl
 *  me.shedaniel.clothconfig2.impl.ConfigEntryBuilderImpl
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05096
 */
package me.shedaniel.clothconfig2.api;

import java.util.function.Consumer;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import me.shedaniel.clothconfig2.impl.ConfigBuilderImpl;
import me.shedaniel.clothconfig2.impl.ConfigEntryBuilderImpl;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05096;

public interface ConfigBuilder {
    public static ConfigBuilder create() {
        return new ConfigBuilderImpl();
    }

    public class05096 build();

    public ConfigBuilder setParentScreen(class05096 var1);

    public ConfigBuilder removeCategory(class00392 var1);

    public boolean doesConfirmSave();

    @Deprecated
    default public ConfigEntryBuilderImpl getEntryBuilder() {
        return (ConfigEntryBuilderImpl)this.entryBuilder();
    }

    public Runnable getSavingRunnable();

    public void setGlobalized(boolean var1);

    public boolean hasCategory(class00392 var1);

    public ConfigBuilder setEditable(boolean var1);

    @Deprecated
    default public boolean doesProcessErrors() {
        return false;
    }

    public ConfigBuilder setDoesConfirmSave(boolean var1);

    public ConfigBuilder setAlwaysShowTabs(boolean var1);

    public boolean isAlwaysShowTabs();

    public ConfigBuilder setSavingRunnable(Runnable var1);

    public class05096 getParentScreen();

    default public ConfigEntryBuilder entryBuilder() {
        return ConfigEntryBuilderImpl.create();
    }

    default public ConfigBuilder solidBackground() {
        return this.setTransparentBackground(false);
    }

    default public ConfigBuilder alwaysShowTabs() {
        return this.setAlwaysShowTabs(true);
    }

    public ConfigBuilder setTitle(class00392 var1);

    public boolean isEditable();

    public class00392 getTitle();

    public ConfigBuilder setDefaultBackgroundTexture(class01894 var1);

    public class01894 getDefaultBackgroundTexture();

    public ConfigBuilder setFallbackCategory(ConfigCategory var1);

    public ConfigCategory getOrCreateCategory(class00392 var1);

    public ConfigBuilder setAfterInitConsumer(Consumer<class05096> var1);

    public ConfigBuilder removeCategoryIfExists(class00392 var1);

    public boolean isTabsSmoothScrolling();

    @Deprecated
    default public ConfigBuilder setDoesProcessErrors(boolean bl) {
        return this;
    }

    public boolean hasTransparentBackground();

    public boolean isListSmoothScrolling();

    default public ConfigBuilder transparentBackground() {
        return this.setTransparentBackground(true);
    }

    public Consumer<class05096> getAfterInitConsumer();

    public ConfigBuilder setShouldListSmoothScroll(boolean var1);

    public ConfigBuilder setTransparentBackground(boolean var1);

    public void setGlobalizedExpanded(boolean var1);

    public ConfigBuilder setShouldTabsSmoothScroll(boolean var1);
}

