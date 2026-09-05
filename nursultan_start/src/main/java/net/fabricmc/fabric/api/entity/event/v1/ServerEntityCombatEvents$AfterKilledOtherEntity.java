/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07438
 */
package net.fabricmc.fabric.api.entity.event.v1;

import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07438;

@FunctionalInterface
public interface ServerEntityCombatEvents$AfterKilledOtherEntity {
    public void afterKilledOtherEntity(class04782 var1, class07049 var2, class07438 var3, class07072 var4);
}

