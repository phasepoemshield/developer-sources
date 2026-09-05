/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.armorhud;

import com.armorhud.armor.ArmorAccessor;
import com.armorhud.armor.VanillaArmorAccessor;
import com.armorhud.config.config;
import com.armorhud.keyBindings;
import com.armorhud.util.armorHudRegistries;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public class armorHud
implements ClientModInitializer {
    public static Logger LOGGER = LoggerFactory.getLogger((String)"simple-armor-hud");
    public static final config CONFIG = new config();
    private static ArmorAccessor armorAccessor;

    public void handleKeys() {
        ClientTickEvents.END_CLIENT_TICK.register(class062022 -> {
            if (keyBindings.armorHudToggle.B()) {
                config.ARMOR_HUD = !config.ARMOR_HUD;
            }
        });
    }

    public static ArmorAccessor getArmorAccessor() {
        return armorAccessor;
    }

    public void onInitializeClient() {
        LOGGER.info("Simple Armor Hud loaded!");
        armorAccessor = new VanillaArmorAccessor();
        CONFIG.load();
        armorHudRegistries.registerArmorHud();
        this.handleKeys();
        LOGGER.info("Armor accessor implementation: {}", (Object)armorAccessor.getClass().getSimpleName());
    }
}

