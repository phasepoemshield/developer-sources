/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class06581
 *  minecraft.class06918
 *  net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
 */
package net.fabricmc.fabric.impl.registry.sync.trackers.vanilla;

import minecraft.class00751;
import minecraft.class01894;
import minecraft.class06581;
import minecraft.class06918;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;

public final class BlockItemTracker
implements RegistryEntryAddedCallback<class06581> {
    public void onEntryAdded(int n, class01894 class018942, class06581 class065812) {
        if (class065812 instanceof class06918) {
            ((class06918)class065812).N(class06581.R, class065812);
        }
    }

    private BlockItemTracker() {
    }

    public static void register(class00751<class06581> class007512) {
        BlockItemTracker blockItemTracker = new BlockItemTracker();
        RegistryEntryAddedCallback.event(class007512).register((Object)blockItemTracker);
    }
}

