/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class03977
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class07277
 */
package net.caffeinemc.mods.lithium.api.inventory;

import minecraft.class00743;
import minecraft.class03977;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class07277;

public interface LithiumInventory
extends class06695 {
    public void setInventoryLithium(class00743<class06584> var1);

    public class00743<class06584> getInventoryLithium();

    default public void generateLootLithium() {
        if (this instanceof class07277) {
            ((class07277)this).y(null);
        }
        if (this instanceof class03977) {
            ((class03977)this).u(null);
        }
    }
}

