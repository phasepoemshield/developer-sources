/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  net.fabricmc.loader.api.FabricLoader
 */
package com.terraformersmc.modmenu.config;

import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.config.option.BooleanConfigOption;
import com.terraformersmc.modmenu.config.option.ConfigOptionStorage;
import com.terraformersmc.modmenu.config.option.EnumConfigOption;
import com.terraformersmc.modmenu.config.option.StringSetConfigOption;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Locale;
import java.util.stream.Collectors;
import net.fabricmc.loader.api.FabricLoader;

public class ModMenuConfigManager {
    private static Path path;

    private static void load() {
        ModMenuConfigManager.prepareConfigPath();
        try {
            if (!Files.exists(path, new LinkOption[0])) {
                ModMenuConfigManager.save();
            }
            if (Files.exists(path, new LinkOption[0])) {
                BufferedReader bufferedReader = Files.newBufferedReader(path);
                JsonObject jsonObject = JsonParser.parseReader((Reader)bufferedReader).getAsJsonObject();
                for (Field field : ModMenuConfig.class.getDeclaredFields()) {
                    Object object;
                    JsonArray jsonArray;
                    if (!Modifier.isStatic(field.getModifiers()) || !Modifier.isFinal(field.getModifiers())) continue;
                    if (StringSetConfigOption.class.isAssignableFrom(field.getType())) {
                        jsonArray = jsonObject.getAsJsonArray(field.getName().toLowerCase(Locale.ROOT));
                        if (jsonArray == null) continue;
                        object = (StringSetConfigOption)field.get(null);
                        ConfigOptionStorage.setStringSet(((StringSetConfigOption)object).getKey(), Sets.newHashSet((Iterable)jsonArray).stream().map(JsonElement::getAsString).collect(Collectors.toSet()));
                        continue;
                    }
                    if (BooleanConfigOption.class.isAssignableFrom(field.getType())) {
                        jsonArray = jsonObject.getAsJsonPrimitive(field.getName().toLowerCase(Locale.ROOT));
                        if (jsonArray == null || !jsonArray.isBoolean()) continue;
                        object = (BooleanConfigOption)field.get(null);
                        ConfigOptionStorage.setBoolean(((BooleanConfigOption)object).getKey(), jsonArray.getAsBoolean());
                        continue;
                    }
                    if (!EnumConfigOption.class.isAssignableFrom(field.getType()) || !(field.getGenericType() instanceof ParameterizedType) || (jsonArray = jsonObject.getAsJsonPrimitive(field.getName().toLowerCase(Locale.ROOT))) == null || !jsonArray.isString() || !((object = ((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0]) instanceof Class)) continue;
                    EnumConfigOption enumConfigOption = (EnumConfigOption)field.get(null);
                    Enum enum_ = null;
                    for (Enum enum_2 : (Enum[])((Class)object).getEnumConstants()) {
                        if (!enum_2.name().toLowerCase(Locale.ROOT).equals(jsonArray.getAsString())) continue;
                        enum_ = enum_2;
                        break;
                    }
                    if (enum_ == null) continue;
                    ConfigOptionStorage.setEnumTypeless(enumConfigOption.getKey(), enum_);
                }
            }
        }
        catch (IOException | IllegalAccessException exception) {
            System.err.println("Couldn't load Mod Menu configuration file; reverting to defaults");
            exception.printStackTrace();
        }
    }

    public static void save() {
        ModMenu.clearModCountCache();
        ModMenuConfigManager.prepareConfigPath();
        JsonObject jsonObject = new JsonObject();
        try {
            for (Field field : ModMenuConfig.class.getDeclaredFields()) {
                Object object;
                Object object2;
                if (!Modifier.isStatic(field.getModifiers()) || !Modifier.isFinal(field.getModifiers())) continue;
                if (BooleanConfigOption.class.isAssignableFrom(field.getType())) {
                    object2 = (BooleanConfigOption)field.get(null);
                    jsonObject.addProperty(field.getName().toLowerCase(Locale.ROOT), Boolean.valueOf(ConfigOptionStorage.getBoolean(((BooleanConfigOption)object2).getKey())));
                    continue;
                }
                if (StringSetConfigOption.class.isAssignableFrom(field.getType())) {
                    object2 = (StringSetConfigOption)field.get(null);
                    object = new JsonArray();
                    ConfigOptionStorage.getStringSet(((StringSetConfigOption)object2).getKey()).forEach(arg_0 -> ((JsonArray)object).add(arg_0));
                    jsonObject.add(field.getName().toLowerCase(Locale.ROOT), (JsonElement)object);
                    continue;
                }
                if (!EnumConfigOption.class.isAssignableFrom(field.getType()) || !(field.getGenericType() instanceof ParameterizedType) || !((object2 = ((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0]) instanceof Class)) continue;
                object = (EnumConfigOption)field.get(null);
                jsonObject.addProperty(field.getName().toLowerCase(Locale.ROOT), ConfigOptionStorage.getEnumTypeless(((EnumConfigOption)object).getKey(), (Class)object2).name().toLowerCase(Locale.ROOT));
            }
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }
        String string = ModMenu.GSON.toJson((JsonElement)jsonObject);
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);){
            bufferedWriter.write(string);
        }
        catch (IOException iOException) {
            System.err.println("Couldn't save Mod Menu configuration file");
            iOException.printStackTrace();
        }
    }

    public static void initializeConfig() {
        ModMenuConfigManager.load();
    }

    private static void prepareConfigPath() {
        if (path == null) {
            path = FabricLoader.getInstance().getConfigDir().resolve("modmenu.json");
        }
    }
}

