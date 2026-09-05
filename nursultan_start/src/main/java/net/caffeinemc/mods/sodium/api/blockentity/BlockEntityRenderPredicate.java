/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class07209
 *  minecraft.class07290
 */
package net.caffeinemc.mods.sodium.api.blockentity;

import minecraft.class00394;
import minecraft.class07209;
import minecraft.class07290;

@FunctionalInterface
public interface BlockEntityRenderPredicate<T extends class00394> {
    public boolean shouldRender(class07290 var1, class07209 var2, T var3);
}

