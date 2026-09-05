/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class04782
 */
package net.fabricmc.fabric.api.event.lifecycle.v1;

import minecraft.class00570;
import minecraft.class04782;

@FunctionalInterface
public interface ServerChunkEvents$Unload {
    public void onChunkUnload(class04782 var1, class00570 var2);
}

