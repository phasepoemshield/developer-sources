/*
 * Decompiled with CFR 0.152.
 */
package com.terraformersmc.modmenu.config.option;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConfigOptionStorage {
    private static final Map<String, Boolean> BOOLEAN_OPTIONS = new HashMap<String, Boolean>();
    private static final Map<String, Enum<?>> ENUM_OPTIONS = new HashMap();
    private static final Map<String, Set<String>> STRING_SET_OPTIONS = new HashMap<String, Set<String>>();

    public static boolean getBoolean(String string) {
        return BOOLEAN_OPTIONS.get(string);
    }

    public static void setBoolean(String string, boolean bl) {
        BOOLEAN_OPTIONS.put(string, bl);
    }

    public static Enum<?> getEnumTypeless(String string, Class<Enum<?>> clazz) {
        return ENUM_OPTIONS.get(string);
    }

    public static void setEnumTypeless(String string, Enum<?> enum_) {
        ENUM_OPTIONS.put(string, enum_);
    }

    public static void setStringSet(String string, Set<String> set) {
        STRING_SET_OPTIONS.put(string, set);
    }

    public static Set<String> getStringSet(String string) {
        return STRING_SET_OPTIONS.get(string);
    }

    public static void toggleBoolean(String string) {
        ConfigOptionStorage.setBoolean(string, !ConfigOptionStorage.getBoolean(string));
    }

    public static <E extends Enum<E>> E getEnum(String string, Class<E> clazz) {
        return (E)ENUM_OPTIONS.get(string);
    }

    public static <E extends Enum<E>> E cycleEnum(String string, Class<E> clazz, int n) {
        Enum[] enumArray = (Enum[])clazz.getEnumConstants();
        E e = ConfigOptionStorage.getEnum(string, clazz);
        Enum enum_ = enumArray[(((Enum)e).ordinal() + enumArray.length + n) % enumArray.length];
        ConfigOptionStorage.setEnum(string, enum_);
        return (E)enum_;
    }

    public static <E extends Enum<E>> E cycleEnum(String string, Class<E> clazz) {
        return ConfigOptionStorage.cycleEnum(string, clazz, 1);
    }

    public static <E extends Enum<E>> void setEnum(String string, E e) {
        ENUM_OPTIONS.put(string, e);
    }
}

