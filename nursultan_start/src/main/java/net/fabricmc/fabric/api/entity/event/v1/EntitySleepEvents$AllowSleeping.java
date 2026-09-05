/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 *  minecraft.class08035
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.entity.event.v1;

import minecraft.class07209;
import minecraft.class08035;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface EntitySleepEvents$AllowSleeping {
    public @Nullable class08035 allowSleep(class08036 var1, class07209 var2);
}

