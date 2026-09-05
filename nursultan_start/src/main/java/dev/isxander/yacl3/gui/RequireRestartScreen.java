/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class05733
 *  minecraft.class06202
 *  minecraft.class06541
 */
package dev.isxander.yacl3.gui;

import minecraft.class00392;
import minecraft.class05096;
import minecraft.class05733;
import minecraft.class06202;
import minecraft.class06541;

public class RequireRestartScreen
extends class05733 {
    public RequireRestartScreen(class05096 class050962) {
        super(bl -> {
            if (bl) {
                class06202.Nq().NP();
            } else {
                class06202.Nq().N(class050962);
            }
        }, (class00392)class00392.L((String)"yacl.restart.title").N(new class06541[]{class06541.field_1061, class06541.field_1067}), (class00392)class00392.L((String)"yacl.restart.message"), (class00392)class00392.L((String)"yacl.restart.yes"), (class00392)class00392.L((String)"yacl.restart.no"));
    }
}

