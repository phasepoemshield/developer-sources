/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04206
 *  minecraft.class04995
 *  net.fabricmc.fabric.mixin.registry.sync.DebugLevelSourceAccessor
 */
package net.fabricmc.fabric.impl.registry.sync.trackers.vanilla;

import java.util.List;
import minecraft.class04206;
import minecraft.class04995;
import net.fabricmc.fabric.mixin.registry.sync.DebugLevelSourceAccessor;

public final class BlockInitTracker {
    public static void postFreeze() {
        List list = class04206.i.j().flatMap(class008912 -> class008912.E().N().stream()).toList();
        int n = class04995.u((float)class04995.N((float)list.size()));
        int n2 = class04995.u((float)((float)list.size() / (float)n));
        DebugLevelSourceAccessor.setALL_BLOCKS((List)list);
        DebugLevelSourceAccessor.setGRID_WIDTH((int)n);
        DebugLevelSourceAccessor.setGRID_HEIGHT((int)n2);
    }
}

