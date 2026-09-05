/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.config.ConfigInstance
 *  dev.isxander.yacl3.config.v2.api.ConfigClassHandler
 *  dev.isxander.yacl3.gui.YACLScreen
 *  dev.isxander.yacl3.impl.YetAnotherConfigLibImpl$BuilderImpl
 *  minecraft.class00392
 *  minecraft.class05096
 */
package dev.isxander.yacl3.api;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.YetAnotherConfigLib$Builder;
import dev.isxander.yacl3.api.YetAnotherConfigLib$ConfigBackedBuilder;
import dev.isxander.yacl3.config.ConfigInstance;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.impl.YetAnotherConfigLibImpl;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class05096;

public interface YetAnotherConfigLib {
    public static <T> YetAnotherConfigLib create(ConfigClassHandler<T> configClassHandler, YetAnotherConfigLib$ConfigBackedBuilder<T> yetAnotherConfigLib$ConfigBackedBuilder) {
        return yetAnotherConfigLib$ConfigBackedBuilder.build(configClassHandler.defaults(), configClassHandler.instance(), YetAnotherConfigLib.createBuilder().save(() -> configClassHandler.save())).build();
    }

    @Deprecated
    public static <T> YetAnotherConfigLib create(ConfigInstance<T> configInstance, YetAnotherConfigLib$ConfigBackedBuilder<T> yetAnotherConfigLib$ConfigBackedBuilder) {
        return yetAnotherConfigLib$ConfigBackedBuilder.build(configInstance.getDefaults(), configInstance.getConfig(), YetAnotherConfigLib.createBuilder().save(() -> configInstance.save())).build();
    }

    public ImmutableList<ConfigCategory> categories();

    public static YetAnotherConfigLib$Builder createBuilder() {
        return new YetAnotherConfigLibImpl.BuilderImpl();
    }

    public class00392 title();

    public Consumer<YACLScreen> initConsumer();

    public Runnable saveFunction();

    public class05096 generateScreen(class05096 var1);
}

