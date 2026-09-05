/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.ConfigBuilder
 *  me.shedaniel.clothconfig2.api.ConfigCategory
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05096
 *  minecraft.class05216
 */
package me.shedaniel.autoconfig.gui;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.ConfigManager;
import me.shedaniel.autoconfig.annotation.Config$Gui$Background;
import me.shedaniel.autoconfig.annotation.Config$Gui$CategoryBackground;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Category;
import me.shedaniel.autoconfig.gui.registry.api.GuiRegistryAccess;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05096;
import minecraft.class05216;

public class ConfigScreenProvider<T extends ConfigData>
implements Supplier<class05096> {
    private static final class01894 TRANSPARENT_BACKGROUND = class01894.N((String)"cloth-config2:transparent");
    private final ConfigManager<T> manager;
    private final GuiRegistryAccess registry;
    private final class05096 parent;
    private Function<ConfigManager<T>, String> i18nFunction = configManager -> String.format("text.autoconfig.%s", configManager.getDefinition().name());
    private Function<ConfigBuilder, class05096> buildFunction = ConfigBuilder::build;
    private BiFunction<String, Field, String> optionFunction = (string, field) -> String.format("%s.option.%s", string, field.getName());
    private BiFunction<String, String, String> categoryFunction = (string, string2) -> String.format("%s.category.%s", string, string2);

    public ConfigScreenProvider(ConfigManager<T> configManager2, GuiRegistryAccess guiRegistryAccess, class05096 class050962) {
        this.manager = configManager2;
        this.registry = guiRegistryAccess;
        this.parent = class050962;
    }

    @Override
    public class05096 get() {
        Object object;
        T t = this.manager.getConfig();
        T t2 = this.manager.getSerializer().createDefault();
        String string = this.i18nFunction.apply(this.manager);
        ConfigBuilder configBuilder = ConfigBuilder.create().setParentScreen(this.parent).setTitle((class00392)class00392.L((String)String.format("%s.title", string))).setSavingRunnable(this.manager::save);
        Class<T> clazz = this.manager.getConfigClass();
        if (clazz.isAnnotationPresent(Config$Gui$Background.class)) {
            object = clazz.getAnnotation(Config$Gui$Background.class).value();
            class01894 class018942 = class01894.L((String)object);
            if (TRANSPARENT_BACKGROUND.equals((Object)class018942)) {
                configBuilder.transparentBackground().setDefaultBackgroundTexture(null);
            } else {
                configBuilder.solidBackground().setDefaultBackgroundTexture(class018942);
            }
        }
        object = Arrays.stream((Config$Gui$CategoryBackground[])clazz.getAnnotationsByType(Config$Gui$CategoryBackground.class)).collect(Collectors.toMap(Config$Gui$CategoryBackground::category, config$Gui$CategoryBackground -> class01894.L((String)config$Gui$CategoryBackground.background())));
        Arrays.stream(clazz.getDeclaredFields()).collect(Collectors.groupingBy(arg_0 -> this.lambda$get$4(configBuilder, (Map)object, string, arg_0), LinkedHashMap::new, Collectors.toList())).forEach((configCategory, list) -> list.forEach(field -> {
            String string2 = this.optionFunction.apply(string, (Field)field);
            this.registry.getAndTransform(string2, (Field)field, t, t2, this.registry).forEach(arg_0 -> ((ConfigCategory)configCategory).addEntry(arg_0));
        }));
        return this.buildFunction.apply(configBuilder);
    }

    private /* synthetic */ ConfigCategory lambda$get$4(ConfigBuilder configBuilder, Map map, String string, Field field) {
        return this.getOrCreateCategoryForField(field, configBuilder, map, string);
    }

    private ConfigCategory getOrCreateCategoryForField(Field field, ConfigBuilder configBuilder, Map<String, class01894> map, String string) {
        class05216 class052162;
        String string2 = "default";
        if (field.isAnnotationPresent(ConfigEntry$Category.class)) {
            string2 = field.getAnnotation(ConfigEntry$Category.class).value();
        }
        if (!configBuilder.hasCategory((class00392)(class052162 = class00392.L((String)this.categoryFunction.apply(string, string2))))) {
            ConfigCategory configCategory = configBuilder.getOrCreateCategory((class00392)class052162);
            if (map.containsKey(string2)) {
                configCategory.setCategoryBackground(map.get(string2));
            }
            return configCategory;
        }
        return configBuilder.getOrCreateCategory((class00392)class052162);
    }

    @Deprecated
    public void setOptionFunction(BiFunction<String, Field, String> biFunction) {
        this.optionFunction = biFunction;
    }

    @Deprecated
    public void setI13nFunction(Function<ConfigManager<T>, String> function) {
        this.i18nFunction = function;
    }

    @Deprecated
    public void setBuildFunction(Function<ConfigBuilder, class05096> function) {
        this.buildFunction = function;
    }

    @Deprecated
    public void setCategoryFunction(BiFunction<String, String, String> biFunction) {
        this.categoryFunction = biFunction;
    }
}

