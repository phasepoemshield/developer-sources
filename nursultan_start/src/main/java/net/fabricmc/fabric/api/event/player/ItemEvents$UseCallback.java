/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.event.player;

import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface ItemEvents$UseCallback {
    public @Nullable class07082 use(class07299 var1, class08036 var2, class07050 var3);
}

