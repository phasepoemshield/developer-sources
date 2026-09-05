/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class07438
 */
package net.fabricmc.fabric.api.item.v1;

import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07438;

@FunctionalInterface
public interface CustomDamageHandler {
    public int damage(class06584 var1, int var2, class07438 var3, class07085 var4, Runnable var5);
}

