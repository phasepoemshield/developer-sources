/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.YetAnotherConfigLib
 *  dev.isxander.yacl3.gui.YACLScreen
 *  minecraft.class00392
 *  minecraft.class05096
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class05096;

public final class YetAnotherConfigLibImpl
implements YetAnotherConfigLib {
    private final class00392 title;
    private final ImmutableList<ConfigCategory> categories;
    private final Runnable saveFunction;
    private final Consumer<YACLScreen> initConsumer;
    private boolean generated = false;

    public ImmutableList<ConfigCategory> categories() {
        return this.categories;
    }

    public YetAnotherConfigLibImpl(class00392 class003922, ImmutableList<ConfigCategory> immutableList, Runnable runnable, Consumer<YACLScreen> consumer) {
        this.title = class003922;
        this.categories = immutableList;
        this.saveFunction = runnable;
        this.initConsumer = consumer;
    }

    public class00392 title() {
        return this.title;
    }

    public Consumer<YACLScreen> initConsumer() {
        return this.initConsumer;
    }

    public Runnable saveFunction() {
        return this.saveFunction;
    }

    public class05096 generateScreen(class05096 class050962) {
        if (this.generated) {
            throw new UnsupportedOperationException("To prevent memory leaks, you should only generate a Screen once per instance. Please re-build the instance to generate another GUI.");
        }
        YACLConstants.LOGGER.info("Generating YACL screen");
        this.generated = true;
        return new YACLScreen((YetAnotherConfigLib)this, class050962);
    }
}

