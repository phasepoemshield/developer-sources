/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class06202
 *  minecraft.class07080
 *  net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint
 */
package net.caffeinemc.mods.sodium.client.config;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class06202;
import minecraft.class07080;
import net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint;
import net.caffeinemc.mods.sodium.api.config.structure.ConfigBuilder;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.config.ConfigManager$ConfigUser;
import net.caffeinemc.mods.sodium.client.config.ConfigManager$ModMetadata;
import net.caffeinemc.mods.sodium.client.config.builder.ConfigBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.structure.Config;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;

public class ConfigManager {
    public static final String CONFIG_ENTRY_POINT_KEY = "sodium:config_api_user";
    private static final Collection<ConfigManager$ConfigUser> configUsers = new ArrayList<ConfigManager$ConfigUser>();
    public static Config CONFIG;
    private static Function<String, ConfigManager$ModMetadata> modInfoFunction;

    public static void registerConfigsEarly() {
        ConfigManager.registerConfigs(ConfigEntryPoint::registerConfigEarly);
    }

    public static void registerConfigEntryPoint(String string, String string2) {
        Class<?> clazz;
        try {
            clazz = Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            SodiumClientMod.logger().warn("Mod '{}' provided a custom config integration but the class is missing: {}", (Object)string2, (Object)string);
            return;
        }
        if (!ConfigEntryPoint.class.isAssignableFrom(clazz)) {
            SodiumClientMod.logger().warn("Mod '{}' provided a custom config integration but the class is of the wrong type: {}", (Object)string2, clazz);
            return;
        }
        ConfigManager.registerConfigEntryPoint(() -> {
            try {
                Constructor constructor = clazz.getDeclaredConstructor(new Class[0]);
                constructor.setAccessible(true);
                return (ConfigEntryPoint)constructor.newInstance(new Object[0]);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                SodiumClientMod.logger().warn("Mod '{}' provided a custom config integration but the class could not be constructed: {}", (Object)string2, (Object)clazz);
                return null;
            }
        }, string2);
    }

    public static void registerConfigEntryPoint(Supplier<ConfigEntryPoint> supplier, String string) {
        configUsers.add(new ConfigManager$ConfigUser(supplier, string));
    }

    public static void registerConfigsLate() {
        ConfigManager.registerConfigs(ConfigEntryPoint::registerConfigLate);
    }

    private static void registerConfigs(BiConsumer<ConfigEntryPoint, ConfigBuilder> biConsumer) {
        ObjectOpenHashSet objectOpenHashSet = new ObjectOpenHashSet();
        ModOptions modOptions = null;
        ObjectArrayList objectArrayList = new ObjectArrayList();
        for (ConfigManager$ConfigUser configManager$ConfigUser : configUsers) {
            ConfigEntryPoint configEntryPoint = configManager$ConfigUser.configEntrypoint.get();
            if (configEntryPoint == null) continue;
            ConfigBuilderImpl configBuilderImpl = new ConfigBuilderImpl(modInfoFunction, configManager$ConfigUser.modId);
            try {
                biConsumer.accept(configEntryPoint, configBuilderImpl);
                Collection<ModOptions> collection = configBuilderImpl.build();
                for (ModOptions modOptions2 : collection) {
                    String string = modOptions2.configId();
                    if (objectOpenHashSet.contains((Object)string)) {
                        throw new IllegalArgumentException("Mod '" + configManager$ConfigUser.modId + "' provided a duplicate mod id: " + string);
                    }
                    objectOpenHashSet.add((Object)string);
                    if (string.equals("sodium")) {
                        modOptions = modOptions2;
                        continue;
                    }
                    objectArrayList.add((Object)modOptions2);
                }
            }
            catch (Exception exception) {
                ConfigManager.crashWithMessage("Mod '" + configManager$ConfigUser.modId + "' failed while registering config options.", exception);
                return;
            }
        }
        objectArrayList.sort(Comparator.comparing(ModOptions::name));
        if (modOptions == null) {
            throw new RuntimeException("Sodium mod config not found");
        }
        objectArrayList.add(0, modOptions);
        try {
            CONFIG = new Config((List<ModOptions>)objectArrayList);
        }
        catch (Exception exception) {
            ConfigManager.crashWithMessage("Failed to build config options", exception);
        }
    }

    private static void crashWithMessage(String string, Exception exception) {
        class06202.N(null, (File)((File)class06202.Nq().l_1), (class07080)new class07080(string, (Throwable)exception));
    }

    public static void setModInfoFunction(Function<String, ConfigManager$ModMetadata> function) {
        modInfoFunction = function;
    }
}

