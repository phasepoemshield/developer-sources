/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  minecraft.class00751
 *  minecraft.class01894
 *  net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
 *  net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback
 *  net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback$RemapState
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.registry.sync.trackers;

import com.google.common.base.Joiner;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import minecraft.class00751;
import minecraft.class01894;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Int2ObjectMapTracker<V, OV>
implements RegistryEntryAddedCallback<V>,
RegistryIdRemapCallback<V> {
    private static final Logger LOGGER = LoggerFactory.getLogger(Int2ObjectMapTracker.class);
    private final String name;
    private final Int2ObjectMap<OV> mappers;
    private Map<class01894, OV> removedMapperCache = new HashMap<class01894, OV>();

    public void onEntryAdded(int n, class01894 class018942, V v) {
        if (this.removedMapperCache.containsKey(class018942)) {
            this.mappers.put(n, this.removedMapperCache.get(class018942));
        }
    }

    private Int2ObjectMapTracker(String string, Int2ObjectMap<OV> int2ObjectMap) {
        this.name = string;
        this.mappers = int2ObjectMap;
    }

    public static <V, OV> void register(class00751<V> class007512, String string, Int2ObjectMap<OV> int2ObjectMap) {
        Int2ObjectMapTracker<V, OV> int2ObjectMapTracker = new Int2ObjectMapTracker<V, OV>(string, int2ObjectMap);
        RegistryEntryAddedCallback.event(class007512).register(int2ObjectMapTracker);
        RegistryIdRemapCallback.event(class007512).register(int2ObjectMapTracker);
    }

    public void onRemap(RegistryIdRemapCallback.RemapState<V> remapState) {
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap(this.mappers);
        Int2IntMap int2IntMap = remapState.getRawIdChangeMap();
        ArrayList<CallSite> arrayList = null;
        this.mappers.clear();
        IntIterator intIterator = int2ObjectOpenHashMap.keySet().iterator();
        while (intIterator.hasNext()) {
            int n = (Integer)intIterator.next();
            int n2 = int2IntMap.getOrDefault(n, Integer.MIN_VALUE);
            if (n2 >= 0) {
                if (this.mappers.containsKey(n2)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<CallSite>();
                    }
                    arrayList.add((CallSite)((Object)(" - Map contained two equal IDs " + n2 + " (" + String.valueOf(remapState.getIdFromOld(n)) + "/" + n + " -> " + String.valueOf(remapState.getIdFromNew(n2)) + "/" + n2 + ")!")));
                    continue;
                }
                this.mappers.put(n2, int2ObjectOpenHashMap.get(n));
                continue;
            }
            LOGGER.warn("[fabric-registry-sync] Int2ObjectMap " + this.name + " is dropping mapping for integer ID " + n + " (" + String.valueOf(remapState.getIdFromOld(n)) + ") - should not happen!");
            this.removedMapperCache.put(remapState.getIdFromOld(n), int2ObjectOpenHashMap.get(n));
        }
        if (arrayList != null) {
            throw new RuntimeException("Errors while remapping Int2ObjectMap " + this.name + " found:\n" + Joiner.on((char)'\n').join(arrayList));
        }
    }
}

