/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class04655
 *  minecraft.class06384
 *  minecraft.class06428
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
 */
package com.armorhud;

import minecraft.class01894;
import minecraft.class04655;
import minecraft.class06384;
import minecraft.class06428;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;

@Environment(value=EnvType.CLIENT)
public class keyBindings {
    public static class06428 armorHudToggle;

    public static void registerKeys() {
        class06384 class063842 = class06384.N((class01894)class01894.N((String)"simple-armor-hud", (String)"armorhud.toggles"));
        armorHudToggle = KeyBindingHelper.registerKeyBinding((class06428)new class06428("key.armorhud.armorvisible", class04655.yI.y(), class063842));
    }
}

