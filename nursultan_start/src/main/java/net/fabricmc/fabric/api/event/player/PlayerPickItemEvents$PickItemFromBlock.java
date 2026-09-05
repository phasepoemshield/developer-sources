/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class04770
 *  minecraft.class06584
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.event.player;

import minecraft.class00500;
import minecraft.class04770;
import minecraft.class06584;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface PlayerPickItemEvents$PickItemFromBlock {
    public @Nullable class06584 onPickItemFromBlock(class04770 var1, class07209 var2, class00500 var3, boolean var4);
}

