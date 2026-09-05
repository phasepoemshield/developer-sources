/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01348
 *  minecraft.class06581
 */
package net.fabricmc.fabric.mixin.content.registry;

import java.util.List;
import minecraft.class01348;
import minecraft.class06581;

public interface WorkAtComposterAccessor {
    public static /* synthetic */ void fabric_setCompostables(List<class06581> list) {
        class01348.N(list);
    }

    public static /* synthetic */ List<class06581> fabric_getCompostable() {
        return class01348.N();
    }
}

