/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.PlaceholderCategory
 *  dev.isxander.yacl3.api.YetAnotherConfigLib
 *  dev.isxander.yacl3.api.YetAnotherConfigLib$Builder
 *  dev.isxander.yacl3.gui.YACLScreen
 *  minecraft.class00392
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.PlaceholderCategory;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.impl.YetAnotherConfigLibImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00392;
import org.apache.commons.lang3.Validate;

public final class YetAnotherConfigLibImpl$BuilderImpl
implements YetAnotherConfigLib.Builder {
    private class00392 title;
    private final List<ConfigCategory> categories = new ArrayList<ConfigCategory>();
    private Runnable saveFunction = () -> {};
    private Consumer<YACLScreen> initConsumer = yACLScreen -> {};

    public YetAnotherConfigLib.Builder categories(Collection<? extends ConfigCategory> collection) {
        Validate.notNull(collection, (String)"`categories` cannot be null", (Object[])new Object[0]);
        this.categories.addAll(collection);
        return this;
    }

    public YetAnotherConfigLib.Builder save(Runnable runnable) {
        Validate.notNull((Object)runnable, (String)"`saveFunction` cannot be null", (Object[])new Object[0]);
        this.saveFunction = runnable;
        return this;
    }

    public YetAnotherConfigLib build() {
        Validate.notNull((Object)this.title, (String)"`title must not be null to build `YetAnotherConfigLib`", (Object[])new Object[0]);
        Validate.notEmpty(this.categories, (String)"`categories` must not be empty to build `YetAnotherConfigLib`", (Object[])new Object[0]);
        Validate.isTrue((!this.categories.stream().allMatch(configCategory -> configCategory instanceof PlaceholderCategory) ? 1 : 0) != 0, (String)"At least one regular category is required to build `YetAnotherConfigLib`", (Object[])new Object[0]);
        return new YetAnotherConfigLibImpl(this.title, (ImmutableList<ConfigCategory>)ImmutableList.copyOf(this.categories), this.saveFunction, this.initConsumer);
    }

    public YetAnotherConfigLib.Builder category(ConfigCategory configCategory) {
        Validate.notNull((Object)configCategory, (String)"`category` cannot be null", (Object[])new Object[0]);
        this.categories.add(configCategory);
        return this;
    }

    public YetAnotherConfigLib.Builder title(class00392 class003922) {
        Validate.notNull((Object)class003922, (String)"`title` cannot be null", (Object[])new Object[0]);
        this.title = class003922;
        return this;
    }

    public YetAnotherConfigLib.Builder screenInit(Consumer<YACLScreen> consumer) {
        Validate.notNull(consumer, (String)"`initConsumer` cannot be null", (Object[])new Object[0]);
        this.initConsumer = consumer;
        return this;
    }
}

