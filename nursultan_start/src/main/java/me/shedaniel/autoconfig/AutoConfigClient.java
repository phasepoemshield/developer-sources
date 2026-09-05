/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 */
package me.shedaniel.autoconfig;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.ConfigManager;
import me.shedaniel.autoconfig.gui.ConfigScreenProvider;
import me.shedaniel.autoconfig.gui.DefaultGuiProviders;
import me.shedaniel.autoconfig.gui.DefaultGuiTransformers;
import me.shedaniel.autoconfig.gui.registry.ComposedGuiRegistryAccess;
import me.shedaniel.autoconfig.gui.registry.DefaultGuiRegistryAccess;
import me.shedaniel.autoconfig.gui.registry.GuiRegistry;
import minecraft.class05096;

public class AutoConfigClient {
    private static final Map<Class<? extends ConfigData>, GuiRegistry> guiRegistries = new HashMap<Class<? extends ConfigData>, GuiRegistry>();
    private static final GuiRegistry defaultGuiRegistry = DefaultGuiTransformers.apply(DefaultGuiProviders.apply(new GuiRegistry()));

    public static <T extends ConfigData> GuiRegistry getGuiRegistry(Class<T> clazz2) {
        return guiRegistries.computeIfAbsent(clazz2, clazz -> new GuiRegistry());
    }

    public static <T extends ConfigData> Supplier<class05096> getConfigScreen(Class<T> clazz, class05096 class050962) {
        return new ConfigScreenProvider((ConfigManager)AutoConfig.getConfigHolder(clazz), new ComposedGuiRegistryAccess(AutoConfigClient.getGuiRegistry(clazz), defaultGuiRegistry, new DefaultGuiRegistryAccess()), class050962);
    }
}

