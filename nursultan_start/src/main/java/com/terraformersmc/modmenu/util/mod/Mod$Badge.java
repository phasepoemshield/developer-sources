/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package com.terraformersmc.modmenu.util.mod;

import com.terraformersmc.modmenu.ModMenu;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00392;

public enum Mod$Badge {
    LIBRARY("modmenu.badge.library", -15698860, -16172759, "library"),
    CLIENT("modmenu.badge.clientsideOnly", -13939844, -15848875, null),
    DEPRECATED("modmenu.badge.deprecated", -8121306, -11334633, "deprecated"),
    PATCHWORK_FORGE("modmenu.badge.forge", -14734014, -15722719, null),
    MODPACK("modmenu.badge.modpack", -8770692, -11465388, null),
    MINECRAFT("modmenu.badge.minecraft", -9474966, -13553617, null);

    private final class00392 text;
    private final int outlineColor;
    private final int fillColor;
    private final String key;
    private static final Map<String, Mod$Badge> KEY_MAP;

    public class00392 getText() {
        return this.text;
    }

    private Mod$Badge(String string2, int n2, int n3, String string3) {
        this.text = class00392.L((String)string2);
        this.outlineColor = n2;
        this.fillColor = n3;
        this.key = string3;
    }

    public static Set<Mod$Badge> convert(Set<String> set, String string) {
        return set.stream().map(string2 -> {
            if (!KEY_MAP.containsKey(string2)) {
                ModMenu.LOGGER.warn("Skipping unknown badge key '{}' specified by mod '{}'", string2, (Object)string);
            }
            return KEY_MAP.get(string2);
        }).filter(Objects::nonNull).collect(Collectors.toSet());
    }

    public int getOutlineColor() {
        return this.outlineColor;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    static {
        KEY_MAP = new HashMap<String, Mod$Badge>();
        Arrays.stream(Mod$Badge.values()).forEach(mod$Badge -> KEY_MAP.put(mod$Badge.key, (Mod$Badge)((Object)mod$Badge)));
    }
}

