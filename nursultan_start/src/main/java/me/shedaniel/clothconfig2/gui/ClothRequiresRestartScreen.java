/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class05733
 *  minecraft.class06202
 */
package me.shedaniel.clothconfig2.gui;

import minecraft.class00392;
import minecraft.class05096;
import minecraft.class05733;
import minecraft.class06202;

public class ClothRequiresRestartScreen
extends class05733 {
    public ClothRequiresRestartScreen(class05096 class050962) {
        super(bl -> {
            if (bl) {
                class06202.Nq().NP();
            } else {
                class06202.Nq().N(class050962);
            }
        }, (class00392)class00392.L((String)"text.cloth-config.restart_required"), (class00392)class00392.L((String)"text.cloth-config.restart_required_sub"), (class00392)class00392.L((String)"text.cloth-config.exit_minecraft"), (class00392)class00392.L((String)"text.cloth-config.ignore_restart"));
    }
}

