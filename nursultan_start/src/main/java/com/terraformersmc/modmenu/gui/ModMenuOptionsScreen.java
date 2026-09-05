/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05914
 *  minecraft.class06202
 */
package com.terraformersmc.modmenu.gui;

import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.config.ModMenuConfigManager;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05914;
import minecraft.class06202;

public class ModMenuOptionsScreen
extends class05914 {
    public ModMenuOptionsScreen(class05096 class050962) {
        super(class050962, (class05630)class06202.Nq().i_7, (class00392)class00392.L((String)"modmenu.options"));
    }

    public void method_25432() {
        ModMenuConfigManager.save();
        ModMenu.checkForUpdates();
    }

    public void method_60325() {
        if (this.field_51824 != null) {
            this.field_51824.N(ModMenuConfig.asOptions());
        }
    }
}

