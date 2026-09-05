/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05096
 */
package com.terraformersmc.modmenu.api;

import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.UpdateChecker;
import com.terraformersmc.modmenu.gui.ModsScreen;
import com.terraformersmc.modmenu.util.NullScreenFactory;
import java.util.Map;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class05096;

public interface ModMenuApi {
    default public UpdateChecker getUpdateChecker() {
        return null;
    }

    public static class05096 createModsScreen(class05096 class050962) {
        return new ModsScreen(class050962);
    }

    default public Map<String, ConfigScreenFactory<?>> getProvidedConfigScreenFactories() {
        return Map.of();
    }

    default public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return new NullScreenFactory();
    }

    public static class00392 createModsButtonText() {
        return ModMenu.createModsButtonText(true);
    }

    default public Map<String, UpdateChecker> getProvidedUpdateCheckers() {
        return Map.of();
    }

    default public void attachModpackBadges(Consumer<String> consumer) {
    }
}

