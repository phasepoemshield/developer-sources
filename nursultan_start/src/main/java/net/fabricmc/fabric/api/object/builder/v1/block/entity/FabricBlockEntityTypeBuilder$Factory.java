/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class07209
 */
package net.fabricmc.fabric.api.object.builder.v1.block.entity;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class07209;

@FunctionalInterface
public interface FabricBlockEntityTypeBuilder$Factory<T extends class00394> {
    public T create(class07209 var1, class00500 var2);
}

