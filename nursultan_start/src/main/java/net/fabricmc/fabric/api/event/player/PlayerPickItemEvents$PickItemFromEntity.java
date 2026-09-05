/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 *  minecraft.class06584
 *  minecraft.class07049
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.event.player;

import minecraft.class04770;
import minecraft.class06584;
import minecraft.class07049;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface PlayerPickItemEvents$PickItemFromEntity {
    public @Nullable class06584 onPickItemFromEntity(class04770 var1, class07049 var2, boolean var3);
}

