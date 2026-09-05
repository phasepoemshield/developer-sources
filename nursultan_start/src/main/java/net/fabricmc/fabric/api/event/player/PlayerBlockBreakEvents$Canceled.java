/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.event.player;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface PlayerBlockBreakEvents$Canceled {
    public void onBlockBreakCanceled(class07299 var1, class08036 var2, class07209 var3, class00500 var4, @Nullable class00394 var5);
}

