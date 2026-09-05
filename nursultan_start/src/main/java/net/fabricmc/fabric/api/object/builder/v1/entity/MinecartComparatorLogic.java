/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07209
 *  minecraft.class07504
 */
package net.fabricmc.fabric.api.object.builder.v1.entity;

import minecraft.class00500;
import minecraft.class07209;
import minecraft.class07504;

@FunctionalInterface
public interface MinecartComparatorLogic<T extends class07504> {
    public int getComparatorValue(T var1, class00500 var2, class07209 var3);
}

