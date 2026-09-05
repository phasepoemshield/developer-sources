/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.event.player;

import minecraft.class00500;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface BlockEvents$UseItemOnCallback {
    public @Nullable class07082 useItemOn(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7);
}

