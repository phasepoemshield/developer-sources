/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package com.armorhud.util;

import com.armorhud.keyBindings;
import com.armorhud.util.modDetect;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class armorHudRegistries {
    public static void registerArmorHud() {
        keyBindings.registerKeys();
        modDetect.detect();
    }
}

