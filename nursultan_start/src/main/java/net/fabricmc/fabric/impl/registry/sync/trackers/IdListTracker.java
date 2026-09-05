/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00742
 *  minecraft.class00751
 *  minecraft.class01894
 *  net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
 *  net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback
 *  net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback$RemapState
 */
package net.fabricmc.fabric.impl.registry.sync.trackers;

import java.util.HashMap;
import java.util.Map;
import minecraft.class00742;
import minecraft.class00751;
import minecraft.class01894;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback;
import net.fabricmc.fabric.impl.registry.sync.RemovableIdList;

public class IdListTracker<V, OV>
implements RegistryEntryAddedCallback<V>,
RegistryIdRemapCallback<V> {
    private final String name;
    private final class00742<OV> mappers;
    private Map<class01894, OV> removedMapperCache = new HashMap<class01894, OV>();

    public void onEntryAdded(int n, class01894 class018942, V v) {
        if (this.removedMapperCache.containsKey(class018942)) {
            this.mappers.N(this.removedMapperCache.get(class018942), n);
        }
    }

    private IdListTracker(String string, class00742<OV> class007422) {
        this.name = string;
        this.mappers = class007422;
    }

    public static <V, OV> void register(class00751<V> class007512, String string, class00742<OV> class007422) {
        IdListTracker<V, OV> idListTracker = new IdListTracker<V, OV>(string, class007422);
        RegistryEntryAddedCallback.event(class007512).register(idListTracker);
        RegistryIdRemapCallback.event(class007512).register(idListTracker);
    }

    public void onRemap(RegistryIdRemapCallback.RemapState<V> remapState) {
        ((RemovableIdList)this.mappers).fabric_remapIds(remapState.getRawIdChangeMap());
    }
}

