/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.terraformersmc.modmenu.api.ConfigScreenFactory
 *  com.terraformersmc.modmenu.api.ModMenuApi
 *  minecraft.class05096
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package com.armorhud.util;

import com.armorhud.config.configScreen;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import minecraft.class05096;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class armorHudModMenu
implements ModMenuApi {
    private class05096 createConfigScreen(class05096 class050962) {
        return new configScreen(class050962);
    }

    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return this::createConfigScreen;
    }
}

