/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07082
 */
package me.shedaniel.autoconfig.example;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.AutoConfigClient;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.example.ExampleConfig;
import me.shedaniel.autoconfig.serializer.DummyConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import minecraft.class07082;

public class ExampleInits {
    public static void exampleClientInit() {
        AutoConfigClient.getGuiRegistry(ExampleConfig.class);
    }

    public static void exampleCommonInit() {
        ConfigHolder<ExampleConfig> configHolder2 = AutoConfig.register(ExampleConfig.class, PartitioningSerializer.wrap(DummyConfigSerializer::new));
        configHolder2.getConfig();
        AutoConfig.getConfigHolder(ExampleConfig.class).getConfig();
        AutoConfig.getConfigHolder(ExampleConfig.class).registerSaveListener((configHolder, exampleConfig) -> class07082.N);
        AutoConfig.getConfigHolder(ExampleConfig.class).registerLoadListener((configHolder, exampleConfig) -> class07082.N);
    }
}

