/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.loader.api.FabricLoader
 */
package com.armorhud.util;

import com.armorhud.armorHud;
import com.armorhud.config.config;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;

@Environment(value=EnvType.CLIENT)
public class modDetect {
    public static void detect() {
        if (FabricLoader.getInstance().isModLoaded("bettermounthud")) {
            config.BETTER_MOUNT_HUD = true;
            armorHud.LOGGER.info("Better mount hud found!");
        }
        if (FabricLoader.getInstance().isModLoaded("double_hotbar")) {
            config.DOUBLE_HOTBAR = true;
            armorHud.LOGGER.info("Double hotbar found!");
        }
        config.save();
    }
}

