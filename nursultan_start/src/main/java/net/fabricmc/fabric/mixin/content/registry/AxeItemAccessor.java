/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class06938
 */
package net.fabricmc.fabric.mixin.content.registry;

import java.util.Map;
import minecraft.class00891;
import minecraft.class06938;

public interface AxeItemAccessor {
    public static /* synthetic */ void setStrippedBlocks(Map<class00891, class00891> map) {
        class06938.N(map);
    }

    public static /* synthetic */ Map<class00891, class00891> getStrippedBlocks() {
        return class06938.N();
    }
}

