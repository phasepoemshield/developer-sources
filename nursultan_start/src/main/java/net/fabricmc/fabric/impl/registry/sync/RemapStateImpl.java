/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class00751
 *  minecraft.class01894
 *  net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback$RemapState
 */
package net.fabricmc.fabric.impl.registry.sync;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import minecraft.class00751;
import minecraft.class01894;
import net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback;

public class RemapStateImpl<T>
implements RegistryIdRemapCallback.RemapState<T> {
    private final Int2IntMap rawIdChangeMap;
    private final Int2ObjectMap<class01894> oldIdMap;
    private final Int2ObjectMap<class01894> newIdMap;

    public class01894 getIdFromOld(int n) {
        return (class01894)this.oldIdMap.get(n);
    }

    public Int2IntMap getRawIdChangeMap() {
        return this.rawIdChangeMap;
    }

    public class01894 getIdFromNew(int n) {
        return (class01894)this.newIdMap.get(n);
    }

    public RemapStateImpl(class00751<T> class007512, Int2ObjectMap<class01894> int2ObjectMap, Int2IntMap int2IntMap) {
        this.rawIdChangeMap = int2IntMap;
        this.oldIdMap = int2ObjectMap;
        this.newIdMap = new Int2ObjectOpenHashMap();
        for (Int2IntMap.Entry entry : int2IntMap.int2IntEntrySet()) {
            class01894 class018942 = class007512.y(class007512.N(entry.getIntValue()));
            this.newIdMap.put(entry.getIntValue(), (Object)class018942);
        }
    }
}

