/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.entity.event.v1;

import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface EntitySleepEvents$ModifySleepingDirection {
    public @Nullable class07211 modifySleepDirection(class07438 var1, class07209 var2, @Nullable class07211 var3);
}

