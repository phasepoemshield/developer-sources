/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.util.Key
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft;

import com.viaversion.viaversion.api.minecraft.RegistryKey;
import com.viaversion.viaversion.util.Key;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

public enum RegistryType implements RegistryKey
{
    BLOCK("block"),
    ITEM("item"),
    FLUID("fluid"),
    ENTITY("entity_type"),
    GAME_EVENT("game_event"),
    ENCHANTMENT("enchantment"),
    DAMAGE_TYPE("damage_type"),
    BANNER_PATTERN("banner_pattern");

    private static final Map<String, RegistryType> MAP;
    private static final RegistryType[] VALUES;
    private final String identifier;

    private RegistryType(String string2) {
        this.identifier = string2;
    }

    @Override
    public Key key() {
        return Key.of((String)this.identifier);
    }

    public String identifier() {
        return this.identifier;
    }

    public static RegistryType[] getValues() {
        return VALUES;
    }

    public static @Nullable RegistryType getByKey(String string) {
        return MAP.get(string);
    }

    static {
        MAP = new HashMap<String, RegistryType>();
        VALUES = RegistryType.values();
        for (RegistryType type : RegistryType.getValues()) {
            MAP.put(type.identifier, type);
        }
    }
}

